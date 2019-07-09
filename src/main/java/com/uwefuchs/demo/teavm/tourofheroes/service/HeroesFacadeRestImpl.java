package com.uwefuchs.demo.teavm.tourofheroes.service;

import com.uwefuchs.demo.teavm.tourofheroes.model.HeroDto;
import org.teavm.flavour.rest.RESTClient;

import javax.ws.rs.core.Response;
import java.util.Collection;

public class HeroesFacadeRestImpl extends AbstractHeroesFacadeImpl {

    private final String baseUrl = "https://heroes-service-heroku.herokuapp.com/heroes-service/webapi";
    private final HeroesResource heroesResource = RESTClient
            .factory(HeroesResource.class)
            .createResource(baseUrl);

    public HeroesFacadeRestImpl(MessagesService messagesService) {
        super(messagesService);
    }

    @Override
    public Collection<HeroDto> getAllHeroes() {
        Collection<HeroDto> allHeroes = heroesResource.getAllHeroes();
        this.log("fetched heroes");

        return allHeroes;
    }

    @Override
    public HeroDto findHero(Integer id) {
        HeroDto hero = heroesResource.findHero(id);
        this.log("fetched hero id=" + id);

        return hero;
    }

    @Override
    public Collection<HeroDto> searchHeroesByName(String name) {
        return heroesResource.searchHeroesByName(name);
    }

    @Override
    public void updateHero(HeroDto heroDto, Integer id) {
        heroesResource.updateHero(heroDto, id);
        this.log("updated hero id=" + id);
    }

    @Override
    public void createHero(HeroDto heroDto) {
        Response response = heroesResource.createHero(heroDto);
        //int id = response.
        //this.log("created hero id=" + id);
    }

    @Override
    public void deleteHero(Integer id) {
        heroesResource.deleteHero(id);
        this.log("deleted hero id=" + id);
    }
}
