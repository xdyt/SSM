package com.mapper;

import java.util.List;

import com.entity.Stu;

public interface StuMapper {
	/**
	 * ѧ���ĵ�½�Ľӿ�
	 * 
	 * @param stu
	 * @return
	 */
	Stu login(Stu stu);

	// ��ѯ�༶
	List<Stu> selectstu();
}
