// Write a program to initialize the instance variable of Person class, using parameterized constructors.
package Classes_and_objects;

class Person8{
    //Instance variable
    String name;
    int age;
// Default constructor
    Person8(){
        name="Raju";
        age=22;
    }
    // Parameterized Constructor
    Person8(String name,int age){
        this.name=name;
        this.age=age;
    }
// Method
    void show(){
        System.out.println("Hello my name is " + name);
        System.out.println("Hello my age is " + age);
    }
}
public class Program_6 {
    public static void main(String[] args) {
        // here constructor overloading is also happening.
        Person8 p1 = new Person8(); // calling default constructor.
        Person8 p2 = new Person8("Sita",20); // calling parameterized constructor.
        p1.show();
        p2.show();
    }
}
