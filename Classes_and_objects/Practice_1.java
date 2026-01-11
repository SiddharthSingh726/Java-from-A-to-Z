package Classes_and_objects;

class Animal{
    String name;
    int age;
    void talk(){
        System.out.println(name+" I am alive and age is "+age);
    }
}
public class Practice_1 {
    public static void main(String []args){
        Animal Raju = new Animal();
        Animal Ramesh = new Animal();
        Raju.name="Raju";
        Ramesh.name="Ramesh";
        Raju.age=24;
        Ramesh.age=25;
        Raju.talk();
        Ramesh.talk();
    }
}
