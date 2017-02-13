/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.webService;

import java.util.List;
import javax.ws.rs.*;
import javax.ws.rs.core.*;
import org.appService.HomeService;
import org.pojo.HomeInfo;

/**
 *
 * @author Azmol-IT
 */
@Path("/homes")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class HomeWebService {
    
    HomeService homeService = new HomeService();
    
    @GET
    public List<HomeInfo> getAllHomes(){
        return homeService.getAllHomes();
    }
    
    @POST
    public HomeInfo addHomes(HomeInfo home){
        
        return homeService.addHome(home);
    }
    
    @PUT
    @Path("/{homeId}")
    public HomeInfo updateHome(@PathParam("homeId") int id, HomeInfo home){
        home.setHomeId(id);
        return homeService.updateHome(home);
    }
    
    @DELETE
    @Path("/{homeId}")
    public void deleteHome(@PathParam("homeId") int id){
        homeService.removeHome(id);
    }
    
    @GET
    @Path("/{homeId}")
    public HomeInfo getHome(@PathParam("homeId") int id) {
        
      return homeService.getHomeInfo(id);
    }
    public static void main(String[] args) {
        HomeWebService obj = new HomeWebService();
        System.out.println(obj.getAllHomes());
    }
    
}
