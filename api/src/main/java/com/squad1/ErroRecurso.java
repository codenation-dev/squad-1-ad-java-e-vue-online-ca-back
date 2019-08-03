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
     * Este método retorna a lista de erros.
     *
     * @return por enquanto TEXT_PLAIN, alterar para Json no futuro.
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
    	
    	//Aqui ainda falta alterar o MediaType para json.
    	//Ver com pessoal do Front se eles preferem json ou xml.
    	
        return "Lista de erros: .......";
    }
}
