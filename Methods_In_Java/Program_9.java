// Write a program to test which ine is executed first by JVM, the static block or the static method.
package Methods_In_Java;

class test3{
    static{
        System.out.println("Static bock");
    }
    public static void main(String[] args) {
        System.out.println("Static method");
    }
}

/* Static blocks execute during class loading, before the main() method, but main() is mandatory for program execution.

   A static block is a block of statements declared as 'static', something like this:-
   static{
            statement;
    }

   JVM executed a static block on a highest priority basis. This means JVM first goes to a static block even before it looks for main()
   method in the program.
 */