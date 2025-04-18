package edu.zuj.oop.finalProject;

public class Rental {
private Car car;
private Customer customer;
private int rentalHours;

    public Rental(Car car, Customer customer, int rentalHours) {
        this.car = car;
        this.customer = customer;
        this.rentalHours = rentalHours;
    }
public double calculateTotalCost(){
return  getCar().calculateRentalCost(getRentalHours());
}


    
    @Override
    public String toString() {
        return "Rental: "+getCustomer().getName()+"rented "+getCar().getModel()+
                " ("+getCar().getType()+") for"+getRentalHours()+" hours. \nTotal cost: $"+calculateTotalCost();
    }

    public Car getCar() {
        return car;
    }

    public Customer getCustomer() {
        return customer;
    }

    public int getRentalHours() {
        return rentalHours;
    }



}
