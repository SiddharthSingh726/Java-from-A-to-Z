package Inheritance;

// final class Food{ so we can not inherit a final class when using final before class.
class Food{
    String food_name = "Samosa";
    final int cost = 20;

    final void show(){
        System.out.println("food_name:"+food_name);
        System.out.println("cost:"+cost);
    }
    final static void show2(){ //Final static methods cannot be overridden or hidden.
        System.out.println("Food name is Very nice");
    }
}
class Chicken extends Food{

  //  void show(){  we can not override the final method as well when using final before instance method.
        void display(){
            show();
            //int cost = 15; We cannot reassign a final instance variable after initialization.
            System.out.println("food_name:"+food_name);
            System.out.println("cost:"+cost);
    }
}
public class Final_Keyword {
    public static void main(String[] args) {
        Chicken c = new Chicken();
        Food.show2(); // we call a static method using classname.method name
        c.show();
        c.display();
    }
}
