// We going to learn about Inheritance Overriding.
package Introduction_to_OOPS;

class Animal4{
    String name;
    void talk(){
        System.out.println("I am a talking");
    }
}
class Parrot extends Animal4{
    @Override
    void talk() {
            System.out.println("Parrot can Speak");
    }
}
public class InheritanceMethodOverriding {
    public static void main(String [] args){
        Parrot p = new Parrot ();
        p.talk();
    }
}
