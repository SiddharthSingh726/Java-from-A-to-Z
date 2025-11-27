// Write a Java program to understand how to use string in a switch statements.
package Control_Statements_in_Java;

public class Program9 {
    public static void main(String [] args){
        String weak = "Thu";
        switch(weak){
            case "Mon": System.out.print("Monday");
            break;
            case "Tue": System.out.print("Tuesday");
            break;
            case "Wed": System.out.print("Wednesday");
            break;
            case "Thu": System.out.print("Thursday");
            break;
            case "Fri": System.out.print("Friday");
            break;
            case "Sat": System.out.print("Saturday");
            break;
            default : System.out.print("No Data is found");
        }
    }
}
