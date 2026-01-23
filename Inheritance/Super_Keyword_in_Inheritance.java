package Inheritance;

class Mobile{
    String name;
    void show(){
        System.out.println("There are many Mobile Companies "+name);
    }
}
class Nokia extends Mobile{
    void show(){
        super.name="Nokia";
        super.show();
        System.out.println("There is "+ name+" as a  Mobile Companies");
    }
}
public class Super_Keyword_in_Inheritance {
    public static void main(String[] args) {
        Mobile m = new Nokia();
        m.show();
    }
}
