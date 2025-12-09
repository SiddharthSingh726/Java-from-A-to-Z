// We going to learn Inheritance.
package Introduction_to_OOPS;

class Animal2 {
    void eat() {
        System.out.println("Animal is eating");
    }
}
class Dog1 extends Animal2 {
    void bark() {
        System.out.println("Dog is barking");
    }
}

public class Inheritance {
    public static void main(String [] args){
        Dog1 a = new Dog1();
        a.eat();
        a.bark();
    }
}
