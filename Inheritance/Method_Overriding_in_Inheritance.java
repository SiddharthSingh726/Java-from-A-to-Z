package Inheritance;

class Laptop{
    void company(){
        System.out.println("Asus");
    }
}
class Asus extends Laptop{
    void company(){
        System.out.println("Asus gen 12");
    }
}
public class Method_Overriding_in_Inheritance {
    public static void main(String[] args) {
        Laptop l1 = new Asus();
        l1.company();
    }
}
