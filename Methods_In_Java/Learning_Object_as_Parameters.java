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

        Employee calculateTax(Employee e1) {
            if (e1.salary <= 50000) {
                e1.tax = 0;
            } else if (e1.salary <= 100000) {
                e1.tax = e1.salary * 0.10;
            } else {
                e1.tax = e1.salary * 0.20;
            }
            return e1;
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
// A method can accept an object as a parameter, modify it, and return the same or another object.