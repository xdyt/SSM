package com.services;

import java.util.List;

import com.entity.Stu;

public interface StuDentService {
	// ѧ��������Ϣ��ѯ����
	List<Stu> select();

	// ͨ��IDɾ��ѧ����Ϣ
	int deleteStuId(int id);

	// ���ѧ����Ϣ
	int insertAddStu(Stu stuDent);

	// �޸�ѧ����Ϣ(1)
	Stu selectStuDentId(int id);

	// �޸�ѧ����Ϣ(2)
	int updateStuDent(Stu stuDent1);
    //��ѯ����ѧ����Ϣ
	Stu selectStuname(String uname);

}