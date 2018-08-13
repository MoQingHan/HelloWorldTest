package com.sx.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sx.test.dao.IDao;
import com.sx.test.pojo.Test;
import com.sx.test.service.TestService;

@Service(value = "testService")
public class TestServiceImpl implements TestService{
	//@Resource(name="baseDao")
	@Autowired
	public IDao iDao;

	
	/*public void setDao(BaseDaoImpl dao) 
	{

		this.dao = dao;
	}*/
	
	public String test(){
		return "hah";
	}


	@Override
	public List<Test> getALlData() {
		return iDao.getAllZsbhs(null);
	}


	@Override
	public String getCount() {
		// TODO Auto-generated method stub
		return iDao.count("1");
	}



	/*@Override
	public String getCount() {
		// TODO Auto-generated method stub
		return (String)dao.selectOne("com.sx.test.mapper.TestMapper.count", "1");
	}*/
}
