package com.mapper;

import java.util.List;

import com.entity.Stu;

public interface StuDentMapper {
	// ��ѯ����ѧ����Ϣ
	List<Stu> select();

	// ͨ��idɾ��ѧ����Ϣ
	int deleteStuId(int id);

	// ���ѧ����
	int insertAddStu(Stu stuDent);

	// �޸�ѧ����Ϣ(1)
	Stu selectStuDentId(int id);

	// �޸�ѧ����Ϣ(2)
	int updateStuDent(Stu stuDent1);
   //������ѯѧ����Ϣ
	Stu selectStuname(String uname);

}
