package com.squad1;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * ./users/reset-password
 */
@Path("/users/reset-password")
public class ResetPasswordRecurso {

    /**
     * This method resets the user's password.
     *
     * @return status code.
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String reset() {
 
    	//Implementar reset password.
    	
        return "Opcao reset password .......";
    }
}
