import java.io.File;
import java.io.FileNotFoundException;
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








 /*   if (mp3FileChange.exists())
    {
        throw new java.io.IOException("file exists");

    }
*/
    }
}
