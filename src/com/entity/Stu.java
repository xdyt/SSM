package com.entity;

public class Stu {
	/**
	 * 学生实体类
	 * ID,Stuid,
	 * 学号,stunum,
	 * 姓名,stuname,
	 * 性别,stusex,
	 * 电话,stuphone,
	 * QQ,stuQQ,
	 * 班级,stuclass,
	 * 年级,stugrade,
	 * 密码,stupwd
	 */
    private Integer stuid;

    private String stupwd;

    private String stunum;

    private String stuname;

    private String stusex;

    private String stuphone;

    private String stuqq;

    private String stuclass;

    private String stugrade;

    /**
     *  提供get  set方法
     * 
     * @return
     */
    public Integer getStuid() {
        return stuid;
    }

    public void setStuid(Integer stuid) {
        this.stuid = stuid;
    }

    public String getStupwd() {
        return stupwd;
    }

    public void setStupwd(String stupwd) {
        this.stupwd = stupwd == null ? null : stupwd.trim();
    }

    public String getStunum() {
        return stunum;
    }

    public void setStunum(String stunum2) {
        this.stunum = stunum2;
    }

    public String getStuname() {
        return stuname;
    }

    public void setStuname(String stuname) {
        this.stuname = stuname == null ? null : stuname.trim();
    }

    public String getStusex() {
        return stusex;
    }

    public void setStusex(String stusex) {
        this.stusex = stusex == null ? null : stusex.trim();
    }

    public String getStuphone() {
        return stuphone;
    }

    public void setStuphone(String stuphone) {
        this.stuphone = stuphone == null ? null : stuphone.trim();
    }

    public String getStuqq() {
        return stuqq;
    }

    public void setStuqq(String stuqq) {
        this.stuqq = stuqq;
    }

    public String getStuclass() {
        return stuclass;
    }

    public void setStuclass(String stuclass) {
        this.stuclass = stuclass == null ? null : stuclass.trim();
    }

    public String getStugrade() {
        return stugrade;
    }

    public void setStugrade(String stugrade) {
        this.stugrade = stugrade == null ? null : stugrade.trim();
    }

	@Override
	public String toString() {
		return "Stu [stuid=" + stuid + ", stupwd=" + stupwd + ", stunum=" + stunum + ", stuname=" + stuname
				+ ", stusex=" + stusex + ", stuphone=" + stuphone + ", stuqq=" + stuqq + ", stuclass=" + stuclass
				+ ", stugrade=" + stugrade + "]";
	}
    
    
}