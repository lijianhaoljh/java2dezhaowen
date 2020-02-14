package com.accp.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Bills {
    private String bid;

    private Integer bstate;

    private String cdlicense;

    private String pno;

    private Integer btid;

    private Integer id;

    private Integer pmid;

    private Integer inid;

    private Integer qualified;

    private Integer reworknum;

    private String respeople;

    private String delaysreason;

    private String reworkreason;

    @DateTimeFormat(pattern = "yyyy-mm-dd")
    @JsonFormat(pattern = "yyyy-mm-dd")
    private Date expectedtime;

    @DateTimeFormat(pattern = "yyyy-mm-dd")
    @JsonFormat(pattern = "yyyy-mm-dd")
    private Date completiontime;

    private Float penaltyamount;

    private String qmember;

    private String pickcar;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date ordertime;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date clearingtime;

    private Float forecastmoney;

    private String remark1;

    private String remark2;

    private String remark3;

    private String remark4;

    private String remark5;
    
    private String mbname;
    private String etime;
    private String edate;
    private String rbname;
    private String contime;
    private String comtime;
    private String atime;
    private String total;
    private String mname;
    
    private String cname;
    private String cphone;
    private String vno;
    private String pname;
    private String pnames;
    private String btname;
    
    public String getBtname() {
		return btname;
	}

	public void setBtname(String btname) {
		this.btname = btname;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCphone() {
		return cphone;
	}

	public void setCphone(String cphone) {
		this.cphone = cphone;
	}

	public String getVno() {
		return vno;
	}

	public void setVno(String vno) {
		this.vno = vno;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPnames() {
		return pnames;
	}

	public void setPnames(String pnames) {
		this.pnames = pnames;
	}

	public String getMbname() {
		return mbname;
	}

	public void setMbname(String mbname) {
		this.mbname = mbname;
	}

	public String getEtime() {
		return etime;
	}

	public void setEtime(String etime) {
		this.etime = etime;
	}

	public String getEdate() {
		return edate;
	}

	public void setEdate(String edate) {
		this.edate = edate;
	}

	public String getRbname() {
		return rbname;
	}

	public void setRbname(String rbname) {
		this.rbname = rbname;
	}

	public String getContime() {
		return contime;
	}

	public void setContime(String contime) {
		this.contime = contime;
	}

	public String getComtime() {
		return comtime;
	}

	public void setComtime(String comtime) {
		this.comtime = comtime;
	}

	public String getAtime() {
		return atime;
	}

	public void setAtime(String atime) {
		this.atime = atime;
	}

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public String getBid() {
        return bid;
    }

    public void setBid(String bid) {
        this.bid = bid;
    }

    public Integer getBstate() {
        return bstate;
    }

    public void setBstate(Integer bstate) {
        this.bstate = bstate;
    }

    public String getCdlicense() {
        return cdlicense;
    }

    public void setCdlicense(String cdlicense) {
        this.cdlicense = cdlicense;
    }

    public String getPno() {
        return pno;
    }

    public void setPno(String pno) {
        this.pno = pno;
    }

    public Integer getBtid() {
        return btid;
    }

    public void setBtid(Integer btid) {
        this.btid = btid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPmid() {
        return pmid;
    }

    public void setPmid(Integer pmid) {
        this.pmid = pmid;
    }

    public Integer getInid() {
        return inid;
    }

    public void setInid(Integer inid) {
        this.inid = inid;
    }

    public Integer getQualified() {
        return qualified;
    }

    public void setQualified(Integer qualified) {
        this.qualified = qualified;
    }

    public Integer getReworknum() {
        return reworknum;
    }

    public void setReworknum(Integer reworknum) {
        this.reworknum = reworknum;
    }

    public String getRespeople() {
        return respeople;
    }

    public void setRespeople(String respeople) {
        this.respeople = respeople;
    }

    public String getDelaysreason() {
        return delaysreason;
    }

    public void setDelaysreason(String delaysreason) {
        this.delaysreason = delaysreason;
    }

    public String getReworkreason() {
        return reworkreason;
    }

    public void setReworkreason(String reworkreason) {
        this.reworkreason = reworkreason;
    }

    public Date getExpectedtime() {
        return expectedtime;
    }

    public void setExpectedtime(Date expectedtime) {
        this.expectedtime = expectedtime;
    }

    public Date getCompletiontime() {
        return completiontime;
    }

    public void setCompletiontime(Date completiontime) {
        this.completiontime = completiontime;
    }

    public Float getPenaltyamount() {
        return penaltyamount;
    }

    public void setPenaltyamount(Float penaltyamount) {
        this.penaltyamount = penaltyamount;
    }

    public String getQmember() {
        return qmember;
    }

    public void setQmember(String qmember) {
        this.qmember = qmember;
    }

    public String getPickcar() {
        return pickcar;
    }

    public void setPickcar(String pickcar) {
        this.pickcar = pickcar;
    }

    public Date getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(Date ordertime) {
        this.ordertime = ordertime;
    }

    public Date getClearingtime() {
        return clearingtime;
    }

    public void setClearingtime(Date clearingtime) {
        this.clearingtime = clearingtime;
    }

    public Float getForecastmoney() {
        return forecastmoney;
    }

    public void setForecastmoney(Float forecastmoney) {
        this.forecastmoney = forecastmoney;
    }

    public String getRemark1() {
        return remark1;
    }

    public void setRemark1(String remark1) {
        this.remark1 = remark1;
    }

    public String getRemark2() {
        return remark2;
    }

    public void setRemark2(String remark2) {
        this.remark2 = remark2;
    }

    public String getRemark3() {
        return remark3;
    }

    public void setRemark3(String remark3) {
        this.remark3 = remark3;
    }

    public String getRemark4() {
        return remark4;
    }

    public void setRemark4(String remark4) {
        this.remark4 = remark4;
    }

    public String getRemark5() {
        return remark5;
    }

    public void setRemark5(String remark5) {
        this.remark5 = remark5;
    }
}