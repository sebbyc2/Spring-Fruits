package com.qa.springfruits.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.springfruits.domain.Fruit;

@Repository
public interface FruitRepo extends JpaRepository<Fruit, Integer>{
	
}
