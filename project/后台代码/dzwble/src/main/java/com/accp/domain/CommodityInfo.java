package com.accp.domain;

public class CommodityInfo {
    private Integer cno;

    private String cname;

    private Integer cbid;

    private Integer cuid;

    private String vehicletype;

    private Integer gid;

    private Integer toino;

    private Integer coid;

    private Integer gcid;

    private Integer pid;

    private Integer mfid;

    private String origin;

    private String barcode;

    private String pack;

    private Float volume;

    private Float grossweight;

    private Float netweight;

    private Float stockprice;

    private Float markup;

    private String exchangecode;

    private Float standardprice;

    private Float memberprice;

    private Float vipprice;

    private Float agreementprice;

    private Float insuranceprice;

    private Float claimprice;

    private String remark1;

    private String remark2;

    private String remark3;

    private String remark4;

    private String remark5;
    
    private int zgid;         //商品大类表ID
    private String zgame;     //商品类名称 包括大中小类
    private int zparentid;    //商品类父级ID;
    
    private String zcbname;   //商品品牌名称;
    private String zcuname;   //商品单位名称;
    private String ztoname;   //收入类型名称;
    private String zconame;   //原厂副厂名称;
    private String zgcname;   //商品等级;
    private String zpname;    //商品产地;
    private String zmfname;   //厂商名称
    
    private String cbname;//品牌
    private String cuname;//单位
    private String gcbname;//大类
    private String gccname;//中类
    private String gcsname;//小类
    private String toname;//收入类型
    private String coname;//原厂副厂
    private String gcname;//商品等级
    private String pname;//产地
    private String mfname;//产商

    public String getCbname() {
		return cbname;
	}

	public void setCbname(String cbname) {
		this.cbname = cbname;
	}

	public String getCuname() {
		return cuname;
	}

	public void setCuname(String cuname) {
		this.cuname = cuname;
	}

	public String getGcbname() {
		return gcbname;
	}

	public void setGcbname(String gcbname) {
		this.gcbname = gcbname;
	}

	public String getGccname() {
		return gccname;
	}

	public void setGccname(String gccname) {
		this.gccname = gccname;
	}

	public String getGcsname() {
		return gcsname;
	}

	public void setGcsname(String gcsname) {
		this.gcsname = gcsname;
	}

	public String getToname() {
		return toname;
	}

	public void setToname(String toname) {
		this.toname = toname;
	}

	public String getConame() {
		return coname;
	}

	public void setConame(String coname) {
		this.coname = coname;
	}

	public String getGcname() {
		return gcname;
	}

	public void setGcname(String gcname) {
		this.gcname = gcname;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getMfname() {
		return mfname;
	}

	public void setMfname(String mfname) {
		this.mfname = mfname;
	}

	public int getZgid() {
		return zgid;
	}

	public void setZgid(int zgid) {
		this.zgid = zgid;
	}

	public String getZgame() {
		return zgame;
	}

	public void setZgame(String zgame) {
		this.zgame = zgame;
	}

	public int getZparentid() {
		return zparentid;
	}

	public void setZparentid(int zparentid) {
		this.zparentid = zparentid;
	}

	public String getZcbname() {
		return zcbname;
	}

	public void setZcbname(String zcbname) {
		this.zcbname = zcbname;
	}

	public String getZcuname() {
		return zcuname;
	}

	public void setZcuname(String zcuname) {
		this.zcuname = zcuname;
	}

	public String getZtoname() {
		return ztoname;
	}

	public void setZtoname(String ztoname) {
		this.ztoname = ztoname;
	}

	public String getZconame() {
		return zconame;
	}

	public void setZconame(String zconame) {
		this.zconame = zconame;
	}

	public String getZgcname() {
		return zgcname;
	}

	public void setZgcname(String zgcname) {
		this.zgcname = zgcname;
	}

	public String getZpname() {
		return zpname;
	}

	public void setZpname(String zpname) {
		this.zpname = zpname;
	}

	public String getZmfname() {
		return zmfname;
	}

	public void setZmfname(String zmfname) {
		this.zmfname = zmfname;
	}

	public Integer getCno() {
        return cno;
    }

    public void setCno(Integer cno) {
        this.cno = cno;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public Integer getCbid() {
        return cbid;
    }

    public void setCbid(Integer cbid) {
        this.cbid = cbid;
    }

    public Integer getCuid() {
        return cuid;
    }

    public void setCuid(Integer cuid) {
        this.cuid = cuid;
    }

    public String getVehicletype() {
        return vehicletype;
    }

    public void setVehicletype(String vehicletype) {
        this.vehicletype = vehicletype;
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public Integer getToino() {
        return toino;
    }

    public void setToino(Integer toino) {
        this.toino = toino;
    }

    public Integer getCoid() {
        return coid;
    }

    public void setCoid(Integer coid) {
        this.coid = coid;
    }

    public Integer getGcid() {
        return gcid;
    }

    public void setGcid(Integer gcid) {
        this.gcid = gcid;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getMfid() {
        return mfid;
    }

    public void setMfid(Integer mfid) {
        this.mfid = mfid;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getPack() {
        return pack;
    }

    public void setPack(String pack) {
        this.pack = pack;
    }

    public Float getVolume() {
        return volume;
    }

    public void setVolume(Float volume) {
        this.volume = volume;
    }

    public Float getGrossweight() {
        return grossweight;
    }

    public void setGrossweight(Float grossweight) {
        this.grossweight = grossweight;
    }

    public Float getNetweight() {
        return netweight;
    }

    public void setNetweight(Float netweight) {
        this.netweight = netweight;
    }

    public Float getStockprice() {
        return stockprice;
    }

    public void setStockprice(Float stockprice) {
        this.stockprice = stockprice;
    }

    public Float getMarkup() {
        return markup;
    }

    public void setMarkup(Float markup) {
        this.markup = markup;
    }

    public String getExchangecode() {
        return exchangecode;
    }

    public void setExchangecode(String exchangecode) {
        this.exchangecode = exchangecode;
    }

    public Float getStandardprice() {
        return standardprice;
    }

    public void setStandardprice(Float standardprice) {
        this.standardprice = standardprice;
    }

    public Float getMemberprice() {
        return memberprice;
    }

    public void setMemberprice(Float memberprice) {
        this.memberprice = memberprice;
    }

    public Float getVipprice() {
        return vipprice;
    }

    public void setVipprice(Float vipprice) {
        this.vipprice = vipprice;
    }

    public Float getAgreementprice() {
        return agreementprice;
    }

    public void setAgreementprice(Float agreementprice) {
        this.agreementprice = agreementprice;
    }

    public Float getInsuranceprice() {
        return insuranceprice;
    }

    public void setInsuranceprice(Float insuranceprice) {
        this.insuranceprice = insuranceprice;
    }

    public Float getClaimprice() {
        return claimprice;
    }

    public void setClaimprice(Float claimprice) {
        this.claimprice = claimprice;
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