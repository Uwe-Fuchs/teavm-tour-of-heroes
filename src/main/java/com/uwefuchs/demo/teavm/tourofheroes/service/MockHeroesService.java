package com.uwefuchs.demo.teavm.tourofheroes.service;

import java.util.LinkedHashMap;
import java.util.Map;

import com.uwefuchs.demo.teavm.tourofheroes.model.HeroDto;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

public class MockHeroesService {
	private static volatile int heroId = 10;
	//private static final Logger LOG = LoggerFactory.getLogger(MockHeroesService.class);
	private static final Map<Integer, HeroDto> heroesMap;

	static {
		heroesMap = buildHeroesMap();
	}

	private static Map<Integer, HeroDto> buildHeroesMap() {
	    Map<Integer, HeroDto> heroesMap = new LinkedHashMap<>();

	    //LOG.debug("building heroes-map...");

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

	    //LOG.debug("... finished!");

	    return heroesMap;
	}

	private static int getNextId() {
		return ++heroId;
	}

	public static Map<Integer, HeroDto> getAllHeroes() {
		return heroesMap;
	}
}
