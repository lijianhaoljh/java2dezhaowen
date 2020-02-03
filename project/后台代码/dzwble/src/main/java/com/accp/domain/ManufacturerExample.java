package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class ManufacturerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ManufacturerExample() {
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

        public Criteria andMfidIsNull() {
            addCriterion("mfid is null");
            return (Criteria) this;
        }

        public Criteria andMfidIsNotNull() {
            addCriterion("mfid is not null");
            return (Criteria) this;
        }

        public Criteria andMfidEqualTo(Integer value) {
            addCriterion("mfid =", value, "mfid");
            return (Criteria) this;
        }

        public Criteria andMfidNotEqualTo(Integer value) {
            addCriterion("mfid <>", value, "mfid");
            return (Criteria) this;
        }

        public Criteria andMfidGreaterThan(Integer value) {
            addCriterion("mfid >", value, "mfid");
            return (Criteria) this;
        }

        public Criteria andMfidGreaterThanOrEqualTo(Integer value) {
            addCriterion("mfid >=", value, "mfid");
            return (Criteria) this;
        }

        public Criteria andMfidLessThan(Integer value) {
            addCriterion("mfid <", value, "mfid");
            return (Criteria) this;
        }

        public Criteria andMfidLessThanOrEqualTo(Integer value) {
            addCriterion("mfid <=", value, "mfid");
            return (Criteria) this;
        }

        public Criteria andMfidIn(List<Integer> values) {
            addCriterion("mfid in", values, "mfid");
            return (Criteria) this;
        }

        public Criteria andMfidNotIn(List<Integer> values) {
            addCriterion("mfid not in", values, "mfid");
            return (Criteria) this;
        }

        public Criteria andMfidBetween(Integer value1, Integer value2) {
            addCriterion("mfid between", value1, value2, "mfid");
            return (Criteria) this;
        }

        public Criteria andMfidNotBetween(Integer value1, Integer value2) {
            addCriterion("mfid not between", value1, value2, "mfid");
            return (Criteria) this;
        }

        public Criteria andMfnameIsNull() {
            addCriterion("mfname is null");
            return (Criteria) this;
        }

        public Criteria andMfnameIsNotNull() {
            addCriterion("mfname is not null");
            return (Criteria) this;
        }

        public Criteria andMfnameEqualTo(String value) {
            addCriterion("mfname =", value, "mfname");
            return (Criteria) this;
        }

        public Criteria andMfnameNotEqualTo(String value) {
            addCriterion("mfname <>", value, "mfname");
            return (Criteria) this;
        }

        public Criteria andMfnameGreaterThan(String value) {
            addCriterion("mfname >", value, "mfname");
            return (Criteria) this;
        }

        public Criteria andMfnameGreaterThanOrEqualTo(String value) {
            addCriterion("mfname >=", value, "mfname");
            return (Criteria) this;
        }

        public Criteria andMfnameLessThan(String value) {
            addCriterion("mfname <", value, "mfname");
            return (Criteria) this;
        }

        public Criteria andMfnameLessThanOrEqualTo(String value) {
            addCriterion("mfname <=", value, "mfname");
            return (Criteria) this;
        }

        public Criteria andMfnameLike(String value) {
            addCriterion("mfname like", value, "mfname");
            return (Criteria) this;
        }

        public Criteria andMfnameNotLike(String value) {
            addCriterion("mfname not like", value, "mfname");
            return (Criteria) this;
        }

        public Criteria andMfnameIn(List<String> values) {
            addCriterion("mfname in", values, "mfname");
            return (Criteria) this;
        }

        public Criteria andMfnameNotIn(List<String> values) {
            addCriterion("mfname not in", values, "mfname");
            return (Criteria) this;
        }

        public Criteria andMfnameBetween(String value1, String value2) {
            addCriterion("mfname between", value1, value2, "mfname");
            return (Criteria) this;
        }

        public Criteria andMfnameNotBetween(String value1, String value2) {
            addCriterion("mfname not between", value1, value2, "mfname");
            return (Criteria) this;
        }

        public Criteria andMfaddressIsNull() {
            addCriterion("mfaddress is null");
            return (Criteria) this;
        }

        public Criteria andMfaddressIsNotNull() {
            addCriterion("mfaddress is not null");
            return (Criteria) this;
        }

        public Criteria andMfaddressEqualTo(String value) {
            addCriterion("mfaddress =", value, "mfaddress");
            return (Criteria) this;
        }

        public Criteria andMfaddressNotEqualTo(String value) {
            addCriterion("mfaddress <>", value, "mfaddress");
            return (Criteria) this;
        }

        public Criteria andMfaddressGreaterThan(String value) {
            addCriterion("mfaddress >", value, "mfaddress");
            return (Criteria) this;
        }

        public Criteria andMfaddressGreaterThanOrEqualTo(String value) {
            addCriterion("mfaddress >=", value, "mfaddress");
            return (Criteria) this;
        }

        public Criteria andMfaddressLessThan(String value) {
            addCriterion("mfaddress <", value, "mfaddress");
            return (Criteria) this;
        }

        public Criteria andMfaddressLessThanOrEqualTo(String value) {
            addCriterion("mfaddress <=", value, "mfaddress");
            return (Criteria) this;
        }

        public Criteria andMfaddressLike(String value) {
            addCriterion("mfaddress like", value, "mfaddress");
            return (Criteria) this;
        }

        public Criteria andMfaddressNotLike(String value) {
            addCriterion("mfaddress not like", value, "mfaddress");
            return (Criteria) this;
        }

        public Criteria andMfaddressIn(List<String> values) {
            addCriterion("mfaddress in", values, "mfaddress");
            return (Criteria) this;
        }

        public Criteria andMfaddressNotIn(List<String> values) {
            addCriterion("mfaddress not in", values, "mfaddress");
            return (Criteria) this;
        }

        public Criteria andMfaddressBetween(String value1, String value2) {
            addCriterion("mfaddress between", value1, value2, "mfaddress");
            return (Criteria) this;
        }

        public Criteria andMfaddressNotBetween(String value1, String value2) {
            addCriterion("mfaddress not between", value1, value2, "mfaddress");
            return (Criteria) this;
        }

        public Criteria andMfsituationIsNull() {
            addCriterion("mfsituation is null");
            return (Criteria) this;
        }

        public Criteria andMfsituationIsNotNull() {
            addCriterion("mfsituation is not null");
            return (Criteria) this;
        }

        public Criteria andMfsituationEqualTo(String value) {
            addCriterion("mfsituation =", value, "mfsituation");
            return (Criteria) this;
        }

        public Criteria andMfsituationNotEqualTo(String value) {
            addCriterion("mfsituation <>", value, "mfsituation");
            return (Criteria) this;
        }

        public Criteria andMfsituationGreaterThan(String value) {
            addCriterion("mfsituation >", value, "mfsituation");
            return (Criteria) this;
        }

        public Criteria andMfsituationGreaterThanOrEqualTo(String value) {
            addCriterion("mfsituation >=", value, "mfsituation");
            return (Criteria) this;
        }

        public Criteria andMfsituationLessThan(String value) {
            addCriterion("mfsituation <", value, "mfsituation");
            return (Criteria) this;
        }

        public Criteria andMfsituationLessThanOrEqualTo(String value) {
            addCriterion("mfsituation <=", value, "mfsituation");
            return (Criteria) this;
        }

        public Criteria andMfsituationLike(String value) {
            addCriterion("mfsituation like", value, "mfsituation");
            return (Criteria) this;
        }

        public Criteria andMfsituationNotLike(String value) {
            addCriterion("mfsituation not like", value, "mfsituation");
            return (Criteria) this;
        }

        public Criteria andMfsituationIn(List<String> values) {
            addCriterion("mfsituation in", values, "mfsituation");
            return (Criteria) this;
        }

        public Criteria andMfsituationNotIn(List<String> values) {
            addCriterion("mfsituation not in", values, "mfsituation");
            return (Criteria) this;
        }

        public Criteria andMfsituationBetween(String value1, String value2) {
            addCriterion("mfsituation between", value1, value2, "mfsituation");
            return (Criteria) this;
        }

        public Criteria andMfsituationNotBetween(String value1, String value2) {
            addCriterion("mfsituation not between", value1, value2, "mfsituation");
            return (Criteria) this;
        }

        public Criteria andMfwebsiteIsNull() {
            addCriterion("mfwebsite is null");
            return (Criteria) this;
        }

        public Criteria andMfwebsiteIsNotNull() {
            addCriterion("mfwebsite is not null");
            return (Criteria) this;
        }

        public Criteria andMfwebsiteEqualTo(String value) {
            addCriterion("mfwebsite =", value, "mfwebsite");
            return (Criteria) this;
        }

        public Criteria andMfwebsiteNotEqualTo(String value) {
            addCriterion("mfwebsite <>", value, "mfwebsite");
            return (Criteria) this;
        }

        public Criteria andMfwebsiteGreaterThan(String value) {
            addCriterion("mfwebsite >", value, "mfwebsite");
            return (Criteria) this;
        }

        public Criteria andMfwebsiteGreaterThanOrEqualTo(String value) {
            addCriterion("mfwebsite >=", value, "mfwebsite");
            return (Criteria) this;
        }

        public Criteria andMfwebsiteLessThan(String value) {
            addCriterion("mfwebsite <", value, "mfwebsite");
            return (Criteria) this;
        }

        public Criteria andMfwebsiteLessThanOrEqualTo(String value) {
            addCriterion("mfwebsite <=", value, "mfwebsite");
            return (Criteria) this;
        }

        public Criteria andMfwebsiteLike(String value) {
            addCriterion("mfwebsite like", value, "mfwebsite");
            return (Criteria) this;
        }

        public Criteria andMfwebsiteNotLike(String value) {
            addCriterion("mfwebsite not like", value, "mfwebsite");
            return (Criteria) this;
        }

        public Criteria andMfwebsiteIn(List<String> values) {
            addCriterion("mfwebsite in", values, "mfwebsite");
            return (Criteria) this;
        }

        public Criteria andMfwebsiteNotIn(List<String> values) {
            addCriterion("mfwebsite not in", values, "mfwebsite");
            return (Criteria) this;
        }

        public Criteria andMfwebsiteBetween(String value1, String value2) {
            addCriterion("mfwebsite between", value1, value2, "mfwebsite");
            return (Criteria) this;
        }

        public Criteria andMfwebsiteNotBetween(String value1, String value2) {
            addCriterion("mfwebsite not between", value1, value2, "mfwebsite");
            return (Criteria) this;
        }

        public Criteria andMfopeningbankIsNull() {
            addCriterion("mfopeningbank is null");
            return (Criteria) this;
        }

        public Criteria andMfopeningbankIsNotNull() {
            addCriterion("mfopeningbank is not null");
            return (Criteria) this;
        }

        public Criteria andMfopeningbankEqualTo(String value) {
            addCriterion("mfopeningbank =", value, "mfopeningbank");
            return (Criteria) this;
        }

        public Criteria andMfopeningbankNotEqualTo(String value) {
            addCriterion("mfopeningbank <>", value, "mfopeningbank");
            return (Criteria) this;
        }

        public Criteria andMfopeningbankGreaterThan(String value) {
            addCriterion("mfopeningbank >", value, "mfopeningbank");
            return (Criteria) this;
        }

        public Criteria andMfopeningbankGreaterThanOrEqualTo(String value) {
            addCriterion("mfopeningbank >=", value, "mfopeningbank");
            return (Criteria) this;
        }

        public Criteria andMfopeningbankLessThan(String value) {
            addCriterion("mfopeningbank <", value, "mfopeningbank");
            return (Criteria) this;
        }

        public Criteria andMfopeningbankLessThanOrEqualTo(String value) {
            addCriterion("mfopeningbank <=", value, "mfopeningbank");
            return (Criteria) this;
        }

        public Criteria andMfopeningbankLike(String value) {
            addCriterion("mfopeningbank like", value, "mfopeningbank");
            return (Criteria) this;
        }

        public Criteria andMfopeningbankNotLike(String value) {
            addCriterion("mfopeningbank not like", value, "mfopeningbank");
            return (Criteria) this;
        }

        public Criteria andMfopeningbankIn(List<String> values) {
            addCriterion("mfopeningbank in", values, "mfopeningbank");
            return (Criteria) this;
        }

        public Criteria andMfopeningbankNotIn(List<String> values) {
            addCriterion("mfopeningbank not in", values, "mfopeningbank");
            return (Criteria) this;
        }

        public Criteria andMfopeningbankBetween(String value1, String value2) {
            addCriterion("mfopeningbank between", value1, value2, "mfopeningbank");
            return (Criteria) this;
        }

        public Criteria andMfopeningbankNotBetween(String value1, String value2) {
            addCriterion("mfopeningbank not between", value1, value2, "mfopeningbank");
            return (Criteria) this;
        }

        public Criteria andMfbankaccountIsNull() {
            addCriterion("mfbankaccount is null");
            return (Criteria) this;
        }

        public Criteria andMfbankaccountIsNotNull() {
            addCriterion("mfbankaccount is not null");
            return (Criteria) this;
        }

        public Criteria andMfbankaccountEqualTo(String value) {
            addCriterion("mfbankaccount =", value, "mfbankaccount");
            return (Criteria) this;
        }

        public Criteria andMfbankaccountNotEqualTo(String value) {
            addCriterion("mfbankaccount <>", value, "mfbankaccount");
            return (Criteria) this;
        }

        public Criteria andMfbankaccountGreaterThan(String value) {
            addCriterion("mfbankaccount >", value, "mfbankaccount");
            return (Criteria) this;
        }

        public Criteria andMfbankaccountGreaterThanOrEqualTo(String value) {
            addCriterion("mfbankaccount >=", value, "mfbankaccount");
            return (Criteria) this;
        }

        public Criteria andMfbankaccountLessThan(String value) {
            addCriterion("mfbankaccount <", value, "mfbankaccount");
            return (Criteria) this;
        }

        public Criteria andMfbankaccountLessThanOrEqualTo(String value) {
            addCriterion("mfbankaccount <=", value, "mfbankaccount");
            return (Criteria) this;
        }

        public Criteria andMfbankaccountLike(String value) {
            addCriterion("mfbankaccount like", value, "mfbankaccount");
            return (Criteria) this;
        }

        public Criteria andMfbankaccountNotLike(String value) {
            addCriterion("mfbankaccount not like", value, "mfbankaccount");
            return (Criteria) this;
        }

        public Criteria andMfbankaccountIn(List<String> values) {
            addCriterion("mfbankaccount in", values, "mfbankaccount");
            return (Criteria) this;
        }

        public Criteria andMfbankaccountNotIn(List<String> values) {
            addCriterion("mfbankaccount not in", values, "mfbankaccount");
            return (Criteria) this;
        }

        public Criteria andMfbankaccountBetween(String value1, String value2) {
            addCriterion("mfbankaccount between", value1, value2, "mfbankaccount");
            return (Criteria) this;
        }

        public Criteria andMfbankaccountNotBetween(String value1, String value2) {
            addCriterion("mfbankaccount not between", value1, value2, "mfbankaccount");
            return (Criteria) this;
        }

        public Criteria andPmidIsNull() {
            addCriterion("pmid is null");
            return (Criteria) this;
        }

        public Criteria andPmidIsNotNull() {
            addCriterion("pmid is not null");
            return (Criteria) this;
        }

        public Criteria andPmidEqualTo(Integer value) {
            addCriterion("pmid =", value, "pmid");
            return (Criteria) this;
        }

        public Criteria andPmidNotEqualTo(Integer value) {
            addCriterion("pmid <>", value, "pmid");
            return (Criteria) this;
        }

        public Criteria andPmidGreaterThan(Integer value) {
            addCriterion("pmid >", value, "pmid");
            return (Criteria) this;
        }

        public Criteria andPmidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pmid >=", value, "pmid");
            return (Criteria) this;
        }

        public Criteria andPmidLessThan(Integer value) {
            addCriterion("pmid <", value, "pmid");
            return (Criteria) this;
        }

        public Criteria andPmidLessThanOrEqualTo(Integer value) {
            addCriterion("pmid <=", value, "pmid");
            return (Criteria) this;
        }

        public Criteria andPmidIn(List<Integer> values) {
            addCriterion("pmid in", values, "pmid");
            return (Criteria) this;
        }

        public Criteria andPmidNotIn(List<Integer> values) {
            addCriterion("pmid not in", values, "pmid");
            return (Criteria) this;
        }

        public Criteria andPmidBetween(Integer value1, Integer value2) {
            addCriterion("pmid between", value1, value2, "pmid");
            return (Criteria) this;
        }

        public Criteria andPmidNotBetween(Integer value1, Integer value2) {
            addCriterion("pmid not between", value1, value2, "pmid");
            return (Criteria) this;
        }

        public Criteria andLpidIsNull() {
            addCriterion("lpid is null");
            return (Criteria) this;
        }

        public Criteria andLpidIsNotNull() {
            addCriterion("lpid is not null");
            return (Criteria) this;
        }

        public Criteria andLpidEqualTo(Integer value) {
            addCriterion("lpid =", value, "lpid");
            return (Criteria) this;
        }

        public Criteria andLpidNotEqualTo(Integer value) {
            addCriterion("lpid <>", value, "lpid");
            return (Criteria) this;
        }

        public Criteria andLpidGreaterThan(Integer value) {
            addCriterion("lpid >", value, "lpid");
            return (Criteria) this;
        }

        public Criteria andLpidGreaterThanOrEqualTo(Integer value) {
            addCriterion("lpid >=", value, "lpid");
            return (Criteria) this;
        }

        public Criteria andLpidLessThan(Integer value) {
            addCriterion("lpid <", value, "lpid");
            return (Criteria) this;
        }

        public Criteria andLpidLessThanOrEqualTo(Integer value) {
            addCriterion("lpid <=", value, "lpid");
            return (Criteria) this;
        }

        public Criteria andLpidIn(List<Integer> values) {
            addCriterion("lpid in", values, "lpid");
            return (Criteria) this;
        }

        public Criteria andLpidNotIn(List<Integer> values) {
            addCriterion("lpid not in", values, "lpid");
            return (Criteria) this;
        }

        public Criteria andLpidBetween(Integer value1, Integer value2) {
            addCriterion("lpid between", value1, value2, "lpid");
            return (Criteria) this;
        }

        public Criteria andLpidNotBetween(Integer value1, Integer value2) {
            addCriterion("lpid not between", value1, value2, "lpid");
            return (Criteria) this;
        }

        public Criteria andMfmanagementbrandIsNull() {
            addCriterion("mfmanagementbrand is null");
            return (Criteria) this;
        }

        public Criteria andMfmanagementbrandIsNotNull() {
            addCriterion("mfmanagementbrand is not null");
            return (Criteria) this;
        }

        public Criteria andMfmanagementbrandEqualTo(String value) {
            addCriterion("mfmanagementbrand =", value, "mfmanagementbrand");
            return (Criteria) this;
        }

        public Criteria andMfmanagementbrandNotEqualTo(String value) {
            addCriterion("mfmanagementbrand <>", value, "mfmanagementbrand");
            return (Criteria) this;
        }

        public Criteria andMfmanagementbrandGreaterThan(String value) {
            addCriterion("mfmanagementbrand >", value, "mfmanagementbrand");
            return (Criteria) this;
        }

        public Criteria andMfmanagementbrandGreaterThanOrEqualTo(String value) {
            addCriterion("mfmanagementbrand >=", value, "mfmanagementbrand");
            return (Criteria) this;
        }

        public Criteria andMfmanagementbrandLessThan(String value) {
            addCriterion("mfmanagementbrand <", value, "mfmanagementbrand");
            return (Criteria) this;
        }

        public Criteria andMfmanagementbrandLessThanOrEqualTo(String value) {
            addCriterion("mfmanagementbrand <=", value, "mfmanagementbrand");
            return (Criteria) this;
        }

        public Criteria andMfmanagementbrandLike(String value) {
            addCriterion("mfmanagementbrand like", value, "mfmanagementbrand");
            return (Criteria) this;
        }

        public Criteria andMfmanagementbrandNotLike(String value) {
            addCriterion("mfmanagementbrand not like", value, "mfmanagementbrand");
            return (Criteria) this;
        }

        public Criteria andMfmanagementbrandIn(List<String> values) {
            addCriterion("mfmanagementbrand in", values, "mfmanagementbrand");
            return (Criteria) this;
        }

        public Criteria andMfmanagementbrandNotIn(List<String> values) {
            addCriterion("mfmanagementbrand not in", values, "mfmanagementbrand");
            return (Criteria) this;
        }

        public Criteria andMfmanagementbrandBetween(String value1, String value2) {
            addCriterion("mfmanagementbrand between", value1, value2, "mfmanagementbrand");
            return (Criteria) this;
        }

        public Criteria andMfmanagementbrandNotBetween(String value1, String value2) {
            addCriterion("mfmanagementbrand not between", value1, value2, "mfmanagementbrand");
            return (Criteria) this;
        }

        public Criteria andPidIsNull() {
            addCriterion("pid is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("pid is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(Integer value) {
            addCriterion("pid =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(Integer value) {
            addCriterion("pid <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(Integer value) {
            addCriterion("pid >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pid >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(Integer value) {
            addCriterion("pid <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(Integer value) {
            addCriterion("pid <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<Integer> values) {
            addCriterion("pid in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<Integer> values) {
            addCriterion("pid not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(Integer value1, Integer value2) {
            addCriterion("pid between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(Integer value1, Integer value2) {
            addCriterion("pid not between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andMfcontactsIsNull() {
            addCriterion("mfcontacts is null");
            return (Criteria) this;
        }

        public Criteria andMfcontactsIsNotNull() {
            addCriterion("mfcontacts is not null");
            return (Criteria) this;
        }

        public Criteria andMfcontactsEqualTo(String value) {
            addCriterion("mfcontacts =", value, "mfcontacts");
            return (Criteria) this;
        }

        public Criteria andMfcontactsNotEqualTo(String value) {
            addCriterion("mfcontacts <>", value, "mfcontacts");
            return (Criteria) this;
        }

        public Criteria andMfcontactsGreaterThan(String value) {
            addCriterion("mfcontacts >", value, "mfcontacts");
            return (Criteria) this;
        }

        public Criteria andMfcontactsGreaterThanOrEqualTo(String value) {
            addCriterion("mfcontacts >=", value, "mfcontacts");
            return (Criteria) this;
        }

        public Criteria andMfcontactsLessThan(String value) {
            addCriterion("mfcontacts <", value, "mfcontacts");
            return (Criteria) this;
        }

        public Criteria andMfcontactsLessThanOrEqualTo(String value) {
            addCriterion("mfcontacts <=", value, "mfcontacts");
            return (Criteria) this;
        }

        public Criteria andMfcontactsLike(String value) {
            addCriterion("mfcontacts like", value, "mfcontacts");
            return (Criteria) this;
        }

        public Criteria andMfcontactsNotLike(String value) {
            addCriterion("mfcontacts not like", value, "mfcontacts");
            return (Criteria) this;
        }

        public Criteria andMfcontactsIn(List<String> values) {
            addCriterion("mfcontacts in", values, "mfcontacts");
            return (Criteria) this;
        }

        public Criteria andMfcontactsNotIn(List<String> values) {
            addCriterion("mfcontacts not in", values, "mfcontacts");
            return (Criteria) this;
        }

        public Criteria andMfcontactsBetween(String value1, String value2) {
            addCriterion("mfcontacts between", value1, value2, "mfcontacts");
            return (Criteria) this;
        }

        public Criteria andMfcontactsNotBetween(String value1, String value2) {
            addCriterion("mfcontacts not between", value1, value2, "mfcontacts");
            return (Criteria) this;
        }

        public Criteria andMfphoneIsNull() {
            addCriterion("mfphone is null");
            return (Criteria) this;
        }

        public Criteria andMfphoneIsNotNull() {
            addCriterion("mfphone is not null");
            return (Criteria) this;
        }

        public Criteria andMfphoneEqualTo(String value) {
            addCriterion("mfphone =", value, "mfphone");
            return (Criteria) this;
        }

        public Criteria andMfphoneNotEqualTo(String value) {
            addCriterion("mfphone <>", value, "mfphone");
            return (Criteria) this;
        }

        public Criteria andMfphoneGreaterThan(String value) {
            addCriterion("mfphone >", value, "mfphone");
            return (Criteria) this;
        }

        public Criteria andMfphoneGreaterThanOrEqualTo(String value) {
            addCriterion("mfphone >=", value, "mfphone");
            return (Criteria) this;
        }

        public Criteria andMfphoneLessThan(String value) {
            addCriterion("mfphone <", value, "mfphone");
            return (Criteria) this;
        }

        public Criteria andMfphoneLessThanOrEqualTo(String value) {
            addCriterion("mfphone <=", value, "mfphone");
            return (Criteria) this;
        }

        public Criteria andMfphoneLike(String value) {
            addCriterion("mfphone like", value, "mfphone");
            return (Criteria) this;
        }

        public Criteria andMfphoneNotLike(String value) {
            addCriterion("mfphone not like", value, "mfphone");
            return (Criteria) this;
        }

        public Criteria andMfphoneIn(List<String> values) {
            addCriterion("mfphone in", values, "mfphone");
            return (Criteria) this;
        }

        public Criteria andMfphoneNotIn(List<String> values) {
            addCriterion("mfphone not in", values, "mfphone");
            return (Criteria) this;
        }

        public Criteria andMfphoneBetween(String value1, String value2) {
            addCriterion("mfphone between", value1, value2, "mfphone");
            return (Criteria) this;
        }

        public Criteria andMfphoneNotBetween(String value1, String value2) {
            addCriterion("mfphone not between", value1, value2, "mfphone");
            return (Criteria) this;
        }

        public Criteria andMfemailIsNull() {
            addCriterion("mfemail is null");
            return (Criteria) this;
        }

        public Criteria andMfemailIsNotNull() {
            addCriterion("mfemail is not null");
            return (Criteria) this;
        }

        public Criteria andMfemailEqualTo(String value) {
            addCriterion("mfemail =", value, "mfemail");
            return (Criteria) this;
        }

        public Criteria andMfemailNotEqualTo(String value) {
            addCriterion("mfemail <>", value, "mfemail");
            return (Criteria) this;
        }

        public Criteria andMfemailGreaterThan(String value) {
            addCriterion("mfemail >", value, "mfemail");
            return (Criteria) this;
        }

        public Criteria andMfemailGreaterThanOrEqualTo(String value) {
            addCriterion("mfemail >=", value, "mfemail");
            return (Criteria) this;
        }

        public Criteria andMfemailLessThan(String value) {
            addCriterion("mfemail <", value, "mfemail");
            return (Criteria) this;
        }

        public Criteria andMfemailLessThanOrEqualTo(String value) {
            addCriterion("mfemail <=", value, "mfemail");
            return (Criteria) this;
        }

        public Criteria andMfemailLike(String value) {
            addCriterion("mfemail like", value, "mfemail");
            return (Criteria) this;
        }

        public Criteria andMfemailNotLike(String value) {
            addCriterion("mfemail not like", value, "mfemail");
            return (Criteria) this;
        }

        public Criteria andMfemailIn(List<String> values) {
            addCriterion("mfemail in", values, "mfemail");
            return (Criteria) this;
        }

        public Criteria andMfemailNotIn(List<String> values) {
            addCriterion("mfemail not in", values, "mfemail");
            return (Criteria) this;
        }

        public Criteria andMfemailBetween(String value1, String value2) {
            addCriterion("mfemail between", value1, value2, "mfemail");
            return (Criteria) this;
        }

        public Criteria andMfemailNotBetween(String value1, String value2) {
            addCriterion("mfemail not between", value1, value2, "mfemail");
            return (Criteria) this;
        }

        public Criteria andMftellphoneIsNull() {
            addCriterion("mftellphone is null");
            return (Criteria) this;
        }

        public Criteria andMftellphoneIsNotNull() {
            addCriterion("mftellphone is not null");
            return (Criteria) this;
        }

        public Criteria andMftellphoneEqualTo(String value) {
            addCriterion("mftellphone =", value, "mftellphone");
            return (Criteria) this;
        }

        public Criteria andMftellphoneNotEqualTo(String value) {
            addCriterion("mftellphone <>", value, "mftellphone");
            return (Criteria) this;
        }

        public Criteria andMftellphoneGreaterThan(String value) {
            addCriterion("mftellphone >", value, "mftellphone");
            return (Criteria) this;
        }

        public Criteria andMftellphoneGreaterThanOrEqualTo(String value) {
            addCriterion("mftellphone >=", value, "mftellphone");
            return (Criteria) this;
        }

        public Criteria andMftellphoneLessThan(String value) {
            addCriterion("mftellphone <", value, "mftellphone");
            return (Criteria) this;
        }

        public Criteria andMftellphoneLessThanOrEqualTo(String value) {
            addCriterion("mftellphone <=", value, "mftellphone");
            return (Criteria) this;
        }

        public Criteria andMftellphoneLike(String value) {
            addCriterion("mftellphone like", value, "mftellphone");
            return (Criteria) this;
        }

        public Criteria andMftellphoneNotLike(String value) {
            addCriterion("mftellphone not like", value, "mftellphone");
            return (Criteria) this;
        }

        public Criteria andMftellphoneIn(List<String> values) {
            addCriterion("mftellphone in", values, "mftellphone");
            return (Criteria) this;
        }

        public Criteria andMftellphoneNotIn(List<String> values) {
            addCriterion("mftellphone not in", values, "mftellphone");
            return (Criteria) this;
        }

        public Criteria andMftellphoneBetween(String value1, String value2) {
            addCriterion("mftellphone between", value1, value2, "mftellphone");
            return (Criteria) this;
        }

        public Criteria andMftellphoneNotBetween(String value1, String value2) {
            addCriterion("mftellphone not between", value1, value2, "mftellphone");
            return (Criteria) this;
        }

        public Criteria andMfaccountIsNull() {
            addCriterion("mfaccount is null");
            return (Criteria) this;
        }

        public Criteria andMfaccountIsNotNull() {
            addCriterion("mfaccount is not null");
            return (Criteria) this;
        }

        public Criteria andMfaccountEqualTo(String value) {
            addCriterion("mfaccount =", value, "mfaccount");
            return (Criteria) this;
        }

        public Criteria andMfaccountNotEqualTo(String value) {
            addCriterion("mfaccount <>", value, "mfaccount");
            return (Criteria) this;
        }

        public Criteria andMfaccountGreaterThan(String value) {
            addCriterion("mfaccount >", value, "mfaccount");
            return (Criteria) this;
        }

        public Criteria andMfaccountGreaterThanOrEqualTo(String value) {
            addCriterion("mfaccount >=", value, "mfaccount");
            return (Criteria) this;
        }

        public Criteria andMfaccountLessThan(String value) {
            addCriterion("mfaccount <", value, "mfaccount");
            return (Criteria) this;
        }

        public Criteria andMfaccountLessThanOrEqualTo(String value) {
            addCriterion("mfaccount <=", value, "mfaccount");
            return (Criteria) this;
        }

        public Criteria andMfaccountLike(String value) {
            addCriterion("mfaccount like", value, "mfaccount");
            return (Criteria) this;
        }

        public Criteria andMfaccountNotLike(String value) {
            addCriterion("mfaccount not like", value, "mfaccount");
            return (Criteria) this;
        }

        public Criteria andMfaccountIn(List<String> values) {
            addCriterion("mfaccount in", values, "mfaccount");
            return (Criteria) this;
        }

        public Criteria andMfaccountNotIn(List<String> values) {
            addCriterion("mfaccount not in", values, "mfaccount");
            return (Criteria) this;
        }

        public Criteria andMfaccountBetween(String value1, String value2) {
            addCriterion("mfaccount between", value1, value2, "mfaccount");
            return (Criteria) this;
        }

        public Criteria andMfaccountNotBetween(String value1, String value2) {
            addCriterion("mfaccount not between", value1, value2, "mfaccount");
            return (Criteria) this;
        }

        public Criteria andMfremarkIsNull() {
            addCriterion("mfremark is null");
            return (Criteria) this;
        }

        public Criteria andMfremarkIsNotNull() {
            addCriterion("mfremark is not null");
            return (Criteria) this;
        }

        public Criteria andMfremarkEqualTo(String value) {
            addCriterion("mfremark =", value, "mfremark");
            return (Criteria) this;
        }

        public Criteria andMfremarkNotEqualTo(String value) {
            addCriterion("mfremark <>", value, "mfremark");
            return (Criteria) this;
        }

        public Criteria andMfremarkGreaterThan(String value) {
            addCriterion("mfremark >", value, "mfremark");
            return (Criteria) this;
        }

        public Criteria andMfremarkGreaterThanOrEqualTo(String value) {
            addCriterion("mfremark >=", value, "mfremark");
            return (Criteria) this;
        }

        public Criteria andMfremarkLessThan(String value) {
            addCriterion("mfremark <", value, "mfremark");
            return (Criteria) this;
        }

        public Criteria andMfremarkLessThanOrEqualTo(String value) {
            addCriterion("mfremark <=", value, "mfremark");
            return (Criteria) this;
        }

        public Criteria andMfremarkLike(String value) {
            addCriterion("mfremark like", value, "mfremark");
            return (Criteria) this;
        }

        public Criteria andMfremarkNotLike(String value) {
            addCriterion("mfremark not like", value, "mfremark");
            return (Criteria) this;
        }

        public Criteria andMfremarkIn(List<String> values) {
            addCriterion("mfremark in", values, "mfremark");
            return (Criteria) this;
        }

        public Criteria andMfremarkNotIn(List<String> values) {
            addCriterion("mfremark not in", values, "mfremark");
            return (Criteria) this;
        }

        public Criteria andMfremarkBetween(String value1, String value2) {
            addCriterion("mfremark between", value1, value2, "mfremark");
            return (Criteria) this;
        }

        public Criteria andMfremarkNotBetween(String value1, String value2) {
            addCriterion("mfremark not between", value1, value2, "mfremark");
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