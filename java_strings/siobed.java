import java.util.Scanner;

public class StringIndexOutOfBoundsExceptionDemo {

    public static void generateException(String str) {
        System.out.println("Attempting to access index beyond string length:");
        char c = str.charAt(str.length());
    }

    public static void handleException(String str) {
        try {
            System.out.println("Attempting to access index beyond string length with try-catch:");
            char c = str.charAt(str.length());
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Successfully caught the StringIndexOutOfBoundsException.");
            System.out.println("Exception message: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.next();

        System.out.println("Calling method to generate exception:");
        try {
            generateException(text);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught the exception in main method.");
        }
        
        System.out.println("\nCalling method to handle exception:");
        handleException(text);

        scanner.close();
    }
}

