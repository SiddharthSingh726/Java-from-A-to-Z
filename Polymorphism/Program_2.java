package Polymorphism;

class Maths{
    void calculate(double x){
        System.out.println("Square value = "+(x*x));
    }
}
class Maths2 extends Maths{
    void calculate(double x){
        System.out.println("Square Root = "+Math.sqrt(x));
    }
}
public class Program_2 {
    public static void main(String[] args) {
        Maths2 m = new Maths2();
        m.calculate(25);
    }
}
