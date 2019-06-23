package com.uwefuchs.demo.teavm.tourofheroes.views;

import com.uwefuchs.demo.teavm.tourofheroes.HeroRoute;
import com.uwefuchs.demo.teavm.tourofheroes.model.HeroDto;
import com.uwefuchs.demo.teavm.tourofheroes.service.HeroesServiceClient;
import org.teavm.flavour.routing.Routing;
import org.teavm.flavour.templates.BindTemplate;
import org.teavm.flavour.widgets.BackgroundWorker;

@BindTemplate("templates/details.html")
public class DetailsView {
    private final HeroesServiceClient heroServiceFacade;
    private HeroDto selectedHero;

    public DetailsView(int heroId, HeroesServiceClient heroServiceFacade) {
        this.heroServiceFacade = heroServiceFacade;

        new BackgroundWorker().run(() -> selectedHero = heroServiceFacade.findHero(heroId));
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
