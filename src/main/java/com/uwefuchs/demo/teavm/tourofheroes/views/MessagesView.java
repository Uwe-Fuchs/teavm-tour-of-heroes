package com.uwefuchs.demo.teavm.tourofheroes.views;

import com.uwefuchs.demo.teavm.tourofheroes.service.MessagesService;
import org.teavm.flavour.templates.BindTemplate;

import java.util.List;

@BindTemplate("templates/messages.html")
public class MessagesView {
    private final MessagesService messagesService;

    public MessagesView(MessagesService messagesService) {
        this.messagesService = messagesService;
    }

    public void add(String message) {
        messagesService.add(message);
    }

    public void clear() {
        messagesService.clear();
    }

    public boolean isEmpty() {
        return messagesService.isEmpty();
    }

    public List<String> getMessages() {
        return messagesService.getMessages();
    }
}
