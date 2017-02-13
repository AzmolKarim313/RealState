/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.test;

import org.dao.HomeDAO;
import org.pojo.HomeInfo;

/**
 *
 * @author Azmol-IT
 */
public class HomeTest {
    
    public static void main(String[] args) {
        HomeInfo home = new HomeInfo();
        HomeDAO dbHome = new HomeDAO();
        
        if (dbHome.listOfHomeData().equals("")) {
            System.out.println("Empty");
        } else {
            System.out.println("Data Found");
        }
        
        System.out.println(dbHome.listOfHomeData());
        
    }
    
}
