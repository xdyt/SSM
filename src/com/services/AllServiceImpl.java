package com.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.entity.Cla;
import com.entity.Stu;
import com.entity.Tab;
import com.entity.Tea;
import com.entity.Tongzhi;
import com.entity.Xitong;
import com.mapper.ClaMapper;
import com.mapper.StuMapper;
import com.mapper.TabMapper;
import com.mapper.TeaMapper;
import com.mapper.TongzhiMapper;
import com.mapper.XitongMapper;

@Service
@Transactional
public class AllServiceImpl implements AllService{
	//学生的mapper接口
	@Autowired
	private StuMapper stuMapper;
	//教师的mapper接口
	@Autowired
	private TeaMapper teamapper;
	@Autowired
	private ClaMapper claMapper;
	@Autowired
	private TabMapper tabMapper;
	@Autowired
	private XitongMapper xitongMapper;
	@Autowired
	private TongzhiMapper tongzhiMapper;
	
	//学生登陆方法
	@Override
	public Stu login(Stu stu) {
		return stuMapper.login(stu);
	}
	//教师登陆方法
	@Override
	public Tea tealogin(Tea tea) {
		return teamapper.tealogin(tea);
	}
	
	
	@Override
	public List<Cla> selectcla() {
		List<Cla> list=  claMapper.selectcla();
		return list;
	}

	@Override
	public List<Stu> selectstu() {
		List<Stu> liststu=stuMapper.selectstu();
		return liststu;
	}

	@Override
	public List<Tab> selectclass() {
		System.out.println("canusmt");
		List<Tab> selectsclass = tabMapper.selectclass();
		return selectsclass;
	}

	@Override
	public List<Xitong> selectxt() {
		List<Xitong> selectxt = xitongMapper.selectxt();
		return selectxt;
	}

	@Override
	public Xitong updatext(int quanxian,int id) {
		return xitongMapper.updatext(quanxian, id);
		//Xitong updatext = xitongMapper.updatext(quanxian,id);//TODO
		
	}

	@Override
	public int inserttz(Tongzhi tongzhi) {
		int inserttz = tongzhiMapper.inserttz(tongzhi);
		return inserttz;
	}

	@Override
	public Xitong updastu(int quanxian, int id) {
		// TODO Auto-generated method stub
		return xitongMapper.updastu(quanxian, id);
	}
	@Override
	public List<Xitong> selectid(int id) {
		return xitongMapper.selectid(id);
	}


	
	
}
