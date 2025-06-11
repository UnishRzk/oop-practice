import java.util.Scanner;

public class Number_to_words {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a number: ");
        long num = sc.nextLong();

        // Handle negative numbers
        if (num < 0) {
            System.out.println("Negative number is invalid");
            sc.close();
            return; // Exit if input is negative
        }   

        // Convert number to words and print the result
        System.out.println("The number in words is: " + convertToWords(num).trim());

        sc.close(); // Close the scanner
    }

    // Function to convert a number to words
    public static String convertToWords(long num) {
        if (num == 0) { // Base case: If the number is 0, return "Zero"
            return "Zero";
        }

        int i = 0; // Keeps track of the scale (e.g., Thousand, Million, etc.)
        String words = ""; // Stores the final word representation

        // Loop to process the number in chunks of 3 digits
        while (num > 0) {
            if (num % 1000 != 0) { // Process non-zero groups of three digits
                words = processthedigits((int) (num % 1000)) + thousands[i] + " " + words;
            }
            num /= 1000; // Move to the next group of three digits
            i++; // Increment scale index (e.g., Thousand, Million)
        }
        return words; // Return the complete word representation
    }

    // Function to process and convert a three-digit number to words
    public static String processthedigits(int number) {
        String results = ""; // Store word representation for the current chunk

        // Handle hundreds place
        if (number / 100 > 0) {
            results += ones[number / 100] + " Hundred ";
            number %= 100; // Remove the hundreds place
        }

        // Handle numbers between 10 and 19 (teens)
        if (number >= 10 && number <= 19) {
            results += teens[number - 10] + " ";
        } else {
            // Handle tens place (e.g., Twenty, Thirty)
            if (number / 10 > 0) {
                results += tens[number / 10] + " ";
            }
            // Handle ones place (e.g., One, Two)
            if (number % 10 > 0) {
                results += ones[number % 10] + " ";
            }
        }

        return results; // Return the word representation for this chunk
    }

    // Array for ones place mapping (0-9)
    private static final String[] ones = {
            "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"
    };

    // Array for teens mapping (10-19)
    private static final String[] teens = {
            "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"
    };

    // Array for tens place mapping (20, 30, ..., 90)
    private static final String[] tens = {
            "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };

    // Array for scale terms (Thousand, Million, etc.)
    private static final String[] thousands = {
            "", "Thousand", "Million", "Billion"
    };
}
