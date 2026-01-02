// We going to learn about super keyword in Inheritance.
package Introduction_to_OOPS;

class Animal3{
    String name;
    Animal3(String name){
        this.name = name;
    }
    String color = "Black";
    void sleep(){
        System.out.println("Animals can Sleep");
    }
}
class Cat extends Animal3{
    Cat(){
        super("Ravi"); //When we have a parameterized constructor than we have to declared it in super.
    }  // we use super keyword to call the parent constructor, method and variables.
    String color = "White";

    void color(){
        System.out.println(name+" have cute Animals");
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
