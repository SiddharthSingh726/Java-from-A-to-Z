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
/* 1.Top-level classes cannot be private or protected; they can be only public or default.
   2.Inner classes can be private, protected, default, or public
   3.Methods can be private, protected, default, or public.
   4.Instance variables can be private, protected, default, or public.
   5.Access modifiers define the visibility and accessibility of a class and its members such as variables, methods, and constructors.
   6.private members are accessible only within the same class.
   7.protected members are accessible within the same package and in subclasses outside the package through inheritance.
   8.Default access allows access only within the same package.
   9.public members can be accessed from anywhere.
 */