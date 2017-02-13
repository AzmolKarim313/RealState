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
@Table(name = "home_info")

@XmlRootElement
public class HomeInfo implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int homeId;
    private String location;
    private String subLocation;
    private int platSize;
    private int roomNo;
    private float platPrice;
    private String hireDate;
    
    @ManyToOne
    @JoinColumn(name = "saleId")
    private SalesInfo sales;

    public SalesInfo getSales() {
        return sales;
    }

    public void setSales(SalesInfo sales) {
        this.sales = sales;
    }

    public int getHomeId() {
        return homeId;
    }

    public void setHomeId(int homeId) {
        this.homeId = homeId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSubLocation() {
        return subLocation;
    }

    public void setSubLocation(String subLocation) {
        this.subLocation = subLocation;
    }

    public int getPlatSize() {
        return platSize;
    }

    public void setPlatSize(int platSize) {
        this.platSize = platSize;
    }

    public int getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }

    public float getPlatPrice() {
        return platPrice;
    }

    public void setPlatPrice(float platPrice) {
        this.platPrice = platPrice;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "HomeInfo{" + "homeId=" + homeId + ", location=" + location + ", subLocation=" + subLocation + ", platSize=" + platSize + ", roomNo=" + roomNo + ", platPrice=" + platPrice + ", hireDate=" + hireDate + '}';
    }
    
}
