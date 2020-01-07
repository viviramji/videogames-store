package com.viviramji.videogames.service;

import com.viviramji.videogames.domain.Videogame;
import com.viviramji.videogames.repository.VideogameRepository;
import java.util.List;
import org.springframework.stereotype.Service;

// Clase de negocio (logica de negocio) en este caso existe un metodo para 
// obtener los videojuegos destacados
@Service
public class VideogameService {
    
    //inyección de dependencia declarar atributo final y crear su respectivo constructor
    private final VideogameRepository videogameRepo;

    public VideogameService(VideogameRepository videogameRepo) {
        this.videogameRepo = videogameRepo;
    }

    public List<Videogame> getFeaturedVideogames() {
        return videogameRepo.findAll();
    }
    
    public void save(Videogame videogame){
        videogameRepo.save(videogame);
    }
}
