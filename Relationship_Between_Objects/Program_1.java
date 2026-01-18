/* Write a program to take class One and class Two, create the reference of class Two in class One. Using the reference,
   let us refer to instance variables and methods of class Two.
*/
package Relationship_Between_Objects;

class One{
    int a; // Instance variable of class One
    Two t; // Reference variable of class Two
    One(Two t,int a){
        this.t=t;
        this.a=a;
    }

    void display(){
        System.out.println("One's x = "+a);
        t.display();
        System.out.println("Two's x = "+t);
    }
}
class Two{
    int b;
    Two(int b){
        this.b = b;
    }
    void display(){
        System.out.println("Two's b = "+b);
    }
}
public class Program_1 {
    public static void main(String[] args) {
        Two two = new Two(22);
        One one = new One(two,10);
        one.display();
    }
}
