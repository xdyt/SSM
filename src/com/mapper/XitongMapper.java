package com.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.entity.Xitong;

public interface XitongMapper {
	//查询
	List<Xitong> selectxt();
	//��ʦȨ��
	Xitong updatext(@Param("quanxian")int quanxian, @Param("id")int id);
	//ѧ��Ȩ��
	Xitong updastu(@Param("quanxian")int quanxian, @Param("id")int id);
	
	//�鿴��ʦ��ѧ����Ȩ��
	List<Xitong> selectid(int id);
	
}
