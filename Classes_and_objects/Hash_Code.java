package Classes_and_objects;

class Person1{
    String name;
    int age;
    void talk(){
        System.out.println("Hello World!! My name is "+name+" and my age is "+age);
    }
}
public class Hash_Code {
    public static void main(String [] args){
        Person1 p1=new Person1();
        System.out.println(p1.hashCode()); // here this hashcode() method will help to know the reference id.
        p1.name = "Sid";
        p1.age = 24;
        p1.talk();
    }
}
