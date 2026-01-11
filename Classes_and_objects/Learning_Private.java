// We are going to learn private modifier.
package Classes_and_objects;

 class Person6{
    private String name = "Vansh";
    private int age = 24;

    void talk(){
        System.out.println(name +" is talking and age is "+ age);
    }
}
 public class Learning_Private {
    public static void main(String[] args) {
        Person6 p6 = new Person6();
        /*p6.name = "Raju";  here these are showing error --> java: name has private access in Classes_and_objects.Person6
        p6.age = 23;   which means using private modifier protects the original data. */
        p6.talk();
    }
}
