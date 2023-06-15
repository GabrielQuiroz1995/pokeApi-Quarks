package cl.forum.arq.bts.proxy;

import cl.forum.arq.bts.pojo.response.GetResponse;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@RegisterRestClient(configKey = "pokeapiurl")
@Path("")
public interface ApiProxi {
    
    @GET 
    @Path("{name}")
    @Produces(MediaType.APPLICATION_JSON)
    Response callGetPokemonData(@PathParam("name") String name);

}
