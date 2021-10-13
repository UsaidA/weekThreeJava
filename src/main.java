import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class main {
    public static void main(String[] args){
    File mp3File = new File("C:\\Users\\bb101\\IdeaProjects\\weekThreeJava\\files\\Me.mp3");
    File mp3FileChange= new File("C:\\Users\\bb101\\IdeaProjects\\weekThreeJava\\files\\Mine.mp3");
    File carsFile =  new File("cars.txt");

    List<car> carList = new ArrayList<>();
    car carOne = new car("BOND007", "AUDI", 50000.0);
    carList.add(carOne);

    System.out.println("\nNew car:\nRegistrationNumber: ");
    Scanner carReg = new Scanner(System.in);
    String userCarReg = carReg.next();
    System.out.println("\nMake: ");
    Scanner carMake = new Scanner(System.in);
    String userCarMake = carMake.next();
    System.out.println("\nPrice: ");
    Scanner carPrice = new Scanner(System.in);
    int userCarPrice = carPrice.nextInt();

    car userCar = new car(userCarReg, userCarMake, userCarPrice);
    carList.add(userCar);


try{
    FileWriter myWriter = new FileWriter("cars.txt");
    myWriter.write(carList);
    myWriter.close();

}catch (IOException e){
    System.out.println("error");
    e.printStackTrace();
}


 /*   if (mp3FileChange.exists())
    {
        throw new java.io.IOException("file exists");

    }
*/
    }
}
