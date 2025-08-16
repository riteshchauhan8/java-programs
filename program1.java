import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for input
        System.out.print("Enter a single alphabet character: ");
        String input = scanner.nextLine();

        // Validate input length and character type
        if (input.length() != 1 || !Character.isLetter(input.charAt(0))) {
            System.out.println("Error: Please enter a single alphabet character (A-Z or a-z).");
        } else {
            char ch = Character.toLowerCase(input.charAt(0)); // Convert to lowercase for easy comparison

            // Check for vowels
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println("Vowel");
            } else {
                System.out.println("Consonant");
            }
        }

        scanner.close();
    }
}