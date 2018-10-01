package com.database.springdata;

import org.springframework.data.jpa.repository.JpaRepository;

import com.database.entity.Person;

public interface PersonSpringDataRepository 
			extends JpaRepository<Person, Integer>{

}
