package com.mapper;

import java.util.List;

import com.entity.Tea;

public interface TeaMapper {
	/**
	 * ��ʦ��½�Ľӿ�
	 * @param tea
	 * @return
	 */
	Tea tealogin(Tea tea);
	//��ѯ���н�ʦ��Ϣ
	public List<Tea> listM();
	
	public int editM(Tea tea);
	//ɾ����ʦ��Ϣ
	public void deleteM(int teaid);
	
	public Tea getM(int teaid);
	
	Tea selectTea(int teaid);
	
	int updateTea(Tea tea);
	
	void addtea(Tea tea);	
	
}	
