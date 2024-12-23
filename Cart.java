package HustBookStore;

import java.util.ArrayList;

public class Cart {
    private ArrayList<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public double totalCost() {
        double total = 0;
        for (Product product : products) {
            total += product.getSellingPrice();
        }
        return total;
    }

    public void displayCart() {
        System.out.println("Cart Contents:");
        for (Product product : products) {
            System.out.println("ID: " + product.getId() + ", Name: " + product.getName() + ", Price: " + product.getSellingPrice());
        }
    }
}
