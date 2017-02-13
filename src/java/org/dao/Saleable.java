/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dao;

import java.util.List;
import org.pojo.SalesInfo;

/**
 *
 * @author Azmol-IT
 */
public interface Saleable {
    
    public boolean doInsert(SalesInfo sales);
    public boolean doUpdate(SalesInfo sales);
    public boolean doDelete(SalesInfo sales);
    public List<SalesInfo> listOfSales();
    
}
