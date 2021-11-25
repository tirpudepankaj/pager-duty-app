package com.pager.duty.core;

import com.pager.duty.web.model.Team;
import com.pager.duty.web.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class PageAppManager {

    private Map<String, Team> registeredEvents = new HashMap<>();


    private NotificationService notificationService;

    @Autowired
    public PageAppManager(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public PageAppManager() {
        registeredEvents = new HashMap<>();
    }

    public void registered(String teamName, Team team) {
        registeredEvents.put(teamName, team);
    }

    public void deRegistered(String name) {
        registeredEvents.remove(name);
    }

    public void receivedAlert(String teamName, String message) {
        if (registeredEvents.containsKey(teamName)) {
            Team team = registeredEvents.get(teamName);
            notificationService.send(team, message);
        } else {
            throw new RuntimeException(String.format("%s team is not registered for the alert", teamName));
        }

    }


}
