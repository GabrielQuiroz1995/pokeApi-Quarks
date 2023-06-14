package cl.forum.arq.bts.controller;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import cl.forum.arq.bts.service.PokeApiClient;

@Path("")
public class PokemonController {
    @Inject
    PokeApiClient pokeApiClient;
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/pokemon/{name}")
    public Response getPokemonInfoController(@PathParam("name") String name){
        return pokeApiClient.getPokemonData(name);
    }
    
}
