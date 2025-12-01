//Accepting the double value.
package Input_and_Output;
import java.util.Scanner;
public class AcceptingDoubleValue {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the double value :- ");
        double d = sc.nextDouble();
        System.out.print("You have Entered the value :- "+d);
    }
}
