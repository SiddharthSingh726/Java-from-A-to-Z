// Write a method for a static method that accepts data and returns the results.
package Methods_In_Java;

class Sample{
    static double sum(double a,double b){
        double result = a+b;
        return result;
    }
        }
public class Program_4 {
    public static void main(String[] args) {
        double x = Sample.sum(10,22.5);
        System.out.println("The sum of a and b is :- "+x);
    }
}

/*A static method is a method that does not act upon instance variable of a class. A static method is declared by using the keyword
  'static'. Static methods are called using Classname.methodname(). The reason why static methods can not act on instance variables is that
  the JVM first executes the static methods and then only it creates the objects. Since the objects are not available at the time of
  calling the static methods, the instance variables are not available.


  Static method are the method which do not act upon the instance variable of a class. Static method are declared as static.
  So, to call the static methods, we need not create an object. We can call a static method as:
  Classname.methodname();
 */