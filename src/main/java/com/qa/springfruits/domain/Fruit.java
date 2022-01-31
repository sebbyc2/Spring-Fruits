package com.qa.springfruits.domain;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Fruit")
public class Fruit {
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int id;
	
	@NotNull
	@Column
	private String name;
	
	@Column
	private String colour;
	
	@Column
	private int mass;
	
	@Column
	private boolean ripe;
	
	//Empty constructor
	public Fruit() {
	}
	
	//Constructor without ID - likely for end user
	public Fruit(String name, String colour, int mass, boolean ripe) {
		super();
		this.name = name;
		this.colour = colour;
		this.mass = mass;
		this.ripe = ripe;
	}
	
	//Constructor with ID
	public Fruit(int id, String name, String colour, int mass, boolean ripe) {
		super();
		this.id = id;
		this.name = name;
		this.colour = colour;
		this.mass = mass;
		this.ripe = ripe;
	}
	
	//Getters & Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getMass() {
		return mass;
	}

	public void setMass(int mass) {
		this.mass = mass;
	}

	public boolean isRipe() {
		return ripe;
	}

	public void setRipe(boolean ripe) {
		this.ripe = ripe;
	}
	
	//Hashcode
	@Override
	public int hashCode() {
		return Objects.hash(colour, id, mass, name, ripe);
	}
	//Equals
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fruit other = (Fruit) obj;
		return Objects.equals(colour, other.colour) && id == other.id && mass == other.mass
				&& Objects.equals(name, other.name) && ripe == other.ripe;
	}
	
	
	
	
	
	
	
	
	

}
