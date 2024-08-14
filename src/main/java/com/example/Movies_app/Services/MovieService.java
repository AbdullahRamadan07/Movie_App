package com.example.Movies_app.Services;

import com.example.Movies_app.DTO.MovieDTO;

import java.util.List;

public interface MovieService {
    public List<MovieDTO> getAllMovies();
    public MovieDTO getMovieById(Long id);
    public MovieDTO addMovie(MovieDTO movieDTO);
    public void deleteMovie(Long id);

}
