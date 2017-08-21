package com.sisyphusdev.petshop.controllers;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sisyphusdev.petshop.daos.PetDAO;
import com.sisyphusdev.petshop.models.Pet;

@Controller
@Transactional
@RequestMapping("pets")
public class PetsController {

	@Autowired
	private PetDAO petDAO = new PetDAO();

	@RequestMapping("/form")
	public String form() {
		return "pets/form";
	}

	@RequestMapping(method=RequestMethod.POST)
	public String save(Pet pet) {
		System.out.println("Registration of pet");
		petDAO.savePet(pet);
		return "pets/ok";
	}

	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView list(Pet pet) {
		List<Pet> pets = petDAO.listPets(pet);
		ModelAndView modelAndView = new ModelAndView("pets/list");
		modelAndView.addObject("pets", pets);
		return modelAndView;
	}
}
