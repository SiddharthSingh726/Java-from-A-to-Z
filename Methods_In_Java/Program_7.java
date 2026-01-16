//Lut us make a program by taking an instance variable x in the Test class
package Methods_In_Java;

import java.util.Scanner;

class Test{
    int a;

    void entering(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        a=input.nextInt();
    }

    void display(){
        System.out.println(a);
    }
}
public class Program_7 {
    public static void main(String[] args) {
        Test obj=new Test();
        Test obj1=new Test();
        obj.entering();
        obj1.entering();
        ++obj.a;
        System.out.print("x in obj:- ");
        obj.display();
        System.out.print("x in obj1:- ");
        obj1.display();
    }
}
/*   Final one-line rule
     Instance variable → input per object
     Static variable → input once for all objects

   Instance variable will have a separate copy in each object, when the value of an instance variable is modified in an object, it
   does not affect the instance variables in other objects.
 */