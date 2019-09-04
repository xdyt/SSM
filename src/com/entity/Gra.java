package com.entity;

public class Gra {
	/**
	 * 成绩表的实体类
	 * ID,Graid,
	 * 学生学号,granum,
	 * 语文,gralan,
	 * 数学,gramath,
	 * 英语,graeng
	 */
    private Integer graid;

    private String stunum;

    private String gralan;

    private String gramath;

    private String graeng;

    /**
     * 提供学生成绩表的get set方法
     * @return
     */
    public Integer getGraid() {
        return graid;
    }

    public void setGraid(Integer graid) {
        this.graid = graid;
    }

    public String getStunum() {
        return stunum;
    }

    public void setStunum(String stunum) {
        this.stunum = stunum == null ? null : stunum.trim();
    }

    public String getGralan() {
        return gralan;
    }

    public void setGralan(String gralan) {
        this.gralan = gralan == null ? null : gralan.trim();
    }

    public String getGramath() {
        return gramath;
    }

    public void setGramath(String gramath) {
        this.gramath = gramath == null ? null : gramath.trim();
    }

    public String getGraeng() {
        return graeng;
    }

    public void setGraeng(String graeng) {
        this.graeng = graeng == null ? null : graeng.trim();
    }
}