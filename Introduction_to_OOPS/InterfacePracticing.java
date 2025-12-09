package Introduction_to_OOPS;

interface Bank {
    void viewCustomerData();
    void viewBankFinancialData();
}

class Clerk1 implements Bank {
    @Override
    public void viewCustomerData() {
        System.out.println("=== Clerk View ===");
        System.out.println("Customer Name: Raju");
        System.out.println("Account Number: 1000001");
        System.out.println("Balance: ₹50,000");
    }

    @Override
    public void viewBankFinancialData() {
        System.out.println("Access Denied: Clerk cannot view bank financial details.");
    }
}

class Manager1 implements Bank {
    @Override
    public void viewCustomerData() {
        System.out.println("=== Manager View ===");
        System.out.println("Customer Name: Raju");
        System.out.println("Account Number: 1000001");
        System.out.println("Balance: ₹50,000");
    }

    @Override
    public void viewBankFinancialData() {
        System.out.println("=== Financial Report ===");
        System.out.println("Bank Profit: ₹5,00,00,000");
        System.out.println("Bank Loss: ₹50,00,000");
        System.out.println("Total Loan Amount to Recover: ₹12,00,00,000");
        System.out.println("Total Salary Paid to Staff: ₹80,00,000");
    }
}

class Admin1 implements Bank {
    @Override
    public void viewCustomerData() {
        System.out.println("=== Admin View ===");
        System.out.println("Full access to customer details.");
    }

    @Override
    public void viewBankFinancialData() {
        System.out.println("=== Admin Financial Access ===");
        System.out.println("Full access to bank financial data.");
    }
}

public class InterfacePracticing {
    public static void main(String[] args) {

        Bank p1 = new Clerk1();
        Bank p2 = new Admin1();
        Bank p3 = new Manager1();

        System.out.println("\n--- Clerk Access ---");
        p1.viewCustomerData();
        p1.viewBankFinancialData();

        System.out.println("\n--- Admin Access ---");
        p2.viewCustomerData();
        p2.viewBankFinancialData();

        System.out.println("\n--- Manager Access ---");
        p3.viewCustomerData();
        p3.viewBankFinancialData();
    }
}
