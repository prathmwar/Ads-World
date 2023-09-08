import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for a number
        System.out.print("Enter a number to find its position: ");
        int targetNumber = scanner.nextInt();

        // Find the position of the target number
        int position = findPosition(targetNumber);

        // Print the result
        if (position != -1) {
            System.out.println(targetNumber + " is present at position " + position + " in the list.");
        } else {
            System.out.println(targetNumber + " is not present in the list.");
        }
    }

    // Function to find the position of a number in the sequence
    public static int findPosition(int targetNumber) {
        int currentNumber = 1;
        int position = 1;

        while (currentNumber <= targetNumber) {
            if (currentNumber == targetNumber) {
                return position;
            }

            // Generate the next number in the sequence
            currentNumber = generateNextNumber(currentNumber);
            position++;
        }

        return -1; // Number not found in the sequence
    }

    // Function to generate the next number in the sequence
    public static int generateNextNumber(int currentNumber)
    {
        int nextNumber = currentNumber + 1;

        // Check if the next number contains other digits (not 1, 2, or 3)
        while (containsOtherDigits(nextNumber))
        {
            nextNumber++;
        }

        return nextNumber;
    }


    // Function to check if a number contains the digits 4 or 5
    public static boolean containsOtherDigits(int number)
    {
        while (number > 0)
        {
            int digit = number % 10;
            if (digit != 1 && digit != 2 && digit != 3)
            {
                return true; // The number contains a digit other than 1, 2, or 3
            }
            number = number/10;
        }
        return false; // The number only contains 1, 2, or 3
    }

}
