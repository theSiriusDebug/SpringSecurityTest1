package com.example.movieService;

import com.example.movieService.models.Developer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface jpaRepositoryForDevelopers extends JpaRepository<Developer, Long> {
    Developer findById(long id);
}
