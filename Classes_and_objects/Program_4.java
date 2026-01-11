// Write a program to initialize the instance variables directly within the Person class.
package Classes_and_objects;

class Person7{
    private String name = "Raju";
    private int age = 24;
    void talk(){
        System.out.println("Hello I am "+ name);
        System.out.println("I am "+ age);
    }
}
public class Program_4 {
    public static void main(String[] args) {
        Person7 p7 = new Person7();
        Person7 p7_7 = new Person7();
        p7.talk();
        p7_7.talk();
    }
}
