package com.uwefuchs.demo.teavm.tourofheroes;

import com.uwefuchs.demo.teavm.tourofheroes.service.HeroesFacade;
import com.uwefuchs.demo.teavm.tourofheroes.service.HeroesFacadeMockImpl;
import com.uwefuchs.demo.teavm.tourofheroes.service.MessagesService;
import com.uwefuchs.demo.teavm.tourofheroes.views.DetailsView;
import com.uwefuchs.demo.teavm.tourofheroes.views.ListView;
import com.uwefuchs.demo.teavm.tourofheroes.views.MessagesView;
import org.teavm.flavour.templates.BindTemplate;
import org.teavm.flavour.templates.Fragment;
import org.teavm.flavour.templates.Templates;
import org.teavm.flavour.widgets.ApplicationTemplate;
import org.teavm.flavour.widgets.RouteBinder;


@BindTemplate("templates/master.html")
public class Client extends ApplicationTemplate implements HeroRoute {

    private final MessagesService messagesService = new MessagesService();
    private final HeroesFacade heroesFacade = new HeroesFacadeMockImpl(messagesService);

    public static void main(String[] args) {
        Client client = new Client();
        new RouteBinder()
                .withDefault(HeroRoute.class, HeroRoute::list)
                .add(client)
                .update();

        client.bind("application-content");
    }

    @Override
    public void list() {
        setView(new ListView(heroesFacade));
    }

    @Override
    public void details(int id) {
        setView(new DetailsView(id, heroesFacade));
    }

    public Fragment getMessages() {
        return Templates.create(new MessagesView(messagesService));
    }
}
