package Classes_and_objects;

class Person{
    //properties - instance variable
    String name;
    int age;
    // Constructor
Person(String name,int age){
    this.name = name;
    this.age = age;
}
    //action - methods
    void talk(){
        System.out.println("Hello I am "+name);
        System.out.println("My age is "+age);
    }
}
public class Demo_Code_1 {
    public static void main(String[] args) {
        Person p1 = new Person("Sid",23);
        System.out.println(p1.name);
        p1.name = "Siddharth";
        System.out.println(p1.name);
        p1.age = 23;
        p1.talk();
    }
}
