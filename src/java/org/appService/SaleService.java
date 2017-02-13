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
import org.dao.SalesDAO;
import org.pojo.SalesInfo;

/**
 *
 * @author Azmol-IT
 */
public class SaleService {
    private Map<Integer, SalesInfo> saleServices = new HashMap();
    SalesDAO dbSale = new SalesDAO();

    public SaleService() {
        for(SalesInfo sale: dbSale.listOfSales()){
            saleServices.put(sale.getSaleId(), sale);
        }
    }
    
    public List<SalesInfo> getAllSales() {
       return new ArrayList<SalesInfo>(saleServices.values());
    }
    
    public SalesInfo getSalesInfo(int id){
        return saleServices.get(id);
    }
    
    public SalesInfo addSale(SalesInfo sale){
        dbSale.doInsert(sale);
        return sale;
    }
    
    public SalesInfo updateSale(SalesInfo sale){
        if(sale.getSaleId() <= 0){
            return null;
        }
       dbSale.doUpdate(sale);
        return sale;
    } 
    
    public void removeSale(int id){
        SalesInfo sale = new SalesInfo();
        sale.setSaleId(id);
        dbSale.doDelete(sale);
    }
}
