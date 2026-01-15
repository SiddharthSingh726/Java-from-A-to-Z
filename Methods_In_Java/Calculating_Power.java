package Methods_In_Java;

import java.util.Scanner;

class Power{
    double x;
    int n;

    void entering(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        x = sc.nextDouble();
        System.out.print("Enter Power: ");
        n = sc.nextInt();
    }

    double power(double x,int n){
        for(int i=1;i<n;i++){
             x *= x;
        }
        return x;
    }
}
public class Calculating_Power {
    public static void main(String[] args) {
        Power p = new Power();
        p.entering();
        System.out.println(p.power(p.x,p.n));
    }
}
