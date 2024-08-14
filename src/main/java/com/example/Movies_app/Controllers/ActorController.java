package com.example.Movies_app.Controllers;

import com.example.Movies_app.DTO.ActorDTO;
import com.example.Movies_app.Services.ActorServiceImp;
import com.example.Movies_app.Services.ActorServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/actors")
public class ActorController {

    @Autowired
    private ActorServiceImp actorService;

    @GetMapping
    public List<ActorDTO> getAllActors() {
        return actorService.getAllActors();
    }

    @GetMapping("/{id}")
    public ActorDTO getActorById(@PathVariable Long id) {
        return actorService.getActorById(id);
    }

    @PostMapping
    public ActorDTO addActor(@RequestBody ActorDTO actorDTO) {
        return actorService.addActor(actorDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteDirector(@PathVariable Long id) {
        actorService.deleteActor(id);
    }
}
