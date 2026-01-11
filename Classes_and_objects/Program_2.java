//Let us rewrite Program 1, where we want to ca the talk() method.
package Classes_and_objects;

class Person3{
    String name;
    int age;

    void talk(){
        System.out.println("Hello my name is "+name);
        System.out.println("Hello my age is "+age);
    }
}
public class Program_2 {
    public static void main(String [] args){
        Person3 p3 = new Person3();
        p3.talk();
    }
}
