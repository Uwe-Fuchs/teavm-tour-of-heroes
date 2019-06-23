package com.uwefuchs.demo.teavm.tourofheroes.service;

import com.uwefuchs.demo.teavm.tourofheroes.model.HeroDto;
import org.teavm.flavour.rest.RESTClient;

import java.util.Collection;

public class HeroesServiceClient {
    private final String baseUrl = "https://heroes-service-heroku.herokuapp.com/heroes-service/webapi";
    private HeroesResource heroServiceFacade = RESTClient
                                                    .factory(HeroesResource.class)
                                                    .createResource(baseUrl);

    public Collection<HeroDto> getAllHeroes() {
        return MockHeroes.getAllHeroes().values();
    }

    public HeroDto findHero(Integer id) {
        return MockHeroes.getAllHeroes().get(id);
    }

    public Collection<HeroDto> searchHeroesByName(String name) {
        return null;
    }

    public void updateHero(HeroDto heroDto, Integer id) {
        MockHeroes.getAllHeroes().put(id, heroDto);
    }

    public void createHero(HeroDto heroDto) {
        int id = MockHeroes.getNextId();
        MockHeroes.getAllHeroes().put(id, heroDto);
    }

    public void deleteHero(Integer id) {
        MockHeroes.getAllHeroes().remove(id);
    }
}
