// Let us make a program to access an instance variable 'x' and a local variable b from the method access().
package Methods_In_Java;

class Sample2{
    private int x; // instance variable.
    void modify(int a){
        x = a; // x is local variable.
    }
    void access(){
        System.out.println("x = " + x);
        //System.out.println("a = " + a); It is showing error here...
    }
}
public class Program_12 {
    public static void main(String[] args) {
        Sample2 s = new Sample2();
        s.modify(10);
        s.access();
    }
}

/* A local variable is a variable declared inside a method, constructor, or block.
   It can be accessed only within that method, constructor, or block and cannot be used outside it.

   Limited to the method / constructor / block
   Local variables must be initialized before use, no default values.

   Stored in stack memory
   Created when method is called
   Destroyed when method ends
   Cannot be static

   | Variable Type | Declared Where            | Scope  | Default Value |
   | ------------- | ------------------------- | ------ | ------------- |
   | Instance      | Inside class              | Object | Yes           |
   | Static        | Inside class              | Class  | Yes           |
   | Local         | Inside method/constructor | Method | ❌ No         |

   Local variables live inside methods and die when the method ends.
   A local variable is declared inside a method or constructor and is accessible only within its scope, with no default value.
*/