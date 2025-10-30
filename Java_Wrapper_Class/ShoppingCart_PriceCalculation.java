// Extra 1. Shopping Cart Price Calculation (uses Integer.parseInt and handles invalid)
public class ShoppingCart_PriceCalculation {
    public static void main(String[] args) {
        String[] prices = {"250","499","abc","99"};
        int total = 0;
        for (String p : prices) {
            try {
                total += Integer.parseInt(p);
            } catch (NumberFormatException e) {
                System.out.println("Invalid price ignored: " + p);
            }
        }
        System.out.println("Total price = " + total);
    }
}
