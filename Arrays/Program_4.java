/* Write a program to take a 2D array and displays its elements in the form of a matrix. To display the elements of 2D array, we
   use two for loops, the outer loop represents the rows and the inner one represents the columns in each loop.
 */
package Arrays;

import java.util.Scanner;

public class Program_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of rows :-" );
        int n = sc.nextInt();
        System.out.print("Enter the value of columns :-" );
        int m = sc.nextInt();
        int [][]arr = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print("Enter element of index "+j+"\t"+j+" is = ");
                arr[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
