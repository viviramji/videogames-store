//a controller class has to have the controller tag or decorator
package com.viviramji.videogames.controller;

import com.viviramji.videogames.domain.Videogame;
import com.viviramji.videogames.service.VideogameService;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class listController {
    
    //obligar a instanciar o crear un constructor que va a instanciar a un service
    private final VideogameService videogameService;

    //constructor
    //Inyección de dependencias
    public listController(VideogameService videogameService) {
        this.videogameService = videogameService;
    }
    
    
    @RequestMapping("/")
    public String toListVideogames(Model model){
        List<Videogame> featuredVideogames = videogameService.getFeaturedVideogames();
        System.out.println(featuredVideogames);
        model.addAttribute("videogames", featuredVideogames);
        return "videogameList";
    }

}
