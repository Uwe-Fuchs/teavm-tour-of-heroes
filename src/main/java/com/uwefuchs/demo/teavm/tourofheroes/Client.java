package com.uwefuchs.demo.teavm.tourofheroes;

import org.teavm.flavour.templates.BindTemplate;
import org.teavm.flavour.widgets.ApplicationTemplate;
import com.uwefuchs.demo.teavm.tourofheroes.model.HeroDto;

@BindTemplate("templates/master.html")
public class Client extends ApplicationTemplate {
    private HeroDto hero = new HeroDto(1, "Windstorm");

    public static void main(String[] args) {
        Client client = new Client();
        client.bind("application-content");
    }

    public HeroDto getHero() {
        return hero;
    }

    public void setHero(HeroDto hero) {
        this.hero = hero;
    }

    public String getHeroNameUppercase() {
        String name = getHero() != null ? getHero().getName() : "";

        if (name != null) {
            return name.toUpperCase();
        } else {
            return "";
        }
        
    }
}
