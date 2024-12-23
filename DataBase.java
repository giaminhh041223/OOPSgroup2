package HustBookStore;

import java.util.ArrayList;

public class DataBase {
    private ArrayList<Employee> employees = new ArrayList<>();
    private ArrayList<Product> products = new ArrayList<>();
    private ArrayList<Customer> customers = new ArrayList<>();

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }
}

