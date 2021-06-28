import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Employee {

    private final int empId;
    private String name;
    private String contactNo;
    private String city;
    private String email;
    private List<Vehicle> vehicles;

    public Employee(int empId, String name, String contactNo, String city, String email) {
        this.empId = empId;
        this.name = name;
        this.contactNo = contactNo;
        this.city = city;
        this.email = email;
    }

    public int getEmpId() { return empId; }

    public void setVehicleDetails(Vehicle vehicle) {
        if (vehicles == null) {
            vehicles = new ArrayList<Vehicle>();
        }
        vehicles.add(vehicle);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", contactNo='" + contactNo + '\'' +
                ", city='" + city + '\'' +
                ", email='" + email + '\'' +
                ", vehicle=" + vehicles +
                '}';
    }
}
