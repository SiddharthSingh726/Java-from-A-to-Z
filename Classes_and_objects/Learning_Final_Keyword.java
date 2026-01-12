//Learning about Final_Keyword
package Classes_and_objects;

final class Animal1{  // here i used final before a class so now the class will not inherit.
    //final Animal1(){} here final keyword is not used with the constructors.
    final String name = "Raghu"; // here i used final before a instance variable now its assigned value cannot be changed.
    final int age = 25; // each object gets its own constant copy of final instance variables
    final static char gender = 'M'; // only one constant copy exists, shared by all objects

    final void talk(){ // here i used final before a method so the method cannot be overridden but can be inherited
        System.out.println(name +"is talking and having age of "+ age+" his Gender is "+gender);
    }
    //class Dod extends Animal1{} if i used final before a class than that class cannot be inherited
}
public class Learning_Final_Keyword {
    public static void main(String [] args){
      final int a = 2; // if a declared a variable with a final means it cannot be changed later.
      Animal1 a1 = new Animal1();
      //a1.name = "Vansh" here i am trying to change the data but it will not happened.
      a1.talk();
    }
}
