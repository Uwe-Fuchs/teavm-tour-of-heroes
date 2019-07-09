package com.uwefuchs.demo.teavm.tourofheroes.service;

import com.uwefuchs.demo.teavm.tourofheroes.model.HeroDto;

import java.util.Collection;

public class HeroesFacadeMockImpl extends AbstractHeroesFacadeImpl {

    public HeroesFacadeMockImpl(MessagesService messagesService) {
        super(messagesService);
    }

    @Override
    public Collection<HeroDto> getAllHeroes() {
        Collection<HeroDto> allHeroes = MockHeroes.getAllHeroes().values();
        this.log("fetched heroes");

        return allHeroes;
    }

    @Override
    public HeroDto findHero(Integer id) {
        HeroDto hero = MockHeroes.getAllHeroes().get(id);
        this.log("fetched hero id=" + id);

        return hero;
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
        this.log("created hero id=" + id);
    }

    @Override
    public void deleteHero(Integer id) {
        MockHeroes.getAllHeroes().remove(id);
        this.log("deleted hero id=" + id);
    }
}
