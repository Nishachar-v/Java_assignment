import java.util.Scanner;

public class CharacterArray {

    public static char[] getChars(String str) {
        char[] charArray = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            charArray[i] = str.charAt(i);
        }
        return charArray;
    }

    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.next();

        char[] customArray = getChars(text);
        char[] builtInArray = text.toCharArray();

        System.out.print("Custom character array: ");
        for (char c : customArray) {
            System.out.print(c + " ");
        }
        System.out.println();
        
        System.out.print("Built-in character array: ");
        for (char c : builtInArray) {
            System.out.print(c + " ");
        }
        System.out.println();

        if (compareCharArrays(customArray, builtInArray)) {
            System.out.println("Both arrays are the same.");
        } else {
            System.out.println("The arrays are different.");
        }

        scanner.close();
    }
}

