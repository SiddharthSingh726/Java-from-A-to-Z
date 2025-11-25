// Write a program to observe the effects of various bitwise operators.

package Operators_in_Java;

public class Program1 {
    public static void main(String [] args){
        int x,y;
        x = 10;
        y = 11;

        System.out.println("~x = "+ (~x));
        System.out.println("x&y = "+ (x&y));
        System.out.println("x|y = "+ (x|y));
        System.out.println("x^y = "+ (x^y));
        System.out.println("x<<2 = "+ (x<<2));
        System.out.println("x>>2 = "+ (x>>2));
        System.out.println("x>>>2 = "+ (x>>>2));
    }
}
