package com.uwefuchs.demo.teavm.tourofheroes.views;

import com.uwefuchs.demo.teavm.tourofheroes.HeroRoute;
import com.uwefuchs.demo.teavm.tourofheroes.model.HeroDto;
import com.uwefuchs.demo.teavm.tourofheroes.service.HeroesFacade;
import com.uwefuchs.demo.teavm.tourofheroes.service.MessagesService;
import org.teavm.flavour.routing.Routing;
import org.teavm.flavour.templates.BindTemplate;

import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

@BindTemplate("templates/dashboard.html")
public class DashboardView extends ListView {

    public DashboardView(HeroesFacade heroesFacade) {
        super(heroesFacade);
    }

    @Override
    public Collection<HeroDto> getHeroes() {
        List<HeroDto> heroes = (List<HeroDto>) super.getHeroes();

        return new ArrayList<HeroDto>(heroes.subList(1, 5));
    }
}
