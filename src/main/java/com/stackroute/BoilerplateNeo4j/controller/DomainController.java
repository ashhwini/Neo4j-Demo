package com.stackroute.BoilerplateNeo4j.controller;

import com.stackroute.BoilerplateNeo4j.domain.Person;
import com.stackroute.BoilerplateNeo4j.service.DomainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class DomainController {

    private DomainService domainService;

    @Autowired
    public DomainController(DomainService domainService) {
        this.domainService = domainService;
    }


    @GetMapping("/getdata")
    public ResponseEntity<List<Person>> getAllCustomer() {
        return new ResponseEntity(domainService.getData(), HttpStatus.OK);
    }

    @PostMapping("/postdata")
    public ResponseEntity<Person> addAllCustomer(@RequestBody Person person){
        return new ResponseEntity<>(domainService.postData(person),HttpStatus.CREATED);
    }

    @PutMapping("/updatedata/{personName}")
    public ResponseEntity<Person> updateUser(@PathVariable String personName,@RequestBody Person person){
        Person update = domainService.updateData(person,personName);
        return new ResponseEntity<>(update,HttpStatus.OK);
    }

    @DeleteMapping("/deletedata")
    public void deleteUserById()
    {
        domainService.deleteData();
    }

}

