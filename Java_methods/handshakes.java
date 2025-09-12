import java.util.Scanner;

public class Handshakes {

    public static long calculateHandshakes(int n) {
        if (n <= 1) {
            return 0;
        }
        return (long) n * (n - 1) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();
        long handshakes = calculateHandshakes(numberOfStudents);
        System.out.println("Maximum number of possible handshakes: " + handshakes);
        scanner.close();
    }
}

