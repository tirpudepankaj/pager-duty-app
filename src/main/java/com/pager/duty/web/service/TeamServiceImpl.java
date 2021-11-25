package com.pager.duty.web.service;

import com.pager.duty.core.PageAppManager;
import com.pager.duty.web.model.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TeamServiceImpl implements TeamService {

    private static List<Team> teamList = new ArrayList<>();

    private PageAppManager pageAppManager;

    @Autowired
    public TeamServiceImpl(PageAppManager pageAppManager) {
        this.pageAppManager = pageAppManager;
    }

    @Override
    public Team create(Team team) {
        teamList.add(team);
        pageAppManager.registered(team.getName(), team);
        return team;
    }
}
