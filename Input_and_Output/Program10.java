//Generating Fibonacci numbers
package Input_and_Output;

import java.util.Scanner;

public class Program10 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first value :- ");
        int f1 = sc.nextInt();
        System.out.print("Enter the second value :- ");
        int f2 = sc.nextInt();
        System.out.print("Enter till where you want the series :- ");
        int n = sc.nextInt();
        System.out.println(f1);
        System.out.println(f2);
        int f = f1+f2;
        System.out.println(f);
        for(int i = 0;i<=n; i++){
            f1 = f2;
            f2 = f;
            f = f1 + f2;
            System.out.println(f);
        }
    }
}
