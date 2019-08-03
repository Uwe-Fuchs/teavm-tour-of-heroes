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
        /*Collection<HeroDto> heroes = super.getHeroes();
        List<HeroDto> selectedHeroes = new ArrayList<>(5);

        int counter = 0;

        for (HeroDto hero : heroes) {
            if (counter >= 1 && counter <= 5) {
                selectedHeroes.add(hero);
            }

            counter++;
        }

        return selectedHeroes;*/

        return new ArrayList<>(super.getHeroes()).subList(1, 5);
    }
}
