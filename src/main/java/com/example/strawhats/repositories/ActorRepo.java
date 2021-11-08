package com.example.strawhats.repositories;

import com.example.strawhats.domain.Actor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActorRepo extends JpaRepository<Actor, Long> {
    //Talk to the database and get the data
}
