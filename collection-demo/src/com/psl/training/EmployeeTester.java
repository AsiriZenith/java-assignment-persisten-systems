package com.psl.training;

import com.psl.training.entity.Address;
import com.psl.training.entity.Employee;
import com.psl.training.service.EmployeeService;

import java.util.Comparator;
import java.util.List;

public class EmployeeTester {

    public static void main(String[] args) {

        Employee employees[] = new Employee[3];
        
        Address address1 = new Address(100,"Elpitita","Galle");
        employees[0] = new Employee(1,"Asiri",9000,"IT",address1);

        Address address3 = new Address(102,"Benthara", "Kaluthara");
        employees[2] = new Employee(3,"Senith",9200,"IS",address3);

        Address address2 = new Address(101,"Ambalangoda","Galle" );
        employees[1] = new Employee(2,"Manjitha",8500,"CS",address2);
        
        EmployeeService employeeService = new EmployeeService();
        employeeService.initializeEmployees(employees);

        List<Employee> empList = employeeService.getEmpList();

        empList.sort(null);
        System.out.println("-----After Sort By EmpId-----");
        for (Employee e: empList) {
            System.out.println(e);
        }

        empList.sort(null);
        System.out.println("-----After Sort By EmpName-----");
        for (Employee e: empList) {
            System.out.println(e);
        }
    }
}

class SortByName implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getEmpName().compareTo(o2.getEmpName());
    }
}
