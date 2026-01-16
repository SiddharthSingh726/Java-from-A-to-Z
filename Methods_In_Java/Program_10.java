// Write a Java program without main() method. This program compiles but gives an error at runtime.
package Methods_In_Java;

class Test3{
    static {
        System.out.println("Static method");
    }
}

/* Error :- Static Block
            Exception in thread "main" java.lang.NoSuchMethodError: main

   We thought that the main() method is the first one that is given attention by the JVM. This is ok if static block is not
   present in the program. If a static block is present, then JVM executes it first of all. After that, it searches for the main()
   method. IF main() method is not found, it will display an error as shown in the output of the above program.
 */