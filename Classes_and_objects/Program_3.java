// Write a program to initiate thr Person class instance variable in main class.
package Classes_and_objects;

class Person5{
    String name = "Vansh";
    int age = 23;

    void talk(){
        System.out.println("Helo i am " + name);
        System.out.println("My age is " + age);
    }
}
public class Program_3 {
    public static void main(String[] args) {
        Person5 p5 = new Person5();
        p5.name = "Raju";   //here original data is being overridden to protect data we use private.
        p5.age = 24;
        p5.talk();
    }
}
