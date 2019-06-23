package com.uwefuchs.demo.teavm.tourofheroes.service;

import com.uwefuchs.demo.teavm.tourofheroes.model.HeroDto;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import java.util.Collection;

@Path("heroes")
public interface HeroesResource {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    Collection<HeroDto> getAllHeroes();

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    HeroDto findHero(@PathParam("id") Integer id);

    @GET
    @Path("search")
    @Produces(MediaType.APPLICATION_JSON)
    Collection<HeroDto> searchHeroesByName(@QueryParam("name") String name);

    @PUT
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    Response updateHero(HeroDto heroDto, @PathParam("id") Integer id);

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    Response createHero(HeroDto heroDto);

    @DELETE
    @Path("{id}")
    Response deleteHero(@PathParam("id") Integer id);
}
