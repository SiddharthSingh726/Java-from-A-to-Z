// Write a Java program without main() method. This program compiles and also runs.
package Methods_In_Java;

class Test4 {
    static {
        System.out.println("Static static method");
        System.exit(0);
    }
}

// We can cheat the JVM by terminating it before it realized that there us no main() method in the program.