package edu.qksdemo.resources;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import edu.qksdemo.beans.Greet;

@Path("/hello")
public class ExampleResource {

    @Inject
    Greet greet;

    @Inject
    @ConfigProperty(name = "name", defaultValue = "Duke")
    private String propName;

    @Inject
    @ConfigProperty(name = "isDuke", defaultValue = "false")
    private boolean isDuke;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "hello, " + (isDuke ? "Duke" : "Quarkus" )+ " & " + greet.greetings();
    }
}