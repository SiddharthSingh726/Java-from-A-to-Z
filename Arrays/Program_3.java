package Arrays;

import java.util.Scanner;

public class Program_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n  : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the random numbers :- ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean Swapped;
        for (int i = 0; i < n; i++) {
            Swapped = false;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    Swapped = true;
                }
            }
            if (!Swapped)
                break;
        }
        System.out.print("The sorted array is:- ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
