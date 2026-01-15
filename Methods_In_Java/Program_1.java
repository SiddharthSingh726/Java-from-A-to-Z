package Methods_In_Java;

class Summing{
    double a,b;
    Summing(double a,double b){
        this.a=a;
        this.b=b;
    }

    void add(){
        double sum =a+b;
        System.out.println(sum);
    }
}
public class Program_1 {
    public static void main(String[] args) {
        Summing obj=new Summing(10,22.5);
        obj.add();
    }
}
