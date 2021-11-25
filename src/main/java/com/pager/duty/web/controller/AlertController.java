package com.pager.duty.web.controller;

import com.pager.duty.web.model.Alert;
import com.pager.duty.web.service.AlertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlertController {


    private AlertService alertService;

    @Autowired
    public AlertController(AlertService alertService) {
        this.alertService = alertService;
    }


    @PostMapping("/page-app/send")
    public ResponseEntity<Alert> sendAlert(@RequestBody Alert alert) {
        return
                ResponseEntity.accepted()
                        .body(alertService.send(alert));
    }


}
