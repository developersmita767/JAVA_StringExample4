//Write a program to find all the words in a given String.
import java.util.Scanner;

public class StringExample4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string from the user
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        // Split the input string into words
        String[] words = input.split("\\s+");

        // Output the words found
        System.out.println("Words found in the string:");
        for (String word : words) {
            System.out.println(word);
        }

        scanner.close();
    }
}
