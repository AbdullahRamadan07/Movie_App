package com.example.Movies_app.Repositories;

import com.example.Movies_app.Entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}
