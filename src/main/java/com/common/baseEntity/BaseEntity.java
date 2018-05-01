package com.common.baseEntity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;


@MappedSuperclass
public class BaseEntity {


    //唯一标识id
    public int id;

    //创建用户
    public String createuser;

    //最后修改用户
    public String modityuser;

    //创建时间
    public String createtime;

    //最后修改时间
    public String modifytime;

    //是够删除，1：删除，0：未删除
    public int isdel = 0;

    //是否启用，1：启用，0：禁用
    public int isenable  = 1;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
	return id;
    }

    public void setId(int id) {
	this.id = id;
    }

    @Column(length=10)
    public String getCreateuser() {
	return createuser;
    }

    public void setCreateuser(String createuser) {
	this.createuser = createuser;
    }

    @Column(length=10)
    public String getModityuser() {
	return modityuser;
    }

    public void setModityuser(String modityuser) {
	this.modityuser = modityuser;
    }

    @Column(length=20,columnDefinition="datetime")
    public String getCreatetime() {
	return createtime;
    }

    public void setCreatetime(String createtime) {
	this.createtime = createtime;
    }

    @Column(length=20,columnDefinition="datetime")
    public String getModifytime() {
	return modifytime;
    }

    public void setModifytime(String modifytime) {
	this.modifytime = modifytime;
    }

    @Column(columnDefinition="tinyint  default 0")
    public int getIsdel() {
	return isdel;
    }

    public void setIsdel(int isdel) {
	this.isdel = isdel;
    }

    @Column(columnDefinition="tinyint  default 1")
    public int getIsenable() {
	return isenable;
    }

    public void setIsenable(int isenable) {
	this.isenable = isenable;
    }
}

