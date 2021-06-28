import java.util.List;

public class MainApp {

    public static void main(String[] args) {

        List<Employee> employees = List.of(
                new Employee(1,"asd","0721234556","colombo","asd@gmail.com"),
                new Employee(2,"pqr","0725577546","galle","pqr@gmail.com"),
                new Employee(3,"xyz","0765577546","mathara","xyz@gmail.com"),
                new Employee(4,"cbz","0723421506","kaluthara","cbz@gmail.com"),
                new Employee(5,"abc","0746802794","maradana","abc@gmail.com")
        );

        List<Vehicle> vehicles = List.of(
                new Vehicle(1,"BMW","Black"),
                new Vehicle(2,"Benz","Black"),
                new Vehicle(2,"Audi","White"),
                new Vehicle(3,"Acura","Silver"),
                new Vehicle(5,"Bentley","Gray")
        );

        for (Vehicle vehicle: vehicles) {
            for (Employee employee: employees) {
                if (vehicle.getEmpId() == employee.getEmpId())
                    employee.setVehicleDetails(vehicle);
            }
        }

        for (Employee emp: employees) {
            System.out.println(emp);
        }
    }
}
