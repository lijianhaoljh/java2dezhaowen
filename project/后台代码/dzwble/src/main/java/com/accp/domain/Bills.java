package com.accp.domain;

import java.util.Date;
import java.util.List;

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
    
    private String cname; //商品名称
    private String cphone;//电话
    private String vno;//会员编码
    private String pname;//服务顾问
    private String pnames;
    private String btname;
    private Integer sidno;  //项目编号
    private String sidname; //项目名称
    private String pcname; //价类
    private Integer r1; //结算工时
    private float r2; //工时金额
    private String problem; //故障原因
    private String faultdescription; //故障描述
    private Integer rtype; //领料类别
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    @JsonFormat(pattern = "yyyy-mm-dd")
    private Date rtime; //领料日期
    private Integer cno; //商品编号
    private String cuname; //商品单位
    private float bpreferential; //优惠前单价
    private float apreferential; //优惠后单价
    private float bpreferentialm; //优惠后金额
    private String psname; //服务顾问
    private Integer num;
    private String ctname;//车主名称
    private String moiname;//车型
    private String cdframe;//车架号
    private String cbname;
    private String cddriver;
    
    private MaintainBill m;
    private RescueBill r;
    private List<Addition> addtions;
    private Account account;
    private List<Requisition> requisition;
    private List<DMaintenance> maintenance;
    private People people;
    private People pick;
    
    
    public String getCddriver() {
		return cddriver;
	}

	public void setCddriver(String cddriver) {
		this.cddriver = cddriver;
	}

	public String getCbname() {
		return cbname;
	}

	public void setCbname(String cbname) {
		this.cbname = cbname;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public List<Requisition> getRequisition() {
		return requisition;
	}

	public void setRequisition(List<Requisition> requisition) {
		this.requisition = requisition;
	}
	public List<DMaintenance> getMaintenance() {
		return maintenance;
	}

	public void setMaintenance(List<DMaintenance> maintenance) {
		this.maintenance = maintenance;
	}

	public People getPeople() {
		return people;
	}

	public void setPeople(People people) {
		this.people = people;
	}

	public People getPick() {
		return pick;
	}

	public void setPick(People pick) {
		this.pick = pick;
	}

	public List<Addition> getAddtions() {
		return addtions;
	}

	public void setAddtions(List<Addition> addtions) {
		this.addtions = addtions;
	}

	public MaintainBill getM() {
		return m;
	}

	public void setM(MaintainBill m) {
		this.m = m;
	}

	public RescueBill getR() {
		return r;
	}

	public void setR(RescueBill r) {
		this.r = r;
	}

	public String getMoiname() {
		return moiname;
	}

	public void setMoiname(String moiname) {
		this.moiname = moiname;
	}

	public String getCdframe() {
		return cdframe;
	}

	public void setCdframe(String cdframe) {
		this.cdframe = cdframe;
	}

	public String getCtname() {
		return ctname;
	}

	public void setCtname(String ctname) {
		this.ctname = ctname;
	}

	private Date startTime;//开单开始时间
    private Date endTime;//开单最后时间
    
    public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public Integer getSidno() {
		return sidno;
	}

	public void setSidno(Integer sidno) {
		this.sidno = sidno;
	}

	public String getSidname() {
		return sidname;
	}

	public void setSidname(String sidname) {
		this.sidname = sidname;
	}

	public String getPcname() {
		return pcname;
	}

	public void setPcname(String pcname) {
		this.pcname = pcname;
	}

	public Integer getR1() {
		return r1;
	}

	public void setR1(Integer r1) {
		this.r1 = r1;
	}

	public float getR2() {
		return r2;
	}

	public void setR2(float r2) {
		this.r2 = r2;
	}

	public String getProblem() {
		return problem;
	}

	public void setProblem(String problem) {
		this.problem = problem;
	}

	public String getFaultdescription() {
		return faultdescription;
	}

	public void setFaultdescription(String faultdescription) {
		this.faultdescription = faultdescription;
	}

	public Integer getRtype() {
		return rtype;
	}

	public void setRtype(Integer rtype) {
		this.rtype = rtype;
	}

	public Date getRtime() {
		return rtime;
	}

	public void setRtime(Date rtime) {
		this.rtime = rtime;
	}

	public Integer getCno() {
		return cno;
	}

	public void setCno(Integer cno) {
		this.cno = cno;
	}

	public String getCuname() {
		return cuname;
	}

	public void setCuname(String cuname) {
		this.cuname = cuname;
	}

	public float getBpreferential() {
		return bpreferential;
	}

	public void setBpreferential(float bpreferential) {
		this.bpreferential = bpreferential;
	}

	public float getApreferential() {
		return apreferential;
	}

	public void setApreferential(float apreferential) {
		this.apreferential = apreferential;
	}

	public float getBpreferentialm() {
		return bpreferentialm;
	}

	public void setBpreferentialm(float bpreferentialm) {
		this.bpreferentialm = bpreferentialm;
	}

	public String getPsname() {
		return psname;
	}

	public void setPsname(String psname) {
		this.psname = psname;
	}

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