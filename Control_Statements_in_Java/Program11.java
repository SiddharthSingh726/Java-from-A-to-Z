// Write a program using for loop to display the numbers in descending order and also use continue statement.
package Control_Statements_in_Java;

public class Program11 {
    public static void main(String []args){
        for(int i = 10; i>=1; i--){
            if(i>5) continue;
            System.out.println(i);
        }
    }
}
