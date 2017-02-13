/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.webService;

import java.util.List;
import javax.ws.rs.*;
import javax.ws.rs.core.*;
import org.appService.ConsumerService;
import org.pojo.CustomerInfo;

/**
 *
 * @author Azmol-IT
 */
@Path("/customers")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class CustomerWebService {
    
    ConsumerService cusWebService = new ConsumerService();
    
    @GET
    public List<CustomerInfo> getAllCus(){
        return cusWebService.getAllCustomer();
    }
    
    @POST
    public CustomerInfo addHomes(CustomerInfo cus){
        
        return cusWebService.addCustomer(cus);
    }
    
    @PUT
    @Path("/{cusId}")
    public CustomerInfo updateCus(@PathParam("cusId") int id, CustomerInfo cus){
        cus.setCusId(id);
        return cusWebService.updateCustomer(cus);
    }
    
    @DELETE
    @Path("/{cusId}")
    public void deleteCus(@PathParam("cusId") int id){
        cusWebService.removeCustomer(id);
    }
    
    @GET
    @Path("/{cusId}")
    public CustomerInfo getCustomer(@PathParam("cusId") int id) {
        
      return cusWebService.getCustomerInfo(id);
    }
    
}
