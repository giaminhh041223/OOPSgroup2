package HustBookStore;

import java.util.Scanner;

public class Admin {
    private DataBase dataBase = new DataBase();

    public void addProduct(Product product) {
        dataBase.getProducts().add(product);
        System.out.println("Product added successfully: " + product.getName());
    }

    public void viewStore() {
        System.out.println("Store Inventory:");
        for (Product product : dataBase.getProducts()) {
            System.out.println("ID: " + product.getId() + ", Name: " + product.getName() + ", Quantity: " + product.getQuantity());
        }
    }

    public void processOrder(int productId, int quantity) {
        for (Product product : dataBase.getProducts()) {
            if (product.getId() == productId) {
                if (product.getQuantity() >= quantity) {
                    product.setQuantity(product.getQuantity() - quantity);
                    System.out.println("Order processed. Remaining stock for " + product.getName() + ": " + product.getQuantity());
                } else {
                    System.out.println("Insufficient stock for product: " + product.getName());
                }
                return;
            }
        }
        System.out.println("Product not found.");
    }

    public void showCosts() {
        Finance finance = new Finance();
        System.out.println("Total Costs:");
        System.out.println("Purchase Cost: " + finance.calculatePurchaseCost());
        System.out.println("Other Costs: " + finance.calculateOtherCosts());
    }

    public void saveData() {
        System.out.println("Data has been saved to the database.");
        // Implement file handling if needed
    }

    public void loadData() {
        System.out.println("Data has been loaded from the database.");
        // Implement file handling if needed
    }

    public static void main(String[] args) {
        Admin admin = new Admin();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n=== HUST Book Store Management ===");
            System.out.println("1. Add Product");
            System.out.println("2. View Store");
            System.out.println("3. Process Order");
            System.out.println("4. Show Costs");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("Choose product type: 1. Book, 2. Stationary, 3. Toy");
                    int productType = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    System.out.print("Enter Product ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter Product Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter Purchase Price: ");
                    double purchasePrice = scanner.nextDouble();

                    System.out.print("Enter Selling Price: ");
                    double sellingPrice = scanner.nextDouble();

                    System.out.print("Enter Quantity: ");
                    int quantity = scanner.nextInt();
                    scanner.nextLine();

                    if (productType == 1) {
                        System.out.print("Enter Publisher: ");
                        String publisher = scanner.nextLine();

                        System.out.print("Enter Author: ");
                        String author = scanner.nextLine();

                        System.out.print("Enter ISBN: ");
                        String isbn = scanner.nextLine();

                        Book book = new Book(id, name, purchasePrice, sellingPrice, quantity, publisher, author, isbn);
                        admin.addProduct(book);

                    } else if (productType == 2) {
                        System.out.print("Enter Brand: ");
                        String brand = scanner.nextLine();

                        System.out.print("Enter Stationary Type: ");
                        String stationaryType = scanner.nextLine();

                        Stationary stationary = new Stationary(id, name, purchasePrice, sellingPrice, quantity, brand, stationaryType);
                        admin.addProduct(stationary);

                    } else if (productType == 3) {
                        System.out.print("Enter Brand: ");
                        String brand = scanner.nextLine();

                        System.out.print("Enter Suitable Age: ");
                        String suitableAge = scanner.nextLine();

                        Toy toy = new Toy(id, name, purchasePrice, sellingPrice, quantity, brand, suitableAge);
                        admin.addProduct(toy);
                    } else {
                        System.out.println("Invalid product type.");
                    }
                    break;

                case 2:
                    admin.viewStore();
                    break;

                case 3:
                    System.out.print("Enter Product ID to Order: ");
                    int orderId = scanner.nextInt();

                    System.out.print("Enter Quantity: ");
                    int orderQuantity = scanner.nextInt();

                    admin.processOrder(orderId, orderQuantity);
                    break;

                case 4:
                    admin.showCosts();
                    break;

                case 5:
                    running = false;
                    System.out.println("Exiting system...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
