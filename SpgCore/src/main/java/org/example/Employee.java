package org.example;

public class Employee {
    private int id;
    private String name;
    private String email;
    private double salary;
    Student student1;

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", salary=" + salary + ", Student= "+student1+"]";
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Student getStudent() {
        return student1;
    }

    public void setStudent1(Student student) {
        this.student1 = student;
    }

    public Employee() {
        System.out.println("employee called through const");
    }

    public Employee(int id, String name, String email,double salary, Student s) {
        this.salary = salary;
        this.id = id;
        this.name = name;
        this.email = email;
        this.student1 = s;
    }
}