package edu.zuj.oop.finalProject;


public class Sedan extends Car{

    public Sedan(String carId,String type,double pricePerHour) {
        super(carId,"Sedan", pricePerHour);
        
    }
    public double calculateRentalCost(int hour){
    return hour * pricePerHour;  
    
    }
    
}
