package com.demoangularspring.angular_spring.service;


import com.demoangularspring.angular_spring.model.Hero;
import com.demoangularspring.angular_spring.repository.HeroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HeroServiceImpl implements IHeroService {
    @Autowired
    com.demoangularspring.angular_spring.repository.HeroRepository HeroRepository;

    @Override
    public Iterable<Hero> findAll() {
        return HeroRepository.findAll();
    }

    @Override
    public Hero findById(Long id) {
        return HeroRepository.findById(id).get();
    }

    @Override
    public Hero save(Hero Hero) {
        return HeroRepository.save(Hero);
    }

    @Override
    public void remove(Hero Hero) {
        HeroRepository.delete(Hero);
    }
}
