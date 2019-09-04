package com.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.entity.Xitong;

public interface XitongMapper {
	//鏌ヨ
	List<Xitong> selectxt();
	//教师权限
	Xitong updatext(@Param("quanxian")int quanxian, @Param("id")int id);
	//学生权限
	Xitong updastu(@Param("quanxian")int quanxian, @Param("id")int id);
	
	//查看教师或学生的权限
	List<Xitong> selectid(int id);
	
}
