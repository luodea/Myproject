package com.common.basedao.interf;

import java.util.List;


@SuppressWarnings("all")
public interface BaseDao<T> {

    /**
     * 
     * @Description: ��ѯ��������
     * @param hql
     * @return
     * @author luodea 
     * @date 2018��4��27��
     */
    public List<T> findByHql(String hql);
    
    
    /**
     * 
     * @Description:����Id��ѯһ������
     * @param classz ���ݹ�������
     * @param id
     * @return
     * @author luodea 
     * @date 2018��4��27��
     */
    public T findById(Class classz,int id);
    
    
    /**
     * 
     * @Description:�޸�һ������
     * @param targetObject
     * @author luodea 
     * @date 2018��4��27��
     */
    public void update(T targetObject);
    
    
    /**
     * 
     * @Description:ɾ��һ������
     * @param targetObject
     * @author luodea 
     * @date 2018��4��27��
     */
    public void delete(T targetObject);
    
    
    /**
     * 
     * @Description:����һ������
     * @param targetObject
     * @author luodea 
     * @date 2018��4��27��
     */
    public void save(T targetObject);
}
