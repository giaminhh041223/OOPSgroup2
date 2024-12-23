package HustBookStore;

import java.util.Date;

public class Receipt {
    private String id;
    private String cashierName;
    private Date date;
    private Product product;
    private float totalCost;

    public Receipt(String id, String cashierName, Date date, Product product, float totalCost) {
        this.id = id;
        this.cashierName = cashierName;
        this.date = date;
        this.product = product;
        this.totalCost = totalCost;
    }

    public void displayReceipt() {
        System.out.println("Receipt ID: " + id);
        System.out.println("Cashier: " + cashierName);
        System.out.println("Date: " + date);
        System.out.println("Product: " + product.getName() + ", Total Cost: $" + totalCost);
    }
}
