package HustBookStore;

import java.util.ArrayList;

public class History {
    private ArrayList<Product> productHistory = new ArrayList<>();
    private ArrayList<Employee> employeeHistory = new ArrayList<>();
    private ArrayList<Receipt> receiptHistory = new ArrayList<>();
    private ArrayList<Finance> financeHistory = new ArrayList<>();

    public void addProductHistory(Product product) {
        productHistory.add(product);
    }

    public void addEmployeeHistory(Employee employee) {
        employeeHistory.add(employee);
    }

    public void addReceiptHistory(Receipt receipt) {
        receiptHistory.add(receipt);
    }

    public void addFinanceHistory(Finance finance) {
        financeHistory.add(finance);
    }
}

