package com.sushishop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sushishop.entity.Sushi;;

@Repository
public interface SushiRepository extends JpaRepository<Sushi, Long>{

    List<Sushi> findByName(String name);
}
