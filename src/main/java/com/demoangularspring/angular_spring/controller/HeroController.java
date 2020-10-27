package com.demoangularspring.angular_spring.controller;


import com.demoangularspring.angular_spring.model.Hero;
import com.demoangularspring.angular_spring.service.IHeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping({"/heroes"})
public class HeroController {
    @Autowired
    IHeroService heroService;


    @GetMapping()
    public ResponseEntity<Iterable<Hero>> showListHero() {
        return new ResponseEntity<Iterable<Hero>>(heroService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    @ResponseBody
    public ResponseEntity<Hero> showHeroDetail(@PathVariable("id") Long id) {
        Hero currentHero = heroService.findById(id);
        return new ResponseEntity<>(currentHero, HttpStatus.OK);
    }
//    @PostMapping()
//    public ResponseEntity<Hero> createHero(Hero hero) {
//        heroiService.save(hero);
//        return new ResponseEntity<>(hero, HttpStatus.OK);
//    }

//    @PutMapping("/{id}")
//    public ResponseEntity<Hero> updateHero(Hero hero) {
//        heroService.save(hero);
//        return new ResponseEntity<>(hero, HttpStatus.OK);
//    }
//
//    @GetMapping("/{id}")
//    public ResponseEntity<Hero> detailHero(@PathVariable("id") Long id) {
//        Hero currentHero = heroService.findById(id);
//        return new ResponseEntity<>(currentHero, HttpStatus.OK);
//    }
//
//
//    @DeleteMapping("/delete")
//    public ResponseEntity<Hero> deleteHero
//            (Hero Hero
//            ) {
//        heroService.remove(Hero
//        );
//        return new ResponseEntity<>(Hero
//                , HttpStatus.OK);
//    }
//
//    @GetMapping("/delete/{id}")
//    public ModelAndView showDeleteHero
//            (@PathVariable("id") Long id) {
//        Hero currentHero
//                = heroService.findById(id);
//        ModelAndView modelAndView = new ModelAndView("delete");
//        modelAndView.addObject("Hero" +
//                "", currentHero
//        );
//        return modelAndView;
//    }
}
