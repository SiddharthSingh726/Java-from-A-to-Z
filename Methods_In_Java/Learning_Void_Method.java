package Methods_In_Java;

import java.util.Scanner;

class Person{
    private String name;
    private int age;

    void entering(){
        System.out.print("enter name :- ");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        System.out.print("enter age :- ");
        age = sc.nextInt();
    }
    void information(){
        System.out.println(name+" is my name.");
        System.out.println(age+" is my age.");
    }
}
public class Learning_Void_Method {
    public static void main(String[] args) {
        Person p = new Person();
        p.entering();
        p.information();
    }
}
