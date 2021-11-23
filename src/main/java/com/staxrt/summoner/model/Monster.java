package com.staxrt.summoner.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name="monsters")
@EntityListeners(AuditingEntityListener.class)
public class Monster {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "monster_name", nullable = false)
    private String monsterName;

    @Column(name = "size", nullable = false)
    private String size;

    @Column(name = "creature_type", nullable = false)
    private String creatureType;

    @Column(name = "alignment", nullable = false)
    private String alignment;

    @Column(name = "armor_class", nullable = false)
    private long armorClass;

    @Column(name = "hit_points", nullable = false)
    private long hitPoints;

    @Column(name = "speed", nullable = false)
    private long speed;

    @Column(name = "strength", nullable = false)
    private long strength;

    @Column(name = "dexterity", nullable = false)
    private long dexterity;

    @Column(name = "constitution", nullable = false)
    private long constitution;

    @Column(name = "intelligence", nullable = false)
    private long intelligence;

    @Column(name = "wisdom", nullable = false)
    private long wisdom;

    @Column(name = "charisma", nullable = false)
    private long charisma;

    @Column(name = "challenge", nullable = false)
    private String challenge;

    @Column(name = "senses", nullable = false)
    private String senses;

    @Column(name = "skills", nullable = false)
    private String skills;

    @Column(name = "languages", nullable = false)
    private String languages;

    @Column(name = "features", nullable = false)
    private ArrayList<String> features;

    @Column(name = "actions", nullable = false)
    private ArrayList<String> actions;

    /**
     * Garden Variety Getters
     */
    public long getId() { return id; }
    public String getMonsterName() { return monsterName; }
    public String getSize() { return size; }
    public String getCreatureType() { return creatureType; }
    public String getAlignment() { return alignment; }
    public String getChallenge() { return challenge; }
    public String getSenses() { return senses; }
    public String getSkills() { return skills; }
    public String getLanguages() { return languages; }
    public long getArmorClass() { return armorClass; }
    public long getHitPoints() { return hitPoints; }
    public long getSpeed() { return speed; }
    public long getStrength() { return strength; }
    public long getDexterity() { return dexterity; }
    public long getConstitution() { return constitution; }
    public long getIntelligence() { return intelligence; }
    public long getWisdom() { return wisdom; }
    public long getCharisma() { return charisma; }

    /**
     * Garden Variety Setters
     */
    public void setId()                                 { this.id = id; }
    public void setMonsterName(String monsterName)      { this.monsterName = monsterName; }
    public void setSize(String size)                    { this.size = size; }
    public void setCreatureType(String creatureType)    { this.creatureType = creatureType; }
    public void setAlignment(String alignment)          { this.alignment = alignment; }
    public void setChallenge(String challenge)          { this.challenge = challenge; }
    public void setSenses(String senses)                { this.senses = senses; }
    public void setSkills(String skills)                { this.skills = skills; }
    public void setLanguages(String languages)          { this.languages = languages; }
    public void setArmorClass(long armorClass)          { this.armorClass = armorClass; }
    public void setHitPoints(long hitPoints)            { this.hitPoints = hitPoints; }
    public void setSpeed(long speed)                    { this.speed = speed; }
    public void setStrength(long strength)              { this.strength = strength; }
    public void setDexterity(long dexterity)            { this.dexterity = dexterity; }
    public void setConstitution(long constitution)      { this.constitution = constitution; }
    public void setIntelligence(long intelligence)      { this.intelligence = intelligence; }
    public void setWisdom(long wisdom)                  { this.wisdom = wisdom; }
    public void setCharisma(long charisma)              { this.charisma = charisma; }


}
