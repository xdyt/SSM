package com.entity;

public class Gra2 {
    private Integer graid;
    private Integer stunum;
    private String stuname;
    private String gralan;
    private String gramath;
    private String graeng;
    public Integer getGraid() {
        return graid;
    }
    public void setGraid(Integer graid) {
        this.graid = graid;
    }
    public Integer getStunum() {
        return stunum;
    }
    public void setStunum(Integer stunum) {
        this.stunum = stunum;
    }
    public String getStuname() {
        return stuname;
    }

    public void setStuname(String stuname) {
        this.stuname = stuname;
    }
    public String getGralan() {
        return gralan;
    }

    public void setGralan(String gralan) {
        this.gralan = gralan;
    }
    public String getGramath() {
        return gramath;
    }

    public void setGramath(String gramath) {
        this.gramath = gramath;
    }

    public String getGraeng() {
        return graeng;
    }
    public void setGraeng(String graeng) {
        this.graeng = graeng;
    }
	@Override
	public String toString() {
		return "Gra2 [graid=" + graid + ", stunum=" + stunum + ", stuname=" + stuname + ", gralan=" + gralan
				+ ", gramath=" + gramath + ", graeng=" + graeng + "]";
	}
	public Gra2() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Gra2(Integer graid, Integer stunum, String stuname, String gralan, String gramath, String graeng) {
		super();
		this.graid = graid;
		this.stunum = stunum;
		this.stuname = stuname;
		this.gralan = gralan;
		this.gramath = gramath;
		this.graeng = graeng;
	}
    
}