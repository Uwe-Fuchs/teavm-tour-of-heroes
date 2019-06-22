package com.uwefuchs.demo.teavm.tourofheroes;

import com.uwefuchs.demo.teavm.tourofheroes.service.HeroesResource;
import com.uwefuchs.demo.teavm.tourofheroes.service.HeroesResourceImpl;
import com.uwefuchs.demo.teavm.tourofheroes.views.DetailsView;
import com.uwefuchs.demo.teavm.tourofheroes.views.ListView;
import org.teavm.flavour.rest.RESTClient;
import org.teavm.flavour.templates.BindTemplate;
import org.teavm.flavour.widgets.ApplicationTemplate;
import org.teavm.flavour.widgets.RouteBinder;


@BindTemplate("templates/master.html")
public class Client extends ApplicationTemplate implements HeroRoute {
    private final String baseUrl = "https://heroes-service-heroku.herokuapp.com/heroes-service/webapi";
    private final HeroesResource heroServiceFacade = new HeroesResourceImpl();
//            RESTClient
//                    .factory(HeroesResource.class)
//                    .createResource(baseUrl);

    public static void main(String[] args) {
        Client client = new Client();
        new RouteBinder()
                .withDefault(HeroRoute.class, r -> r.list())
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
