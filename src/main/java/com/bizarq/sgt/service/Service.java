package com.bizarq.sgt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.bizarq.sgt.domain.Person;
import com.bizarq.sgt.mapper.PersonaMapper;

public class Service {
	@Autowired
	private PersonaMapper mapper;

	public List<Person> selectAllPerson() {
		return mapper.selectAllPerson();
	}

	public Person selectPerson(int id) {
		return mapper.selectPerson(id);
	}

	public int insertPerson(Person person) {
		return mapper.insertPerson(person);
	}
}
