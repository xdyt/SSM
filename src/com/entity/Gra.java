package com.entity;

public class Gra {
	/**
	 * �ɼ����ʵ����
	 * ID,Graid,
	 * ѧ��ѧ��,granum,
	 * ����,gralan,
	 * ��ѧ,gramath,
	 * Ӣ��,graeng
	 */
    private Integer graid;

    private String stunum;

    private String gralan;

    private String gramath;

    private String graeng;

    /**
     * �ṩѧ���ɼ����get set����
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