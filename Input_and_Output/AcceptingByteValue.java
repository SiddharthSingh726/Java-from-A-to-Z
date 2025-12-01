//Accepting the byte value.
package Input_and_Output;
import java.util.Scanner;
public class AcceptingByteValue {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the byte value :- ");
        byte b = sc.nextByte();
        System.out.print("You have Enter the value :- "+b);
    }
}
