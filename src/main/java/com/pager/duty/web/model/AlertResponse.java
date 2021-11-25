package com.pager.duty.web.model;

public class AlertResponse {

    private String success;


    public AlertResponse() {
    }

    public AlertResponse(String success) {
        this.success = success;
    }

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    @Override
    public String toString() {
        return "AlertResponse{" +
                "success='" + success + '\'' +
                '}';
    }
}
