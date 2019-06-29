package com.uwefuchs.demo.teavm.tourofheroes.views;

import com.uwefuchs.demo.teavm.tourofheroes.HeroRoute;
import com.uwefuchs.demo.teavm.tourofheroes.model.HeroDto;
import com.uwefuchs.demo.teavm.tourofheroes.service.HeroesFacade;
import org.teavm.flavour.routing.Routing;
import org.teavm.flavour.templates.BindTemplate;
import org.teavm.flavour.widgets.BackgroundWorker;

@BindTemplate("templates/details.html")
public class DetailsView {
    private final HeroesFacade heroesFacade;
    private HeroDto selectedHero;

    public DetailsView(int heroId, HeroesFacade heroesFacade) {
        this.heroesFacade = heroesFacade;

        new BackgroundWorker().run(() -> selectedHero = heroesFacade.findHero(heroId));
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

    public void goBack() {
        Routing.open(HeroRoute.class).list();
    }
}
