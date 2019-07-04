package com.uwefuchs.demo.teavm.tourofheroes.service;

public abstract class AbstractHeroesFacadeImpl implements HeroesFacade {
    private final MessagesService messagesService;

    public AbstractHeroesFacadeImpl(MessagesService messagesService) {
        this.messagesService = messagesService;
    }

    protected void log(String message) {
        this.messagesService.add("HeroesFacade: " + message);
    }
}
