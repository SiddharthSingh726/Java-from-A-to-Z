package Introduction_to_OOPS;

abstract class BankView {
    abstract void viewCustomerData();
    abstract void viewBankFinancialData();
}

class Clerk extends BankView {
    @Override
    void viewCustomerData() {
        System.out.println("=== Clerk View ===");
        System.out.println("Customer Name: Raju");
        System.out.println("Account Number: 1000001");
        System.out.println("Balance: ₹50,000");
    }

    @Override
    void viewBankFinancialData() {
        System.out.println("Access Denied: Clerk cannot view bank financial details.");
    }
}

class Manager extends BankView {
    @Override
    void viewCustomerData() {
        System.out.println("=== Manager View ===");
        System.out.println("Customer Name: Raju");
        System.out.println("Account Number: 1000001");
        System.out.println("Balance: ₹50,000");
    }

    @Override
    void viewBankFinancialData() {
        System.out.println("=== Financial Report ===");
        System.out.println("Bank Profit: ₹5,00,00,000");
        System.out.println("Bank Loss: ₹50,00,000");
        System.out.println("Total Loan Amount to Recover: ₹12,00,00,000");
        System.out.println("Total Salary Paid to Staff: ₹80,00,000");
    }
}

class Admin extends BankView {
    @Override
    void viewCustomerData() {
        System.out.println("Admin: Full access to customer details.");
    }

    @Override
    void viewBankFinancialData() {
        System.out.println("Admin: Full access to bank financial data.");
    }
}

public class PracticingAbstraction2 {
    public static void main(String[] args) {

        BankView clerk = new Clerk();
        BankView manager = new Manager();
        BankView admin = new Admin();

        System.out.println("\n--- Clerk Access ---");
        clerk.viewCustomerData();
        clerk.viewBankFinancialData();

        System.out.println("\n--- Manager Access ---");
        manager.viewCustomerData();
        manager.viewBankFinancialData();

        System.out.println("\n--- Admin Access ---");
        admin.viewCustomerData();
        admin.viewBankFinancialData();
    }
}
