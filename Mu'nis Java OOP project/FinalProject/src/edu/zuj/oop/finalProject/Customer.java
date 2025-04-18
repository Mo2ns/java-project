package edu.zuj.oop.finalProject;

public class Customer {
private String customerId;
private String name;
private int contactNumber;

    public Customer() {
        this.customerId="No customer ID";
        this.name="No name";
        this.contactNumber=0;
    }

    public Customer(String customerId, String name, int contactNumber) {
        this.customerId = customerId;
        this.name = name;
        this.contactNumber = contactNumber;
    }

    public int getContactNumber() {
        return contactNumber;
    }


    public String getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Customer{" + "customerId=" + customerId + ", name=" + name + '}';
    }

    
    
}
