package com.entity;

public class Cla {
    private Integer claid;

    private String claname;

    private String clacour;

    public Integer getClaid() {
        return claid;
    }

    public void setClaid(Integer claid) {
        this.claid = claid;
    }

    public String getClaname() {
        return claname;
    }

    public void setClaname(String claname) {
        this.claname = claname == null ? null : claname.trim();
    }

    public String getClacour() {
        return clacour;
    }

    public void setClacour(String clacour) {
        this.clacour = clacour == null ? null : clacour.trim();
    }
}