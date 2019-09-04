package com.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.entity.Gra2;
import com.mapper.Gra2Mapper;
@Service
@Transactional
public class GraServiceImpl implements GraService{
	@Autowired
	private Gra2Mapper gradao;

	@Override
	public List<Gra2> selectGra2() {
		
		return gradao.selectGra2();
	}

	@Override
	public void addGra(Gra2 gra2) {
		
		gradao.addGra(gra2);
	}

}
