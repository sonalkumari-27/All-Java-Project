package com.hibernate.Hibernate;



import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       EntityManagerFactory emf= Persistence.createEntityManagerFactory("myPU");
       EntityManager em=emf.createEntityManager();
       EntityTransaction tx =em.getTransaction();
       tx.begin();
       Query query = em.createQuery(
               "UPDATE employee e SET e.salary = 60000 WHERE e.id = 1");
       int rows = query.executeUpdate();
//       System.out.println("Rows Updated: " + rows);
//       List<employee> list=query.getResultList();
//       for(employee e:list) {
//    	   System.out.println(e);
//       }
//       et.begin();
//       employee e = new employee("almn",9000);
//       em.persist(e);
//       et.commit();
       
       em.close();
       emf.close();
    }
}