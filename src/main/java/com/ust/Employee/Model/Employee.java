package com.ust.Employee.Model;

import javax.persistence.*;

@Entity
@Table
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Emp_id;
    private String Emp_name;
    private String Emp_gender;
    private int Emp_age;
    private String Emp_designation;

    @Override
    public String toString() {
        return "Employee{" +
                "Emp_id=" + Emp_id +
                ", Emp_name='" + Emp_name + '\'' +
                ", Emp_gender='" + Emp_gender + '\'' +
                ", Emp_age=" + Emp_age +
                ", Emp_designation='" + Emp_designation + '\'' +
                '}';
    }

    public Employee(){}

    public Employee(int emp_id, String emp_name, String emp_gender, int emp_age, String emp_designation) {
        Emp_id = emp_id;
        Emp_name = emp_name;
        Emp_gender = emp_gender;
        Emp_age = emp_age;
        Emp_designation = emp_designation;
    }

    public int getEmp_id() {
        return Emp_id;
    }

    public void setEmp_id(int emp_id) {
        Emp_id = emp_id;
    }

    public String getEmp_name() {
        return Emp_name;
    }

    public void setEmp_name(String emp_name) {
        Emp_name = emp_name;
    }

    public String getEmp_gender() {
        return Emp_gender;
    }

    public void setEmp_gender(String emp_gender) {
        Emp_gender = emp_gender;
    }

    public int getEmp_age() {
        return Emp_age;
    }

    public void setEmp_age(int emp_age) {
        Emp_age = emp_age;
    }

    public String getEmp_designation() {
        return Emp_designation;
    }

    public void setEmp_designation(String emp_designation) {
        Emp_designation = emp_designation;
    }
}
