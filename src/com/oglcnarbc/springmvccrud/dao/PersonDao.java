package com.oglcnarbc.springmvccrud.dao;

import java.util.List;

import com.oglcnarbc.springmvccrud.entity.Person;

public interface PersonDao {
	
	public List<Person> getPersons();
	
	public void savePerson(Person person);

	public Person getPerson(int id);

	public void updatePerson(Person person);

	public void deletePerson(int id);

}
