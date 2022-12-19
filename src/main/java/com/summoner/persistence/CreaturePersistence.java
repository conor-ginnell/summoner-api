package com.summoner.persistence;

import com.summoner.model.Creature;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
public class CreaturePersistence {

    HashMap<String, Creature> creatureMap;

    public CreaturePersistence() {
        this.creatureMap = new HashMap<>();
        Creature goblin = new Creature("Goblin", 12, 6);
        creatureMap.put(goblin.name(), goblin);
    }

    public Creature get(String name) {
        return creatureMap.get(name);
    }

    public void put(Creature creature) {
        creatureMap.put(creature.name(), creature);
    }
}
