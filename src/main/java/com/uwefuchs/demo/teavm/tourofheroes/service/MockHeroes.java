package com.uwefuchs.demo.teavm.tourofheroes.service;

import com.uwefuchs.demo.teavm.tourofheroes.model.HeroDto;

import java.util.LinkedHashMap;
import java.util.Map;

class MockHeroes {
    private static int heroId = 10;
    private static final Map<Integer, HeroDto> heroesMap;

    static {
        heroesMap = new LinkedHashMap<>();

        int id = getNextId();
        heroesMap.put(id, new HeroDto(id, "Mr. Nice"));

        id = getNextId();
        heroesMap.put(id, new HeroDto(id, "Narco"));

        id = getNextId();
        heroesMap.put(id, new HeroDto(id, "Bombasto"));

        id = getNextId();
        heroesMap.put(id, new HeroDto(id, "Celeritas"));

        id = getNextId();
        heroesMap.put(id, new HeroDto(id, "Magneta"));

        id = getNextId();
        heroesMap.put(id, new HeroDto(id, "RubberMan"));

        id = getNextId();
        heroesMap.put(id, new HeroDto(id, "Dynama"));

        id = getNextId();
        heroesMap.put(id, new HeroDto(id, "Dr IQ"));

        id = getNextId();
        heroesMap.put(id, new HeroDto(id, "Magma"));

        id = getNextId();
        heroesMap.put(id, new HeroDto(id, "Tornado"));
    }

    static int getNextId() {
        return ++heroId;
    }

    static Map<Integer, HeroDto> getAllHeroes() {
        return heroesMap;
    }
}
