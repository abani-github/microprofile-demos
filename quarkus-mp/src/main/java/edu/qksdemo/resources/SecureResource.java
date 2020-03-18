package edu.qksdemo.resources;

import javax.annotation.security.PermitAll;
import javax.annotation.security.RolesAllowed;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.SecurityContext;

/**
 * SecureResource
 */
@Path("/secure")
 public class SecureResource {
    

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @PermitAll
    public String hello(@Context SecurityContext ctx) {
        return "no secure hello";
    }

    @GET
    @Path("roles-allowed")
    @Produces(MediaType.TEXT_PLAIN)
    @RolesAllowed("openid")
    public String secureHello(@Context SecurityContext ctx) {
        return "secured hello " + ctx.getUserPrincipal().getName();
    }

}