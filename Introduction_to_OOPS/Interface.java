// In this we going to learn about Interfaces.
package Introduction_to_OOPS;

interface Payment1{
    void pay();
}
class UPI1 implements Payment1{
    public void pay(){
        System.out.println("Paying through UPI");
    }
}
class Card1 implements Payment1{
    public void pay(){
        System.out.println("Paying through Card...");
    }
}
class Cash1 implements Payment1{
    public void pay(){
        System.out.println("Paying through Cash...");
    }
}
public class Interface {
    public static void main(String [] args){
        Payment1 p1 = new UPI1();
        Payment1 p2 = new Card1();
        Payment1 p3 = new Cash1();

        p1.pay();
        p2.pay();
        p3.pay();
    }
}
