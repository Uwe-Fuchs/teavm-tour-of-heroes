package com.uwefuchs.demo.teavm.tourofheroes.service;

import java.util.ArrayList;
import java.util.List;

public class MessagesService {
    private List<String> messages = new ArrayList<>();

    public void add(String message) {
        messages.add(message);
    }

    public void clear() {
        messages.clear();
    }
}
