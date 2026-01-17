// Write a program to interchange the values inside the object. Since the same object data is modified, we can see the data has interchanged.
package Methods_In_Java;

class Employee3{
    int id1, id2;

    Employee3(int id1, int id2){
        this.id1 = id1;
        this.id2 = id2;
    }

    void swap(Employee3 e3){
        int temp = e3.id1;
        e3.id1 = e3.id2;
        e3.id2 = temp;
    }
}
public class Program_17 {
    public static void main(String[] args) {
        Employee3 e1 = new Employee3(1,2);
        System.out.println(e1.id1+"\t"+e1.id2);
        e1.swap(e1);
        System.out.println(e1.id1+"\t"+e1.id2);
    }
}
