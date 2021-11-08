package com.example.strawhats.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Actor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String heroes;
    private String actorName;

    public Actor() {
    }

    public Actor(Long id, String heroes, String actorName) {
        this.id = id;
        this.heroes = heroes;
        this.actorName = actorName;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHeroes() {
        return heroes;
    }

    public void setHeroes(String heroes) {
        this.heroes = heroes;
    }

    public String getActorName() {
        return actorName;
    }

    public void setActorName(String actor) {
        this.actorName = actor;
    }

    @Override
    public String toString() {
        return "VoiceCast{" +
                "id=" + id +
                ", heroes='" + heroes + '\'' +
                ", actor='" + actorName + '\'' +
                '}';
    }
}
