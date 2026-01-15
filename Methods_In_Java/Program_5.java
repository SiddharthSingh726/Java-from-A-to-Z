// Write a program to test whether a static method can access the instance variable or not.
/*package Methods_In_Java;

class Testing{
    int x;
    Testing(int x){
        this.x=x;
    }
    static void access(){
        System.out.println("x = "+x);
    }
}
public class Program_5 {
    public static void main(String[] args) {
        Testing obj =  new Testing(10);
        obj.access();
    }
}*/
/* As here it is giving error as :-
   java: non-static variable x cannot be referenced from a static context it means static method not accessing the instance
   variables.

   But a static method can access static variables. Static variables are also declared as 'static'. In the following program, we
   are declaring x as a static variable. Now it is accessible in the static method access().
 */