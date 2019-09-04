package com.mapper;

import java.util.List;

import com.entity.Tea;

public interface TeaMapper {
	/**
	 * 教师登陆的接口
	 * @param tea
	 * @return
	 */
	Tea tealogin(Tea tea);
	//查询所有教师信息
	public List<Tea> listM();
	
	public int editM(Tea tea);
	//删除教师信息
	public void deleteM(int teaid);
	
	public Tea getM(int teaid);
	
	Tea selectTea(int teaid);
	
	int updateTea(Tea tea);
	
	void addtea(Tea tea);	
	
}	
