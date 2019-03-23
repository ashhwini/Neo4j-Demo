package com.stackroute.BoilerplateNeo4j.domain;

import org.neo4j.ogm.annotation.*;

import java.util.List;

@NodeEntity(label = "Person") //This annotation creates the node with label name as Person
public class Person {

    @GraphId
    private Long id;

    @Property(name = "name") //This annotation creates the property with property name as "name"
    private String name;

    @Relationship(type = "likes") //This annotation creates the relationship as likes between the movie node and person node
    private List<Movies> moviesList;

    @Relationship(type = "friendsof") //This annotation creates the relationship as friends-of between the person node and person node
    private List<Person> friendsList;

    public Person() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Movies> getMoviesList() {
        return moviesList;
    }

    public void setMoviesList(List<Movies> moviesList) {
        this.moviesList = moviesList;
    }

    public List<Person> getFriendsList() {
        return friendsList;
    }

    public void setFriendsList(List<Person> friendsList) {
        this.friendsList = friendsList;
    }

    public Person(Long id, String name, List<Movies> moviesList, List<Person> friendsList) {
        this.id = id;
        this.name = name;
        this.moviesList = moviesList;
        this.friendsList = friendsList;
    }
}
