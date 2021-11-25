package com.pager.duty.web.controller;

import com.pager.duty.web.model.Team;
import com.pager.duty.web.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeamController {

    private TeamService teamService;


    @Autowired
    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }


    @PostMapping("/pager-app/team/")
    public ResponseEntity<Team> create(@RequestBody Team team) {
        return ResponseEntity.accepted().body(teamService.create(team));
    }

}
