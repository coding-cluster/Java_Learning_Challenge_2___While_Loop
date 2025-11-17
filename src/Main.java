// Cumulative sum until zero input
// Instructions:
// Ask the user for numbers and sum them. The loop ends when the user input a zero.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean exit = false;
        float totalSum = 0;
        while (!exit) {
            System.out.print("Please, input a number: ");
            float n = scanner.nextFloat();

            if (n == 0) {
                System.out.println("The sum is equal to: " + totalSum);
                exit = true;
            }

            totalSum += n;
        }
    }
}