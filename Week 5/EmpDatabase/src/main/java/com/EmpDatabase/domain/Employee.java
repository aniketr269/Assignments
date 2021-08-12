package com.EmpDatabase.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employee {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int id;
@Column(name="name")
private String name;
@Column(name="email")
private String email;


public Employee()
{

}


    public Employee(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
