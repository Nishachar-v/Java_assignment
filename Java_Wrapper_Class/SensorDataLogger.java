// Extra 5. Sensor Data Logger (shows method overload accepting primitive and wrapper)
import java.util.*;
public class SensorDataLogger {
    public static void log(Double value) {
        System.out.println("Logged (wrapper): " + value);
    }
    public static void log(double value) {
        System.out.println("Logged (primitive): " + value);
    }
    public static void main(String[] args) {
        double prim = 23.5;
        Double wrap = 24.0;
        log(prim); // auto-boxing allows call to wrapper overload if needed
        log(wrap);
    }
}
