package com.pager.duty.web.service;

import com.pager.duty.web.model.Team;

public interface NotificationService {


    public void send(Team team, String message);

}
