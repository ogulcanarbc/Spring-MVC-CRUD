package com.oglcnarbc.springmvccrud.service;

import java.util.List;

import com.oglcnarbc.springmvccrud.entity.Person;

public interface PersonService {

	public List<Person> getPersons();
	public void savePerson(Person person);
	public Person getPerson(int id);
	public void updatePerson(Person person);
	public void deletePerson(int id);
}
