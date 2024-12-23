package HustBookStore;

import java.util.ArrayList;

public class Finance {
    private double fund;
    private double otherCosts;
    private double purchaseCost;

    public double calculatePurchaseCost() {
        return purchaseCost;
    }

    public double calculateOtherCosts() {
        return otherCosts;
    }

    public void paySalaries(ArrayList<Employee> employees) {
        double totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
        }
        if (fund >= totalSalary) {
            fund -= totalSalary;
            System.out.println("Salaries paid successfully. Remaining fund: $" + fund);
        } else {
            System.out.println("Insufficient funds to pay salaries.");
        }
    }
    
}

