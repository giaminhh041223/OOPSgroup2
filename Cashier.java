package HustBookStore;

import java.util.ArrayList;
import java.util.Date;


public class Cashier {
    private ArrayList<Customer> customerList = new ArrayList<>();

    public void createReceipt(String id, String cashierName, Date date, Product product, float totalCost) {
        Receipt receipt = new Receipt(id, cashierName, date, product, totalCost);
        receipt.displayReceipt();
    }

    public void createCart() {
        Cart cart = new Cart();
        System.out.println("New cart created.");
    }
}