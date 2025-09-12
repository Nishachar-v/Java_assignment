import java.util.Scanner;

public class MeanHeightCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] heights = new double[11];
        double sum = 0.0;

        for (int i = 0; i < 11; i++) {
            System.out.print("Enter height for player " + (i + 1) + " (in cm): ");
            heights[i] = scanner.nextDouble();
            sum += heights[i];
        }

        double meanHeight = sum / 11;
        System.out.println("The mean height of the football team is: " + meanHeight + " cm.");
        scanner.close();
    }
}

