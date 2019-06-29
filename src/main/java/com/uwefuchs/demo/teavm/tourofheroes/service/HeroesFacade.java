package com.uwefuchs.demo.teavm.tourofheroes.service;

import com.uwefuchs.demo.teavm.tourofheroes.model.HeroDto;

import java.util.Collection;

public interface HeroesFacade {
    Collection<HeroDto> getAllHeroes();

    HeroDto findHero(Integer id);

    Collection<HeroDto> searchHeroesByName(String name);

    void updateHero(HeroDto heroDto, Integer id);

    void createHero(HeroDto heroDto);

    void deleteHero(Integer id);
}
