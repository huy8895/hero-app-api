package com.demoangularspring.angular_spring.service;


import com.demoangularspring.angular_spring.model.Hero;

public interface IHeroService {
    Iterable<Hero> findAll();
    Hero findById(Long id);
    Hero save(Hero city);
    void remove(Hero city);
}

