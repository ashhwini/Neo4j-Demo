package com.stackroute.BoilerplateNeo4j.repository;

import com.stackroute.BoilerplateNeo4j.domain.Person;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DomainRepository extends Neo4jRepository<Person,Long> {
    @Query("MATCH (n) DETACH DELETE n")
    void deleteAllNodesAndRelationship();
}
