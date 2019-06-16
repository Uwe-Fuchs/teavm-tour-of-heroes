package com.uwefuchs.demo.teavm.tourofheroes.views;

import com.uwefuchs.demo.teavm.tourofheroes.HeroRoute;
import com.uwefuchs.demo.teavm.tourofheroes.model.HeroDto;
import com.uwefuchs.demo.teavm.tourofheroes.service.MockHeroesService;
import org.teavm.flavour.routing.Routing;
import org.teavm.flavour.templates.BindTemplate;

import java.util.function.Consumer;

@BindTemplate("templates/details.html")
public class DetailsView {
    private HeroDto selectedHero;

    public DetailsView(String heroId) {
        int id = heroId != null ? Integer.valueOf(heroId) : -1;
        selectedHero = MockHeroesService.getHero(id);
    }

    public HeroDto getSelectedHero() {
        return selectedHero;
    }

    public String getSelectedHeroNameUppercase() {
        String name = selectedHero != null ? selectedHero.getName() : "";

        if (name != null) {
            return name.toUpperCase();
        } else {
            return "";
        }
    }

    public HeroRoute route(Consumer<String> consumer) {
        return Routing.build(HeroRoute.class, consumer);
    }
}
