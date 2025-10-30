// 4. Wrapper Comparison
public class WrapperComparison {
    public static void main(String[] args) {
        Integer a = 100;
        Integer b = 100;
        Integer c = 200;
        Integer d = 200;
        System.out.println("a == b : " + (a == b));
        System.out.println("c == d : " + (c == d));
        System.out.println("a.equals(b) : " + a.equals(b));
        System.out.println("\nExplanation: Integer values between -128 and 127 may be cached by JVM, so a and b refer to same object. Larger values like 200 are not necessarily cached, so c and d may be different objects. equals() compares values.");
    }
}
