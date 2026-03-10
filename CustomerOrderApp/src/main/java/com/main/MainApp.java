package com.main;

import com.dao.*;
import com.entity.*;
import java.time.LocalDate;
public class MainApp {
    public static void main(String[] args) {
        CustomerDAOImpl cdao = new CustomerDAOImpl();
        Order order = new Order();
        order.setOrderNumber("ORD101");
        order.setProductName("Laptop");
        order.setQuantity(1);
        order.setPrice(75000);
        order.setOrderDate(LocalDate.now());
        Customer cust = new Customer();
        cust.setCustomerName("Sonal");
        cust.setEmail("sonal@gmail.com");
        cust.setGender("Female");
        cust.setPhone(9876543210L);
        cust.setRegistrationDate(LocalDate.now());
        cust.setOrder(order);
        cdao.insertCustomer(cust);

        System.out.println("Inserted Successfully!");
    }
}