package Inheritance;

class A{
    void m1(){
        System.out.println("m1");
    }
}
class B extends A{
    void m1(){
        System.out.println("m2");
    }
    void m2(){
        System.out.println("m3");
    }
}
public class Upcasting_and_Lowercasting {
    public static void main(String[] args) {
        /*A a = new B(); // uppercasting
        if (a instanceof B) {
            B d3 = (B) a; //lowercasting
            d3.m2();
            d3.m1();
        }*/
        B b = new B(); //Method access depends on reference type
        b.m1();
        b.m2();
    }
}
