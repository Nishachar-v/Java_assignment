// Extra 6. Bank Transaction Limits
public class BankTransactionLimits {
    public static double remainingLimit(Double limit, double used) {
        if (limit == null) return 0.0;
        return limit - used;
    }
    public static void main(String[] args) {
        System.out.println(remainingLimit(Double.valueOf(1000.0), 250.0));
        System.out.println(remainingLimit(null, 100.0));
    }
}
