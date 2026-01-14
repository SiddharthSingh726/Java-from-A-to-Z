package Methods_In_Java;

import java.util.Scanner;

class Calculation{
    double value;

    void entering(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an value: ");
        value = sc.nextDouble();
    }
    double squareRoot(double value){
        return value*value;
    }
}
public class Square_Root {
    public static void main(String[] args) {
        Calculation c = new Calculation();
        c.entering();
        System.out.println(c.squareRoot(c.value));
    }
}
