package com.qa.springfruits.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qa.springfruits.domain.Fruit;

public interface FruitRepo extends JpaRepository<Fruit, Integer>{
	
}
