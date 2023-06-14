package cl.forum.arq.bts.service;

import javax.ws.rs.core.Response;

public interface PokeApiClient {
    Response getPokemonData(String name);
}
