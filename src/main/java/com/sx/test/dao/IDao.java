package com.sx.test.dao;

import java.util.List;

import com.sx.test.pojo.Test;

public interface IDao {
	String count(String name);
	
	List<Test> getAllZsbhs(Test test);
}
