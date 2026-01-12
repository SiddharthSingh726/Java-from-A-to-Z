package Classes_and_objects;

class Student {
    //Instance variables using private to restrict the visibility of members outside the class.
    private String name;
    private int age;
    // Default constructor
    Student() {
        name = "Sam";
        age = 18;
    }
    void talk(){
        System.out.println("Hello my name is " + name);
        System.out.println("Hello my age is " + age);
    }
}
public class Program_5 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        s1.talk();
        s2.talk();
    }
}
