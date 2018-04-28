package com.common.basedao.impl;

import java.util.List;

import javax.persistence.Query;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.common.basedao.interf.BaseDao;


@Repository("baseDao")
@SuppressWarnings("all")
public class BaseDaoimpl<T> implements BaseDao<T> {


    @Autowired
    private SessionFactory sessionFactory;

    //获取绑定当前线程的Session
    public Session getSession() {
	return sessionFactory.getCurrentSession();
    }

    @Transactional
    public List<T> findByHql(String hql) {
	Query query = getSession().createQuery(hql);
	return query.getResultList();
    }
    @Transactional
    public void update(T targetObject) {
	getSession().update(targetObject);
    }
    @Transactional
    public void delete(T targetObject) {
	getSession().delete(targetObject);
    }
    @Transactional
    public void save(T targetObject) {
	getSession().save(targetObject);
    }

    @Transactional
    public T findById(Class classz, int id) {
	return (T)getSession().get(classz, id);
    }

}
