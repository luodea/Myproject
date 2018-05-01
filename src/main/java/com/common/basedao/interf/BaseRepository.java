package com.common.basedao.interf;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * 持久化层的基础接口
 * @author luodea
 *
 */

public interface BaseRepository<T> extends CrudRepository<T, Integer>,PagingAndSortingRepository<T, Integer>{
	
	
}
