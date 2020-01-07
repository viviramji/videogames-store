//a controller class has to have the controller tag or decorator
package com.viviramji.videogames.controller;

import com.viviramji.videogames.domain.Videogame;
import com.viviramji.videogames.service.VideogameService;
import java.util.List;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

// I can asign the root of our URL in this controller class
// 4 example: @requestMapping("/myApp"); that means every single endpoing 
// in this class gonna start using localhost:8080/myApp/[myOwnEndpoing]
@Controller
public class listController {
    
    //obligar a instanciar o crear un constructor que va a instanciar a un service
    private final VideogameService videogameService;

    //constructor
    //Inyección de dependencias
    public listController(VideogameService videogameService) {
        this.videogameService = videogameService;
    }
    
    //by default @ReqMapping is Get http method you can use @GetMapping and save some time
    @RequestMapping({"/index", "/home", "/"})
    public String toListVideogames(Model model){
        List<Videogame> featuredVideogames = videogameService.getFeaturedVideogames();
        System.out.println(featuredVideogames);
        model.addAttribute("videogames", featuredVideogames);
        return "videogameList";
    }
    
    //send user to new videogame form
    @RequestMapping(value="/new", method=RequestMethod.GET)
    public String newVideogame(Model model){
        model.addAttribute("videogame", new Videogame());
        return "/crud/new";
    }
    
    //saves a videogame
    @RequestMapping(value="/save", method=RequestMethod.POST)
    public String save(@Valid Videogame videogame,
                        BindingResult bindingResult, Model model){
        System.out.println("@@@ Esto es lo que traigo papi, " + videogame);
        if( bindingResult.hasErrors() ){
            return "/crud/new";
        }else{
            videogameService.save(videogame);
            model.addAttribute("videogame", videogame);
            return "/crud/success";
        }
    }
    
    //success windows
    @RequestMapping(value="/success", method=RequestMethod.POST )
    public String success(@RequestParam("videogame") Videogame videogame){
        return "/crud/success";
    }

}
