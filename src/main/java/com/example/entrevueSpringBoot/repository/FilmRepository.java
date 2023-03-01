package com.example.entrevueSpringBoot.repository;

import com.example.entrevueSpringBoot.domain.Film;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmRepository extends JpaRepository<Film, Long> {
}
