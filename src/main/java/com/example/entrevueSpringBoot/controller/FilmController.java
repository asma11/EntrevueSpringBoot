package com.example.entrevueSpringBoot.controller;

import com.example.entrevueSpringBoot.domain.Film;
import com.example.entrevueSpringBoot.repository.FilmRepository;
import org.springframework.web.bind.annotation.*;

@RestController
public class FilmController {
    private final FilmRepository _filmRepository;

    public FilmController(FilmRepository filmRepository) {
        this._filmRepository = filmRepository;
    }

    @GetMapping("/api/film/{id}")
    public Film getFilmById(@PathVariable Long id){
        return _filmRepository.getById(id);
    }

    @PostMapping("/api/film")
    public Film addNewFilm(@RequestBody Film newFilm){

    return _filmRepository.save(newFilm);
    }
}
