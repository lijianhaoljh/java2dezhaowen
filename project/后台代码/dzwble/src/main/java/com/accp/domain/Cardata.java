package com.accp.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Cardata {
    private String cdlicense;

    private Integer cdno;

    private Integer moid;

    private String cddriver;

    private String cddriverphone;
    

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date cddriverbirth;

    private Integer clid;


    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date cdlicenseend;

    private String cdframe;

    private Integer mid;

    private String cdyearprice;

    private Float cdmileage;

    private Float cdload;
    

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date cdbuydate;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date cdgolicense;

    
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date cdcarcheckdate;

    private Integer fid;

    private Integer inid;
    
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date indate;

    private Integer inidBusiness;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date inidBdate;

    private Integer cdisinsure;

    private Float cdnextmileage;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date cdnextkeepdate;

    private String cno;

    private String remark1;

    private String remark2;

    private String remark3;

    private String remark4;

    private String remark5;
    
    private String cbnam;//车品牌名称
    
    private String moiname;//车型号名称
    
    private String mname;//发动机名称
    
    private String clname;//车辆归属名称
    
    private String fname;//燃油名称
    
    private String cname;//客户名称
    
    public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getClname() {
		return clname;
	}

	public void setClname(String clname) {
		this.clname = clname;
	}

	public String getCbnam() {
		return cbnam;
	}

	public void setCbnam(String cbnam) {
		this.cbnam = cbnam;
	}

	public String getMoiname() {
		return moiname;
	}

	public void setMoiname(String moiname) {
		this.moiname = moiname;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public String getCdlicense() {
        return cdlicense;
    }

    public void setCdlicense(String cdlicense) {
        this.cdlicense = cdlicense;
    }

    public Integer getCdno() {
        return cdno;
    }

    public void setCdno(Integer cdno) {
        this.cdno = cdno;
    }

    public Integer getMoid() {
        return moid;
    }

    public void setMoid(Integer moid) {
        this.moid = moid;
    }

    public String getCddriver() {
        return cddriver;
    }

    public void setCddriver(String cddriver) {
        this.cddriver = cddriver;
    }

    public String getCddriverphone() {
        return cddriverphone;
    }

    public void setCddriverphone(String cddriverphone) {
        this.cddriverphone = cddriverphone;
    }

    public Date getCddriverbirth() {
        return cddriverbirth;
    }

    public void setCddriverbirth(Date cddriverbirth) {
        this.cddriverbirth = cddriverbirth;
    }

    public Integer getClid() {
        return clid;
    }

    public void setClid(Integer clid) {
        this.clid = clid;
    }

    public Date getCdlicenseend() {
        return cdlicenseend;
    }

    public void setCdlicenseend(Date cdlicenseend) {
        this.cdlicenseend = cdlicenseend;
    }

    public String getCdframe() {
        return cdframe;
    }

    public void setCdframe(String cdframe) {
        this.cdframe = cdframe;
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getCdyearprice() {
        return cdyearprice;
    }

    public void setCdyearprice(String cdyearprice) {
        this.cdyearprice = cdyearprice;
    }

    public Float getCdmileage() {
        return cdmileage;
    }

    public void setCdmileage(Float cdmileage) {
        this.cdmileage = cdmileage;
    }

    public Float getCdload() {
        return cdload;
    }

    public void setCdload(Float cdload) {
        this.cdload = cdload;
    }

    public Date getCdbuydate() {
        return cdbuydate;
    }

    public void setCdbuydate(Date cdbuydate) {
        this.cdbuydate = cdbuydate;
    }

    public Date getCdgolicense() {
        return cdgolicense;
    }

    public void setCdgolicense(Date cdgolicense) {
        this.cdgolicense = cdgolicense;
    }

    public Date getCdcarcheckdate() {
        return cdcarcheckdate;
    }

    public void setCdcarcheckdate(Date cdcarcheckdate) {
        this.cdcarcheckdate = cdcarcheckdate;
    }

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public Integer getInid() {
        return inid;
    }

    public void setInid(Integer inid) {
        this.inid = inid;
    }

    public Date getIndate() {
        return indate;
    }

    public void setIndate(Date indate) {
        this.indate = indate;
    }

    public Integer getInidBusiness() {
        return inidBusiness;
    }

    public void setInidBusiness(Integer inidBusiness) {
        this.inidBusiness = inidBusiness;
    }

    public Date getInidBdate() {
        return inidBdate;
    }

    public void setInidBdate(Date inidBdate) {
        this.inidBdate = inidBdate;
    }

    public Integer getCdisinsure() {
        return cdisinsure;
    }

    public void setCdisinsure(Integer cdisinsure) {
        this.cdisinsure = cdisinsure;
    }

    public Float getCdnextmileage() {
        return cdnextmileage;
    }

    public void setCdnextmileage(Float cdnextmileage) {
        this.cdnextmileage = cdnextmileage;
    }

    public Date getCdnextkeepdate() {
        return cdnextkeepdate;
    }

    public void setCdnextkeepdate(Date cdnextkeepdate) {
        this.cdnextkeepdate = cdnextkeepdate;
    }

    public String getCno() {
        return cno;
    }

    public void setCno(String cno) {
        this.cno = cno;
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