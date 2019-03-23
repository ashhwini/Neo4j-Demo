package com.stackroute.BoilerplateNeo4j.domain;

import org.neo4j.ogm.annotation.*;

@NodeEntity(label = "Movies") //This annotation creates the node with label name as Movies
public class Movies {

    @GraphId
    private Long id;

    @Property(name = "title")  //This annotation creates the property with property name as "title"
    private String title;

    public Movies(Long id, String title) {
        this.id = id;
        this.title = title;
    }

    public Movies() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
