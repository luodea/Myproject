package com.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.common.baseEntity.BaseEntity;

@Entity
@Table(name="person")
public class Person extends BaseEntity{



	private String name;
    private int age;
    private String heigth;
    private String weigth;

    @Column(length=20)
    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }
    @Column(length=10)
    public int getAge() {
	return age;
    }

    public void setAge(int age) {
	this.age = age;
    }
    
    @Column(length=20)
    public String getHeigth() {
	return heigth;
    }

    public void setHeigth(String heigth) {
	this.heigth = heigth;
    }
    @Column(length=20)
    public String getWeigth() {
	return weigth;
    }

    public void setWeigth(String weigth) {
	this.weigth = weigth;
    }

}
