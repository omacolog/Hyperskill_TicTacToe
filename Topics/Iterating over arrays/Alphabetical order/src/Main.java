import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input line containing lowercase strings separated by spaces
        String input = scanner.nextLine();

        // Split the input line into an array of strings
        String[] words = input.split(" ");

        // Check if the array is in alphabetical order
        boolean isAlphabetical = true;

        for (int i = 0; i < words.length - 1; i++) {
            if (words[i].compareTo(words[i + 1]) > 0) {
                isAlphabetical = false;
                break;
            }
        }

        // Print the result
        System.out.println(isAlphabetical);

        scanner.close();
    }
}
