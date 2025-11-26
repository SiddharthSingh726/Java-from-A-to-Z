// Write a program to test if a number is positive or negative.

package Control_Statements_in_Java;

public class Program1 {
    public static void main (String [] args){
        int x = -5;

        if(x==0) {
            System.out.print("Its is Zero");
        } else if(x>0) {
            System.out.print(x+ " is positive");
        } else {
            System.out.print(x+ " is negative");
        }
    }
}
