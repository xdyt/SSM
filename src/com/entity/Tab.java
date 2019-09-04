package com.entity;

public class Tab {
	/**
	 * 教师通讯录实体类
	 * ID,Tabid,
	 * 工号,tabnum,
	 * 姓名,tabname,
	 * 性别,tabsex,
	 * 电话,tabphone,
	 * QQ,tabqq
	 * 课程,tabclass
	 */
    private Integer tabid;

    private String tabnum;

    private String tabname;

    private String tabsex;

    private String tabphone;

    private String tabqq;

    private String tabclass;
    
    /**
     * 提供教师版的get set方法
     * @return
     */

    public Integer getTabid() {
        return tabid;
    }

    public void setTabid(Integer tabid) {
        this.tabid = tabid;
    }

    public String getTabnum() {
        return tabnum;
    }

    public void setTabnum(String tabnum) {
        this.tabnum = tabnum == null ? null : tabnum.trim();
    }

    public String getTabname() {
        return tabname;
    }

    public void setTabname(String tabname) {
        this.tabname = tabname == null ? null : tabname.trim();
    }

    public String getTabsex() {
        return tabsex;
    }

    public void setTabsex(String tabsex) {
        this.tabsex = tabsex == null ? null : tabsex.trim();
    }

    public String getTabphone() {
        return tabphone;
    }

    public void setTabphone(String tabphone) {
        this.tabphone = tabphone == null ? null : tabphone.trim();
    }

    public String getTabqq() {
        return tabqq;
    }

    public void setTabqq(String tabqq) {
        this.tabqq = tabqq == null ? null : tabqq.trim();
    }

    public String getTabclass() {
        return tabclass;
    }

    public void setTabclass(String tabclass) {
        this.tabclass = tabclass == null ? null : tabclass.trim();
    }
}