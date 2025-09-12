public class NullPointerExceptionDemo {

    public static void generateException() {
        String text = null;
        System.out.println("Attempting to get length of null string:");
        int length = text.length();
    }

    public static void handleException() {
        String text = null;
        try {
            System.out.println("Attempting to get length of null string with try-catch:");
            int length = text.length();
        } catch (NullPointerException e) {
            System.out.println("Successfully caught the NullPointerException.");
            System.out.println("Exception message: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.println("Calling method to generate exception:");
        try {
            generateException();
        } catch (NullPointerException e) {
            System.out.println("Caught the exception in main method.");
        }

        System.out.println("\nCalling method to handle exception:");
        handleException();
    }
}

