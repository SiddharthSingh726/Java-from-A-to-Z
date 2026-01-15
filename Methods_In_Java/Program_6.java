// Write a program to test weather a static method can access the static variable or not.
package Methods_In_Java;

import java.util.Scanner;

class Sample1{
    static int a;

    void enter(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        a=sc.nextInt();
    }
    static void access(){
        System.out.println("x = "+a);
    }
    void entering(){
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        System.out.println("Entering");
    }
}
public class Program_6 {
    public static void main(String[] args) {
        Sample1 s=new Sample1();
        s.enter();
        Sample1.access();
    }
}
/* 1.The other name of static variable is 'class variable' and for static method is 'class method'.
   2.An instance variable is a variable whose separate copy is available to each object. A class variables is a variable whose single
     copy in memory is shared by all objects.
   3.Instance variables are created in the objects on heap memory. Class variables are stored on method area.
 */