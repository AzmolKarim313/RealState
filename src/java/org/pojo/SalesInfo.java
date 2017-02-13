/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Azmol-IT
 */
@Entity
@Table(name = "sales_info")
@XmlRootElement
public class SalesInfo implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int saleId;
    private int homeId;
    private int cusId;
    private String salesDate;
    private String status;
    
    @OneToMany(mappedBy = "sales")
    private List<HomeInfo> listOfHome = new ArrayList<HomeInfo>();
    
    @OneToMany(mappedBy = "sales")
    private List<CustomerInfo> listOfCus = new ArrayList<CustomerInfo>();

    public List<CustomerInfo> getListOfCus() {
        return listOfCus;
    }

    public void setListOfCus(List<CustomerInfo> listOfCus) {
        this.listOfCus = listOfCus;
    }

    public List<HomeInfo> getListOfHome() {
        return listOfHome;
    }

    public void setListOfHome(List<HomeInfo> listOfHome) {
        this.listOfHome = listOfHome;
    }

    public int getSaleId() {
        return saleId;
    }

    public void setSaleId(int saleId) {
        this.saleId = saleId;
    }

    public int getHomeId() {
        return homeId;
    }

    public void setHomeId(int homeId) {
        this.homeId = homeId;
    }

    public int getCusId() {
        return cusId;
    }

    public void setCusId(int cusId) {
        this.cusId = cusId;
    }

    public String getSalesDate() {
        return salesDate;
    }

    public void setSalesDate(String salesDate) {
        this.salesDate = salesDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "SalesInfo{" + "saleId=" + saleId + ", salesDate=" + salesDate + ", status=" + status + '}';
    }
    
}
