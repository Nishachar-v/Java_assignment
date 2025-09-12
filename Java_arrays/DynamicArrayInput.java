import java.util.Scanner;

public class DynamicArrayInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        System.out.println("Enter up to 10 numbers (enter 0 or a negative number to stop):");

        while (true) {
            if (index >= 10) {
                break;
            }

            System.out.print("Enter number " + (index + 1) + ": ");
            double inputNumber = scanner.nextDouble();

            if (inputNumber <= 0) {
                break;
            }

            numbers[index] = inputNumber;
            index++;
        }

        System.out.println("\nYou entered the following numbers:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
            total += numbers[i];
        }

        System.out.println("\nSum of all numbers: " + total);
        scanner.close();
    }
}

