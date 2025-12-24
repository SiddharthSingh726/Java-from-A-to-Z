//In this we will learn about Encapsulation, getter and setter and privation the variable.
package Introduction_to_OOPS;

class Person1{
    private String name;
    private int age;
    private char Gender;
    private String food;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setAge(int age){
        if(age < 0) {
            System.out.println("Invalid age");
        } else {
            this.age = age;
        }
    }
    public int getAge(){
        return this.age;
    }
    public void setGender(char Gender){
        if(Gender == 'M' || Gender == 'F') {
            this.Gender = Gender;
        } else {
            System.out.println("Invalid gender");
        }
    }
    public char getGender(){
        return this.Gender;
    }
    public void setFood(String food){
        this.food = food;
    }
    public String getFood(){
        return this.food;
    }
    void talk(){
        System.out.println(name +" is talking...");
    }
    void eat(){
        System.out.println(name +" is eating "+ food);
    }
}
public class Encapsulation {
    public static void main(String [] args){
        Person1 Raju = new Person1();
        Person1 Sita = new Person1();
        Raju.setName("Raju");
        Raju.setAge(21);
        Raju.setGender('M');
        Raju.setFood("Banana");
        System.out.println(Raju.getFood());
        System.out.println(Raju.getAge());
        System.out.println(Raju.getGender());
        System.out.println("-----------------------------------------------");
        Sita.setName("Sita");
        Sita.setAge(19);
        Sita.setGender('F');
        Sita.setFood("Apple");
        System.out.println(Sita.getFood());
        System.out.println(Sita.getAge());
        System.out.println(Sita.getGender());
        Raju.talk();
        Raju.eat();
        Sita.talk();
        Sita.eat();
    }
}
