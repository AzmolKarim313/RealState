/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pojo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Azmol-IT
 */
@Entity
@Table(name = "cus_info")
@XmlRootElement
public class CustomerInfo implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cusId;
    private String cusName;
    private String contactNo;
    private String email;
    private String password;
    
    @ManyToOne
    @JoinColumn(name = "saleId")
    private SalesInfo sales;

    public SalesInfo getSales() {
        return sales;
    }

    public void setSales(SalesInfo sales) {
        this.sales = sales;
    }

    public int getCusId() {
        return cusId;
    }

    public void setCusId(int cusId) {
        this.cusId = cusId;
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "CustomerInfo{" + "cusId=" + cusId + ", cusName=" + cusName + ", contactNo=" + contactNo + ", email=" + email + ", password=" + password + '}';
    }
    
}
