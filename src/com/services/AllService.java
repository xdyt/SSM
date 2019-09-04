package com.services;

import java.util.List;

import com.entity.Cla;
import com.entity.Stu;
import com.entity.Tab;
import com.entity.Tea;
import com.entity.Tongzhi;
import com.entity.Xitong;

public interface AllService {
	/**
	 * ѧ���½
	 * 
	 * @param stu
	 * @return
	 */
	Stu login(Stu stu);

	/**
	 * ��ʦ��½
	 * 
	 * @param tea
	 * @return
	 */
	Tea tealogin(Tea tea);

	// 查询年级
	List<Cla> selectcla();

	// 查询班级
	List<Stu> selectstu();

	// 查询课程
	List<Tab> selectclass();

	// 查询
	List<Xitong> selectxt();

	// 修改
	Xitong updatext(int quanxian, int id);

	// 插入通知
	int inserttz(Tongzhi tongzhi);

	// ѧ����½��Ȩ��
	Xitong updastu(int quanxian, int id);
	
	//��ѯ��ʦ��ѧ����Ȩ��
	List<Xitong> selectid(int id);

}
