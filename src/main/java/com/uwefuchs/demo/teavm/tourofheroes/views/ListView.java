package com.uwefuchs.demo.teavm.tourofheroes.views;

import com.uwefuchs.demo.teavm.tourofheroes.model.HeroDto;
import com.uwefuchs.demo.teavm.tourofheroes.service.MockHeroesService;
import org.teavm.flavour.templates.BindTemplate;

import java.util.Collection;
import java.util.Map;

@BindTemplate("templates/list.html")
public class ListView {
    private HeroDto selectedHero;
    private final Map<Integer, HeroDto> heroesMap = MockHeroesService.getAllHeroes();

    public Collection<HeroDto> getHeroes() {
        return this.heroesMap.values();
    }

    public HeroDto getSelectedHero() {
        return selectedHero;
    }

    public void setSelectedHero(HeroDto selectedHero) {
        this.selectedHero = selectedHero;
    }
}
