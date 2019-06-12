package com.uwefuchs.demo.teavm.tourofheroes.views;

import org.teavm.flavour.routing.Routing;
import org.teavm.flavour.templates.BindTemplate;

@BindTemplate("templates/herodetail.html")
public class HeroDetailView {
    private String name;

    public void setName(String name) {
        this.name = name;
    }
}
