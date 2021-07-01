public class City {
    private String Id;
    private String name;
    private String stateId;

    public City(String id, String name, String stateId) {
        Id = id;
        this.name = name;
        this.stateId = stateId;
    }

    public String getStateId() {
        return stateId;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                '}';
    }
}
