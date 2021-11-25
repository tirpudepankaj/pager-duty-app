package com.pager.duty.web.service;

import com.pager.duty.constant.PageAppConstant;
import com.pager.duty.web.model.AlertMessage;
import com.pager.duty.web.model.AlertResponse;
import com.pager.duty.web.model.Team;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class NotificationServiceImpl implements NotificationService {


    @Override
    public void send(Team team, String message) {
        RestTemplate restTemplate = new RestTemplate();
        AlertMessage alertMessage = new AlertMessage(team
                .getDevelopers().stream().findAny().get().getPhoneNumber(), message);
        HttpEntity<AlertMessage> alertMessageHttpEntity = new HttpEntity<>(alertMessage);
        ResponseEntity<AlertResponse> responseEntity = restTemplate.exchange(PageAppConstant.NOTIFICATION_MOC_URL,
                HttpMethod.POST, alertMessageHttpEntity, AlertResponse.class, new String[]{});
        System.out.println(responseEntity);

    }
}
