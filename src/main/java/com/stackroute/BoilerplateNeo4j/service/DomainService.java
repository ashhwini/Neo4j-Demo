package com.stackroute.BoilerplateNeo4j.service;

import com.stackroute.BoilerplateNeo4j.domain.Person;

public interface DomainService {
    Iterable<Person> getData();
    Person postData(Person person);
    Person updateData(Person person, String personName);
    void deleteData();
}
