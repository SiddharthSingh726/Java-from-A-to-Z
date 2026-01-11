//Initializing the Instance Variables.
package Classes_and_objects;

class Person4{
    String name;
    int age;
    void talk(){
        System.out.println("Helo i am " + name);
        System.out.println("My age is " + age);
    }
}
public class Program_2_2 {
    public static void main(String[] args) {
        Person4 p4 = new Person4();
        p4.name = "Raju";
        p4.age = 22;
        p4.talk();
    }
}
