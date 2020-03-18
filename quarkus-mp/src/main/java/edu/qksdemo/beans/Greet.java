package edu.qksdemo.beans;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 * Greet
 */
@RequestScoped
@Named
public class Greet {

    public String greetings(){
        return "Greeting from CDI.";
    }
    
}