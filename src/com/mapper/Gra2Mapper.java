package com.mapper;

import java.util.List;

import com.entity.Gra2;

public interface Gra2Mapper {
	    //鏌ヨ鎵�鏈夋垚缁╀俊鎭�
		List<Gra2> selectGra2();
		//娣诲姞瀛︾敓鑰冭瘯鎴愮哗
	    void addGra(Gra2 gra2); 
}