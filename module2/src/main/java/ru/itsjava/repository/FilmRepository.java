package ru.itsjava.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itsjava.domain.Film;


//Получить фильм с допустимым возрастом больше 10
public interface FilmRepository extends JpaRepository<Film, Long> {
}