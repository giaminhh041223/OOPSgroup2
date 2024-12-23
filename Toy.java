package HustBookStore;

public class Toy extends Product {
    private String brand;
    private String suitableAge;

    public Toy(int id, String name, double purchasePrice, double sellingPrice, int quantity, String brand, String suitableAge) {
        super(id, name, purchasePrice, sellingPrice, quantity);
        this.brand = brand;
        this.suitableAge = suitableAge;
    }

    public String getBrand() {
        return brand;
    }

    public String getSuitableAge() {
        return suitableAge;
    }
}