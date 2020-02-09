package com.accp.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Staff {
    private Integer sid;

    private String pno;

    private Integer mid;

    private Integer jid;

    private Integer rid;

    private String shealth;

    private Float sheight;

    private String splace;

    private String snation;

    private String smarry;

    private String seducation;

    private String sschool;

    private String smajor;

    private String smajorlevel;

    private String sfiel;

    private String speople;

    private String speoplephone;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date sindate;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date sinterniship;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date sbirthday;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date sstarttime;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date sendtime;

    private String srecommed;

    private String snonumber;

    private String sinnumber;

    private Float salldiscount;

    private Float sworkdiscount;

    private Float sshopdiscount;

    private Float sdiscount;

    private String jobResume;

    private String educationExperience;

    private String familyMember;

    private String disciplinaryRecords;

    private String employmentAdvice;

    private String remark1;

    private String remark2;

    private String remark3;

    //以下是员工表字段（一对一）
    
    private String pname;

    private String psex;

    private String pidcard;

    private String paddress;

    private String pphone;

    private String ptellphone;

    private String pemail;

    private String spassword;

    private String salt;

    private String pbank;

    private String pbanknumber;

    private String presidenceaddress;

    private Integer ptid;

    private String img;

    private Integer dimission;

    private String dcause;
    
    
    //以下是组织机构字段
    private String mname;

    private Integer parentid;

    //岗位名称
    private String jname;
    
    //角色名称
    private String rname;
    
    private People people;
    
    public People getPeople() {
		return people;
	}

	public void setPeople(People people) {
		this.people = people;
	}

	public String getRname() {
		return rname;
	}

	public void setRname(String rname) {
		this.rname = rname;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPsex() {
		return psex;
	}

	public void setPsex(String psex) {
		this.psex = psex;
	}

	public String getPidcard() {
		return pidcard;
	}

	public void setPidcard(String pidcard) {
		this.pidcard = pidcard;
	}

	public String getPaddress() {
		return paddress;
	}

	public void setPaddress(String paddress) {
		this.paddress = paddress;
	}

	public String getPphone() {
		return pphone;
	}

	public void setPphone(String pphone) {
		this.pphone = pphone;
	}

	public String getPtellphone() {
		return ptellphone;
	}

	public void setPtellphone(String ptellphone) {
		this.ptellphone = ptellphone;
	}

	public String getPemail() {
		return pemail;
	}

	public void setPemail(String pemail) {
		this.pemail = pemail;
	}

	public String getSpassword() {
		return spassword;
	}

	public void setSpassword(String spassword) {
		this.spassword = spassword;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public String getPbank() {
		return pbank;
	}

	public void setPbank(String pbank) {
		this.pbank = pbank;
	}

	public String getPbanknumber() {
		return pbanknumber;
	}

	public void setPbanknumber(String pbanknumber) {
		this.pbanknumber = pbanknumber;
	}

	public String getPresidenceaddress() {
		return presidenceaddress;
	}

	public void setPresidenceaddress(String presidenceaddress) {
		this.presidenceaddress = presidenceaddress;
	}

	public Integer getPtid() {
		return ptid;
	}

	public void setPtid(Integer ptid) {
		this.ptid = ptid;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public Integer getDimission() {
		return dimission;
	}

	public void setDimission(Integer dimission) {
		this.dimission = dimission;
	}

	public String getDcause() {
		return dcause;
	}

	public void setDcause(String dcause) {
		this.dcause = dcause;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public Integer getParentid() {
		return parentid;
	}

	public void setParentid(Integer parentid) {
		this.parentid = parentid;
	}

	public String getJname() {
		return jname;
	}

	public void setJname(String jname) {
		this.jname = jname;
	}

	public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getPno() {
        return pno;
    }

    public void setPno(String pno) {
        this.pno = pno;
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public Integer getJid() {
        return jid;
    }

    public void setJid(Integer jid) {
        this.jid = jid;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getShealth() {
        return shealth;
    }

    public void setShealth(String shealth) {
        this.shealth = shealth;
    }

    public Float getSheight() {
        return sheight;
    }

    public void setSheight(Float sheight) {
        this.sheight = sheight;
    }

    public String getSplace() {
        return splace;
    }

    public void setSplace(String splace) {
        this.splace = splace;
    }

    public String getSnation() {
        return snation;
    }

    public void setSnation(String snation) {
        this.snation = snation;
    }

    public String getSmarry() {
        return smarry;
    }

    public void setSmarry(String smarry) {
        this.smarry = smarry;
    }

    public String getSeducation() {
        return seducation;
    }

    public void setSeducation(String seducation) {
        this.seducation = seducation;
    }

    public String getSschool() {
        return sschool;
    }

    public void setSschool(String sschool) {
        this.sschool = sschool;
    }

    public String getSmajor() {
        return smajor;
    }

    public void setSmajor(String smajor) {
        this.smajor = smajor;
    }

    public String getSmajorlevel() {
        return smajorlevel;
    }

    public void setSmajorlevel(String smajorlevel) {
        this.smajorlevel = smajorlevel;
    }

    public String getSfiel() {
        return sfiel;
    }

    public void setSfiel(String sfiel) {
        this.sfiel = sfiel;
    }

    public String getSpeople() {
        return speople;
    }

    public void setSpeople(String speople) {
        this.speople = speople;
    }

    public String getSpeoplephone() {
        return speoplephone;
    }

    public void setSpeoplephone(String speoplephone) {
        this.speoplephone = speoplephone;
    }

    public Date getSindate() {
        return sindate;
    }

    public void setSindate(Date sindate) {
        this.sindate = sindate;
    }

    public Date getSinterniship() {
        return sinterniship;
    }

    public void setSinterniship(Date sinterniship) {
        this.sinterniship = sinterniship;
    }

    public Date getSbirthday() {
        return sbirthday;
    }

    public void setSbirthday(Date sbirthday) {
        this.sbirthday = sbirthday;
    }

    public Date getSstarttime() {
        return sstarttime;
    }

    public void setSstarttime(Date sstarttime) {
        this.sstarttime = sstarttime;
    }

    public Date getSendtime() {
        return sendtime;
    }

    public void setSendtime(Date sendtime) {
        this.sendtime = sendtime;
    }

    public String getSrecommed() {
        return srecommed;
    }

    public void setSrecommed(String srecommed) {
        this.srecommed = srecommed;
    }

    public String getSnonumber() {
        return snonumber;
    }

    public void setSnonumber(String snonumber) {
        this.snonumber = snonumber;
    }

    public String getSinnumber() {
        return sinnumber;
    }

    public void setSinnumber(String sinnumber) {
        this.sinnumber = sinnumber;
    }

    public Float getSalldiscount() {
        return salldiscount;
    }

    public void setSalldiscount(Float salldiscount) {
        this.salldiscount = salldiscount;
    }

    public Float getSworkdiscount() {
        return sworkdiscount;
    }

    public void setSworkdiscount(Float sworkdiscount) {
        this.sworkdiscount = sworkdiscount;
    }

    public Float getSshopdiscount() {
        return sshopdiscount;
    }

    public void setSshopdiscount(Float sshopdiscount) {
        this.sshopdiscount = sshopdiscount;
    }

    public Float getSdiscount() {
        return sdiscount;
    }

    public void setSdiscount(Float sdiscount) {
        this.sdiscount = sdiscount;
    }

    public String getJobResume() {
        return jobResume;
    }

    public void setJobResume(String jobResume) {
        this.jobResume = jobResume;
    }

    public String getEducationExperience() {
        return educationExperience;
    }

    public void setEducationExperience(String educationExperience) {
        this.educationExperience = educationExperience;
    }

    public String getFamilyMember() {
        return familyMember;
    }

    public void setFamilyMember(String familyMember) {
        this.familyMember = familyMember;
    }

    public String getDisciplinaryRecords() {
        return disciplinaryRecords;
    }

    public void setDisciplinaryRecords(String disciplinaryRecords) {
        this.disciplinaryRecords = disciplinaryRecords;
    }

    public String getEmploymentAdvice() {
        return employmentAdvice;
    }

    public void setEmploymentAdvice(String employmentAdvice) {
        this.employmentAdvice = employmentAdvice;
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
}