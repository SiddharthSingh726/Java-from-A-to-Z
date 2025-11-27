// Write a program to see the use of fpr-each loop and retrieve the elements one by one from an array and display it.
package Control_Statements_in_Java;

public class Program7 {
    public static void main(String [] args){
        int arr [] = {200, 19, -56, 44, 99};
        for(int i : arr){
            System.out.println(i);
        }
    }
}
