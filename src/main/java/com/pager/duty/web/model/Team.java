package com.pager.duty.web.model;

import java.util.List;




public class Team {

    private String name;

    private List<Developer> developers;


    public Team(String name, List<Developer> developers) {
        this.name = name;
        this.developers = developers;
    }

    public String getName() {
        return name;
    }

    public List<Developer> getDevelopers() {
        return developers;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDevelopers(List<Developer> developers) {
        this.developers = developers;
    }
}
