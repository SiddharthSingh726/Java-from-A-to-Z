/* Write a program to use this to refer to the current class parameterized constructor as this(), its method as this.method(),
   and its instance variable.*/
package Methods_In_Java;

class Sample3{
    private int x;

    Sample3(){
        this(55);
        this.access();
    }
    Sample3(int x){
        this.x = x;
    }
    void access(){
        System.out.println("x = "+x);
    }
}
public class Program_13 {
    public static void main(String[] args) {
        Sample3 s = new Sample3();
    }
}

/* 'this' is a keyword that refers to the object of the class where it is used. In other words, 'this' refers to the object of the
   present class. Generally, we write instance variables, constructors and methods in a class. All these members are referenced by
   'this'. When an object is created to a class, a default reference is also created internally to the object, This default reference
   is nothing but 'this'. So 'this' can refer to all the things of the present object.

   this is a reference variable that refers to the current object.
 */