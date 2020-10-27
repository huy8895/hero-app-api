package com.demoangularspring.angular_spring.repository;


import com.demoangularspring.angular_spring.model.Hero;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HeroRepository extends JpaRepository<Hero,Long> {
}
