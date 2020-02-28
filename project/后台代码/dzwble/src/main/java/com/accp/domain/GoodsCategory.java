package com.accp.domain;

import java.util.List;

public class GoodsCategory {
    private Integer gid;

    private String gname;

    private Integer parentid;

    private Integer catalog;

    private String remark1;

    private String remark2;

    private String remark3;

    private String remark4;

    private String remark5;
    
    private List<GoodsCategory> children;

    public List<GoodsCategory> getChildren() {
		return children;
	}

	public void setChildren(List<GoodsCategory> children) {
		this.children = children;
	}

	public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public Integer getCatalog() {
        return catalog;
    }

    public void setCatalog(Integer catalog) {
        this.catalog = catalog;
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