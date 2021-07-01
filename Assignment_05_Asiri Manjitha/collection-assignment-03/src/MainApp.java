import java.util.List;
import java.util.Scanner;

public class MainApp {

    static CityStateMap cityStateMap;
    static Scanner scanner;

    public MainApp() {
        cityStateMap = new CityStateMap();
        scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {

        MainApp mainApp = new MainApp();

        mainApp.assignValues();

        int option = 0;

        do {
            System.out.println(
                    "1.Get All Cities\t2.Get All States\t3.Get Cities For A State\t4.Add New City\t5.Delete All Cities For a Given State\t6.Exit"
            );
            System.out.print("Enter the option : ");
            option = scanner.nextInt();

            if (option == 1) {
                System.out.println(cityStateMap.getAllCities());
            } else if (option == 2) {
                System.out.println(cityStateMap.getAllStates());
            } else if (option == 3) {
                System.out.println(cityStateMap.getCitiesForGivenState(mainApp.selectState()));
            } else if (option == 4) {
                System.out.print("Enter new city name: ");
                String name = scanner.nextLine();
//                mainApp.addNewCity();
            } else if (option == 5) {

            } else {
                System.out.println("Entered Is Invalid!!");
            }
        } while (option != 6);
    }

    public void assignValues() {
        List<State> stateList = List.of(
                new State("s001", "UK"),
                new State("s002", "USA"),
                new State("s003", "UAE")
        );

        List<City> cityList = List.of(
                new City("c001", "London", "s001"),
                new City("c002", "New York", "s002"),
                new City("c003", "Chicago", "s002"),
                new City("c004", "Dubai", "s003"),
                new City("c005", "Liverpool", "s001"),
                new City("c006", "Yorkshire", "s001")
        );

        for (City city : cityList) {
            cityStateMap.addCity(city);
        }

        for (State state : stateList) {
            cityStateMap.addState(state);
        }
    }

    public State selectState() {
        List<State> stateList = cityStateMap.getAllStates();
        for (int i = 0; i < stateList.size(); i++) {
            System.out.println((i + 1) + " - " + stateList.get(i).getName());
        }
        System.out.print("Select State : ");
        int sId = scanner.nextInt();
        return stateList.get(sId - 1);
    }

    public void addNewCity() {
        State state = selectState();
        String id = "c00" + (cityStateMap.getAllCities().size() + 1);
        cityStateMap.addCity(new City(id, "name", "s007"));
    }
}
