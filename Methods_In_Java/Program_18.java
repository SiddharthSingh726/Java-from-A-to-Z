// Write a program to add two matrices and displays sum matrix.
package Methods_In_Java;

import java.util.Scanner;

class Matrix {
    int r, c;
    int[][] arr;

    // Constructor: allocate memory
    Matrix(int r, int c) {
        this.r = r;
        this.c = c;
        arr = new int[r][c];
    }

    // Accept matrix using Scanner and return it
    int[][] getMatrix(Scanner sc) {
        System.out.println("Enter elements row-wise:");

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }

    // Add two matrices and return sum matrix
    int[][] findSum(int[][] a, int[][] b) {
        int[][] temp = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                temp[i][j] = a[i][j] + b[i][j];
            }
        }
        return temp;
    }

    // Display matrix
    void displayMatrix(int[][] res) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(res[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

class MatrixSum {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        // Create two Matrix objects (3x3)
        Matrix obj1 = new Matrix(3, 3);
        Matrix obj2 = new Matrix(3, 3);

        int[][] x, y, z;

        System.out.println("\nEnter elements for first matrix:");
        x = obj1.getMatrix(sc);

        System.out.println("\nEnter elements for second matrix:");
        y = obj2.getMatrix(sc);

        // Add matrices
        z = obj1.findSum(x, y);

        System.out.println("\nThe sum matrix is:");
        obj1.displayMatrix(z);

        sc.close();
    }
}


/* Just like objects are passed to methods it is also possible to pass arrays to methods and returns arrays from methods. In this
   case, an array name should be understood as an object reference. For example,
   int[] myMethod(int arr[])
   This is the way we can pass a one dimensional array 'arr' to 'myMethod()'. We can also return a one dimensional array of int type
   as shown in the preceding statement.
   int[][] myMethod(int arr[][]).
 */
