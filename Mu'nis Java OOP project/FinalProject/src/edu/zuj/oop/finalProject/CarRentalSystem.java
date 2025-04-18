package edu.zuj.oop.finalProject;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class CarRentalSystem {
    
    private ArrayList<Car>cars=new ArrayList<>();
    private ArrayList<Customer>customers=new ArrayList<>();
    private ArrayList<Rental>rentals=new ArrayList<>();
    
    public void addCar(Car car){
    cars.add(car);
    }
    
    public void addCustomer(Customer customer){
    customers.add(customer);
    }
    
    public void rentCar(String customerId, String model, int hours) {
        Customer customer = findCustomer(customerId);
        Car car = findCar(model);

        if (customer != null && car != null ) {
            
            Rental rental = new Rental(car, customer, hours);
            rentals.add(rental);
            System.out.println("Rental Successful: " + rental);
        } else {
            System.out.println("Rental Failed: Car not available or invalid IDs.");
        }}
    
    private Customer findCustomer(String customerId) {
        for (Customer customer : customers) {
            if (customer.getCustomerId().equals(customerId)) {
                return customer;
            }
        }
        return null;}
    
    private Car findCar(String model){
    
        for (Car car : cars) {
            if(car.getModel().equals(model)){
                return car;}
        }
        return null;}

    
    public void displayCars(){
        System.out.println("Available Cars :");
        for (Car car : cars) {
         System.out.println(car.getType() + " - " + car.getModel() + " ($" + car.getPricePerHour() + "/hour)");
        }
    }
    
    public void diplayRentals(){
        System.out.println("Current Rentals :");
        for (Rental rental : rentals) {
            System.out.println(rental.getCar()+"\n"+rental.getCustomer()+"\n"+rental.getRentalHours());
        }
    }
    
    public static void main(String[] args) {
      CarRentalSystem system= new CarRentalSystem();
      
      //Add cars
      system.addCar(new Sedan("Toyota Corolla","3423",20));
      system.addCar(new Sedan("Toyota Camry","3492",25));
      system.addCar(new Sedan("Toyota Yaris","9283",20));
      system.addCar(new Suv("Toyota Rav4","2343",40));
      system.addCar(new Suv("Toyota Land Cruiser","3212",100));
      system.addCar(new Suv("Toyota Highlander","1233",60));
      
      //add customers
      system.addCustomer(new Customer("2030129","Ahmad",07723563));
      system.addCustomer(new Customer("2234565","Anas",0771232));
      
      //renting cars
      system.rentCar("2030129","Toyota Rav4", 4);
      
      
      Scanner in=new Scanner(System.in);
      int choice = -1;
      
      do{
          System.out.println("Car Rental System");
          System.out.println("1. Display Cars");
          System.out.println("2. Rent a Car");
          System.out.println("3. Display Rentals");
          System.out.println("4. Exit");
          System.out.println("What can i help you :");
          
          if(in.hasNextInt()){
          choice=in.nextInt();
          in.nextLine();
          }
          
          switch(choice){
              case 1:
                  system.displayCars();
                  break;
              case 2:
                  System.out.println("Enter Customer ID:");
                  String customerId=in.next();
                  System.out.println("Enter Car ID: ");
                  String carId=in.next();
                  System.out.println("Enter Rental Hours: ");
                  int hours=in.nextInt();
                  system.rentCar(customerId, carId, hours);
                  break;
              case 3:
                  system.diplayRentals();
                  break;
              case 4: 
                  System.out.println("Exiting system, Goodbye");
                  break;
              default:System.out.println("Invalid choice. Try again");
          }
      }while(choice != 4);
    }
    
}
