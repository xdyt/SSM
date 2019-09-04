package com.mapper;

import java.util.List;

import com.entity.Stu;

public interface StuDentMapper {
	// 查询所有学生信息
	List<Stu> select();

	// 通过id删除学生信息
	int deleteStuId(int id);

	// 添加学生信
	int insertAddStu(Stu stuDent);

	// 修改学生信息(1)
	Stu selectStuDentId(int id);

	// 修改学生信息(2)
	int updateStuDent(Stu stuDent1);
   //单个查询学生信息
	Stu selectStuname(String uname);

}
