package com.psl.training.entity;

public class Employee implements Comparable<Employee>{

    private int empId;
    private String empName;
    private int salary;
    private String department;
    private Address address;

    public Employee(int empId, String empName, int salary, String department, Address address) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
        this.department = department;
        this.address = address;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                ", address=" + address +
                '}';
    }

    @Override
    public int compareTo(Employee e) {
        int result = 0;
        if (this.empId < e.getEmpId()){
            result = -1;
        } else if (this.empId == e.getEmpId()){
            result = 0;
        } else if (this.empId > e.getEmpId()){
            result = 1;
        }
        return result;
    }
}
