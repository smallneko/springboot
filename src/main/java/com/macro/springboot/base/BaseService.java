package com.macro.springboot.base;

import java.util.List;

/**
 * 通用 Service
 * Create by Cheng
 */

public interface BaseService<T> {

	List<T> list(T entity);

	T get(T entity);

	int update(T entity);

	int save(T entity);

	int delete(T entity);

}
