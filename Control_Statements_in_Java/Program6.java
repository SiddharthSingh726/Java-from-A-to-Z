/* Write a program to display stars in a triangular form - a single star in the first line, two stars in the second line,
 * three stars in the third line, and so on.
 */
package Control_Statements_in_Java;

public class Program6 {
    public static void main(String [] args){
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
