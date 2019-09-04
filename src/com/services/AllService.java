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
	 * 学会登陆
	 * 
	 * @param stu
	 * @return
	 */
	Stu login(Stu stu);

	/**
	 * 教师登陆
	 * 
	 * @param tea
	 * @return
	 */
	Tea tealogin(Tea tea);

	// 鏌ヨ骞寸骇
	List<Cla> selectcla();

	// 鏌ヨ鐝骇
	List<Stu> selectstu();

	// 鏌ヨ璇剧▼
	List<Tab> selectclass();

	// 鏌ヨ
	List<Xitong> selectxt();

	// 淇敼
	Xitong updatext(int quanxian, int id);

	// 鎻掑叆閫氱煡
	int inserttz(Tongzhi tongzhi);

	// 学生登陆的权限
	Xitong updastu(int quanxian, int id);
	
	//查询教师或学生的权限
	List<Xitong> selectid(int id);

}
