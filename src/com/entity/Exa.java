package com.entity;

public class Exa {
	/**
	 * ID,Exaid, 考试名称,exaname, 时间,exatime, 考试类型,Exadata, 考试班级,exacla, 考试科目,exasub,
	 * 备注,eaxrem
	 */
	private Integer exaid;

	private String exaname;

	private String exatime;

	private String exadata;

	private String exacla;

	private String exasub;

	private String exarem;

	/**
	 * 
	 * 
	 * @return
	 */

	public Integer getExaid() {
		return exaid;
	}

	public void setExaid(Integer exaid) {
		this.exaid = exaid;
	}

	public String getExaname() {
		return exaname;
	}

	public void setExaname(String exaname) {
		this.exaname = exaname == null ? null : exaname.trim();
	}

	public String getExatime() {
		return exatime;
	}

	public void setExatime(String exatime) {
		this.exatime = exatime == null ? null : exatime.trim();
	}

	public String getExadata() {
		return exadata;
	}

	public void setExadata(String exadata) {
		this.exadata = exadata == null ? null : exadata.trim();
	}

	public String getExacla() {
		return exacla;
	}

	public void setExacla(String exacla) {
		this.exacla = exacla == null ? null : exacla.trim();
	}

	public String getExasub() {
		return exasub;
	}

	public void setExasub(String exasub) {
		this.exasub = exasub == null ? null : exasub.trim();
	}

	public String getExarem() {
		return exarem;
	}

	public void setExarem(String exarem) {
		this.exarem = exarem == null ? null : exarem.trim();
	}

	@Override
	public String toString() {
		return "Exa [exaid=" + exaid + ", exaname=" + exaname + ", exatime=" + exatime + ", exadata=" + exadata
				+ ", exacla=" + exacla + ", exasub=" + exasub + ", exarem=" + exarem + "]";
	}

	public Exa(Integer exaid, String exaname, String exatime, String exadata, String exacla, String exasub,
			String exarem) {
		super();
		this.exaid = exaid;
		this.exaname = exaname;
		this.exatime = exatime;
		this.exadata = exadata;
		this.exacla = exacla;
		this.exasub = exasub;
		this.exarem = exarem;
	}

	public Exa() {
		super();
		// TODO Auto-generated constructor stub
	}

}