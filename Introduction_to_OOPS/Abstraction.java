// We going to learn about abstraction in this
package Introduction_to_OOPS;

abstract class Animal {
    abstract void sound();  //Abstraction class have no body.
}
    class Dog extends Animal{
        void sound(){
            System.out.println("Dog Barks");
    }
}
public class Abstraction {
    public static void main(String [] args){
        Animal a = new Dog();  // We can not create the object of abstract class.
        a.sound();
    }
}
