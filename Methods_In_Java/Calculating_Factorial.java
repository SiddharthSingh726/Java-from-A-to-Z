package Methods_In_Java;

import java.util.Scanner;

class Factorial{
    int n;

    void entering(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = input.nextInt();
    }

    int factorial(int n){
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i; // n! = 1 * 2 * ... * n
        }
        return result;
    }
}
public class Calculating_Factorial {
    public static void main(String[] args) {
        Factorial f = new Factorial();
        f.entering();
        System.out.println(f.factorial(f.n));
    }
}
