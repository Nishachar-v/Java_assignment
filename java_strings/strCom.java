import java.util.Scanner;

public class StringComparison {

    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = scanner.next();
        System.out.print("Enter second string: ");
        String s2 = scanner.next();

        boolean customCompareResult = compareStrings(s1, s2);
        boolean builtInResult = s1.equals(s2);

        System.out.println("Comparison using custom method: " + customCompareResult);
        System.out.println("Comparison using built-in method: " + builtInResult);
        
        if (customCompareResult == builtInResult) {
            System.out.println("Both methods produced the same result.");
        } else {
            System.out.println("The results from both methods are different.");
        }

        scanner.close();
    }
}

