package com.sisyphusdev.petshop.daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.sisyphusdev.petshop.models.Pet;

@Repository
public class PetDAO {

	@PersistenceContext
	private EntityManager manager;
	
	public void savePet(Pet pet) {
		manager.persist(pet);
	}

	public List<Pet> listPets(Pet pet) {	
		return manager.createQuery("select p from Pet p", Pet.class).getResultList();
	}
	
}
