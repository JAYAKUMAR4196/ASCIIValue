import java.util.Scanner;

public class ASCIIValue {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a character
        System.out.print("Enter a character: ");
        char character = scanner.next().charAt(0); // Read a single character

        // Get the ASCII value of the character
        int asciiValue = (int) character;

        // Display the ASCII value
        System.out.println("The ASCII value of '" + character + "' is: " + asciiValue);

        // Close the scanner
        scanner.close();
    }
}
