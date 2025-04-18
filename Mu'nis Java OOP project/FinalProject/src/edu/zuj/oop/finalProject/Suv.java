package edu.zuj.oop.finalProject;

public class Suv extends Car{
    public Suv(String carId,String type,double pricePerHour) {
        super(carId,"SUV", pricePerHour);
        
    }
    public double calculateRentalCost(int hour){
    return hour * pricePerHour;  
    
    }
}
