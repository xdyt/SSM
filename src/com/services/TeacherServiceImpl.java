package com.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Stu;
import com.entity.Tea;
import com.mapper.TeaMapper;


@Service
public class TeacherServiceImpl implements TeacherService{
	@Autowired
	private TeaMapper teaMapper;

	public List<Tea> list() {
		// TODO Auto-generated method stub
		return teaMapper.listM();
	}

	public int edit(Tea tea) {
		// TODO Auto-generated method stub
		return teaMapper.editM(tea);
	}

	public void delete(int teaid) {
		// TODO Auto-generated method stub
		teaMapper.deleteM(teaid);
	}

	public Tea get(int teaid) {
		// TODO Auto-generated method stub
		return teaMapper.getM(teaid);
	}

	// 修改学生信息(1)
	@Override
	public Tea selectTea(int teaid) {
		Tea tea = teaMapper.selectTea(teaid);
		return tea;
	}

	// 修改学生信息(2)
	@Override
	public int updateTea(Tea tea) {
		int s = teaMapper.updateTea(tea);
		return s;
	}

	@Override
	public void addtea(Tea tea) {
		// TODO Auto-generated method stub
		teaMapper.addtea(tea);
	}




	

	
}
