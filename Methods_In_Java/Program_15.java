// Let us try to interchange two integers 10 and 20 to the swap method.
package Methods_In_Java;

class Check{
    void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
    }
}
public class Program_15 {
    public static void main(String[] args) {
        int num1 = 10, num2 = 20;
        Check c = new Check();
        System.out.println(num1+"\t"+num2);
        c.swap(num1,num2);
        System.out.println(num1+"\t"+num2);
    }
}

/* Primitive data types or fundamental data types represents single entitles or single values. For example, char, byte, short, int,
   long, double and boolean are called primitive data types, because they store single values. They are passes to methods by value.
   This means when we pass primitive data types to methods, a copy of those will be passed to methods. Therefore, any changes made
   to them inside the method will not affect them outside the method.

   The output indicated that the integers are not interchanged. From main() method, we passwd 10 and 20 to swap() method. Inside
   method, they are interchanged. But when we come out of swap() method, again we find the previous values as they are, not interchanged.

   When we send primitive data types linke int,float,char,etc., to a methid, a copy of their values will b sent to the method. So
   any modification to them inside the method will not affect thier original copy. This is also called pass by value or call by value.

   Primitive data types in Java are passed by value.Only copies are sent to methods.
 */