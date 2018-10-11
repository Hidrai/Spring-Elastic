package com.hid.hidrai.springelasticdemo.developer.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * Created by Hidrai on 10/10/2018.
 */

@Document(indexName = "hidrai", type = "developers")
public class Developer {

    @Id
    private String id;
    private String name;
    private String surname;
    private String spec;
    private String email;

    public Developer(){}

    public Developer (String id, String name, String surname, String spec, String email)
    {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.spec = spec;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", spec='" + spec + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
