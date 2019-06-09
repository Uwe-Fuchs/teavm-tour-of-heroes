package com.uwefuchs.demo.teavm.tourofheroes;

import com.uwefuchs.demo.teavm.tourofheroes.model.HeroDto;
import com.uwefuchs.demo.teavm.tourofheroes.service.MockHeroesService;
import org.teavm.flavour.templates.BindTemplate;
import org.teavm.flavour.widgets.ApplicationTemplate;

import java.util.Collection;
import java.util.Map;

@BindTemplate("templates/master.html")
public class Client extends ApplicationTemplate {
    private HeroDto selectedHero;
    private final Map<Integer, HeroDto> heroesMap = MockHeroesService.getAllHeroes();

    public static void main(String[] args) {
        Client client = new Client();
        client.bind("application-content");
    }

    public Collection<HeroDto> getHeroes() {
        return this.heroesMap.values();
    }

    public HeroDto getSelectedHero() {
        return selectedHero;
    }

    public void setSelectedHero(HeroDto selectedHero) {
        this.selectedHero = selectedHero;
    }

    public String getSelectedHeroNameUppercase() {
        String name = getSelectedHero() != null ? getSelectedHero().getName() : "";

        if (name != null) {
            return name.toUpperCase();
        } else {
            return "";
        }
        
    }
}
