package com.uwefuchs.demo.teavm.tourofheroes.service;

import com.uwefuchs.demo.teavm.tourofheroes.model.HeroDto;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import java.util.Collection;

public class HeroesResourceImpl implements HeroesResource {
    @Override
    public Collection<HeroDto> getAllHeroes() {
        return MockHeroesService.getAllHeroes().values();
    }

    @Override
    public HeroDto findHero(Integer id) {
        return MockHeroesService.getAllHeroes().get(id);
    }

    @Override
    public Collection<HeroDto> searchHeroesByName(String name) {
        return null;
    }

    @Override
    public Response updateHero(HeroDto HeroDto, Integer id) {
        return null;
    }

    @Override
    public Response createHero(UriInfo uriInfo, HeroDto HeroDto) {
        return null;
    }

    @Override
    public Response deleteHero(Integer id) {
        return null;
    }
}
