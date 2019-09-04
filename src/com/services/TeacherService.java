package com.services;

import java.util.List;

import com.entity.Tea;


public interface TeacherService {

	List<Tea> list();
	
	int edit(Tea tea);
	
	void delete(int teaid);
	
	Tea get(int teaid);
	// 修改教师信息(1)
	Tea selectTea(int teaid);

	// 修改教师信息(2)
	int updateTea(Tea tea);

	void addtea(Tea tea);
	
}
