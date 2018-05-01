package com.common.baseEntity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;


@MappedSuperclass
public class BaseEntity {


    //Ψһ��ʶid
    public int id;

    //�����û�
    public String createuser;

    //����޸��û�
    public String modityuser;

    //����ʱ��
    public String createtime;

    //����޸�ʱ��
    public String modifytime;

    //�ǹ�ɾ����1��ɾ����0��δɾ��
    public int isdel = 0;

    //�Ƿ����ã�1�����ã�0������
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

