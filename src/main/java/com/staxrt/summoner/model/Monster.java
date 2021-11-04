package com.staxrt.summoner.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

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

}
