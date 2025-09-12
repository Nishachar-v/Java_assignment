import java.util.Scanner;

public class MultiplicationTable6to9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to find its multiplication table from 6 to 9: ");
        int number = scanner.nextInt();

        int[] multiplicationResult = new int[4];
        int arrayIndex = 0;
        for (int i = 6; i <= 9; i++) {
            multiplicationResult[arrayIndex] = number * i;
            arrayIndex++;
        }

        arrayIndex = 0;
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[arrayIndex]);
            arrayIndex++;
        }
        scanner.close();
    }
}

