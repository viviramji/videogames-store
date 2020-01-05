//a controller class has to have the controller tag or decorator
package com.viviramji.videogames.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class listController {
    
    @RequestMapping("/")
    public String toListVideogames(){
        //Searching video games
        return "videogameList";
    }

}
