package com.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.entity.Stu;
import com.mapper.StuDentMapper;

@Service
@Transactional
public class StuDentServiceImpl implements StuDentService {
	@Autowired
	private StuDentMapper stuDentMapper;

	// ѧ��������Ϣ��ѯ����
	@Override
	public List<Stu> select() {
		List<Stu> dent = stuDentMapper.select();
		return dent;
	}

	// ͨ��idɾ��ѧ����Ϣ
	@Override
	public int deleteStuId(int id) {
		int u = stuDentMapper.deleteStuId(id);
		return u;
	}

	// ���ѧ����Ϣ
	@Override
	public int insertAddStu(Stu stuDent) {
		int ent = stuDentMapper.insertAddStu(stuDent);
		return ent;
	}

	// �޸�ѧ����Ϣ(1)
	@Override
	public Stu selectStuDentId(int id) {
		Stu stu = stuDentMapper.selectStuDentId(id);
		return stu;
	}

	// �޸�ѧ����Ϣ(2)
	@Override
	public int updateStuDent(Stu stuDent1) {
		int s = stuDentMapper.updateStuDent(stuDent1);
		return s;
	}

	// ������ѯ
	@Override
	public Stu selectStuname(String uname) {
		Stu t = stuDentMapper.selectStuname(uname);
		return t;
	}

}
