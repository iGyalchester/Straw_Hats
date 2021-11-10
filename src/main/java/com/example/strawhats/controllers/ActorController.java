package com.example.strawhats.controllers;

import com.example.strawhats.domain.Actor;
import com.example.strawhats.services.ActorService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/actors")
public class ActorController {

    @Autowired
    ActorService actorService;

    @GetMapping
    public List<Actor> getAllActors() {
        return actorService.getAllActors();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Actor createActor(@RequestBody Actor actor) {
        return actorService.createActor(actor);
    }

    @PutMapping("/{id}")
    public void updateActor(@PathVariable Long id, @RequestBody Actor actor) {
        actorService.updateActor(id, actor);
    }

    @DeleteMapping("/{id}")
    public void deleteActor(@PathVariable Long id) {
        actorService.deleteActor(id);
    }

    @GetMapping("/{id}")
    public Actor getActorById(@PathVariable Long id) {
        return actorService.getActorById(id);
    }

}
