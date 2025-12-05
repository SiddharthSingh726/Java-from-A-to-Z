//To accept a year number from the keyboard and test if it is a leap or not.
package Input_and_Output;

import java.io.*;
import java.util.Scanner;

public class Program8 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Year :- ");
        int year = sc.nextInt();
        if(year % 100 == 0 && year % 400 == 0){
            System.out.print("This Year is A Leap Year");
        }else if (year % 100 != 0 && year % 4 == 0){
            System.out.print("This Year is a leap Year");
        } else System.out.print("It is not a Leap Year");
    }
}
