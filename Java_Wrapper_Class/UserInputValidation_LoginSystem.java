// Extra 3. User Input Validation (Login System)
public class UserInputValidation_LoginSystem {
    public static boolean isValidAge(String input) {
        try {
            int age = Integer.parseInt(input);
            return age >= 18;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public static void main(String[] args) {
        String[] tests = {"20","17","abc","18"};
        for (String t : tests) {
            System.out.println("Input: " + t + " -> valid and >=18? " + isValidAge(t));
        }
    }
}
