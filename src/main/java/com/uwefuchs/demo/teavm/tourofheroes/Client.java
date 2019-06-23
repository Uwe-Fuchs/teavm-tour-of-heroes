package com.uwefuchs.demo.teavm.tourofheroes;

import com.uwefuchs.demo.teavm.tourofheroes.service.HeroesServiceClient;
import com.uwefuchs.demo.teavm.tourofheroes.views.DetailsView;
import com.uwefuchs.demo.teavm.tourofheroes.views.ListView;
import org.teavm.flavour.templates.BindTemplate;
import org.teavm.flavour.widgets.ApplicationTemplate;
import org.teavm.flavour.widgets.RouteBinder;


@BindTemplate("templates/master.html")
public class Client extends ApplicationTemplate implements HeroRoute {

    private final HeroesServiceClient heroServiceFacade = new HeroesServiceClient();

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
        setView(new ListView(heroServiceFacade));
    }

    @Override
    public void details(int id) {
        setView(new DetailsView(id, heroServiceFacade));
    }
}
