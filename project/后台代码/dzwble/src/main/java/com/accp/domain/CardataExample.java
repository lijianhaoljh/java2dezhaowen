package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CardataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CardataExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andCdlicenseIsNull() {
            addCriterion("cdlicense is null");
            return (Criteria) this;
        }

        public Criteria andCdlicenseIsNotNull() {
            addCriterion("cdlicense is not null");
            return (Criteria) this;
        }

        public Criteria andCdlicenseEqualTo(String value) {
            addCriterion("cdlicense =", value, "cdlicense");
            return (Criteria) this;
        }

        public Criteria andCdlicenseNotEqualTo(String value) {
            addCriterion("cdlicense <>", value, "cdlicense");
            return (Criteria) this;
        }

        public Criteria andCdlicenseGreaterThan(String value) {
            addCriterion("cdlicense >", value, "cdlicense");
            return (Criteria) this;
        }

        public Criteria andCdlicenseGreaterThanOrEqualTo(String value) {
            addCriterion("cdlicense >=", value, "cdlicense");
            return (Criteria) this;
        }

        public Criteria andCdlicenseLessThan(String value) {
            addCriterion("cdlicense <", value, "cdlicense");
            return (Criteria) this;
        }

        public Criteria andCdlicenseLessThanOrEqualTo(String value) {
            addCriterion("cdlicense <=", value, "cdlicense");
            return (Criteria) this;
        }

        public Criteria andCdlicenseLike(String value) {
            addCriterion("cdlicense like", value, "cdlicense");
            return (Criteria) this;
        }

        public Criteria andCdlicenseNotLike(String value) {
            addCriterion("cdlicense not like", value, "cdlicense");
            return (Criteria) this;
        }

        public Criteria andCdlicenseIn(List<String> values) {
            addCriterion("cdlicense in", values, "cdlicense");
            return (Criteria) this;
        }

        public Criteria andCdlicenseNotIn(List<String> values) {
            addCriterion("cdlicense not in", values, "cdlicense");
            return (Criteria) this;
        }

        public Criteria andCdlicenseBetween(String value1, String value2) {
            addCriterion("cdlicense between", value1, value2, "cdlicense");
            return (Criteria) this;
        }

        public Criteria andCdlicenseNotBetween(String value1, String value2) {
            addCriterion("cdlicense not between", value1, value2, "cdlicense");
            return (Criteria) this;
        }

        public Criteria andCdnoIsNull() {
            addCriterion("cdno is null");
            return (Criteria) this;
        }

        public Criteria andCdnoIsNotNull() {
            addCriterion("cdno is not null");
            return (Criteria) this;
        }

        public Criteria andCdnoEqualTo(Integer value) {
            addCriterion("cdno =", value, "cdno");
            return (Criteria) this;
        }

        public Criteria andCdnoNotEqualTo(Integer value) {
            addCriterion("cdno <>", value, "cdno");
            return (Criteria) this;
        }

        public Criteria andCdnoGreaterThan(Integer value) {
            addCriterion("cdno >", value, "cdno");
            return (Criteria) this;
        }

        public Criteria andCdnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("cdno >=", value, "cdno");
            return (Criteria) this;
        }

        public Criteria andCdnoLessThan(Integer value) {
            addCriterion("cdno <", value, "cdno");
            return (Criteria) this;
        }

        public Criteria andCdnoLessThanOrEqualTo(Integer value) {
            addCriterion("cdno <=", value, "cdno");
            return (Criteria) this;
        }

        public Criteria andCdnoIn(List<Integer> values) {
            addCriterion("cdno in", values, "cdno");
            return (Criteria) this;
        }

        public Criteria andCdnoNotIn(List<Integer> values) {
            addCriterion("cdno not in", values, "cdno");
            return (Criteria) this;
        }

        public Criteria andCdnoBetween(Integer value1, Integer value2) {
            addCriterion("cdno between", value1, value2, "cdno");
            return (Criteria) this;
        }

        public Criteria andCdnoNotBetween(Integer value1, Integer value2) {
            addCriterion("cdno not between", value1, value2, "cdno");
            return (Criteria) this;
        }

        public Criteria andMoidIsNull() {
            addCriterion("moid is null");
            return (Criteria) this;
        }

        public Criteria andMoidIsNotNull() {
            addCriterion("moid is not null");
            return (Criteria) this;
        }

        public Criteria andMoidEqualTo(Integer value) {
            addCriterion("moid =", value, "moid");
            return (Criteria) this;
        }

        public Criteria andMoidNotEqualTo(Integer value) {
            addCriterion("moid <>", value, "moid");
            return (Criteria) this;
        }

        public Criteria andMoidGreaterThan(Integer value) {
            addCriterion("moid >", value, "moid");
            return (Criteria) this;
        }

        public Criteria andMoidGreaterThanOrEqualTo(Integer value) {
            addCriterion("moid >=", value, "moid");
            return (Criteria) this;
        }

        public Criteria andMoidLessThan(Integer value) {
            addCriterion("moid <", value, "moid");
            return (Criteria) this;
        }

        public Criteria andMoidLessThanOrEqualTo(Integer value) {
            addCriterion("moid <=", value, "moid");
            return (Criteria) this;
        }

        public Criteria andMoidIn(List<Integer> values) {
            addCriterion("moid in", values, "moid");
            return (Criteria) this;
        }

        public Criteria andMoidNotIn(List<Integer> values) {
            addCriterion("moid not in", values, "moid");
            return (Criteria) this;
        }

        public Criteria andMoidBetween(Integer value1, Integer value2) {
            addCriterion("moid between", value1, value2, "moid");
            return (Criteria) this;
        }

        public Criteria andMoidNotBetween(Integer value1, Integer value2) {
            addCriterion("moid not between", value1, value2, "moid");
            return (Criteria) this;
        }

        public Criteria andCddriverIsNull() {
            addCriterion("cddriver is null");
            return (Criteria) this;
        }

        public Criteria andCddriverIsNotNull() {
            addCriterion("cddriver is not null");
            return (Criteria) this;
        }

        public Criteria andCddriverEqualTo(String value) {
            addCriterion("cddriver =", value, "cddriver");
            return (Criteria) this;
        }

        public Criteria andCddriverNotEqualTo(String value) {
            addCriterion("cddriver <>", value, "cddriver");
            return (Criteria) this;
        }

        public Criteria andCddriverGreaterThan(String value) {
            addCriterion("cddriver >", value, "cddriver");
            return (Criteria) this;
        }

        public Criteria andCddriverGreaterThanOrEqualTo(String value) {
            addCriterion("cddriver >=", value, "cddriver");
            return (Criteria) this;
        }

        public Criteria andCddriverLessThan(String value) {
            addCriterion("cddriver <", value, "cddriver");
            return (Criteria) this;
        }

        public Criteria andCddriverLessThanOrEqualTo(String value) {
            addCriterion("cddriver <=", value, "cddriver");
            return (Criteria) this;
        }

        public Criteria andCddriverLike(String value) {
            addCriterion("cddriver like", value, "cddriver");
            return (Criteria) this;
        }

        public Criteria andCddriverNotLike(String value) {
            addCriterion("cddriver not like", value, "cddriver");
            return (Criteria) this;
        }

        public Criteria andCddriverIn(List<String> values) {
            addCriterion("cddriver in", values, "cddriver");
            return (Criteria) this;
        }

        public Criteria andCddriverNotIn(List<String> values) {
            addCriterion("cddriver not in", values, "cddriver");
            return (Criteria) this;
        }

        public Criteria andCddriverBetween(String value1, String value2) {
            addCriterion("cddriver between", value1, value2, "cddriver");
            return (Criteria) this;
        }

        public Criteria andCddriverNotBetween(String value1, String value2) {
            addCriterion("cddriver not between", value1, value2, "cddriver");
            return (Criteria) this;
        }

        public Criteria andCddriverphoneIsNull() {
            addCriterion("cddriverphone is null");
            return (Criteria) this;
        }

        public Criteria andCddriverphoneIsNotNull() {
            addCriterion("cddriverphone is not null");
            return (Criteria) this;
        }

        public Criteria andCddriverphoneEqualTo(String value) {
            addCriterion("cddriverphone =", value, "cddriverphone");
            return (Criteria) this;
        }

        public Criteria andCddriverphoneNotEqualTo(String value) {
            addCriterion("cddriverphone <>", value, "cddriverphone");
            return (Criteria) this;
        }

        public Criteria andCddriverphoneGreaterThan(String value) {
            addCriterion("cddriverphone >", value, "cddriverphone");
            return (Criteria) this;
        }

        public Criteria andCddriverphoneGreaterThanOrEqualTo(String value) {
            addCriterion("cddriverphone >=", value, "cddriverphone");
            return (Criteria) this;
        }

        public Criteria andCddriverphoneLessThan(String value) {
            addCriterion("cddriverphone <", value, "cddriverphone");
            return (Criteria) this;
        }

        public Criteria andCddriverphoneLessThanOrEqualTo(String value) {
            addCriterion("cddriverphone <=", value, "cddriverphone");
            return (Criteria) this;
        }

        public Criteria andCddriverphoneLike(String value) {
            addCriterion("cddriverphone like", value, "cddriverphone");
            return (Criteria) this;
        }

        public Criteria andCddriverphoneNotLike(String value) {
            addCriterion("cddriverphone not like", value, "cddriverphone");
            return (Criteria) this;
        }

        public Criteria andCddriverphoneIn(List<String> values) {
            addCriterion("cddriverphone in", values, "cddriverphone");
            return (Criteria) this;
        }

        public Criteria andCddriverphoneNotIn(List<String> values) {
            addCriterion("cddriverphone not in", values, "cddriverphone");
            return (Criteria) this;
        }

        public Criteria andCddriverphoneBetween(String value1, String value2) {
            addCriterion("cddriverphone between", value1, value2, "cddriverphone");
            return (Criteria) this;
        }

        public Criteria andCddriverphoneNotBetween(String value1, String value2) {
            addCriterion("cddriverphone not between", value1, value2, "cddriverphone");
            return (Criteria) this;
        }

        public Criteria andCddriverbirthIsNull() {
            addCriterion("cddriverbirth is null");
            return (Criteria) this;
        }

        public Criteria andCddriverbirthIsNotNull() {
            addCriterion("cddriverbirth is not null");
            return (Criteria) this;
        }

        public Criteria andCddriverbirthEqualTo(Date value) {
            addCriterion("cddriverbirth =", value, "cddriverbirth");
            return (Criteria) this;
        }

        public Criteria andCddriverbirthNotEqualTo(Date value) {
            addCriterion("cddriverbirth <>", value, "cddriverbirth");
            return (Criteria) this;
        }

        public Criteria andCddriverbirthGreaterThan(Date value) {
            addCriterion("cddriverbirth >", value, "cddriverbirth");
            return (Criteria) this;
        }

        public Criteria andCddriverbirthGreaterThanOrEqualTo(Date value) {
            addCriterion("cddriverbirth >=", value, "cddriverbirth");
            return (Criteria) this;
        }

        public Criteria andCddriverbirthLessThan(Date value) {
            addCriterion("cddriverbirth <", value, "cddriverbirth");
            return (Criteria) this;
        }

        public Criteria andCddriverbirthLessThanOrEqualTo(Date value) {
            addCriterion("cddriverbirth <=", value, "cddriverbirth");
            return (Criteria) this;
        }

        public Criteria andCddriverbirthIn(List<Date> values) {
            addCriterion("cddriverbirth in", values, "cddriverbirth");
            return (Criteria) this;
        }

        public Criteria andCddriverbirthNotIn(List<Date> values) {
            addCriterion("cddriverbirth not in", values, "cddriverbirth");
            return (Criteria) this;
        }

        public Criteria andCddriverbirthBetween(Date value1, Date value2) {
            addCriterion("cddriverbirth between", value1, value2, "cddriverbirth");
            return (Criteria) this;
        }

        public Criteria andCddriverbirthNotBetween(Date value1, Date value2) {
            addCriterion("cddriverbirth not between", value1, value2, "cddriverbirth");
            return (Criteria) this;
        }

        public Criteria andClidIsNull() {
            addCriterion("clid is null");
            return (Criteria) this;
        }

        public Criteria andClidIsNotNull() {
            addCriterion("clid is not null");
            return (Criteria) this;
        }

        public Criteria andClidEqualTo(Integer value) {
            addCriterion("clid =", value, "clid");
            return (Criteria) this;
        }

        public Criteria andClidNotEqualTo(Integer value) {
            addCriterion("clid <>", value, "clid");
            return (Criteria) this;
        }

        public Criteria andClidGreaterThan(Integer value) {
            addCriterion("clid >", value, "clid");
            return (Criteria) this;
        }

        public Criteria andClidGreaterThanOrEqualTo(Integer value) {
            addCriterion("clid >=", value, "clid");
            return (Criteria) this;
        }

        public Criteria andClidLessThan(Integer value) {
            addCriterion("clid <", value, "clid");
            return (Criteria) this;
        }

        public Criteria andClidLessThanOrEqualTo(Integer value) {
            addCriterion("clid <=", value, "clid");
            return (Criteria) this;
        }

        public Criteria andClidIn(List<Integer> values) {
            addCriterion("clid in", values, "clid");
            return (Criteria) this;
        }

        public Criteria andClidNotIn(List<Integer> values) {
            addCriterion("clid not in", values, "clid");
            return (Criteria) this;
        }

        public Criteria andClidBetween(Integer value1, Integer value2) {
            addCriterion("clid between", value1, value2, "clid");
            return (Criteria) this;
        }

        public Criteria andClidNotBetween(Integer value1, Integer value2) {
            addCriterion("clid not between", value1, value2, "clid");
            return (Criteria) this;
        }

        public Criteria andCdlicenseendIsNull() {
            addCriterion("cdlicenseend is null");
            return (Criteria) this;
        }

        public Criteria andCdlicenseendIsNotNull() {
            addCriterion("cdlicenseend is not null");
            return (Criteria) this;
        }

        public Criteria andCdlicenseendEqualTo(Date value) {
            addCriterion("cdlicenseend =", value, "cdlicenseend");
            return (Criteria) this;
        }

        public Criteria andCdlicenseendNotEqualTo(Date value) {
            addCriterion("cdlicenseend <>", value, "cdlicenseend");
            return (Criteria) this;
        }

        public Criteria andCdlicenseendGreaterThan(Date value) {
            addCriterion("cdlicenseend >", value, "cdlicenseend");
            return (Criteria) this;
        }

        public Criteria andCdlicenseendGreaterThanOrEqualTo(Date value) {
            addCriterion("cdlicenseend >=", value, "cdlicenseend");
            return (Criteria) this;
        }

        public Criteria andCdlicenseendLessThan(Date value) {
            addCriterion("cdlicenseend <", value, "cdlicenseend");
            return (Criteria) this;
        }

        public Criteria andCdlicenseendLessThanOrEqualTo(Date value) {
            addCriterion("cdlicenseend <=", value, "cdlicenseend");
            return (Criteria) this;
        }

        public Criteria andCdlicenseendIn(List<Date> values) {
            addCriterion("cdlicenseend in", values, "cdlicenseend");
            return (Criteria) this;
        }

        public Criteria andCdlicenseendNotIn(List<Date> values) {
            addCriterion("cdlicenseend not in", values, "cdlicenseend");
            return (Criteria) this;
        }

        public Criteria andCdlicenseendBetween(Date value1, Date value2) {
            addCriterion("cdlicenseend between", value1, value2, "cdlicenseend");
            return (Criteria) this;
        }

        public Criteria andCdlicenseendNotBetween(Date value1, Date value2) {
            addCriterion("cdlicenseend not between", value1, value2, "cdlicenseend");
            return (Criteria) this;
        }

        public Criteria andCdframeIsNull() {
            addCriterion("cdframe is null");
            return (Criteria) this;
        }

        public Criteria andCdframeIsNotNull() {
            addCriterion("cdframe is not null");
            return (Criteria) this;
        }

        public Criteria andCdframeEqualTo(String value) {
            addCriterion("cdframe =", value, "cdframe");
            return (Criteria) this;
        }

        public Criteria andCdframeNotEqualTo(String value) {
            addCriterion("cdframe <>", value, "cdframe");
            return (Criteria) this;
        }

        public Criteria andCdframeGreaterThan(String value) {
            addCriterion("cdframe >", value, "cdframe");
            return (Criteria) this;
        }

        public Criteria andCdframeGreaterThanOrEqualTo(String value) {
            addCriterion("cdframe >=", value, "cdframe");
            return (Criteria) this;
        }

        public Criteria andCdframeLessThan(String value) {
            addCriterion("cdframe <", value, "cdframe");
            return (Criteria) this;
        }

        public Criteria andCdframeLessThanOrEqualTo(String value) {
            addCriterion("cdframe <=", value, "cdframe");
            return (Criteria) this;
        }

        public Criteria andCdframeLike(String value) {
            addCriterion("cdframe like", value, "cdframe");
            return (Criteria) this;
        }

        public Criteria andCdframeNotLike(String value) {
            addCriterion("cdframe not like", value, "cdframe");
            return (Criteria) this;
        }

        public Criteria andCdframeIn(List<String> values) {
            addCriterion("cdframe in", values, "cdframe");
            return (Criteria) this;
        }

        public Criteria andCdframeNotIn(List<String> values) {
            addCriterion("cdframe not in", values, "cdframe");
            return (Criteria) this;
        }

        public Criteria andCdframeBetween(String value1, String value2) {
            addCriterion("cdframe between", value1, value2, "cdframe");
            return (Criteria) this;
        }

        public Criteria andCdframeNotBetween(String value1, String value2) {
            addCriterion("cdframe not between", value1, value2, "cdframe");
            return (Criteria) this;
        }

        public Criteria andMidIsNull() {
            addCriterion("mid is null");
            return (Criteria) this;
        }

        public Criteria andMidIsNotNull() {
            addCriterion("mid is not null");
            return (Criteria) this;
        }

        public Criteria andMidEqualTo(Integer value) {
            addCriterion("mid =", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotEqualTo(Integer value) {
            addCriterion("mid <>", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThan(Integer value) {
            addCriterion("mid >", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThanOrEqualTo(Integer value) {
            addCriterion("mid >=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThan(Integer value) {
            addCriterion("mid <", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThanOrEqualTo(Integer value) {
            addCriterion("mid <=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidIn(List<Integer> values) {
            addCriterion("mid in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotIn(List<Integer> values) {
            addCriterion("mid not in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidBetween(Integer value1, Integer value2) {
            addCriterion("mid between", value1, value2, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotBetween(Integer value1, Integer value2) {
            addCriterion("mid not between", value1, value2, "mid");
            return (Criteria) this;
        }

        public Criteria andCdyearpriceIsNull() {
            addCriterion("cdyearprice is null");
            return (Criteria) this;
        }

        public Criteria andCdyearpriceIsNotNull() {
            addCriterion("cdyearprice is not null");
            return (Criteria) this;
        }

        public Criteria andCdyearpriceEqualTo(String value) {
            addCriterion("cdyearprice =", value, "cdyearprice");
            return (Criteria) this;
        }

        public Criteria andCdyearpriceNotEqualTo(String value) {
            addCriterion("cdyearprice <>", value, "cdyearprice");
            return (Criteria) this;
        }

        public Criteria andCdyearpriceGreaterThan(String value) {
            addCriterion("cdyearprice >", value, "cdyearprice");
            return (Criteria) this;
        }

        public Criteria andCdyearpriceGreaterThanOrEqualTo(String value) {
            addCriterion("cdyearprice >=", value, "cdyearprice");
            return (Criteria) this;
        }

        public Criteria andCdyearpriceLessThan(String value) {
            addCriterion("cdyearprice <", value, "cdyearprice");
            return (Criteria) this;
        }

        public Criteria andCdyearpriceLessThanOrEqualTo(String value) {
            addCriterion("cdyearprice <=", value, "cdyearprice");
            return (Criteria) this;
        }

        public Criteria andCdyearpriceLike(String value) {
            addCriterion("cdyearprice like", value, "cdyearprice");
            return (Criteria) this;
        }

        public Criteria andCdyearpriceNotLike(String value) {
            addCriterion("cdyearprice not like", value, "cdyearprice");
            return (Criteria) this;
        }

        public Criteria andCdyearpriceIn(List<String> values) {
            addCriterion("cdyearprice in", values, "cdyearprice");
            return (Criteria) this;
        }

        public Criteria andCdyearpriceNotIn(List<String> values) {
            addCriterion("cdyearprice not in", values, "cdyearprice");
            return (Criteria) this;
        }

        public Criteria andCdyearpriceBetween(String value1, String value2) {
            addCriterion("cdyearprice between", value1, value2, "cdyearprice");
            return (Criteria) this;
        }

        public Criteria andCdyearpriceNotBetween(String value1, String value2) {
            addCriterion("cdyearprice not between", value1, value2, "cdyearprice");
            return (Criteria) this;
        }

        public Criteria andCdmileageIsNull() {
            addCriterion("cdmileage is null");
            return (Criteria) this;
        }

        public Criteria andCdmileageIsNotNull() {
            addCriterion("cdmileage is not null");
            return (Criteria) this;
        }

        public Criteria andCdmileageEqualTo(Float value) {
            addCriterion("cdmileage =", value, "cdmileage");
            return (Criteria) this;
        }

        public Criteria andCdmileageNotEqualTo(Float value) {
            addCriterion("cdmileage <>", value, "cdmileage");
            return (Criteria) this;
        }

        public Criteria andCdmileageGreaterThan(Float value) {
            addCriterion("cdmileage >", value, "cdmileage");
            return (Criteria) this;
        }

        public Criteria andCdmileageGreaterThanOrEqualTo(Float value) {
            addCriterion("cdmileage >=", value, "cdmileage");
            return (Criteria) this;
        }

        public Criteria andCdmileageLessThan(Float value) {
            addCriterion("cdmileage <", value, "cdmileage");
            return (Criteria) this;
        }

        public Criteria andCdmileageLessThanOrEqualTo(Float value) {
            addCriterion("cdmileage <=", value, "cdmileage");
            return (Criteria) this;
        }

        public Criteria andCdmileageIn(List<Float> values) {
            addCriterion("cdmileage in", values, "cdmileage");
            return (Criteria) this;
        }

        public Criteria andCdmileageNotIn(List<Float> values) {
            addCriterion("cdmileage not in", values, "cdmileage");
            return (Criteria) this;
        }

        public Criteria andCdmileageBetween(Float value1, Float value2) {
            addCriterion("cdmileage between", value1, value2, "cdmileage");
            return (Criteria) this;
        }

        public Criteria andCdmileageNotBetween(Float value1, Float value2) {
            addCriterion("cdmileage not between", value1, value2, "cdmileage");
            return (Criteria) this;
        }

        public Criteria andCdloadIsNull() {
            addCriterion("cdload is null");
            return (Criteria) this;
        }

        public Criteria andCdloadIsNotNull() {
            addCriterion("cdload is not null");
            return (Criteria) this;
        }

        public Criteria andCdloadEqualTo(Float value) {
            addCriterion("cdload =", value, "cdload");
            return (Criteria) this;
        }

        public Criteria andCdloadNotEqualTo(Float value) {
            addCriterion("cdload <>", value, "cdload");
            return (Criteria) this;
        }

        public Criteria andCdloadGreaterThan(Float value) {
            addCriterion("cdload >", value, "cdload");
            return (Criteria) this;
        }

        public Criteria andCdloadGreaterThanOrEqualTo(Float value) {
            addCriterion("cdload >=", value, "cdload");
            return (Criteria) this;
        }

        public Criteria andCdloadLessThan(Float value) {
            addCriterion("cdload <", value, "cdload");
            return (Criteria) this;
        }

        public Criteria andCdloadLessThanOrEqualTo(Float value) {
            addCriterion("cdload <=", value, "cdload");
            return (Criteria) this;
        }

        public Criteria andCdloadIn(List<Float> values) {
            addCriterion("cdload in", values, "cdload");
            return (Criteria) this;
        }

        public Criteria andCdloadNotIn(List<Float> values) {
            addCriterion("cdload not in", values, "cdload");
            return (Criteria) this;
        }

        public Criteria andCdloadBetween(Float value1, Float value2) {
            addCriterion("cdload between", value1, value2, "cdload");
            return (Criteria) this;
        }

        public Criteria andCdloadNotBetween(Float value1, Float value2) {
            addCriterion("cdload not between", value1, value2, "cdload");
            return (Criteria) this;
        }

        public Criteria andCdbuydateIsNull() {
            addCriterion("cdbuydate is null");
            return (Criteria) this;
        }

        public Criteria andCdbuydateIsNotNull() {
            addCriterion("cdbuydate is not null");
            return (Criteria) this;
        }

        public Criteria andCdbuydateEqualTo(Date value) {
            addCriterion("cdbuydate =", value, "cdbuydate");
            return (Criteria) this;
        }

        public Criteria andCdbuydateNotEqualTo(Date value) {
            addCriterion("cdbuydate <>", value, "cdbuydate");
            return (Criteria) this;
        }

        public Criteria andCdbuydateGreaterThan(Date value) {
            addCriterion("cdbuydate >", value, "cdbuydate");
            return (Criteria) this;
        }

        public Criteria andCdbuydateGreaterThanOrEqualTo(Date value) {
            addCriterion("cdbuydate >=", value, "cdbuydate");
            return (Criteria) this;
        }

        public Criteria andCdbuydateLessThan(Date value) {
            addCriterion("cdbuydate <", value, "cdbuydate");
            return (Criteria) this;
        }

        public Criteria andCdbuydateLessThanOrEqualTo(Date value) {
            addCriterion("cdbuydate <=", value, "cdbuydate");
            return (Criteria) this;
        }

        public Criteria andCdbuydateIn(List<Date> values) {
            addCriterion("cdbuydate in", values, "cdbuydate");
            return (Criteria) this;
        }

        public Criteria andCdbuydateNotIn(List<Date> values) {
            addCriterion("cdbuydate not in", values, "cdbuydate");
            return (Criteria) this;
        }

        public Criteria andCdbuydateBetween(Date value1, Date value2) {
            addCriterion("cdbuydate between", value1, value2, "cdbuydate");
            return (Criteria) this;
        }

        public Criteria andCdbuydateNotBetween(Date value1, Date value2) {
            addCriterion("cdbuydate not between", value1, value2, "cdbuydate");
            return (Criteria) this;
        }

        public Criteria andCdgolicenseIsNull() {
            addCriterion("cdgolicense is null");
            return (Criteria) this;
        }

        public Criteria andCdgolicenseIsNotNull() {
            addCriterion("cdgolicense is not null");
            return (Criteria) this;
        }

        public Criteria andCdgolicenseEqualTo(Date value) {
            addCriterion("cdgolicense =", value, "cdgolicense");
            return (Criteria) this;
        }

        public Criteria andCdgolicenseNotEqualTo(Date value) {
            addCriterion("cdgolicense <>", value, "cdgolicense");
            return (Criteria) this;
        }

        public Criteria andCdgolicenseGreaterThan(Date value) {
            addCriterion("cdgolicense >", value, "cdgolicense");
            return (Criteria) this;
        }

        public Criteria andCdgolicenseGreaterThanOrEqualTo(Date value) {
            addCriterion("cdgolicense >=", value, "cdgolicense");
            return (Criteria) this;
        }

        public Criteria andCdgolicenseLessThan(Date value) {
            addCriterion("cdgolicense <", value, "cdgolicense");
            return (Criteria) this;
        }

        public Criteria andCdgolicenseLessThanOrEqualTo(Date value) {
            addCriterion("cdgolicense <=", value, "cdgolicense");
            return (Criteria) this;
        }

        public Criteria andCdgolicenseIn(List<Date> values) {
            addCriterion("cdgolicense in", values, "cdgolicense");
            return (Criteria) this;
        }

        public Criteria andCdgolicenseNotIn(List<Date> values) {
            addCriterion("cdgolicense not in", values, "cdgolicense");
            return (Criteria) this;
        }

        public Criteria andCdgolicenseBetween(Date value1, Date value2) {
            addCriterion("cdgolicense between", value1, value2, "cdgolicense");
            return (Criteria) this;
        }

        public Criteria andCdgolicenseNotBetween(Date value1, Date value2) {
            addCriterion("cdgolicense not between", value1, value2, "cdgolicense");
            return (Criteria) this;
        }

        public Criteria andCdcarcheckdateIsNull() {
            addCriterion("cdcarcheckdate is null");
            return (Criteria) this;
        }

        public Criteria andCdcarcheckdateIsNotNull() {
            addCriterion("cdcarcheckdate is not null");
            return (Criteria) this;
        }

        public Criteria andCdcarcheckdateEqualTo(Date value) {
            addCriterion("cdcarcheckdate =", value, "cdcarcheckdate");
            return (Criteria) this;
        }

        public Criteria andCdcarcheckdateNotEqualTo(Date value) {
            addCriterion("cdcarcheckdate <>", value, "cdcarcheckdate");
            return (Criteria) this;
        }

        public Criteria andCdcarcheckdateGreaterThan(Date value) {
            addCriterion("cdcarcheckdate >", value, "cdcarcheckdate");
            return (Criteria) this;
        }

        public Criteria andCdcarcheckdateGreaterThanOrEqualTo(Date value) {
            addCriterion("cdcarcheckdate >=", value, "cdcarcheckdate");
            return (Criteria) this;
        }

        public Criteria andCdcarcheckdateLessThan(Date value) {
            addCriterion("cdcarcheckdate <", value, "cdcarcheckdate");
            return (Criteria) this;
        }

        public Criteria andCdcarcheckdateLessThanOrEqualTo(Date value) {
            addCriterion("cdcarcheckdate <=", value, "cdcarcheckdate");
            return (Criteria) this;
        }

        public Criteria andCdcarcheckdateIn(List<Date> values) {
            addCriterion("cdcarcheckdate in", values, "cdcarcheckdate");
            return (Criteria) this;
        }

        public Criteria andCdcarcheckdateNotIn(List<Date> values) {
            addCriterion("cdcarcheckdate not in", values, "cdcarcheckdate");
            return (Criteria) this;
        }

        public Criteria andCdcarcheckdateBetween(Date value1, Date value2) {
            addCriterion("cdcarcheckdate between", value1, value2, "cdcarcheckdate");
            return (Criteria) this;
        }

        public Criteria andCdcarcheckdateNotBetween(Date value1, Date value2) {
            addCriterion("cdcarcheckdate not between", value1, value2, "cdcarcheckdate");
            return (Criteria) this;
        }

        public Criteria andFidIsNull() {
            addCriterion("fid is null");
            return (Criteria) this;
        }

        public Criteria andFidIsNotNull() {
            addCriterion("fid is not null");
            return (Criteria) this;
        }

        public Criteria andFidEqualTo(Integer value) {
            addCriterion("fid =", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotEqualTo(Integer value) {
            addCriterion("fid <>", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidGreaterThan(Integer value) {
            addCriterion("fid >", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidGreaterThanOrEqualTo(Integer value) {
            addCriterion("fid >=", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidLessThan(Integer value) {
            addCriterion("fid <", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidLessThanOrEqualTo(Integer value) {
            addCriterion("fid <=", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidIn(List<Integer> values) {
            addCriterion("fid in", values, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotIn(List<Integer> values) {
            addCriterion("fid not in", values, "fid");
            return (Criteria) this;
        }

        public Criteria andFidBetween(Integer value1, Integer value2) {
            addCriterion("fid between", value1, value2, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotBetween(Integer value1, Integer value2) {
            addCriterion("fid not between", value1, value2, "fid");
            return (Criteria) this;
        }

        public Criteria andInidIsNull() {
            addCriterion("inid is null");
            return (Criteria) this;
        }

        public Criteria andInidIsNotNull() {
            addCriterion("inid is not null");
            return (Criteria) this;
        }

        public Criteria andInidEqualTo(Integer value) {
            addCriterion("inid =", value, "inid");
            return (Criteria) this;
        }

        public Criteria andInidNotEqualTo(Integer value) {
            addCriterion("inid <>", value, "inid");
            return (Criteria) this;
        }

        public Criteria andInidGreaterThan(Integer value) {
            addCriterion("inid >", value, "inid");
            return (Criteria) this;
        }

        public Criteria andInidGreaterThanOrEqualTo(Integer value) {
            addCriterion("inid >=", value, "inid");
            return (Criteria) this;
        }

        public Criteria andInidLessThan(Integer value) {
            addCriterion("inid <", value, "inid");
            return (Criteria) this;
        }

        public Criteria andInidLessThanOrEqualTo(Integer value) {
            addCriterion("inid <=", value, "inid");
            return (Criteria) this;
        }

        public Criteria andInidIn(List<Integer> values) {
            addCriterion("inid in", values, "inid");
            return (Criteria) this;
        }

        public Criteria andInidNotIn(List<Integer> values) {
            addCriterion("inid not in", values, "inid");
            return (Criteria) this;
        }

        public Criteria andInidBetween(Integer value1, Integer value2) {
            addCriterion("inid between", value1, value2, "inid");
            return (Criteria) this;
        }

        public Criteria andInidNotBetween(Integer value1, Integer value2) {
            addCriterion("inid not between", value1, value2, "inid");
            return (Criteria) this;
        }

        public Criteria andIndateIsNull() {
            addCriterion("indate is null");
            return (Criteria) this;
        }

        public Criteria andIndateIsNotNull() {
            addCriterion("indate is not null");
            return (Criteria) this;
        }

        public Criteria andIndateEqualTo(Date value) {
            addCriterion("indate =", value, "indate");
            return (Criteria) this;
        }

        public Criteria andIndateNotEqualTo(Date value) {
            addCriterion("indate <>", value, "indate");
            return (Criteria) this;
        }

        public Criteria andIndateGreaterThan(Date value) {
            addCriterion("indate >", value, "indate");
            return (Criteria) this;
        }

        public Criteria andIndateGreaterThanOrEqualTo(Date value) {
            addCriterion("indate >=", value, "indate");
            return (Criteria) this;
        }

        public Criteria andIndateLessThan(Date value) {
            addCriterion("indate <", value, "indate");
            return (Criteria) this;
        }

        public Criteria andIndateLessThanOrEqualTo(Date value) {
            addCriterion("indate <=", value, "indate");
            return (Criteria) this;
        }

        public Criteria andIndateIn(List<Date> values) {
            addCriterion("indate in", values, "indate");
            return (Criteria) this;
        }

        public Criteria andIndateNotIn(List<Date> values) {
            addCriterion("indate not in", values, "indate");
            return (Criteria) this;
        }

        public Criteria andIndateBetween(Date value1, Date value2) {
            addCriterion("indate between", value1, value2, "indate");
            return (Criteria) this;
        }

        public Criteria andIndateNotBetween(Date value1, Date value2) {
            addCriterion("indate not between", value1, value2, "indate");
            return (Criteria) this;
        }

        public Criteria andInidBusinessIsNull() {
            addCriterion("inid_business is null");
            return (Criteria) this;
        }

        public Criteria andInidBusinessIsNotNull() {
            addCriterion("inid_business is not null");
            return (Criteria) this;
        }

        public Criteria andInidBusinessEqualTo(Integer value) {
            addCriterion("inid_business =", value, "inidBusiness");
            return (Criteria) this;
        }

        public Criteria andInidBusinessNotEqualTo(Integer value) {
            addCriterion("inid_business <>", value, "inidBusiness");
            return (Criteria) this;
        }

        public Criteria andInidBusinessGreaterThan(Integer value) {
            addCriterion("inid_business >", value, "inidBusiness");
            return (Criteria) this;
        }

        public Criteria andInidBusinessGreaterThanOrEqualTo(Integer value) {
            addCriterion("inid_business >=", value, "inidBusiness");
            return (Criteria) this;
        }

        public Criteria andInidBusinessLessThan(Integer value) {
            addCriterion("inid_business <", value, "inidBusiness");
            return (Criteria) this;
        }

        public Criteria andInidBusinessLessThanOrEqualTo(Integer value) {
            addCriterion("inid_business <=", value, "inidBusiness");
            return (Criteria) this;
        }

        public Criteria andInidBusinessIn(List<Integer> values) {
            addCriterion("inid_business in", values, "inidBusiness");
            return (Criteria) this;
        }

        public Criteria andInidBusinessNotIn(List<Integer> values) {
            addCriterion("inid_business not in", values, "inidBusiness");
            return (Criteria) this;
        }

        public Criteria andInidBusinessBetween(Integer value1, Integer value2) {
            addCriterion("inid_business between", value1, value2, "inidBusiness");
            return (Criteria) this;
        }

        public Criteria andInidBusinessNotBetween(Integer value1, Integer value2) {
            addCriterion("inid_business not between", value1, value2, "inidBusiness");
            return (Criteria) this;
        }

        public Criteria andInidBdateIsNull() {
            addCriterion("inid_bdate is null");
            return (Criteria) this;
        }

        public Criteria andInidBdateIsNotNull() {
            addCriterion("inid_bdate is not null");
            return (Criteria) this;
        }

        public Criteria andInidBdateEqualTo(Date value) {
            addCriterion("inid_bdate =", value, "inidBdate");
            return (Criteria) this;
        }

        public Criteria andInidBdateNotEqualTo(Date value) {
            addCriterion("inid_bdate <>", value, "inidBdate");
            return (Criteria) this;
        }

        public Criteria andInidBdateGreaterThan(Date value) {
            addCriterion("inid_bdate >", value, "inidBdate");
            return (Criteria) this;
        }

        public Criteria andInidBdateGreaterThanOrEqualTo(Date value) {
            addCriterion("inid_bdate >=", value, "inidBdate");
            return (Criteria) this;
        }

        public Criteria andInidBdateLessThan(Date value) {
            addCriterion("inid_bdate <", value, "inidBdate");
            return (Criteria) this;
        }

        public Criteria andInidBdateLessThanOrEqualTo(Date value) {
            addCriterion("inid_bdate <=", value, "inidBdate");
            return (Criteria) this;
        }

        public Criteria andInidBdateIn(List<Date> values) {
            addCriterion("inid_bdate in", values, "inidBdate");
            return (Criteria) this;
        }

        public Criteria andInidBdateNotIn(List<Date> values) {
            addCriterion("inid_bdate not in", values, "inidBdate");
            return (Criteria) this;
        }

        public Criteria andInidBdateBetween(Date value1, Date value2) {
            addCriterion("inid_bdate between", value1, value2, "inidBdate");
            return (Criteria) this;
        }

        public Criteria andInidBdateNotBetween(Date value1, Date value2) {
            addCriterion("inid_bdate not between", value1, value2, "inidBdate");
            return (Criteria) this;
        }

        public Criteria andCdisinsureIsNull() {
            addCriterion("cdisinsure is null");
            return (Criteria) this;
        }

        public Criteria andCdisinsureIsNotNull() {
            addCriterion("cdisinsure is not null");
            return (Criteria) this;
        }

        public Criteria andCdisinsureEqualTo(Integer value) {
            addCriterion("cdisinsure =", value, "cdisinsure");
            return (Criteria) this;
        }

        public Criteria andCdisinsureNotEqualTo(Integer value) {
            addCriterion("cdisinsure <>", value, "cdisinsure");
            return (Criteria) this;
        }

        public Criteria andCdisinsureGreaterThan(Integer value) {
            addCriterion("cdisinsure >", value, "cdisinsure");
            return (Criteria) this;
        }

        public Criteria andCdisinsureGreaterThanOrEqualTo(Integer value) {
            addCriterion("cdisinsure >=", value, "cdisinsure");
            return (Criteria) this;
        }

        public Criteria andCdisinsureLessThan(Integer value) {
            addCriterion("cdisinsure <", value, "cdisinsure");
            return (Criteria) this;
        }

        public Criteria andCdisinsureLessThanOrEqualTo(Integer value) {
            addCriterion("cdisinsure <=", value, "cdisinsure");
            return (Criteria) this;
        }

        public Criteria andCdisinsureIn(List<Integer> values) {
            addCriterion("cdisinsure in", values, "cdisinsure");
            return (Criteria) this;
        }

        public Criteria andCdisinsureNotIn(List<Integer> values) {
            addCriterion("cdisinsure not in", values, "cdisinsure");
            return (Criteria) this;
        }

        public Criteria andCdisinsureBetween(Integer value1, Integer value2) {
            addCriterion("cdisinsure between", value1, value2, "cdisinsure");
            return (Criteria) this;
        }

        public Criteria andCdisinsureNotBetween(Integer value1, Integer value2) {
            addCriterion("cdisinsure not between", value1, value2, "cdisinsure");
            return (Criteria) this;
        }

        public Criteria andCdnextmileageIsNull() {
            addCriterion("cdnextmileage is null");
            return (Criteria) this;
        }

        public Criteria andCdnextmileageIsNotNull() {
            addCriterion("cdnextmileage is not null");
            return (Criteria) this;
        }

        public Criteria andCdnextmileageEqualTo(Float value) {
            addCriterion("cdnextmileage =", value, "cdnextmileage");
            return (Criteria) this;
        }

        public Criteria andCdnextmileageNotEqualTo(Float value) {
            addCriterion("cdnextmileage <>", value, "cdnextmileage");
            return (Criteria) this;
        }

        public Criteria andCdnextmileageGreaterThan(Float value) {
            addCriterion("cdnextmileage >", value, "cdnextmileage");
            return (Criteria) this;
        }

        public Criteria andCdnextmileageGreaterThanOrEqualTo(Float value) {
            addCriterion("cdnextmileage >=", value, "cdnextmileage");
            return (Criteria) this;
        }

        public Criteria andCdnextmileageLessThan(Float value) {
            addCriterion("cdnextmileage <", value, "cdnextmileage");
            return (Criteria) this;
        }

        public Criteria andCdnextmileageLessThanOrEqualTo(Float value) {
            addCriterion("cdnextmileage <=", value, "cdnextmileage");
            return (Criteria) this;
        }

        public Criteria andCdnextmileageIn(List<Float> values) {
            addCriterion("cdnextmileage in", values, "cdnextmileage");
            return (Criteria) this;
        }

        public Criteria andCdnextmileageNotIn(List<Float> values) {
            addCriterion("cdnextmileage not in", values, "cdnextmileage");
            return (Criteria) this;
        }

        public Criteria andCdnextmileageBetween(Float value1, Float value2) {
            addCriterion("cdnextmileage between", value1, value2, "cdnextmileage");
            return (Criteria) this;
        }

        public Criteria andCdnextmileageNotBetween(Float value1, Float value2) {
            addCriterion("cdnextmileage not between", value1, value2, "cdnextmileage");
            return (Criteria) this;
        }

        public Criteria andCdnextkeepdateIsNull() {
            addCriterion("cdnextkeepdate is null");
            return (Criteria) this;
        }

        public Criteria andCdnextkeepdateIsNotNull() {
            addCriterion("cdnextkeepdate is not null");
            return (Criteria) this;
        }

        public Criteria andCdnextkeepdateEqualTo(Date value) {
            addCriterion("cdnextkeepdate =", value, "cdnextkeepdate");
            return (Criteria) this;
        }

        public Criteria andCdnextkeepdateNotEqualTo(Date value) {
            addCriterion("cdnextkeepdate <>", value, "cdnextkeepdate");
            return (Criteria) this;
        }

        public Criteria andCdnextkeepdateGreaterThan(Date value) {
            addCriterion("cdnextkeepdate >", value, "cdnextkeepdate");
            return (Criteria) this;
        }

        public Criteria andCdnextkeepdateGreaterThanOrEqualTo(Date value) {
            addCriterion("cdnextkeepdate >=", value, "cdnextkeepdate");
            return (Criteria) this;
        }

        public Criteria andCdnextkeepdateLessThan(Date value) {
            addCriterion("cdnextkeepdate <", value, "cdnextkeepdate");
            return (Criteria) this;
        }

        public Criteria andCdnextkeepdateLessThanOrEqualTo(Date value) {
            addCriterion("cdnextkeepdate <=", value, "cdnextkeepdate");
            return (Criteria) this;
        }

        public Criteria andCdnextkeepdateIn(List<Date> values) {
            addCriterion("cdnextkeepdate in", values, "cdnextkeepdate");
            return (Criteria) this;
        }

        public Criteria andCdnextkeepdateNotIn(List<Date> values) {
            addCriterion("cdnextkeepdate not in", values, "cdnextkeepdate");
            return (Criteria) this;
        }

        public Criteria andCdnextkeepdateBetween(Date value1, Date value2) {
            addCriterion("cdnextkeepdate between", value1, value2, "cdnextkeepdate");
            return (Criteria) this;
        }

        public Criteria andCdnextkeepdateNotBetween(Date value1, Date value2) {
            addCriterion("cdnextkeepdate not between", value1, value2, "cdnextkeepdate");
            return (Criteria) this;
        }

        public Criteria andCnoIsNull() {
            addCriterion("cno is null");
            return (Criteria) this;
        }

        public Criteria andCnoIsNotNull() {
            addCriterion("cno is not null");
            return (Criteria) this;
        }

        public Criteria andCnoEqualTo(String value) {
            addCriterion("cno =", value, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoNotEqualTo(String value) {
            addCriterion("cno <>", value, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoGreaterThan(String value) {
            addCriterion("cno >", value, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoGreaterThanOrEqualTo(String value) {
            addCriterion("cno >=", value, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoLessThan(String value) {
            addCriterion("cno <", value, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoLessThanOrEqualTo(String value) {
            addCriterion("cno <=", value, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoLike(String value) {
            addCriterion("cno like", value, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoNotLike(String value) {
            addCriterion("cno not like", value, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoIn(List<String> values) {
            addCriterion("cno in", values, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoNotIn(List<String> values) {
            addCriterion("cno not in", values, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoBetween(String value1, String value2) {
            addCriterion("cno between", value1, value2, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoNotBetween(String value1, String value2) {
            addCriterion("cno not between", value1, value2, "cno");
            return (Criteria) this;
        }

        public Criteria andRemark1IsNull() {
            addCriterion("remark1 is null");
            return (Criteria) this;
        }

        public Criteria andRemark1IsNotNull() {
            addCriterion("remark1 is not null");
            return (Criteria) this;
        }

        public Criteria andRemark1EqualTo(String value) {
            addCriterion("remark1 =", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotEqualTo(String value) {
            addCriterion("remark1 <>", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1GreaterThan(String value) {
            addCriterion("remark1 >", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1GreaterThanOrEqualTo(String value) {
            addCriterion("remark1 >=", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1LessThan(String value) {
            addCriterion("remark1 <", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1LessThanOrEqualTo(String value) {
            addCriterion("remark1 <=", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1Like(String value) {
            addCriterion("remark1 like", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotLike(String value) {
            addCriterion("remark1 not like", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1In(List<String> values) {
            addCriterion("remark1 in", values, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotIn(List<String> values) {
            addCriterion("remark1 not in", values, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1Between(String value1, String value2) {
            addCriterion("remark1 between", value1, value2, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotBetween(String value1, String value2) {
            addCriterion("remark1 not between", value1, value2, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark2IsNull() {
            addCriterion("remark2 is null");
            return (Criteria) this;
        }

        public Criteria andRemark2IsNotNull() {
            addCriterion("remark2 is not null");
            return (Criteria) this;
        }

        public Criteria andRemark2EqualTo(String value) {
            addCriterion("remark2 =", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2NotEqualTo(String value) {
            addCriterion("remark2 <>", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2GreaterThan(String value) {
            addCriterion("remark2 >", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2GreaterThanOrEqualTo(String value) {
            addCriterion("remark2 >=", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2LessThan(String value) {
            addCriterion("remark2 <", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2LessThanOrEqualTo(String value) {
            addCriterion("remark2 <=", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2Like(String value) {
            addCriterion("remark2 like", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2NotLike(String value) {
            addCriterion("remark2 not like", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2In(List<String> values) {
            addCriterion("remark2 in", values, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2NotIn(List<String> values) {
            addCriterion("remark2 not in", values, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2Between(String value1, String value2) {
            addCriterion("remark2 between", value1, value2, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2NotBetween(String value1, String value2) {
            addCriterion("remark2 not between", value1, value2, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark3IsNull() {
            addCriterion("remark3 is null");
            return (Criteria) this;
        }

        public Criteria andRemark3IsNotNull() {
            addCriterion("remark3 is not null");
            return (Criteria) this;
        }

        public Criteria andRemark3EqualTo(String value) {
            addCriterion("remark3 =", value, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3NotEqualTo(String value) {
            addCriterion("remark3 <>", value, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3GreaterThan(String value) {
            addCriterion("remark3 >", value, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3GreaterThanOrEqualTo(String value) {
            addCriterion("remark3 >=", value, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3LessThan(String value) {
            addCriterion("remark3 <", value, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3LessThanOrEqualTo(String value) {
            addCriterion("remark3 <=", value, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3Like(String value) {
            addCriterion("remark3 like", value, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3NotLike(String value) {
            addCriterion("remark3 not like", value, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3In(List<String> values) {
            addCriterion("remark3 in", values, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3NotIn(List<String> values) {
            addCriterion("remark3 not in", values, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3Between(String value1, String value2) {
            addCriterion("remark3 between", value1, value2, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3NotBetween(String value1, String value2) {
            addCriterion("remark3 not between", value1, value2, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark4IsNull() {
            addCriterion("remark4 is null");
            return (Criteria) this;
        }

        public Criteria andRemark4IsNotNull() {
            addCriterion("remark4 is not null");
            return (Criteria) this;
        }

        public Criteria andRemark4EqualTo(String value) {
            addCriterion("remark4 =", value, "remark4");
            return (Criteria) this;
        }

        public Criteria andRemark4NotEqualTo(String value) {
            addCriterion("remark4 <>", value, "remark4");
            return (Criteria) this;
        }

        public Criteria andRemark4GreaterThan(String value) {
            addCriterion("remark4 >", value, "remark4");
            return (Criteria) this;
        }

        public Criteria andRemark4GreaterThanOrEqualTo(String value) {
            addCriterion("remark4 >=", value, "remark4");
            return (Criteria) this;
        }

        public Criteria andRemark4LessThan(String value) {
            addCriterion("remark4 <", value, "remark4");
            return (Criteria) this;
        }

        public Criteria andRemark4LessThanOrEqualTo(String value) {
            addCriterion("remark4 <=", value, "remark4");
            return (Criteria) this;
        }

        public Criteria andRemark4Like(String value) {
            addCriterion("remark4 like", value, "remark4");
            return (Criteria) this;
        }

        public Criteria andRemark4NotLike(String value) {
            addCriterion("remark4 not like", value, "remark4");
            return (Criteria) this;
        }

        public Criteria andRemark4In(List<String> values) {
            addCriterion("remark4 in", values, "remark4");
            return (Criteria) this;
        }

        public Criteria andRemark4NotIn(List<String> values) {
            addCriterion("remark4 not in", values, "remark4");
            return (Criteria) this;
        }

        public Criteria andRemark4Between(String value1, String value2) {
            addCriterion("remark4 between", value1, value2, "remark4");
            return (Criteria) this;
        }

        public Criteria andRemark4NotBetween(String value1, String value2) {
            addCriterion("remark4 not between", value1, value2, "remark4");
            return (Criteria) this;
        }

        public Criteria andRemark5IsNull() {
            addCriterion("remark5 is null");
            return (Criteria) this;
        }

        public Criteria andRemark5IsNotNull() {
            addCriterion("remark5 is not null");
            return (Criteria) this;
        }

        public Criteria andRemark5EqualTo(String value) {
            addCriterion("remark5 =", value, "remark5");
            return (Criteria) this;
        }

        public Criteria andRemark5NotEqualTo(String value) {
            addCriterion("remark5 <>", value, "remark5");
            return (Criteria) this;
        }

        public Criteria andRemark5GreaterThan(String value) {
            addCriterion("remark5 >", value, "remark5");
            return (Criteria) this;
        }

        public Criteria andRemark5GreaterThanOrEqualTo(String value) {
            addCriterion("remark5 >=", value, "remark5");
            return (Criteria) this;
        }

        public Criteria andRemark5LessThan(String value) {
            addCriterion("remark5 <", value, "remark5");
            return (Criteria) this;
        }

        public Criteria andRemark5LessThanOrEqualTo(String value) {
            addCriterion("remark5 <=", value, "remark5");
            return (Criteria) this;
        }

        public Criteria andRemark5Like(String value) {
            addCriterion("remark5 like", value, "remark5");
            return (Criteria) this;
        }

        public Criteria andRemark5NotLike(String value) {
            addCriterion("remark5 not like", value, "remark5");
            return (Criteria) this;
        }

        public Criteria andRemark5In(List<String> values) {
            addCriterion("remark5 in", values, "remark5");
            return (Criteria) this;
        }

        public Criteria andRemark5NotIn(List<String> values) {
            addCriterion("remark5 not in", values, "remark5");
            return (Criteria) this;
        }

        public Criteria andRemark5Between(String value1, String value2) {
            addCriterion("remark5 between", value1, value2, "remark5");
            return (Criteria) this;
        }

        public Criteria andRemark5NotBetween(String value1, String value2) {
            addCriterion("remark5 not between", value1, value2, "remark5");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}