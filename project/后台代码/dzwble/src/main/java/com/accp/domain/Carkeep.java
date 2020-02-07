package com.accp.domain;

import java.util.Date;

public class Carkeep {
    private Integer ckid;

    private String cdlicense;

    private Date plandate;

    private Integer planmillage;

    private String remark;

    private String ckname;

    public Integer getCkid() {
        return ckid;
    }

    public void setCkid(Integer ckid) {
        this.ckid = ckid;
    }

    public String getCdlicense() {
        return cdlicense;
    }

    public void setCdlicense(String cdlicense) {
        this.cdlicense = cdlicense;
    }

    public Date getPlandate() {
        return plandate;
    }

    public void setPlandate(Date plandate) {
        this.plandate = plandate;
    }

    public Integer getPlanmillage() {
        return planmillage;
    }

    public void setPlanmillage(Integer planmillage) {
        this.planmillage = planmillage;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getCkname() {
        return ckname;
    }

    public void setCkname(String ckname) {
        this.ckname = ckname;
    }
}