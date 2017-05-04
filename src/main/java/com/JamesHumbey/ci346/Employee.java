package com.JamesHumbey.ci346;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Version;

/**
 * Created by James1
 */
@Data
@Entity
public class Employee {

    private @Id @GeneratedValue Long id;
    private String firstName;
    private String lastName;
    private String description;

    private @Version @JsonIgnore Long Version;

    private Employee(){}

    public Employee(String firstName,String lastName, String description){
        this.firstName = firstName;
        this.lastName = lastName;
        this.description = description;
    }



}
