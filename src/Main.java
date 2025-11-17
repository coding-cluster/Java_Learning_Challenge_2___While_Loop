// Cumulative sum until zero input
// Instructions:
// Ask the user for numbers and sum them. The loop ends when the user input a zero.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalSum = 0;

        while (true) {
            System.out.print("Please, input a number: ");
            double n = scanner.nextDouble();

            if (n == 0) {
                break;
            }

            totalSum += n;
        }

        System.out.println("The sum is equal to: " + totalSum);
    }
}