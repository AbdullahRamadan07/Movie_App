package com.example.Movies_app.Services;


import com.example.Movies_app.DTO.ActorDTO;
import com.example.Movies_app.Entities.Actor;
import com.example.Movies_app.Repositories.ActorRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

public class ActorServiceImp implements ActorService {

    @Autowired
    private ActorRepository actorRepository;

    public List<ActorDTO> getAllActors() {
        return actorRepository.findAll().stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    public ActorDTO getActorById(Long id) {
        return actorRepository.findById(id).map(this::convertToDTO).orElse(null);
    }

    public ActorDTO addActor(ActorDTO actorDTO) {
        Actor actor = convertToEntity(actorDTO);
        return convertToDTO(actorRepository.save(actor));
    }

    public void deleteActor(Long id) {
        actorRepository.deleteById(id);
    }

    private ActorDTO convertToDTO(Actor actor) {
        return new ActorDTO(actor.getId(), actor.getName());
    }

    private Actor convertToEntity(ActorDTO actorDTO) {
        Actor actor = new Actor();
        actor.setId(actorDTO.getId());
        actor.setName(actorDTO.getName());
        return actor;
    }
}
