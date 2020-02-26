package com.accp.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Account {
    private Integer id;
    private Integer aid;
    
    public Integer getAid() {
		return aid;
	}

	public void setAid(Integer aid) {
		this.aid = aid;
	}

	private String bid;

    private Integer astate;

    private Float beforeMoney;

    private Float total;

    private Float materialsExpenses;

    private Float crash;

    private Float addition;

    @DateTimeFormat(pattern = "yyyy-mm-dd")
    @JsonFormat(pattern = "yyyy-mm-dd")
    private Date atime;

    private String aname;

    private Float cash;

    private Float bank;

    private Float bill;

    private Float buying;

    private Float atCard;

    private Float atDeposit;

    private Float collectTaxes;

    private Float voucher;

    private Float wipeMantissa;

    private Float internal;

    private Float pointsDeduction;

    private Float profitLoss;

    private Integer itid;

    private String invid;

    private String remark1;

    private String remark2;

    private String remark3;

    private String remark4;

    private String remark5;
    
    private String rbname;
    private String mbname;
    private String pmname;
    private Integer bstate;
    private String btname;
    private String cname;
    private String cdlicense;
    private String moiname;
    private String cdframe;
    private String cpeople;
    private String inname;
    private String ieinname;
    private String pname;
    private String cno;
    private String jifen;
    
    private String billmoney;
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    @JsonFormat(pattern = "yyyy-mm-dd")
    private Date invdate;
    
    
    
    public String getBillmoney() {
		return billmoney;
	}

	public void setBillmoney(String billmoney) {
		this.billmoney = billmoney;
	}

	public Date getInvdate() {
		return invdate;
	}

	public void setInvdate(Date invdate) {
		this.invdate = invdate;
	}

	public String getCno() {
		return cno;
	}

	public void setCno(String cno) {
		this.cno = cno;
	}

	public String getJifen() {
		return jifen;
	}

	public void setJifen(String jifen) {
		this.jifen = jifen;
	}

	@DateTimeFormat(pattern = "yyyy-mm-dd")
    @JsonFormat(pattern = "yyyy-mm-dd")
    private Date completiontime;

    
    public String getRbname() {
		return rbname;
	}

	public void setRbname(String rbname) {
		this.rbname = rbname;
	}

	public String getMbname() {
		return mbname;
	}

	public void setMbname(String mbname) {
		this.mbname = mbname;
	}

	public String getPmname() {
		return pmname;
	}

	public void setPmname(String pmname) {
		this.pmname = pmname;
	}

	public Integer getBstate() {
		return bstate;
	}

	public void setBstate(Integer bstate) {
		this.bstate = bstate;
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

	public String getCdlicense() {
		return cdlicense;
	}

	public void setCdlicense(String cdlicense) {
		this.cdlicense = cdlicense;
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

	public String getCpeople() {
		return cpeople;
	}

	public void setCpeople(String cpeople) {
		this.cpeople = cpeople;
	}

	public String getInname() {
		return inname;
	}

	public void setInname(String inname) {
		this.inname = inname;
	}

	public String getIeinname() {
		return ieinname;
	}

	public void setIeinname(String ieinname) {
		this.ieinname = ieinname;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Date getCompletiontime() {
		return completiontime;
	}

	public void setCompletiontime(Date completiontime) {
		this.completiontime = completiontime;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBid() {
        return bid;
    }

    public void setBid(String bid) {
        this.bid = bid;
    }

    public Integer getAstate() {
        return astate;
    }

    public void setAstate(Integer astate) {
        this.astate = astate;
    }

    public Float getBeforeMoney() {
        return beforeMoney;
    }

    public void setBeforeMoney(Float beforeMoney) {
        this.beforeMoney = beforeMoney;
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    public Float getMaterialsExpenses() {
        return materialsExpenses;
    }

    public void setMaterialsExpenses(Float materialsExpenses) {
        this.materialsExpenses = materialsExpenses;
    }

    public Float getCrash() {
        return crash;
    }

    public void setCrash(Float crash) {
        this.crash = crash;
    }

    public Float getAddition() {
        return addition;
    }

    public void setAddition(Float addition) {
        this.addition = addition;
    }

    public Date getAtime() {
        return atime;
    }

    public void setAtime(Date atime) {
        this.atime = atime;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public Float getCash() {
        return cash;
    }

    public void setCash(Float cash) {
        this.cash = cash;
    }

    public Float getBank() {
        return bank;
    }

    public void setBank(Float bank) {
        this.bank = bank;
    }

    public Float getBill() {
        return bill;
    }

    public void setBill(Float bill) {
        this.bill = bill;
    }

    public Float getBuying() {
        return buying;
    }

    public void setBuying(Float buying) {
        this.buying = buying;
    }

    public Float getAtCard() {
        return atCard;
    }

    public void setAtCard(Float atCard) {
        this.atCard = atCard;
    }

    public Float getAtDeposit() {
        return atDeposit;
    }

    public void setAtDeposit(Float atDeposit) {
        this.atDeposit = atDeposit;
    }

    public Float getCollectTaxes() {
        return collectTaxes;
    }

    public void setCollectTaxes(Float collectTaxes) {
        this.collectTaxes = collectTaxes;
    }

    public Float getVoucher() {
        return voucher;
    }

    public void setVoucher(Float voucher) {
        this.voucher = voucher;
    }

    public Float getWipeMantissa() {
        return wipeMantissa;
    }

    public void setWipeMantissa(Float wipeMantissa) {
        this.wipeMantissa = wipeMantissa;
    }

    public Float getInternal() {
        return internal;
    }

    public void setInternal(Float internal) {
        this.internal = internal;
    }

    public Float getPointsDeduction() {
        return pointsDeduction;
    }

    public void setPointsDeduction(Float pointsDeduction) {
        this.pointsDeduction = pointsDeduction;
    }

    public Float getProfitLoss() {
        return profitLoss;
    }

    public void setProfitLoss(Float profitLoss) {
        this.profitLoss = profitLoss;
    }

    public Integer getItid() {
        return itid;
    }

    public void setItid(Integer itid) {
        this.itid = itid;
    }

    public String getInvid() {
        return invid;
    }

    public void setInvid(String invid) {
        this.invid = invid;
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