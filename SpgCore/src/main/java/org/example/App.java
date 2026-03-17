package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLOutput;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-config.xml");

        Student student = (Student)context.getBean("student");
        Employee employee = (Employee) context.getBean("employee");

        System.out.println(student);
        System.out.println(employee);
    }
}
