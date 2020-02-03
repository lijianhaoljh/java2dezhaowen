package com.accp.domain;

import java.util.Date;

public class Invoice {
    private String invid;

    private Date invdate;

    private Float invmoney;

    public String getInvid() {
        return invid;
    }

    public void setInvid(String invid) {
        this.invid = invid;
    }

    public Date getInvdate() {
        return invdate;
    }

    public void setInvdate(Date invdate) {
        this.invdate = invdate;
    }

    public Float getInvmoney() {
        return invmoney;
    }

    public void setInvmoney(Float invmoney) {
        this.invmoney = invmoney;
    }
}