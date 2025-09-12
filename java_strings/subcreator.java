import java.util.Scanner;

public class SubstringCreator {

    public static String createSubstring(String text, int start, int end) {
        if (start < 0 || end > text.length() || start > end) {
            return null;
        }
        String result = "";
        for (int i = start; i < end; i++) {
            result += text.charAt(i);
        }
        return result;
    }

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
        System.out.print("Enter a string: ");
        String text = scanner.next();
        System.out.print("Enter start index: ");
        int startIndex = scanner.nextInt();
        System.out.print("Enter end index: ");
        int endIndex = scanner.nextInt();

        String customSubstring = createSubstring(text, startIndex, endIndex);
        String builtInSubstring = text.substring(startIndex, endIndex);

        System.out.println("Substring using custom method: " + customSubstring);
        System.out.println("Substring using built-in method: " + builtInSubstring);
        
        if (compareStrings(customSubstring, builtInSubstring)) {
            System.out.println("The substrings are the same.");
        } else {
            System.out.println("The substrings are different.");
        }

        scanner.close();
    }
}

