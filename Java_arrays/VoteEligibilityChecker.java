import java.util.Scanner;

public class VoteEligibilityChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ages = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age for student " + (i + 1) + ": ");
            ages[i] = scanner.nextInt();
        }

        for (int i = 0; i < ages.length; i++) {
            int age = ages[i];
            if (age < 0) {
                System.out.println("Student " + (i + 1) + ": Invalid age.");
            } else if (age >= 18) {
                System.out.println("Student with the age " + age + " can vote.");
            } else {
                System.out.println("Student with the age " + age + " cannot vote.");
            }
        }
        scanner.close();
    }
}

