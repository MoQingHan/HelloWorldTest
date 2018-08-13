package com.sx.test.dao.Impl;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.sx.test.dao.IDaoTest;

public class DaoTestImpl extends SqlSessionDaoSupport implements IDaoTest {
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.lanqiaobei.dao.BaseDao#getMapper(java.lang.Class)
	 */
	public <T> T getMapper(Class<T> clz) {

		return getSqlSession().getMapper(clz);
	}

	
	public Object selectOne(String statement, Object parameter) {

		return getSqlSession().selectOne(statement, parameter);
	}

	


	/*
	 * (non-Javadoc)
	 * 
	 * @see com.lanqiaobei.dao.BaseDao#selectList(java.lang.String,
	 * java.lang.Object)
	 */
	public List<?> selectList(String statement, Object parameter) {

		return getSqlSession().selectList(statement, parameter);
	}
	
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.lanqiaobei.dao.BaseDao#selectMap(java.lang.String,
	 * java.lang.String)
	 */
	public <K, V> Map<K, V> selectMap(String statement, String parameter) {
		return selectMap(statement,parameter);
	}
	
	public <K, V> Map<K, V> selectMap(String statement, Object parameter, String key) {

	
		return getSqlSession().selectMap(statement, parameter, key);
	}

	
		/*
	 * (non-Javadoc)
	 * 
	 * @see com.lanqiaobei.dao.BaseDao#selectMap(java.lang.String,
	 * java.lang.Object, java.lang.String)
	 */
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.lanqiaobei.dao.BaseDao#insert(java.lang.String,
	 * java.lang.Object)
	 */
	public int insert(String statement, Object parameter) {

	
		return getSqlSession().insert(statement, parameter);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.lanqiaobei.dao.BaseDao#update(java.lang.String,
	 * java.lang.Object)
	 */
	public int update(String statement, Object parameter) {

	
		return getSqlSession().update(statement, parameter);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.lanqiaobei.dao.BaseDao#delete(java.lang.String,
	 * java.lang.Object)
	 */
	public int delete(String statement, Object parameter) {

	
		return getSqlSession().delete(statement, parameter);
	}
}
