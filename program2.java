import java.util.Scanner;

public class CharacterRhombus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of rows
        System.out.print("Enter the number of rows (odd number): ");
        int n = scanner.nextInt();

        // Validate that the number is odd and greater than 0
        if (n % 2 == 0 || n <= 0) {
            System.out.println("Error: Please enter a positive odd number.");
        } else {
            int mid = (n / 2) + 1;

            // Upper half including the middle line
            for (int i = 1; i <= mid; i++) {
                // Print spaces
                for (int j = 1; j <= mid - i; j++) {
                    System.out.print(" ");
                }

                // Print increasing characters
                for (char ch = 'A'; ch < 'A' + i; ch++) {
                    System.out.print(ch);
                }

                // Print decreasing characters
                for (char ch = (char) ('A' + i - 2); ch >= 'A'; ch--) {
                    System.out.print(ch);
                }

                System.out.println();
            }

            // Lower half
            for (int i = mid - 1; i >= 1; i--) {
                // Print spaces
                for (int j = 1; j <= mid - i; j++) {
                    System.out.print(" ");
                }

                
                for (char ch = 'A'; ch < 'A' + i; ch++) {
                    System.out.print(ch);
                }
                for (char ch = (char) ('A' + i - 2); ch >= 'A'; ch--) {
                    System.out.print(ch);
                }

                System.out.println();
            }
        }

        scanner.close();
    }
}

