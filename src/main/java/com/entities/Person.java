package com.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="person")
public class Person {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;

    private String name;

    private Integer age;

    private String heigth;

    private String weigth;


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

    public Integer getAge() {
	return age;
    }

    public void setAge(Integer age) {
	this.age = age;
    }

    public String getHeigth() {
	return heigth;
    }

    public void setHeigth(String heigth) {
	this.heigth = heigth;
    }

    public String getWeigth() {
	return weigth;
    }

    public void setWeigth(String weigth) {
	this.weigth = weigth;
    }

}
