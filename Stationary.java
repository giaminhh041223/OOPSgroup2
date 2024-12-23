package HustBookStore;

public class Stationary extends Product {
    private String brand;
    private String stationaryType;

    public Stationary(int id, String name, double purchasePrice, double sellingPrice, int quantity, String brand, String stationaryType) {
        super(id, name, purchasePrice, sellingPrice, quantity);
        this.brand = brand;
        this.stationaryType = stationaryType;
    }

    public String getBrand() {
        return brand;
    }

    public String getStationaryType() {
        return stationaryType;
    }
}
