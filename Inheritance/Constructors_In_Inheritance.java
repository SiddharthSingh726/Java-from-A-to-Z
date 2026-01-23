package Inheritance;

class Person{
    int num;
    Person(){
        System.out.println("Person constructor");
    }
    Person(String name){
        System.out.println("The value of num is "+name);
    }
}
class Child extends Person{
    Child(){
        super("Child");
        System.out.println("Child constructor");
    }
}
public class Constructors_In_Inheritance {
    public static void main(String[] args) {
        Child c = new Child();
    }
}
