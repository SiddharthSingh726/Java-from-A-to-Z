package Type_Casting;

class Pro{
    void Typecasting(){
        char a  = 'A';
        int b = (int)a; //type casting
        System.out.println(b);
    }
}
class Pro2 extends Pro{
    void Typecasting(){
        super.Typecasting();
        int a = (int)'A';
        float c =  (float)a;
        System.out.println(c);
    }
}
public class Program_1 {
    public static void main(String[] args) {
        Pro2 p = new Pro2();
        p.Typecasting();
    }
}
