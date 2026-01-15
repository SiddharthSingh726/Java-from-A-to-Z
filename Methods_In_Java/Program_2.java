// Write a program for a method without parameter but with a return type.
package Methods_In_Java;

import java.util.Scanner;

class Summing1{
    double a,b;

    void entering(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number: ");
        a=sc.nextDouble();
        System.out.print("Enter the second number: ");
        b=sc.nextDouble();
    }
    double sum(){
        double sum = a+b;
        return sum;
    }
}
public class Program_2 {
    public static void main(String[] args) {
        Summing1 obj=new Summing1();
        obj.entering();
        System.out.println("The sum of a and b  is :- "+obj.sum());
    }
}
