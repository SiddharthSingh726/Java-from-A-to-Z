//Accepting a name (string) from the keyboard.
package Input_and_Output;
import java.util.Scanner;
public class Program2 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String :- ");
        String str = sc.nextLine();
        System.out.print("You have Entered the String :- "+str);
    }
}
