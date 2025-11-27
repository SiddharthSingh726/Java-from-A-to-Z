// Write a program for using the switch statement to execute a particular task depending on color value.
package Control_Statements_in_Java;

public class Program8 {
    public static void main(String [] args){
        char color = 'g';
        switch(color){
            case 'r': System.out.print("Red");
            break;
            case 'g': System.out.print("Green");
            break;
            case 'b': System.out.print("Blue");
            break;
            case 'w': System.out.print("white");
            break;
            default : System.out.print("No Color");
        }
    }
}
