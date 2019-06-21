package com.uwefuchs.demo.teavm.tourofheroes.views;

import com.uwefuchs.demo.teavm.tourofheroes.HeroRoute;
import com.uwefuchs.demo.teavm.tourofheroes.model.HeroDto;
import com.uwefuchs.demo.teavm.tourofheroes.service.MockHeroesService;
import org.teavm.flavour.routing.Routing;
import org.teavm.flavour.templates.BindTemplate;

import java.util.Collection;
import java.util.Map;

@BindTemplate("templates/list.html")
public class ListView {
    private final Map<Integer, HeroDto> heroesMap = MockHeroesService.getAllHeroes();

    public Collection<HeroDto> getHeroes() {
        return this.heroesMap.values();
    }

    public void showDetails(HeroDto selectedHero) {
        Routing.open(HeroRoute.class).details(selectedHero.getId());
    }
}
