import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CityStateMap {
    private List<City> cityList;
    private List<State> stateList;
    private List<City> accordingToTheGiveState;

    public void addCity(City city) {
        if (cityList == null)
            cityList = new ArrayList<>();
        cityList.add(city);
    }

    public void addState(State state) {
        if (stateList == null)
            stateList = new ArrayList<>();
        stateList.add(state);
    }

    public List<City> getAllCities() {
        return this.cityList;
    }

    public List<State> getAllStates() {
        return this.stateList;
    }

    public List<City> getCitiesForGivenState(State state) {
        if (accordingToTheGiveState == null)
            accordingToTheGiveState = new ArrayList<>();

        accordingToTheGiveState = (List<City>) cityList.stream()
                .filter(city -> city.getStateId() == state.getId())
                .collect(Collectors.toList());
        return accordingToTheGiveState;
    }
}
//    List<String> names =
//            Arrays.asList("Reflection","Collection","Stream");
//
//    // demonstration of filter method
//    List<String> result = names.stream().filter(s->s.startsWith("S")).
//            collect(Collectors.toList());
//    System.out.println(result);