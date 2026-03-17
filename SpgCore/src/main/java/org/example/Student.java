package org.example;

public class Student {
    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", gender=" + gender + ", marks=" + marks + "]";
    }
    private int id;
    private String name;
    private String gender;
    private int marks;

    public int getId() {
        return id;
    }
    public Student() {
        System.out.println("Student called through const");
    }

    public Student(int id, String name, String gender, int marks) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.marks = marks;
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
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public int getMarks() {
        return marks;
    }
    public void setMarks(int marks) {
        this.marks = marks;
    }

}