package com.dao;

import com.entity.Order;
import jakarta.persistence.*;

public class OrderDAOImpl {

    EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("myPU");
    public void updateOrder(Order order) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.merge(order);
        tx.commit();
        em.close();
    }
    public Order getOrderById(int id) {
        EntityManager em = emf.createEntityManager();
        Order o = em.find(Order.class, id);
        em.close();
        return o;
    }
}
