// Write a program to create Person2 class and an object p1 to Person2 class. et us display the hash code number of the object, using hascode().
package Classes_and_objects;

class Person2{
    String name;
    int age;
    void talk(){
    }
}
public class Program_1 {
    public static void main(String [] args){
        Person2 p1 = new Person2();
        System.out.println("Hash Code = " + p1.hashCode());
    }
}
