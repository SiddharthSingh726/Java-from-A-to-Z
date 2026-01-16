//Let us make a program by taking a static variable x in the Test2 class.
package Methods_In_Java;

import java.util.Scanner;

class Test2{
    static int a;

    void entering(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        a=sc.nextInt();
    }

    static void display(){
        System.out.println("a="+a);
    }
}
public class Program_8 {
    public static void main(String[] args) {
        Test2 obj=new Test2();
        Test2 obj1=new Test2();
        obj.entering();
        ++obj.a;
        obj.display();
        obj1.display();
    }
}
/* Class variable (static variable) will have only one copy in memory and that is shared by all the objects, any modifications to it
   will also affect other objects.

   After executing static methods, JVM create the objects. So the instance variables of the objects are not available to static variable.

   The execution sequence of JVM is the process where JVM executes first to all any static blocks in the java program.Then it executes
   static methods(remember main() is a static method) and then it creates any objects needed by the program. Finally, it executes the
   instance methods.
 */
