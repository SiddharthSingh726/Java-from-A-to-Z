// Write a program which accepts elements of a matrix and displays its transpose.
package Arrays;

import java.util.Scanner;

public class Program_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of rows:- ");
        int n = sc.nextInt();
        System.out.print("Enter the value of columns:- ");
        int m = sc.nextInt();
        int [][]arr = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print("Enter the value at index "+i+" and "+j+" is = ");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("The Transpose matrix is : ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
    }
}

// Take columns as rows and vise versa and display.