import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

public class MainApp {

    public static void main(String[] args) {
        List<Movie> movieList = new ArrayList<>();
        try {
            movieList.add(new Movie(1,"Wrath of Man","English",new SimpleDateFormat("dd/MM/yyyy").parse("16/06/2016"),"Guy Ritchie","Miramax","2h 1m"));
            movieList.add(new Movie(2,"The Meg","English",new SimpleDateFormat("dd/MM/yyyy").parse("08/08/2018"),"Jon Turteltaub","Colin Wilson","1h 52m"));
            movieList.add(new Movie(3,"Parker","English",new SimpleDateFormat("dd/MM/yyyy").parse("18/01/2013"),"Taylor Hackford","Westlake","1h 58m"));
            movieList.add(new Movie(4,"Abominable","Chinese",new SimpleDateFormat("dd/MM/yyyy").parse("11/06/2014"),"Jill Culton","Suzanne Buirgy","1h 37m"));

        } catch (ParseException parseException) {
            System.out.println(parseException.getMessage());
        }
        Scanner sc = new Scanner(System.in);
        MainApp mainApp = new MainApp();
        List<Movie> sortedEmployees = null;

        System.out.println("1.Sort by language\t2.Sort by director\t3.Sort by duration\t4.Sort By Language And ReleaseDate");
        System.out.print("Enter Option: ");
        int option = sc.nextInt();

        if (option == 1) {
            Comparator<Movie> cm1 = Comparator.comparing(Movie::getLanguage);
            Collections.sort(movieList,cm1);
        } else if (option == 2) {
            Comparator<Movie> cm2 = Comparator.comparing(Movie::getDirector);
            Collections.sort(movieList,cm2);
        } else if (option == 3) {
            Comparator<Movie> cm3 = Comparator.comparing(Movie::getDuration);
            Collections.sort(movieList,cm3);
        } else if (option == 4) {
            Comparator<Movie> compareByName = Comparator.comparing(Movie::getLanguage).thenComparing(Movie::getReleaseDate);
            sortedEmployees = movieList.stream()
                    .sorted(compareByName)
                    .collect(Collectors.toList());
        } else {
            option = 5;
            System.out.println("selected invalid!!");
        }

        if (option == 4) {
            mainApp.printMovieList(sortedEmployees);
        } else if (option != 5) {
            mainApp.printMovieList(movieList);
        }
    }

    public void printMovieList(List<Movie> movieList) {
        for (Movie movie: movieList) {
            System.out.println(movie);
        }
    }
}
