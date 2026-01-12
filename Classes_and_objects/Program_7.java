// Write a java program to understand the use of methods in a class.
package Classes_and_objects;

import java.util.Scanner;

class Person9{
    private String name;
    private int age;

    void accept(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name:- ");
        name = sc.nextLine();
        System.out.print("Enter your age:- ");
        age = sc.nextInt();
    }
    void check(){
        if(age <= 30){
            System.out.println(name+" is Young");
        }
            else if(age <= 50){
                System.out.println(name+" is middle age");
            }
                else System.out.println(name+" is older");
            }
        }
public class Program_7 {
    public static void main(String[] args) {
        Person9 p = new Person9();
        p.accept();
        p.check();
    }
}
