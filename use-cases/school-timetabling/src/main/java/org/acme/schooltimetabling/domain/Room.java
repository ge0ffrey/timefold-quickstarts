package org.acme.schooltimetabling.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import ai.timefold.solver.core.api.domain.lookup.PlanningId;

@Entity
public class Room {

    @PlanningId
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    // No-arg constructor required for Hibernate
    public Room() {
    }

    public Room(String name) {
        this.name = name;
    }

    public Room(long id, String name) {
        this(name);
        this.id = id;
    }

    @Override
    public String toString() {
        return name;
    }

    // ************************************************************************
    // Getters and setters
    // ************************************************************************

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
