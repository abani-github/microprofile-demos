package edu.qksdemo.resources;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import edu.qksdemo.configs.AppConfig;

import java.util.Date;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * HelloResource
 */
@Path("/greet")
public class GreetResource {

    //@Inject
    @ConfigProperty(name = "welcome.msg", defaultValue = "Duke")
    private String msg;

    @Inject
    private AppConfig appConfig;

    @ConfigProperty(name = "pubish.date")
    private Date date;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello(){
        return "hello: " + msg;
    }
}