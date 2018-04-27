package com.common.basedao.interf;

import java.util.List;


@SuppressWarnings("all")
public interface BaseDao<T> {

    /**
     * 
     * @Description: 查询多条数据
     * @param hql
     * @return
     * @author luodea 
     * @date 2018年4月27日
     */
    public List<T> findByHql(String hql);
    
    
    /**
     * 
     * @Description:根据Id查询一条数据
     * @param classz 数据关联对象
     * @param id
     * @return
     * @author luodea 
     * @date 2018年4月27日
     */
    public T findById(Class classz,int id);
    
    
    /**
     * 
     * @Description:修改一条数据
     * @param targetObject
     * @author luodea 
     * @date 2018年4月27日
     */
    public void update(T targetObject);
    
    
    /**
     * 
     * @Description:删除一条数据
     * @param targetObject
     * @author luodea 
     * @date 2018年4月27日
     */
    public void delete(T targetObject);
    
    
    /**
     * 
     * @Description:保存一条数据
     * @param targetObject
     * @author luodea 
     * @date 2018年4月27日
     */
    public void save(T targetObject);
}
