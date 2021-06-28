public class Vehicle {

    private String type;
    private String color;
    private int empId;

    public Vehicle(int empId) {
        this.empId = empId;
    }

    public Vehicle(int empId, String type, String color) {
        this.type = type;
        this.color = color;
        this.empId = empId;
    }

    public int getEmpId() { return empId; }

    public void setType(String type) {
        this.type = type;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "type='" + type + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
