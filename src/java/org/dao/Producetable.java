/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dao;

import java.util.List;
import org.pojo.HomeInfo;

/**
 *
 * @author Azmol-IT
 */
public interface Producetable {
    
    public boolean doInsert(HomeInfo home);
    public boolean doUpdate(HomeInfo home);
    public boolean doDelete(HomeInfo home);
    public List<HomeInfo> listOfHomeData();
    
}
