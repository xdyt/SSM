package com.entity;

public class Tongzhi {
	private int utid;
	private String tongzhi;
	public int getUtid() {
		return utid;
	}
	public void setUtid(int utid) {
		this.utid = utid;
	}
	public String getTongzhi() {
		return tongzhi;
	}
	public void setTongzhi(String tongzhi) {
		this.tongzhi = tongzhi;
	}
	@Override
	public String toString() {
		return "Tongzhi [" +"utid=" + utid + ", tongzhi=" + tongzhi + "]";
	}

}
