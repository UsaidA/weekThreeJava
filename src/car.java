import java.io.File;
import java.util.Scanner;

public class car {
    private String registrationNumber;
    private String make;

    private double price;

    public car(String registrationNumber,String make, double price){
        this.registrationNumber = registrationNumber;
        this.make = make;
        this.price = price;

    }

    public String addCar(){
        System.out.println("\nNew car:\nRegistrationNumber: ");
        Scanner carReg = new Scanner(System.in);
        String userCarReg = carReg.next();
        System.out.println("\nMake: ");
        Scanner carMake = new Scanner(System.in);
        String userCarMake = carMake.next();
        System.out.println("\nPrice: ");
        Scanner carPrice = new Scanner(System.in);
        int userCarPrice = carPrice.nextInt();
        registrationNumber = userCarReg;
        make = userCarMake;
        price = userCarPrice;
        
        return registrationNumber;
        return make;
        return price;

    }
    public void readList(){

    }
    public void writeList(){

    }
}
