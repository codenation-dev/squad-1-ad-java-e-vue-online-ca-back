package com.squad1;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * ./errors
 */
@Path("/errors")
public class ErroRecurso {

    /**
     * This method returns the list of errors.
     *
     * @return Json
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getErrors() {
 
    	//Ver com pessoal do Front se eles preferem json ou xml.
    	
        return "Lista de erros: .......";
    }
}
