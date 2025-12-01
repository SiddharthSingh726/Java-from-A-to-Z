//Accepting the boolean value.
package Input_and_Output;
import java.util.Scanner;
public class AcceptingBooleanValue {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of Boolean :- ");
        boolean b = sc.nextBoolean();
        System.out.print("You have entered the value :- "+b);
    }
}
