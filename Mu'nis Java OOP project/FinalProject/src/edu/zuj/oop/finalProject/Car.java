package edu.zuj.oop.finalProject;

abstract class Car {

protected String carId; //98.8787
protected String type; //sedan or SUV
protected String model; // Ex. Toyota corolla
protected double pricePerHour; // rental price per hour
private boolean available; //availablity of the car


public Car() {
        // default constructuer
        this.carId="Unkown";
        this.type = "Unknown";
        this.model = "Unknown";
        this.pricePerHour = 0.0;
}

    

public Car(String type, String model, double pricePerHour) {
        this.carId=carId;
        this.type = type;
        this.model = model;
        this.pricePerHour = pricePerHour;
        this.available=true;
    }

    
    public String getCarId() {
        return carId;
    }

    
    public String getType() {
        return type;
    }

    public String getModel() {
        return model;
    }

    
    public double getPricePerHour() {
        return pricePerHour;
    }
    
    public boolean Available() {
        return available;
    }

    public void setAvailable(boolean isAvailable) {
        this.available = isAvailable;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPricePerHour(double pricePerHour) {
        this.pricePerHour = pricePerHour;
    }
    public abstract double calculateRentalCost(int hours);

    @Override
    public String toString() {
        return "Car{" + "carId=" + carId + ", type=" + type + ", model=" + model + ", pricePerHour=" + pricePerHour + '}';
    }

    


    
}
