package Inheritance;

class Animals{
    String name;
    int age;
    void eat(){
        System.out.println(name+" Animals eat and his age is "+age);
    }
}
class Dog extends Animals{
    void sleep(){  //here the child class is able to access the name and age because child class have access of both parent and child member access.
        System.out.println(name+" is the Dog sleep and his age is "+age);
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.name = "Tommy";
        d.age = 20;
        d.eat();
        d.sleep();
    }
}
