package com.example.Lab.People;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Person {
    private @Id Long id;
    private String Name;
    private String LastName;

    Person(Long id, String Name, String LastName){
        this.id = id;
        this.Name = Name;
        this.LastName = LastName;
    }
}
/*
    fetch(
  '/people',
    {
        method: 'POST',
                headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify({ name: 'Paul', lastName: 'Jackson' })
    }
).then(result => result.json().then(console.log))*/