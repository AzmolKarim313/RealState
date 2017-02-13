/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dao;

import java.util.List;
import org.pojo.CustomerInfo;

/**
 *
 * @author Azmol-IT
 */
public interface Consumable {
    
    public boolean doInsert(CustomerInfo customer);
    public boolean doUpdate(CustomerInfo customer);
    public boolean doDelete(CustomerInfo customer);
    public List<CustomerInfo> listOfCustomer();
    
}
