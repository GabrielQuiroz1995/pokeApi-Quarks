package cl.forum.arq.bts.service;

import cl.forum.arq.bts.util.Pokemon;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;

@ApplicationScoped
public class PokeApiClient {

    private static final String BASE_URL = "https://pokeapi.co/api/v2";

    @GET
    @Path("/pokemon")
    @Produces(MediaType.APPLICATION_JSON)
    public Pokemon getPokemon(@QueryParam("name") String name) {
        Client client = ClientBuilder.newClient();
        return client.target(BASE_URL)
                .path("/pokemon/" + name)
                .request(MediaType.APPLICATION_JSON)
                .get(Pokemon.class);
    }
}
