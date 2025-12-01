//Accepting the Long value.
package Input_and_Output;
import java.util.Scanner;
public class AcceptingLongValue {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of long :- ");
        long l = sc.nextLong();
        System.out.print("You have entered the value :- "+l);
    }
}
