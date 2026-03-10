package com.dao;

import com.entity.Customer;
import jakarta.persistence.*;
import java.util.List;

public class CustomerDAOImpl {

    EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("myPU");
    public void insertCustomer(Customer customer) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(customer);
        tx.commit();
        em.close();
    }
    public void updateCustomer(Customer customer) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.merge(customer);
        tx.commit();
        em.close();
    }
    public void deleteCustomer(int id) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        tx.begin();
        Customer c = em.find(Customer.class, id);
        if(c != null) em.remove(c);
        tx.commit();
        em.close();
    }

    // 4️⃣ Fetch Customer by ID
    public Customer getCustomerById(int id) {
        EntityManager em = emf.createEntityManager();
        Customer c = em.find(Customer.class, id);
        em.close();
        return c;
    }

    // 5️⃣ Fetch All Customers
    public List<Customer> getAllCustomers() {
        EntityManager em = emf.createEntityManager();
        List<Customer> list =
            em.createQuery("FROM Customer", Customer.class)
              .getResultList();
        em.close();
        return list;
    }

    // 6️⃣ JPQL — Fetch by Email
    public Customer getCustomerByEmail(String email) {
        EntityManager em = emf.createEntityManager();
        Customer c = em.createQuery(
            "SELECT c FROM Customer c WHERE c.email = :email",
            Customer.class)
            .setParameter("email", email)
            .getSingleResult();
        em.close();
        return c;
    }
}