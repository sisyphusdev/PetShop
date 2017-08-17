package com.sisyphusdev.petshop.controllers;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sisyphusdev.petshop.daos.PetDAO;
import com.sisyphusdev.petshop.models.Pet;


@Controller
@Transactional
public class PetsController {

	@Autowired
	private PetDAO petDAO = new PetDAO();
	
	@RequestMapping("/pets")
	public String save(Pet pet) {
		System.out.println("Registration of pet");
		petDAO.savePet(pet);
		return "pets/ok";
	}
	
	@RequestMapping("/pets/form")
	public String form(){
	return "pets/form";
	}
	

}
