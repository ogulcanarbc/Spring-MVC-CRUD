package com.oglcnarbc.springmvccrud.dao;

import java.util.List;

import org.hibernate.query.Query;

import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.oglcnarbc.springmvccrud.entity.Person;

@Repository
public class PersonDaoImpl implements PersonDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public List<Person> getPersons() {
	
		Session currentSession = sessionFactory.getCurrentSession();
		List<Person> peopleList = currentSession.createQuery("from Person",Person.class).getResultList();
		return peopleList;
	}

	@Override
	@Transactional
	public void savePerson(Person person) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.save(person);
		
	}

	@Override
	@Transactional
	public Person getPerson(int id) {
		Session currentSession = sessionFactory.getCurrentSession();
		return currentSession.get(Person.class, id);
	}

	@Override
	@Transactional
	public void updatePerson(Person person) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.update(person);
	}

	@Override
	@Transactional
	public void deletePerson(int id) {
		
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Person> query = currentSession.createQuery("delete from Person where id=:personId");
		query.setParameter("personId", id);
		query.executeUpdate();
	}

}
