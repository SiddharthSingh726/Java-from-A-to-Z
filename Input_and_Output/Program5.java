//Accepting and displaying employee details.
package Input_and_Output;
import java.util.Scanner;
public class Program5 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the Employee :- ");
        String name = sc.nextLine();
        System.out.print("Enter the id of the Employee :- ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the Gender of the Employee :- ");
        char gender = sc.nextLine().charAt(0);
        System.out.println("The name of the Employee is  :- "+name);
        System.out.println("The id of the Employee is :- "+id);
        System.out.print("The Gender of the Employee is :- "+gender);
    }
}
