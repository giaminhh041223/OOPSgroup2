package HustBookStore;

public class Customer {
    private String phoneNumber;
    private String name;
    private int creditPoint;

    public Customer(String phoneNumber, String name, int creditPoint) {
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.creditPoint = creditPoint;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }

    public int getCreditPoint() {
        return creditPoint;
    }

    public void redeemPoints(int points) {
        if (creditPoint >= points) {
            creditPoint -= points;
            System.out.println(points + " points redeemed successfully!");
        } else {
            System.out.println("Insufficient points to redeem.");
        }
    }
}