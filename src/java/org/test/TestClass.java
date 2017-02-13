/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.test;

import org.hibernate.Session;
import org.pojo.CustomerInfo;
import org.pojo.HomeInfo;
import org.pojo.SalesInfo;
import org.util.HibernateUtil;

/**
 *
 * @author Azmol-IT
 */
public class TestClass {
    
    public static void main(String[] args) {
        
        System.out.println("Hibernate annotation Starting.....");
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        
        SalesInfo s = new SalesInfo();
        HomeInfo h = new HomeInfo();
        CustomerInfo c = new CustomerInfo();
        
        s.setSalesDate("01-08-16");
        s.setCusId(1);
        s.setHomeId(1);
        s.setStatus("Paid");
        session.save(s);
        
        h.setLocation("Jessore");
        h.setHireDate("01-02-2016");
        h.setPlatPrice(25000);
        h.setPlatSize(2500);
        h.setRoomNo(4);
        h.setSubLocation("Sodor");
        h.setSales(s);
        
        c.setCusName("Azmol");
        c.setContactNo("01936835834");
        c.setEmail("azmol@gmail.com");
        c.setPassword("123");
        c.setSales(s);
        
        s.getListOfHome().add(h);
        session.save(h);
        
        s.getListOfCus().add(c);
        session.save(c);
        
        session.getTransaction().commit();
        
        System.out.println("Done");
        
        
    }
    
}
