package Arrays;

import java.util.Scanner;

public class Side_Program1 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Array limit :- ");
        int n = sc.nextInt();
        int [] marks = new int[n];
        for(int i = 0; i<n; i++){
            System.out.print("Enter the value of index "+i+" :- ");
            marks[i] = sc.nextInt();
        }
        for(int i = 0; i<n; i++){
            System.out.println("The value at index "+i+" is :- "+marks[i]);
        }
    }
}
