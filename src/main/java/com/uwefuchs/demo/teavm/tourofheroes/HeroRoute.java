package com.uwefuchs.demo.teavm.tourofheroes;

import org.teavm.flavour.routing.Path;
import org.teavm.flavour.routing.PathParameter;
import org.teavm.flavour.routing.PathSet;
import org.teavm.flavour.routing.Route;

@PathSet
public interface HeroRoute extends Route {
    @Path("/")
    void list();

    @Path("/details/{id}")
    void details(@PathParameter("id") String id);
}
