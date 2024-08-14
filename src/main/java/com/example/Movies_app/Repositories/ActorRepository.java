package com.example.Movies_app.Repositories;

import com.example.Movies_app.Entities.Actor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActorRepository extends JpaRepository<Actor ,Long> {
}
