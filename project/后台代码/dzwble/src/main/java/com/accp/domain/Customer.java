package com.accp.domain;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Customer {
    private String cno;

    private String ctno;

    private String cname;

    private String cpeople;

    private String cphone;

    private String caddress;
    
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date cbirthday;

    private Integer cperiod;

    private Float climit;

    private String pno;

    private String province;

    private String city;

    private String district;

    private String cremark;

    private String ctaxes;

    private String cregistphone;

    private String cbank;

    private String cbanknumber;

    private String cregistaddress;

    private String other1;

    private String other2;

    private String other3;

    private String other4;

    private String jifen;

    private String creatdate;

    private String remark3;

    private String remark4;

    private String remark5;
    
    private String ctname;//客户类型名称
    
    private Integer isvip;//是否为会员
    
    private String vno;//会员卡号
    
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date vjoindate;//入会时间
    
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date venddate;//会员到期时间

    private Integer vjifen;//会员积分
    
    private String pname;//服务顾问
    
    private String pphone;//顾问电话
    
    private List<Cardata> cars;//汽车集合
    
    public List<Cardata> getCars() {
		return cars;
	}

	public void setCars(List<Cardata> cars) {
		this.cars = cars;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getCtname() {
		return ctname;
	}

	public void setCtname(String ctname) {
		this.ctname = ctname;
	}

	public Integer getIsvip() {
		return isvip;
	}

	public void setIsvip(Integer isvip) {
		this.isvip = isvip;
	}

	public String getVno() {
		return vno;
	}

	public void setVno(String vno) {
		this.vno = vno;
	}

	public Date getVjoindate() {
		return vjoindate;
	}

	public void setVjoindate(Date vjoindate) {
		this.vjoindate = vjoindate;
	}

	public Date getVenddate() {
		return venddate;
	}

	public void setVenddate(Date venddate) {
		this.venddate = venddate;
	}

	public Integer getVjifen() {
		return vjifen;
	}

	public void setVjifen(Integer vjifen) {
		this.vjifen = vjifen;
	}

	public String getPphone() {
		return pphone;
	}

	public void setPphone(String pphone) {
		this.pphone = pphone;
	}

	public String getCno() {
        return cno;
    }

    public void setCno(String cno) {
        this.cno = cno;
    }

    public String getCtno() {
        return ctno;
    }

    public void setCtno(String ctno) {
        this.ctno = ctno;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCpeople() {
        return cpeople;
    }

    public void setCpeople(String cpeople) {
        this.cpeople = cpeople;
    }

    public String getCphone() {
        return cphone;
    }

    public void setCphone(String cphone) {
        this.cphone = cphone;
    }

    public String getCaddress() {
        return caddress;
    }

    public void setCaddress(String caddress) {
        this.caddress = caddress;
    }

    public Date getCbirthday() {
        return cbirthday;
    }

    public void setCbirthday(Date cbirthday) {
        this.cbirthday = cbirthday;
    }

    public Integer getCperiod() {
        return cperiod;
    }

    public void setCperiod(Integer cperiod) {
        this.cperiod = cperiod;
    }

    public Float getClimit() {
        return climit;
    }

    public void setClimit(Float climit) {
        this.climit = climit;
    }

    public String getPno() {
        return pno;
    }

    public void setPno(String pno) {
        this.pno = pno;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCremark() {
        return cremark;
    }

    public void setCremark(String cremark) {
        this.cremark = cremark;
    }

    public String getCtaxes() {
        return ctaxes;
    }

    public void setCtaxes(String ctaxes) {
        this.ctaxes = ctaxes;
    }

    public String getCregistphone() {
        return cregistphone;
    }

    public void setCregistphone(String cregistphone) {
        this.cregistphone = cregistphone;
    }

    public String getCbank() {
        return cbank;
    }

    public void setCbank(String cbank) {
        this.cbank = cbank;
    }

    public String getCbanknumber() {
        return cbanknumber;
    }

    public void setCbanknumber(String cbanknumber) {
        this.cbanknumber = cbanknumber;
    }

    public String getCregistaddress() {
        return cregistaddress;
    }

    public void setCregistaddress(String cregistaddress) {
        this.cregistaddress = cregistaddress;
    }

    public String getOther1() {
        return other1;
    }

    public void setOther1(String other1) {
        this.other1 = other1;
    }

    public String getOther2() {
        return other2;
    }

    public void setOther2(String other2) {
        this.other2 = other2;
    }

    public String getOther3() {
        return other3;
    }

    public void setOther3(String other3) {
        this.other3 = other3;
    }

    public String getOther4() {
        return other4;
    }

    public void setOther4(String other4) {
        this.other4 = other4;
    }

    public String getJifen() {
        return jifen;
    }

    public void setJifen(String jifen) {
        this.jifen = jifen;
    }

    public String getCreatdate() {
        return creatdate;
    }

    public void setCreatdate(String creatdate) {
        this.creatdate = creatdate;
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