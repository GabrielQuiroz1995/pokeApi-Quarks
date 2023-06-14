package cl.forum.arq.bts.service;

import cl.forum.arq.bts.util.Pokemon;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;

@ApplicationScoped
@Path("/pokemon")
public class PokeApiClient {


    @Inject
    @ConfigProperty(name = "pokeapi.base-url")
    private String baseUrl;

    //Desde aca parti probando la configuracion de proxy
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Pokemon getPokemon(@QueryParam("name") String name) {
        Client client = ClientBuilder.newClient();
        return client.target(baseUrl)
                .path("/pokemon/" + name)
                .request(MediaType.APPLICATION_JSON)
                .get(Pokemon.class);
    }
}