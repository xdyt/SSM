package com.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.entity.Exa;
import com.mapper.ExaMapper;

@Service
@Transactional
public class ExaServiceImpl implements ExaService{
	//注入ExaMapper
	@Autowired
	private ExaMapper exaMapper;
	//查询考试列表信息
	@Override
	public List<Exa> selectExa() {
		List<Exa> exa=exaMapper.selectExa();
		return exa;
	}
	
	//删除考试信息
	@Override
	public int deleteExa(Integer exaid) {
		exaMapper.deleteExa(exaid);
		return exaid;
		
	}
	//添加考试
	@Override
	public void AddExa(Exa exa) {
		exaMapper.AddExa(exa);
		
	}

	
	

}
