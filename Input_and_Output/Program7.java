// To perform different arithmetic operations on given numbers.
package Input_and_Output;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Program7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the two values (comma separated): ");
        String str = sc.nextLine();

        StringTokenizer st = new StringTokenizer(str, ",");

        double num1 = 0, num2 = 0;

        // Read first number
        if (st.hasMoreTokens()) {
            num1 = parseNumber(st.nextToken().trim());
        }

        // Read second number
        if (st.hasMoreTokens()) {
            num2 = parseNumber(st.nextToken().trim());
        }

        // Perform arithmetic
        System.out.println("Result of Addition: " + (num1 + num2));
        System.out.println("Result of Subtraction: " + (num1 - num2));
        System.out.println("Result of Multiplication: " + (num1 * num2));

        if (num2 != 0) {
            System.out.println("Result of Division: " + (num1 / num2));
        } else {
            System.out.println("Division: Not possible (division by zero)");
        }
    }

    // Convert string token to number (int or double)
    public static double parseNumber(String token) {
        if (token.matches("\\d+")) {
            return Integer.parseInt(token);
        }
        else if (token.matches("\\d+\\.\\d+")) {
            return Double.parseDouble(token);
        }
        else {
            System.out.println("Invalid number: " + token);
            return 0;
        }
    }
}
