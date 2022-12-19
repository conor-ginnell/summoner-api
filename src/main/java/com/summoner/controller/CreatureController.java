package com.summoner.controller;

import com.summoner.model.Creature;
import com.summoner.service.CreatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/creature/")
public class CreatureController {

    @Autowired
    CreatureService creatureService;

    public CreatureController() {}

    @GetMapping(value="/{name}")
    public Creature getCreature(@PathVariable String name) {
        return creatureService.findByName(name);
    }
}