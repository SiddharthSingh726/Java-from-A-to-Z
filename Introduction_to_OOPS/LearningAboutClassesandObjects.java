// Here we going to learn about how to create a class and objects in java.
package Introduction_to_OOPS;

class Person{
    String name;
    int age;
    char Gender;
    String food;

    void talk(){
        System.out.println(name + " is talking...");
    }
    void eat(){
        System.out.println(name + " is eating a "+ food);
    }
}
public class LearningAboutClassesandObjects {
    public static void main(String [] args){
        Person Raju = new Person();
        Person Sita = new Person();
        Raju.name = "Raju";
        Raju.age = 25;
        Raju.Gender = 'M';
        Raju.food = "Mango";
        Raju.talk();
        Raju.eat();
        Sita.name = "Sita";   
        Sita.age = 21;
        Sita.Gender = 'F';
        Sita.food = "Apple";
        Sita.talk();
        Sita.eat();
    }
}
