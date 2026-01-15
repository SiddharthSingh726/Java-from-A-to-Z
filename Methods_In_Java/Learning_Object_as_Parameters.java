package Methods_In_Java;

import java.util.Scanner;

class Employee{
    double salary;
    double tax;

    void entering(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Salary: ");
        salary = sc.nextDouble();
    }

        Employee calculateTax(Employee obj) {
            if (obj.salary <= 50000) {
                obj.tax = 0;
            } else if (obj.salary <= 100000) {
                obj.tax = obj.salary * 0.10;
            } else {
                obj.tax = obj.salary * 0.20;
            }
            return obj;
    }
}
public class Learning_Object_as_Parameters {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.entering();
        Employee e2 = e1.calculateTax(e1);

        System.out.println("The tax is " + e1.tax);
        System.out.println("The salary is " + e1.salary);
    }
}
