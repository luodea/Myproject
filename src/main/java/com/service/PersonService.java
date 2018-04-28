package com.service;

import java.util.List;

import com.common.basedao.impl.BaseDaoimpl;
import com.common.basedao.interf.BaseDao;

public class PersonService<T>{
    
    BaseDao<T> dao = new BaseDaoimpl<T>();
    
    public T getdata(Class classz, int id) {
	return dao.findById(classz, id);
    }
   
    

}
