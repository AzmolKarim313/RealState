/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.dao.CustomerDAO;
import org.pojo.CustomerInfo;

/**
 *
 * @author Azmol-IT
 */
public class ConsumerService {
    private Map<Integer, CustomerInfo> customerServices = new HashMap();
    CustomerDAO dbCus = new CustomerDAO();

    public ConsumerService() {
        for(CustomerInfo customer: dbCus.listOfCustomer()){
            customerServices.put(customer.getCusId(), customer);
        }
    }
    
    public List<CustomerInfo> getAllCustomer() {
       return new ArrayList<CustomerInfo>(customerServices.values());
    }
    
    public CustomerInfo getCustomerInfo(int id){
        return customerServices.get(id);
    }
    
    public CustomerInfo addCustomer(CustomerInfo customer){
        dbCus.doInsert(customer);
        return customer;
    }
    
    public CustomerInfo updateCustomer(CustomerInfo customer){
        if(customer.getCusId() <= 0){
            return null;
        }
       dbCus.doUpdate(customer);
        return customer;
    } 
    
    public void removeCustomer(int id){
        CustomerInfo customer = new CustomerInfo();
        customer.setCusId(id);
        dbCus.doDelete(customer);
    }
}
