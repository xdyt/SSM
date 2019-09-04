package com.services;

import java.util.List;

import com.entity.Gra2;
import com.mapper.Gra2Mapper;

public class Gra2ServiceImpl implements Gra2Service{
	private Gra2Mapper gra2dao;
	//添加学生成绩

	@Override
	public void addGra(Gra2 gra2) {
		gra2dao.addGra(gra2);
	}
    //查询成绩
	@Override
	public List<Gra2> selectGra2() {
		return gra2dao.selectGra2();
	}
	
}
