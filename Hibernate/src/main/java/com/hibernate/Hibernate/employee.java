package com.hibernate.Hibernate;

import jakarta.persistence.*;
@Entity
@Table(name="Emp")
public class employee {
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	@Column(name="id")
	private int id;
	@Column(name="emp name")
	private String name;
	@Column(name="salary ")
	private double salary;
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public employee() {
		
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	public employee(String name, double salary) {
		super();
		
		this.name=name;
		this.salary=salary;
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
}
