package com.common.basedao.interf;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * �־û���Ļ����ӿ�
 * @author luodea
 *
 */

public interface BaseRepository<T> extends CrudRepository<T, Integer>,PagingAndSortingRepository<T, Integer>{
	
	
}
