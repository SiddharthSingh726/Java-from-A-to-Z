// Write a program for a method with two parameter and return type.
package Methods_In_Java;

import java.util.Scanner;

class Subtraction{
    double a,b;

    void entering(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Entering Subtraction a:- ");
        a = sc.nextDouble();
        System.out.print("Entering Subtraction b:- ");
        b = sc.nextDouble();
    }

    double sub(double a,double b){
        double sub1 =  a - b;
        return sub1;
    }
}
public class Program_3 {
    public static void main(String[] args) {
        Subtraction obj = new Subtraction();
        obj.entering();
        System.out.println("The Substraction of a and b :- "+obj.sub(obj.a,obj.b));
    }
}
