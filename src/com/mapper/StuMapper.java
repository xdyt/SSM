package com.mapper;

import java.util.List;

import com.entity.Stu;

public interface StuMapper {
	/**
	 * 学生的登陆的接口
	 * 
	 * @param stu
	 * @return
	 */
	Stu login(Stu stu);

	// 查询班级
	List<Stu> selectstu();
}
