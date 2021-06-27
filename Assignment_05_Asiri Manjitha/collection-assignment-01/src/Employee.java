import java.util.Scanner;

public class Employee {

    private int empId;
    private String name;
    private String contactNo;
    private String city;
    private String email;
    private Vehicle vehicle;

    public Employee(int empId, String name, String contactNo, String city, String email) {
        this.empId = empId;
        this.name = name;
        this.contactNo = contactNo;
        this.city = city;
        this.email = email;
    }

    public void setVehicleDetails() {
        Scanner sc = new Scanner(System.in);
        vehicle = new Vehicle(this.empId);

        System.out.print("Enter Vehicle Type: ");
        vehicle.setType(sc.nextLine());

        System.out.print("Enter Vehicle Color: ");
        vehicle.setColor(sc.nextLine());
    }

    public boolean isAvailableVehicle() {
        if (vehicle == null) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", contactNo='" + contactNo + '\'' +
                ", city='" + city + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
