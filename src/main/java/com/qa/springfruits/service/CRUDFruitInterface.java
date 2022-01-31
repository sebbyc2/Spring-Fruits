package com.qa.springfruits.service;

import java.util.List;

public interface CRUDFruitInterface<T>{
	
	//CRRUD
	//A generalised interface for Creating, Reading, Updating, and Deleting Fruits.
	
	//Create
	T create(T t);
	
	//Read All
	List<T> getAll();
	
	//Read One
	T getOne(int id);
	
	//Update
	T update(int id, T t);
	
	//Delete
	boolean delete(int id);

}
