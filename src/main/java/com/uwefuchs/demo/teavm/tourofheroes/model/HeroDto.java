package com.uwefuchs.demo.teavm.tourofheroes.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class HeroDto implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private int id;
    private String name;
    
    // jackson
    @SuppressWarnings("unused")
	private HeroDto() {    	
    }

    public HeroDto (int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }
}
