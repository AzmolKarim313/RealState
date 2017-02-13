/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dao;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.pojo.CustomerInfo;
import org.pojo.HomeInfo;
import org.util.HibernateUtil;

/**
 *
 * @author Azmol-IT
 */
public class CustomerDAO implements Consumable{

    @Override
    public boolean doInsert(CustomerInfo customer) {
        boolean success = false;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(customer);
            success = true;
            session.getTransaction().commit();
            session.close();
        } catch (HibernateException e) {
            e.printStackTrace();
        }
        return success;
    }

    @Override
    public boolean doUpdate(CustomerInfo customer) {
        boolean success = false;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.update(customer);
            success = true;
            session.getTransaction().commit();
            session.close();
        } catch (HibernateException e) {
            e.printStackTrace();
        }
        return success;
    }

    @Override
    public boolean doDelete(CustomerInfo customer) {
        
        boolean success = false;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(customer);
            success = true;
            session.getTransaction().commit();
            session.close();
        } catch (HibernateException e) {
            e.printStackTrace();
        }
        return success;
    }

    @Override
    public List<CustomerInfo> listOfCustomer() {
        List<CustomerInfo> list = new ArrayList<CustomerInfo>();
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query query = session.createQuery("From CustomerInfo");
        list = query.list();
        session.getTransaction().commit();
        session.close();
        return list;
    }
    
}
