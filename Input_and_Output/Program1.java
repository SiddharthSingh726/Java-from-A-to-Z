//Accepting a single Character from keyboard.
package Input_and_Output;

import java.util.Scanner;

public class Program1 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Character :- ");
        char ch = sc.next().charAt(0);
        System.out.print("You have entered the character :- "+ch);
    }
}
