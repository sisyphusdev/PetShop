package com.sisyphusdev.petshop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class PetsController {

	@RequestMapping("/pets")
	public String save() {
		System.out.println("Registration of pet");
		return "pets/ok";
	}
	
	@RequestMapping("/pets/form")
	public String form(){
	return "pets/form";
	}
	

}
