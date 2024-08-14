package com.example.Movies_app.Services;

import com.example.Movies_app.DTO.MovieDTO;
import com.example.Movies_app.Entities.Movie;
import com.example.Movies_app.Repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MovieServiceImp implements MovieService{
    @Autowired
    private MovieRepository movieRepository;
//    private ActorService actorService;

    public List<MovieDTO> getAllMovies() {
        return movieRepository.findAll().stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    public MovieDTO getMovieById(Long id) {
        return movieRepository.findById(id).map(this::convertToDTO).orElse(null);
    }

    public MovieDTO addMovie(MovieDTO movieDTO) {
        Movie movie = convertToEntity(movieDTO);
        return convertToDTO(movieRepository.save(movie));
    }

    public void deleteMovie(Long id) {
        movieRepository.deleteById(id);
    }

    private MovieDTO convertToDTO(Movie movie) {
        return new MovieDTO(movie.getId(), movie.getTitle(), movie.getGenre(), movie.getYear(),
                movie.getActor() != null ? movie.getActor().getId() : null);
    }

//    public ActorServiceImp service;
    private Movie convertToEntity(MovieDTO movieDTO) {
        Movie movie = new Movie();
        movie.setId(movieDTO.getId());
        movie.setTitle(movieDTO.getTitle());
        movie.setGenre(movieDTO.getGenre());
        movie.setYear(movieDTO.getYear());
        // Assume ActorService can provide Actor by ID
//        movie.setActor(actorService.getActorById(movieDTO.getActorId()));
        return movie;
    }
}

