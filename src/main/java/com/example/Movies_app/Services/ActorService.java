package com.example.Movies_app.Services;

import com.example.Movies_app.DTO.ActorDTO;
import com.example.Movies_app.Entities.Actor;

import java.util.List;

public interface ActorService {
    public List<ActorDTO> getAllActors();
    public ActorDTO getActorById(Long id);

    public ActorDTO addActor(ActorDTO actorDTO);

    public void deleteActor(Long id);
}
