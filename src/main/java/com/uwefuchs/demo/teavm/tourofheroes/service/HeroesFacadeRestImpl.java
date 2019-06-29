package com.uwefuchs.demo.teavm.tourofheroes.service;

import com.uwefuchs.demo.teavm.tourofheroes.model.HeroDto;
import org.teavm.flavour.rest.RESTClient;

import java.util.Collection;

public class HeroesFacadeRestImpl extends AbstractHeroesFacadeImpl {

    private final String baseUrl = "https://heroes-service-heroku.herokuapp.com/heroes-service/webapi";
    private final HeroesResource heroServiceFacade = RESTClient
            .factory(HeroesResource.class)
            .createResource(baseUrl);

    public HeroesFacadeRestImpl(MessagesService messagesService) {
        super(messagesService);
    }

    @Override
    public Collection<HeroDto> getAllHeroes() {
        return null;
    }

    @Override
    public HeroDto findHero(Integer id) {
        return null;
    }

    @Override
    public Collection<HeroDto> searchHeroesByName(String name) {
        return null;
    }

    @Override
    public void updateHero(HeroDto heroDto, Integer id) {

    }

    @Override
    public void createHero(HeroDto heroDto) {

    }

    @Override
    public void deleteHero(Integer id) {

    }
}
