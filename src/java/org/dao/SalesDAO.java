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
import org.pojo.SalesInfo;
import org.util.HibernateUtil;

/**
 *
 * @author Azmol-IT
 */
public class SalesDAO implements Saleable{

    @Override
    public boolean doInsert(SalesInfo sales) {
        boolean success = false;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(sales);
            success = true;
            session.getTransaction().commit();
            session.close();
        } catch (HibernateException e) {
            e.printStackTrace();
        }
        return success;
    }

    @Override
    public boolean doUpdate(SalesInfo sales) {
        boolean success = false;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.update(sales);
            success = true;
            session.getTransaction().commit();
            session.close();
        } catch (HibernateException e) {
            e.printStackTrace();
        }
        return success;
    }

    @Override
    public boolean doDelete(SalesInfo sales) {
        boolean success = false;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(sales);
            success = true;
            session.getTransaction().commit();
            session.close();
        } catch (HibernateException e) {
            e.printStackTrace();
        }
        return success;
    }

    @Override
    public List<SalesInfo> listOfSales() {
        List<SalesInfo> list = new ArrayList<SalesInfo>();
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query query = session.createQuery("From SalesInfo");
        list = query.list();
        session.getTransaction().commit();
        session.close();
        return list;
    }
    
}
