package Polymorphism;

class Person{
     int add(int a , int b){
        return a+b;
    }
    int add(int a, int b, int c){
        return a+b+c;
    }
}
public class Program_1 {
    public static void main(String[] args) {
        Person p1 = new Person();
        int t = p1.add(1,2);
        int t2 = p1.add(2,3,4);
        System.out.println(t);
        System.out.println(t2);
    }
}
