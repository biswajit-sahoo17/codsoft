import java.util.*;
import java.io.*;
public class Wordcounter {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter '1' to enter text, '2' to provide a file:");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            String inputText = "";
            switch (choice) {
                case 1:
                    System.out.println("Enter your text:");
                    inputText = scanner.nextLine();
                    break;
                case 2:
                    System.out.println("Enter the file name:");
                    String fileName = scanner.nextLine();
                    try {
                        inputText = readFile(fileName);
                    } catch (IOException e) {
                        System.out.println("Error reading file: " + e.getMessage());
                        return;
                    }
                    break;
                default:
                    System.out.println("Invalid choice.");
                    return;
            }

            // Split the input text into words
            String[] words = inputText.split("\\s+|\\p{Punct}");

            // Initialize counter variable
            int wordCount = 0;

            // Count words
            for (String word : words) {
                if (!word.isEmpty()) { // Ignore empty strings
                    wordCount++;
                }
            }

            // Display the total count of words
            System.out.println("Total words: " + wordCount);

            // Further enhancements can be implemented here
        }

        // Method to read a file and return its content as a string
        private static String readFile(String fileName) throws IOException {
            StringBuilder contentBuilder = new StringBuilder();
            try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
                String line;
                while ((line = br.readLine()) != null) {
                    contentBuilder.append(line).append("\n");
                }
            }
            return contentBuilder.toString();
}
    }


