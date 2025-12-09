// We going to learn about super keyword in Inheritance.
package Introduction_to_OOPS;

class Animal3{
    Animal3(){
        System.out.println("Animals are cute");
    }
    String color = "Black";
    void sleep(){
        System.out.println("Animals can Sleep");
    }
}
class Cat extends Animal3{
    Cat(){
        super();
    }
    String color = "White";

    void color(){
        super.sleep();
        System.out.println(color);
        System.out.println(super.color);
    }
}
public class InheritanceUsingSuper {
    public static void main(String [] args){
        Cat c = new Cat();
        c.color();
    }
}
