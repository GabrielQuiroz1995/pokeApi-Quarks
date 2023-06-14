//package cl.forum.arq.bts.service.impl;
package cl.forum.arq.bts.service.impl; //?

//importar proxy
import cl.forum.arq.bts.model.Pokemon;
import cl.forum.arq.bts.proxy.ApiProxi;
//importar Service
import  cl.forum.arq.bts.service.PokeApiClient;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.core.Response;

@ApplicationScoped
public class PokeApiClientImp implements PokeApiClient{
    @Inject
    @RestClient
    ApiProxi apiProxi;
    @Override
    public Response getPokemonData(String namePoke){
        Response response = apiProxi.callGetPokemonData(namePoke);
        Pokemon pok = response.readEntity(Pokemon.class);
        return Response.ok(pok).build();
    }

}
