package com.entity;

public class Tea {
	/**
	 * ��ʦʵ����
	 * ID,Teaid,
	 * ����,teanum,
	 * ����,teaname,
	 * �Ա�,teasex,
	 * �绰,teaphone,
	 * QQ,teaQQ,
	 * �γ�,teacou,
	 * ����,teapwd
	 */
    private Integer teaid;

    private String teapwd;

    private String teanum;

    private String teaname;

    private String teasex;

    private String teaphone;

    private String teaqq;

    private String teacou;
    
    /**
     * ��Ӧ��get set����
     * @return
     */
    public Integer getTeaid() {
        return teaid;
    }

    public void setTeaid(Integer teaid) {
        this.teaid = teaid;
    }

    public String getTeapwd() {
        return teapwd;
    }

    public void setTeapwd(String teapwd) {
        this.teapwd = teapwd == null ? null : teapwd.trim();
    }

    public String getTeanum() {
        return teanum;
    }

    public void setTeanum(String teanum) {
        this.teanum = teanum == null ? null : teanum.trim();
    }

    public String getTeaname() {
        return teaname;
    }

    public void setTeaname(String teaname) {
        this.teaname = teaname == null ? null : teaname.trim();
    }

    public String getTeasex() {
        return teasex;
    }

    public void setTeasex(String teasex) {
        this.teasex = teasex == null ? null : teasex.trim();
    }

    public String getTeaphone() {
        return teaphone;
    }

    public void setTeaphone(String teaphone) {
        this.teaphone = teaphone == null ? null : teaphone.trim();
    }

    public String getTeaqq() {
        return teaqq;
    }

    public void setTeaqq(String teaqq) {
        this.teaqq = teaqq == null ? null : teaqq.trim();
    }

    public String getTeacou() {
        return teacou;
    }

    public void setTeacou(String teacou) {
        this.teacou = teacou == null ? null : teacou.trim();
    }
}