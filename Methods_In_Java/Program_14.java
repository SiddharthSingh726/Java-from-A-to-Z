// Write a program to create Person class object.
package Methods_In_Java;

class Person1{
    private String name;
    private int age;

    //Mutator Methods
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }

    // Accessor Methods
    String getName(){
        return this.name;
    }
    int getAge(){
        return this.age;
    }
}
public class Program_14 {
    public static void main(String[] args) {
        Person1 p1 = new Person1();
        p1.setName("Jack");
        p1.setAge(23);
        System.out.println(p1.getName());
        System.out.println(p1.getAge());
    }
}

/* Instance methods are the which act upon the instance variables. To call the instance methods, objects is needed, since the
   instance variables are contained in the objects. We call the instance methods by using objectname.methodname(). The specialty
   of instance methods is that they can access not only instance variables but also static variables directly.

   There are two types of instance methods.
   1. Accessor methods
   2. Mutator methods

   Accessor methods are the methods that simply access or read the instance variables. They do not modify the instance variables.
   Mutator methods not only accesses the instance variables byt also modify them.

 */