package com.database.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name="find_all_persons", query="select p from Person p")
public class Person {

	@Id
	@GeneratedValue
	private int id;
	
	private String name;
	private String location;
	private Date birth_date;
	
	public Person() {
		
	}
	
	public Person(int id, String name, String location, Date birth_date) {
		this.id = id;
		this.name = name;
		this.location = location;
		this.birth_date = birth_date;
	}
	
	public Person(String name, String location, Date birth_date) {
		this.name = name;
		this.location = location;
		this.birth_date = birth_date;
	}
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}
	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}
	/**
	 * @return the birth_date
	 */
	public Date getBirth_date() {
		return birth_date;
	}
	/**
	 * @param birth_date the birth_date to set
	 */
	public void setBirth_date(Date birth_date) {
		this.birth_date = birth_date;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "\n Person [id=" + id + ", " + (name != null ? "name=" + name + ", " : "")
				+ (location != null ? "location=" + location + ", " : "")
				+ (birth_date != null ? "birth_date=" + birth_date : "") + "]";
	}
	
	
	

}
