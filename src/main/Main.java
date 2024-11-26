package main;

import models.*;

import java.util.Date;
public class Main {
    public static void main(String[] args) {
        // Create stores
        Store store1 = new Store(1, "Carrefour", "City Center");
        Store store2 = new Store(2, "Monoprix", "Menzah 6");

        // Create employees for store1
        store1.addEmployee(new Cashier(101, "Alice", "Downtown", 190, 1));
        store1.addEmployee(new Cashier(102, "Bob", "Uptown", 160, 2));
        store1.addEmployee(new Salesperson(103, "Charlie", "Suburb", 150, 0.5));
        store1.addEmployee(new Manager(104, "Diana", "City Center", 170, 200));

        // Create employees for store2
        store2.addEmployee(new Cashier(201, "Eve", "Westside", 185, 3));
        store2.addEmployee(new Salesperson(202, "Frank", "Eastside", 140, 0.7));
        store2.addEmployee(new Salesperson(203, "Grace", "Midtown", 160, 0.6));
        store2.addEmployee(new Salesperson(204, "Hank", "Northside", 130, 0.8));
        store2.addEmployee(new Manager(205, "Ivy", "Southside", 175, 300));

        // Add products to stores
        store1.addProduct(new Product(1011, "Milk", "Delight", 0.700));
        store1.addProduct(new Product(1012, "Yogurt", "Vitalait", 1.200));
        store2.addProduct(new Product(2011, "Bread", "Bakery", 0.500));
        store2.addProduct(new Product(2012, "Tomato", "Sicam", 0.900));

        // Display details of each store
        System.out.println("Details of Store 1:");
        store1.displayDetails();

        System.out.println("\nDetails of Store 2:");
        store2.displayDetails();

        // Calculate and display salaries
        System.out.println("\nSalaries:");
        store1.getEmployees().forEach(e -> System.out.println(e + ", Salary: " + e.calculateSalary() + " DT"));
        store2.getEmployees().forEach(e -> System.out.println(e + ", Salary: " + e.calculateSalary() + " DT"));
    }
}

