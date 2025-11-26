// Write a program to display numbers from 1 to 10 using infinite for loop.
package Control_Statements_in_Java;

public class Program5 {
    public static void main(String [] args){
        int x = 1;
        for( ; ; ){
            System.out.println(x);
            x++;
            if(x>10) break; // when x become greater than 10 just come out of the loop.
        }
    }
}
