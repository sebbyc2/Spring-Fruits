package com.qa.springfruits.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.qa.springfruits.domain.Fruit;
import com.qa.springfruits.repo.FruitRepo;

@Service
public class FruitService implements CRUDFruitInterface<Fruit>{
	
	//Creating a repository using FruitRepo interface
	private FruitRepo repo;
	
	//Instantiating the repository
	public FruitService(FruitRepo repo) {
		this.repo = repo;
	}
	
	//Saving a fruit to the repo and then returning it
	@Override
	public Fruit create(Fruit fruit) {
		return this.repo.save(fruit);
	}
	
	//Returning a list of all fruits in the repo
	@Override
	public List<Fruit> getAll() {
		return this.repo.findAll();
	}
	
	//Returning the fruit specified by id
	@Override
	public Fruit getOne(int id) {
		Optional<Fruit> optionalFruit = this.repo.findById(id);
		return optionalFruit.get();
	}
	
	//updating the fruit specified id, with new fruit values
	@Override
	public Fruit update(int id, Fruit newFruit) {
		Optional<Fruit> optionalFruit = this.repo.findById(id);
		if (optionalFruit.isPresent()) {
			Fruit previousFruit = optionalFruit.get();
			previousFruit.setColour(newFruit.getColour());
			previousFruit.setMass(newFruit.getMass());
			previousFruit.setName(newFruit.getName());
			previousFruit.setRipe(newFruit.isRipe());
			return previousFruit;
		}
		return null;
	}
	
	//deleting the fruit in repo specified by id
	@Override
	public boolean delete(int id) {
		this.repo.deleteById(id);
		boolean exists = this.repo.existsById(id);
		return !exists;
	}

}
