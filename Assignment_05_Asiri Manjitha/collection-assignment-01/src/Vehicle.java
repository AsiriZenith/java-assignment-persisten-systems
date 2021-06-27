public class Vehicle {

    private String type;
    private String color;
    private int empId;

    public Vehicle(int empId) {
        this.empId = empId;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
