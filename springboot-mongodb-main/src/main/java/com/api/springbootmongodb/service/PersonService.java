package com.api.springbootmongodb.service;

import com.api.springbootmongodb.collection.Person;
import org.bson.Document;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface PersonService {
    String save(Person person);

    List<Person> getPersonStartWith(String name);

    void delete(String id);

    List<Person> getByPersonAge(Integer minAge, Integer maxAge);

    List<Person> getByPersionSalary(Double minSalary,Double maxSalary);

    Page<Person> search(String name, Integer minAge, Integer maxAge,Double minSalary,Double maxSalary, String city, Pageable pageable);

    Page<Person> search(String id, Integer minSalary,Integer maxSalary,Pageable pageable);
    List<Document> getOldestPersonByCity();

    List<Document> getPopulationByCity();

}
