/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.webService;

import java.util.List;
import javax.ws.rs.*;
import javax.ws.rs.core.*;
import org.appService.SaleService;
import org.pojo.SalesInfo;

/**
 *
 * @author Azmol-IT
 */
@Path("/sales")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class SaleWebService {
    
    SaleService saleService = new SaleService();
    
    @GET
    public List<SalesInfo> getAllSales(){
        return saleService.getAllSales();
    }
    
    @POST
    public SalesInfo addSales(SalesInfo sale){
        
        return saleService.addSale(sale);
    }
    
    @PUT
    @Path("/{saleId}")
    public SalesInfo updateSales(@PathParam("saleId") int id, SalesInfo sale){
        sale.setSaleId(id);
        return saleService.updateSale(sale);
    }
    
    @DELETE
    @Path("/{saleId}")
    public void deleteSales(@PathParam("saleId") int id){
        saleService.removeSale(id);
    }
    
    @GET
    @Path("/{saleId}")
    public SalesInfo getSales(@PathParam("saleId") int id) {
        
      return saleService.getSalesInfo(id);
    }
    
}
