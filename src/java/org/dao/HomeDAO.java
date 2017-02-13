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
import org.pojo.HomeInfo;
import org.util.HibernateUtil;

/**
 *
 * @author Azmol-IT
 */
public class HomeDAO implements Producetable{

    @Override
    public boolean doInsert(HomeInfo home) {
        boolean success = false;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(home);
            success = true;
            session.getTransaction().commit();
            session.close();
        } catch (HibernateException e) {
            e.printStackTrace();
        }
        return success;
    }

    @Override
    public boolean doUpdate(HomeInfo home) {
        boolean success = false;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.update(home);
            success = true;
            session.getTransaction().commit();
            session.close();
        } catch (HibernateException e) {
            e.printStackTrace();
        }
        return success;
    }

    @Override
    public boolean doDelete(HomeInfo home) {
        boolean success = false;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(home);
            success = true;
            session.getTransaction().commit();
            session.close();
        } catch (HibernateException e) {
            e.printStackTrace();
        }
        return success;
    }

    @Override
    public List<HomeInfo> listOfHomeData() {
        List<HomeInfo> list = new ArrayList<HomeInfo>();
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query query = session.createQuery("From HomeInfo");
        list = query.list();
        session.getTransaction().commit();
        session.close();
        return list;
    }
    
}
