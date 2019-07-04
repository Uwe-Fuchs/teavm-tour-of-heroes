package com.uwefuchs.demo.teavm.tourofheroes.views;

import com.uwefuchs.demo.teavm.tourofheroes.HeroRoute;
import com.uwefuchs.demo.teavm.tourofheroes.model.HeroDto;
import com.uwefuchs.demo.teavm.tourofheroes.service.HeroesFacade;
import com.uwefuchs.demo.teavm.tourofheroes.service.MessagesService;
import org.teavm.flavour.routing.Routing;
import org.teavm.flavour.templates.BindTemplate;

import java.util.Collection;

@BindTemplate("templates/list.html")
public class ListView {
    private final HeroesFacade heroesFacade;
    private final MessagesService messagesService;

    public ListView(HeroesFacade heroesFacade, MessagesService messagesService) {
        this.heroesFacade = heroesFacade;
        this.messagesService = messagesService;
    }

    public Collection<HeroDto> getHeroes() {
        return this.heroesFacade.getAllHeroes();
    }

    public void showDetails(HeroDto selectedHero) {
        Routing.open(HeroRoute.class).details(selectedHero.getId());
    }
}
