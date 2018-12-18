package com.oglcnarbc.springmvccrud.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.oglcnarbc.springmvccrud.entity.Person;
import com.oglcnarbc.springmvccrud.service.PersonService;

@Controller
@RequestMapping("/person")
public class PersonController{
	
	@Autowired
	private PersonService personService;
	
	@GetMapping("/list")
	public String listPeople(Model model) throws IOException {
	
		List<Person> listPerson =  personService.getPersons();
		model.addAttribute("listPersons", listPerson);
		return "ana-sayfa";
	}
	
	@GetMapping("/showPersonForm")
	public String showPersonForm(Model model) {
		
		Person person = new Person();
		model.addAttribute("person", person);
		 
		return "kisi-ekle";
	}
	
	
	@PostMapping("/savePerson")
	public String savePerson(@ModelAttribute("person") Person person) {
		
		personService.savePerson(person);
				
		return "redirect:/person/list";
		
	}
	
	@GetMapping("/showFormUpdatePerson")
	public String showFormForUpdatePerson(@RequestParam("PersonId") int id, Model model) {
		Person person = personService.getPerson(id);
		model.addAttribute("getPerson",person);
		return "kisi-guncelle";
	}
	
	@PostMapping("/updatePerson")
	public String updatePerson(Person person) {
		personService.updatePerson(person);
		return "redirect:/person/list";
	}
	
	@GetMapping("/deletePerson")
	public String deletePerson(@RequestParam("PersonId") int id, Model model) {
		
		personService.deletePerson(id);

		return "redirect:/person/list";
	}
}

