// Let us try to make a program to interchange two Employee objects by passing them to swap() method.
package Methods_In_Java;

class Employee1{
     int id;
     Employee1(int id){
        this.id = id;
    }
    }
class Check1{
    void swap(Employee1 e1,Employee1 e2){
        Employee1 temp = e1;
        e1 = e2;
        e2 = temp;
    }
}
public class Program_16 {
    public static void main(String[] args) {
        Employee1 e1 = new Employee1(10);
        Employee1 e2 = new Employee1(20);
        Check1 obj = new Check1();
        System.out.println(e1.id+"\t"+e2.id);
        obj.swap(e1,e2);
        System.out.println(e1.id+"\t"+e2.id);
    }
}

/* We can pass objects to methods, and returns objects from the methods.For example:-
   Employee myMethod(Employee obj){
            statements;
            return obj;
       }

    myMethod() is a method that accepts Employee class object. So the reference of Employee class is declared as parameter in
    myMethod(). After doing some processing on the object, if it returns the same object, we can write a statement like:-
    return obj;

    Even the objects are also passed to methods by value. This means, when we send am object to a method, its bit by bit copy will
    be sent to the method. Any modifications to  the object inside the method will not affects the original copy outside the method.
    So when we come out of the method, we find the original value unchanged.

    Primitive data types, objects, even references - every thing is passed to method using pass by value or call by value concept.
    This means that bit by bit copy is passed to value.
 */