package com.viviramji.videogames.repository;

import com.viviramji.videogames.domain.Videogame;
import org.springframework.data.jpa.repository.JpaRepository;

//this interface allows to user ORM methods, delete, update, save, findAll, findById... etc.

public interface VideogameRepository extends JpaRepository<Videogame, Integer> {
    
}
