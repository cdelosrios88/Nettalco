package com.bizarq.sgt.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.bizarq.sgt.domain.Person;

public interface PersonaMapper {
	/******************************************
	    * Retrieves the List of person 
	    * @return person list
	    */
	    //SQL query in xml "PersonaMapper.xml"
	    public List<Person> selectAllPerson();
	    /******************************************
	    * Retrieves a person 
	    * @param person id
	    * @return person
	    */
	    //SQL query using annotation
	    @Select("SELECT * FROM person")
	    public List<Person> selectAllPerson2();
	   
	    /******************************************
	    * Retrieves a person 
	    * @param person id
	    * @return person
	    */
	    //SQL query using annotation
	    @Select("SELECT * FROM person WHERE id = #{id}")
	    public Person selectPerson(@Param("id") int id);
	   
	    /******************************************
	    * Insert a person 
	    * @param person
	    * @return int
	    */
	    @Insert("INSERT INTO person (id,name) VALUES (#{id}, #{name})")
	    public int insertPerson(Person person);
}
