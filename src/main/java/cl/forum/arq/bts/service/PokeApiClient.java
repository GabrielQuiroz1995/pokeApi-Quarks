package cl.forum.arq.bts.service;

import cl.forum.arq.bts.pojo.response.GetResponse;

import javax.ws.rs.core.Response;

public interface PokeApiClient {
    Response getPokemonData(String name);
}
