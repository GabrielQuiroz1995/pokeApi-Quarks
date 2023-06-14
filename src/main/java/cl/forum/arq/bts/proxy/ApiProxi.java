package cl.forum.arq.bts.proxy;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.Path;

@Path("/pokemon")
@RegisterRestClient(configKey = "pokeapiurl")
public interface ApiProxi {
    
}
