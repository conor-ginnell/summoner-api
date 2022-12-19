package com.summoner.service;

import com.summoner.model.Creature;
import com.summoner.persistence.CreaturePersistence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreatureService {

    @Autowired
    CreaturePersistence creaturePersistence;

    public CreatureService(){}

    public Creature findByName(String name) {
        return creaturePersistence.get(name);
    }
}
