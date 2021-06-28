import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        List<Movie> movieList = List.of(
                new Movie(1,"Wrath of Man","English","16/06/2016","Guy Ritchie","Miramax","2h 1m"),
                new Movie(2,"The Meg","English","08/08/2018","Jon Turteltaub","Colin Wilson","1h 52m"),
                new Movie(3,"Parker","English","18/01/2013","Taylor Hackford","Westlake","1h 58m"),
                new Movie(4,"Abominable","Chinese","18/01/2013","Jill Culton","Suzanne Buirgy","1h 37m")
        );

        Scanner sc = new Scanner(System.in);
        MainApp mainApp = new MainApp();

        System.out.println("1.Sort by language\t2.Sort by director");
        System.out.print("Enter Option: ");
        int option = sc.nextInt();

        if (option == 1) {
            mainApp.sortByLanguage(movieList);
        }

    }

    public void sortByLanguage(List<Movie> movieList) {
//        Collections.sort(movieList.);
//        movieList.sort();
    }
}
