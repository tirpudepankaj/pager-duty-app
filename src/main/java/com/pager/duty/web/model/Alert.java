package com.pager.duty.web.model;

public class Alert {

    private String teamName;

    private String message;

    public Alert(String teamName, String message) {
        this.teamName = teamName;
        this.message = message;
    }

    public Alert() {
    }

    public String getMessage() {
        return message;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
