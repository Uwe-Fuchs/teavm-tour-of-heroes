package com.uwefuchs.demo.teavm.tourofheroes.service;

import com.uwefuchs.demo.teavm.tourofheroes.model.HeroDto;

import java.util.Collection;

public class HeroesFacadeMockImpl extends AbstractHeroesFacadeImpl {

    public HeroesFacadeMockImpl(MessagesService messagesService) {
        super(messagesService);
    }

    @Override
    public Collection<HeroDto> getAllHeroes() {
        // TODO: send the message _after_ fetching the heroes
        this.log("fetched heroes");
        return MockHeroes.getAllHeroes().values();
    }

    @Override
    public HeroDto findHero(Integer id) {
        // TODO: send the message _after_ fetching the hero
        this.log("fetched hero id=" + id);
        return MockHeroes.getAllHeroes().get(id);
    }

    @Override
    public Collection<HeroDto> searchHeroesByName(String name) {
        return null;
    }

    @Override
    public void updateHero(HeroDto heroDto, Integer id) {
        MockHeroes.getAllHeroes().put(id, heroDto);
        this.log("updated hero id=" + id);
    }

    @Override
    public void createHero(HeroDto heroDto) {
        int id = MockHeroes.getNextId();
        MockHeroes.getAllHeroes().put(id, heroDto);
    }

    @Override
    public void deleteHero(Integer id) {
        MockHeroes.getAllHeroes().remove(id);
    }
}
