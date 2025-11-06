import java.time.LocalDate;

class ServiceOverdueException extends Exception {
    public ServiceOverdueException(String msg) { super(msg); }
}
class InvalidMileageException extends Exception {
    public InvalidMileageException(String msg) { super(msg); }
}

class Vehicle {
    private LocalDate serviceDate;
    private int mileage;

    public Vehicle(LocalDate serviceDate, int mileage) {
        this.serviceDate = serviceDate;
        this.mileage = mileage;
    }

    public void checkMaintenance() throws ServiceOverdueException, InvalidMileageException {
        if (mileage < 0) throw new InvalidMileageException("Mileage cannot be negative!");
        if (serviceDate.isBefore(LocalDate.now())) throw new ServiceOverdueException("Service is overdue!");
        System.out.println("Vehicle is in good condition.");
    }
}

public class VehicleMaintenanceTracker {
    public static void main(String[] args) {
        Vehicle v = new Vehicle(LocalDate.of(2024, 10, 10), 15000);
        try {
            v.checkMaintenance();
        } catch (ServiceOverdueException | InvalidMileageException e) {
            System.out.println("Alert: " + e.getMessage());
        }
    }
}