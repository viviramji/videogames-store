package com.viviramji.videogames.repository;

import com.viviramji.videogames.domain.Videogame;
import org.springframework.data.jpa.repository.JpaRepository;

//this interface allows to user ORM methods, delete, update, save, findAll, findById... etc.
//JpaRep recieve the type of data it's gonna manage e. g. Videogame type and Id type in this case an Int
public interface VideogameRepository extends JpaRepository<Videogame, Integer> {
    
}
