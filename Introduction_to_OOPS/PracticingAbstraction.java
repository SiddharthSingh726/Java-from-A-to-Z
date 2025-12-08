// Practicing Abstraction Questions. Where we have abstract class named as Payment and subclasses UPI,Card,Cash.
package Introduction_to_OOPS;

abstract class Payment{
    abstract void pay();
}
class UPI extends Payment {
    @Override
    void pay() {
        System.out.println("Paying through UPI...");
    }
}
class Card extends Payment {
    @Override
    void pay() {
        System.out.println("Paying through Card...");
    }
}
class Cash extends Payment {
    @Override
    void pay() {
        System.out.println("Paying through Cash...");
    }
}
public class PracticingAbstraction {
    public static void main(String [] args){
        Payment upi = new UPI();
        Payment card = new Card();
        Payment cash = new Cash();
        upi.pay();
        card.pay();
        cash.pay();
    }
}
