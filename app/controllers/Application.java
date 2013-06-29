package controllers;

import play.*;
import play.mvc.*;

import javax.ws.rs.GET;
import javax.ws.rs.Path;


@Path("/")
public class Application extends Controller {
    
    @GET 
    @Path("/")
    public static Result index() {
        return ok("cool");
    }
  
}
