package Arrays;

import java.util.Scanner;

public class Program_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter marks :- " );
            arr[i] = sc.nextInt();
        }
        int tot = 0;
        for(int i=0;i<n;i++){
            tot += arr[i];
        }
        System.out.println("The total marks of a Student is :- "+ tot);
        float percent = (float) tot /n;
        System.out.println("The percent of student is :- "+ percent);
    }
}
