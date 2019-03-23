package com.stackroute.BoilerplateNeo4j.service;

import com.stackroute.BoilerplateNeo4j.domain.Person;
import com.stackroute.BoilerplateNeo4j.repository.DomainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DomainServiceImpl implements DomainService {

    private DomainRepository domainRepository;

    @Autowired
    public DomainServiceImpl(DomainRepository domainRepository) {
        this.domainRepository = domainRepository;
    }

    /*
            This method gets all the data from neo4j database
     */
    @Override
    public Iterable<Person> getData() {
        return domainRepository.findAll();
    }

    /*
            This method posts the data to neo4j database
     */
    @Override
    public Person postData(Person person) {
        return domainRepository.save(person);
    }

    /*
        This method updates person's name
     */
    @Override
    public Person updateData(Person person, String personName) {
        person.setName(personName);
        Person update =  domainRepository.save(person);
        return update;
    }

    /*
        This method deletes all the nodes and its relationships from neo4j database
     */
    @Override
    public void deleteData() {
        domainRepository.deleteAllNodesAndRelationship();
    }

}
