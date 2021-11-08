package com.example.strawhats.services;

import com.example.strawhats.domain.Actor;
import com.example.strawhats.repositories.ActorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class ActorService {

    private ActorRepo actorRepo;

    @Autowired
    public ActorService(ActorRepo actorRepo) {
        this.actorRepo = actorRepo;
    }

    public List<Actor> getAllActors() {
        List<Actor> actors = new ArrayList<>();
        actorRepo.findAll().forEach(actors::add);
        return actors;
    }

    public Actor getActor(Long id) {
        return actorRepo.findById(id).orElse(null);
    }

    public Actor createActor(Actor actor) {
        return actorRepo.save(actor);
    }

    public void updateActor(Long id, Actor actor) {
        actorRepo.save(actor);
    }

    public void deleteActor(Long id) {
        actorRepo.deleteById(id);
    }

    public void addActor(Actor actor) {
        actorRepo.save(actor);
    }

    public Actor getActorById(Long id) {
        return actorRepo.findById(id).orElse(null);
    }
}
