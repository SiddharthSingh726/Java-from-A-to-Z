// To accept different values of input separated by commas.
package Input_and_Output;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Program6 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String :- ");
        String str = sc.nextLine();

        StringTokenizer st = new StringTokenizer(str, ",");

        while(st.hasMoreTokens()){
            String token = st.nextToken().trim(); // trim extra spaces

            Object value;  // store converted value (int, double, string)

            if (token.matches("\\d+")) {
                value = Integer.parseInt(token);   // convert to int
            }
            else if (token.matches("\\d+\\.\\d+")) {
                value = Double.parseDouble(token); // convert to double
            }
            else {
                value = token;                     // keep as string
            }

            System.out.println("Converted Value = " + value);
        }
    }
}
