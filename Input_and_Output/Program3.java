//Accepting an int value from keyboard.
package Input_and_Output;
import java.util.Scanner;
public class Program3 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Integer Value :- ");
        int a = sc.nextInt();
        System.out.print("You Have Entered the value :- "+a);
    }
}
