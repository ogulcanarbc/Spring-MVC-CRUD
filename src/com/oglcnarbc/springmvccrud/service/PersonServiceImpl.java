package com.oglcnarbc.springmvccrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oglcnarbc.springmvccrud.dao.PersonDao;
import com.oglcnarbc.springmvccrud.entity.Person;

@Service
public class PersonServiceImpl implements PersonService {

	
	@Autowired
	private PersonDao personDao;

	@Override
	public List<Person> getPersons() {
		return personDao.getPersons();
	}

	@Override
	public void savePerson(Person person) {
		
		personDao.savePerson(person);
	}

	@Override
	public Person getPerson(int id) {

		return personDao.getPerson(id);
	}

	@Override
	public void updatePerson(Person person) {
		
		personDao.updatePerson(person);
	}

	@Override
	public void deletePerson(int id) {
		
		personDao.deletePerson(id);
	}

	

}
