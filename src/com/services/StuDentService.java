package com.services;

import java.util.List;

import com.entity.Stu;

public interface StuDentService {
	// 学生个人信息查询所有
	List<Stu> select();

	// 通过ID删除学生信息
	int deleteStuId(int id);

	// 添加学生信息
	int insertAddStu(Stu stuDent);

	// 修改学生信息(1)
	Stu selectStuDentId(int id);

	// 修改学生信息(2)
	int updateStuDent(Stu stuDent1);
    //查询单个学生信息
	Stu selectStuname(String uname);

}