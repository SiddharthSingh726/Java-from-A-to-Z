package Polymorphism;

class Test{
    float a  = 15.5f;
    int x = (int)a;
    float sum(){
        return a+x;
    }
}
public class Variable_Polymorphism {
    public static void main(String[] args) {
        Test t = new Test();
        t.sum();
        System.out.println(t.sum());
    }
}
