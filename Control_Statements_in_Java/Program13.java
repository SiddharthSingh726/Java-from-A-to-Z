//Write a program to return a value from a method.
package Control_Statements_in_Java;

public class Program13 {
    public static void main(String [] args){
        int res = Program13.myMethod(10);
        System.out.println("Result = "+res);
    }
    static int myMethod(int num){
        return num*num;
    }
}
