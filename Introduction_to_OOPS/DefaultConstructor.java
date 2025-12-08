// We going to learn about default Constructor and Parameterized Constructor.
package Introduction_to_OOPS;

class Person2{
    String name;
    int age;
    char gender;
    String food;
    Person2(){
        System.out.println("The Default Constructor is called...");
    }
    Person2(String name){
        this.name = name;
    }
    Person2(String name, int age, char gender, String food) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.food = food;
    }
    void talk(){
        System.out.println(name+ " is talking... ");
    }
    void eat(){
        System.out.println(name+ " is eating "+food);
    }
}
public class DefaultConstructor {
    public static void main(String [] args){
        Person2 Raju = new Person2("Raju",25,'M',"Mango");
        Person2 unknown = new Person2();
        Person2 Sita = new Person2("Sita");
        Raju.talk();
        Raju.eat();
        Sita.talk();
        Sita.eat();
    }
}
