package Methods_In_Java;

import java.util.Scanner;

class Sum{
    int a,b;

    void entering(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number a:- ");
        a = sc.nextInt();
        System.out.print("Enter the number b:- ");
        b = sc.nextInt();
    }

    int sum(int a,int b){
        return a+b;
    }
}
public class Doing_Sum {
    public static void main(String[] args) {
        Sum obj = new Sum();
        obj.entering();
        System.out.println("The sum of a and b is :- "+obj.sum(obj.a,obj.b));
    }
}
