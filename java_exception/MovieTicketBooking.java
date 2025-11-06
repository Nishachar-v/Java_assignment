import java.util.*;

class InvalidSeatException extends Exception { public InvalidSeatException(String msg){ super(msg);} }
class SeatAlreadyBookedException extends Exception { public SeatAlreadyBookedException(String msg){ super(msg);} }

class MovieBooking {
    Map<Integer, Boolean> seats = new HashMap<>();

    public MovieBooking() {
        for (int i = 1; i <= 5; i++) seats.put(i, true);
    }

    public void bookSeat(int seatNo) throws InvalidSeatException, SeatAlreadyBookedException {
        if (!seats.containsKey(seatNo)) throw new InvalidSeatException("Seat does not exist!");
        if (!seats.get(seatNo)) throw new SeatAlreadyBookedException("Seat already booked!");
        seats.put(seatNo, false);
        System.out.println("Seat booked successfully: " + seatNo);
    }
}

public class MovieTicketBooking {
    public static void main(String[] args) {
        MovieBooking m = new MovieBooking();
        try {
            m.bookSeat(2);
            m.bookSeat(2);
        } catch (Exception e) {
            System.out.println("Booking error: " + e.getMessage());
        }
    }
}