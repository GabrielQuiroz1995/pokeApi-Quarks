package cl.forum.arq.bts.service;

import cl.forum.arq.bts.util.Pokemon;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/pokemon-info")
public class PokemonResource {
    @Inject
    private PokeApiClient pokeAPIClient;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Pokemon getPokemonInfo(@QueryParam("name") String name) {
        return pokeAPIClient.getPokemon(name);
    }
}
