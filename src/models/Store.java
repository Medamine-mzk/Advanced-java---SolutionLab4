package models;

import java.util.ArrayList;
import java.util.List;
public class Store {
    private int id;
    private String name;
    private String address;
    private List<Product> products = new ArrayList<>();
    private List<Employee> employees = new ArrayList<>();
    private int capacity = 50;

    public Store(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public void addEmployee(Employee employee) {
        if (employees.size() < 20) {
            employees.add(employee);
        } else {
            System.out.println("Maximum employee capacity reached!");
        }
    }

    public void addProduct(Product product) {
        if (products.size() < capacity) {
            products.add(product);
        } else {
            System.out.println("Store is at full capacity!");
        }
    }
    public List<Employee> getEmployees() {
        return employees;
    }

    public void displayDetails() {
        System.out.println("Store ID: " + id + ", Name: " + name + ", Address: " + address);
        System.out.println("Products: " + products);
        System.out.println("Employees: ");
        employees.forEach(System.out::println);
    }
}
