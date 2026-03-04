package Introduction_to_Oops_Part_2;

class Student {
    String name; //State/Property

    void studying(){ //Behaviour/Method
        System.out.println(name + " Student is studying");
    }
}
public class Example_1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Siddharth Singh";
        s1.studying();
    }
}
