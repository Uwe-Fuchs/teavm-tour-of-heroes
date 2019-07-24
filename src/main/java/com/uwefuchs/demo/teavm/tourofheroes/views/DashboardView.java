package com.uwefuchs.demo.teavm.tourofheroes.views;

import com.uwefuchs.demo.teavm.tourofheroes.HeroRoute;
import com.uwefuchs.demo.teavm.tourofheroes.model.HeroDto;
import com.uwefuchs.demo.teavm.tourofheroes.service.HeroesFacade;
import com.uwefuchs.demo.teavm.tourofheroes.service.MessagesService;
import org.teavm.flavour.routing.Routing;
import org.teavm.flavour.templates.BindTemplate;

import java.util.Collection;
import java.util.ArrayList;

@BindTemplate("templates/dashboard.html")
public class DashboardView extends ListView {

    public DashboardView(HeroesFacade heroesFacade) {
        super(heroesFacade);
    }

    @Override
    public Collection<HeroDto> getHeroes() {
        Collection<HeroDto> heroes = super.getHeroes();
        Collection<HeroDto> selectedHeroes = new ArrayList<>(5);

        return selectedHeroes;
    }
}
