package com.pager.duty.web.service;

import com.pager.duty.core.PageAppManager;
import com.pager.duty.web.model.Alert;
import org.springframework.stereotype.Component;

@Component
public class AlertServiceImpl implements AlertService {

    private PageAppManager pageAppManager;

    public AlertServiceImpl(PageAppManager pageAppManager) {
        this.pageAppManager = pageAppManager;
    }

    @Override
    public Alert send(Alert alert) {
        pageAppManager.receivedAlert(alert.getTeamName(), alert.getMessage());
        return alert;
    }
}
