package com.mapper;

import java.util.List;

import com.entity.Exa;

public interface ExaMapper {
	//查询考试列表
	List<Exa> selectExa();
	
	//删除考试信息
	int deleteExa(Integer exaid);
	//添加考试
	void AddExa(Exa exa);
	
}
