//Accepting the Short value.
package Input_and_Output;
import java.util.Scanner;
public class AcceptingShortValue {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the short value :- ");
        short s = sc.nextShort();
        System.out.print("You have entered the value :- "+s);
    }
}
