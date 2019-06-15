package com.uwefuchs.demo.teavm.tourofheroes.views;

import com.uwefuchs.demo.teavm.tourofheroes.model.HeroDto;
import org.teavm.flavour.templates.BindTemplate;

@BindTemplate("templates/details.html")
public class DetailsView {
    private String heroId = null;
    private HeroDto selectedHero = null;

    public DetailsView(String heroId) {
        this.heroId = heroId;
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
}
