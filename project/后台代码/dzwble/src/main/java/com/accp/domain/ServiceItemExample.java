package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class ServiceItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ServiceItemExample() {
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

        public Criteria andSidnoIsNull() {
            addCriterion("sidno is null");
            return (Criteria) this;
        }

        public Criteria andSidnoIsNotNull() {
            addCriterion("sidno is not null");
            return (Criteria) this;
        }

        public Criteria andSidnoEqualTo(Integer value) {
            addCriterion("sidno =", value, "sidno");
            return (Criteria) this;
        }

        public Criteria andSidnoNotEqualTo(Integer value) {
            addCriterion("sidno <>", value, "sidno");
            return (Criteria) this;
        }

        public Criteria andSidnoGreaterThan(Integer value) {
            addCriterion("sidno >", value, "sidno");
            return (Criteria) this;
        }

        public Criteria andSidnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("sidno >=", value, "sidno");
            return (Criteria) this;
        }

        public Criteria andSidnoLessThan(Integer value) {
            addCriterion("sidno <", value, "sidno");
            return (Criteria) this;
        }

        public Criteria andSidnoLessThanOrEqualTo(Integer value) {
            addCriterion("sidno <=", value, "sidno");
            return (Criteria) this;
        }

        public Criteria andSidnoIn(List<Integer> values) {
            addCriterion("sidno in", values, "sidno");
            return (Criteria) this;
        }

        public Criteria andSidnoNotIn(List<Integer> values) {
            addCriterion("sidno not in", values, "sidno");
            return (Criteria) this;
        }

        public Criteria andSidnoBetween(Integer value1, Integer value2) {
            addCriterion("sidno between", value1, value2, "sidno");
            return (Criteria) this;
        }

        public Criteria andSidnoNotBetween(Integer value1, Integer value2) {
            addCriterion("sidno not between", value1, value2, "sidno");
            return (Criteria) this;
        }

        public Criteria andSidnameIsNull() {
            addCriterion("sidname is null");
            return (Criteria) this;
        }

        public Criteria andSidnameIsNotNull() {
            addCriterion("sidname is not null");
            return (Criteria) this;
        }

        public Criteria andSidnameEqualTo(String value) {
            addCriterion("sidname =", value, "sidname");
            return (Criteria) this;
        }

        public Criteria andSidnameNotEqualTo(String value) {
            addCriterion("sidname <>", value, "sidname");
            return (Criteria) this;
        }

        public Criteria andSidnameGreaterThan(String value) {
            addCriterion("sidname >", value, "sidname");
            return (Criteria) this;
        }

        public Criteria andSidnameGreaterThanOrEqualTo(String value) {
            addCriterion("sidname >=", value, "sidname");
            return (Criteria) this;
        }

        public Criteria andSidnameLessThan(String value) {
            addCriterion("sidname <", value, "sidname");
            return (Criteria) this;
        }

        public Criteria andSidnameLessThanOrEqualTo(String value) {
            addCriterion("sidname <=", value, "sidname");
            return (Criteria) this;
        }

        public Criteria andSidnameLike(String value) {
            addCriterion("sidname like", value, "sidname");
            return (Criteria) this;
        }

        public Criteria andSidnameNotLike(String value) {
            addCriterion("sidname not like", value, "sidname");
            return (Criteria) this;
        }

        public Criteria andSidnameIn(List<String> values) {
            addCriterion("sidname in", values, "sidname");
            return (Criteria) this;
        }

        public Criteria andSidnameNotIn(List<String> values) {
            addCriterion("sidname not in", values, "sidname");
            return (Criteria) this;
        }

        public Criteria andSidnameBetween(String value1, String value2) {
            addCriterion("sidname between", value1, value2, "sidname");
            return (Criteria) this;
        }

        public Criteria andSidnameNotBetween(String value1, String value2) {
            addCriterion("sidname not between", value1, value2, "sidname");
            return (Criteria) this;
        }

        public Criteria andToinoIsNull() {
            addCriterion("toino is null");
            return (Criteria) this;
        }

        public Criteria andToinoIsNotNull() {
            addCriterion("toino is not null");
            return (Criteria) this;
        }

        public Criteria andToinoEqualTo(Integer value) {
            addCriterion("toino =", value, "toino");
            return (Criteria) this;
        }

        public Criteria andToinoNotEqualTo(Integer value) {
            addCriterion("toino <>", value, "toino");
            return (Criteria) this;
        }

        public Criteria andToinoGreaterThan(Integer value) {
            addCriterion("toino >", value, "toino");
            return (Criteria) this;
        }

        public Criteria andToinoGreaterThanOrEqualTo(Integer value) {
            addCriterion("toino >=", value, "toino");
            return (Criteria) this;
        }

        public Criteria andToinoLessThan(Integer value) {
            addCriterion("toino <", value, "toino");
            return (Criteria) this;
        }

        public Criteria andToinoLessThanOrEqualTo(Integer value) {
            addCriterion("toino <=", value, "toino");
            return (Criteria) this;
        }

        public Criteria andToinoIn(List<Integer> values) {
            addCriterion("toino in", values, "toino");
            return (Criteria) this;
        }

        public Criteria andToinoNotIn(List<Integer> values) {
            addCriterion("toino not in", values, "toino");
            return (Criteria) this;
        }

        public Criteria andToinoBetween(Integer value1, Integer value2) {
            addCriterion("toino between", value1, value2, "toino");
            return (Criteria) this;
        }

        public Criteria andToinoNotBetween(Integer value1, Integer value2) {
            addCriterion("toino not between", value1, value2, "toino");
            return (Criteria) this;
        }

        public Criteria andCbnoIsNull() {
            addCriterion("cbno is null");
            return (Criteria) this;
        }

        public Criteria andCbnoIsNotNull() {
            addCriterion("cbno is not null");
            return (Criteria) this;
        }

        public Criteria andCbnoEqualTo(Integer value) {
            addCriterion("cbno =", value, "cbno");
            return (Criteria) this;
        }

        public Criteria andCbnoNotEqualTo(Integer value) {
            addCriterion("cbno <>", value, "cbno");
            return (Criteria) this;
        }

        public Criteria andCbnoGreaterThan(Integer value) {
            addCriterion("cbno >", value, "cbno");
            return (Criteria) this;
        }

        public Criteria andCbnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("cbno >=", value, "cbno");
            return (Criteria) this;
        }

        public Criteria andCbnoLessThan(Integer value) {
            addCriterion("cbno <", value, "cbno");
            return (Criteria) this;
        }

        public Criteria andCbnoLessThanOrEqualTo(Integer value) {
            addCriterion("cbno <=", value, "cbno");
            return (Criteria) this;
        }

        public Criteria andCbnoIn(List<Integer> values) {
            addCriterion("cbno in", values, "cbno");
            return (Criteria) this;
        }

        public Criteria andCbnoNotIn(List<Integer> values) {
            addCriterion("cbno not in", values, "cbno");
            return (Criteria) this;
        }

        public Criteria andCbnoBetween(Integer value1, Integer value2) {
            addCriterion("cbno between", value1, value2, "cbno");
            return (Criteria) this;
        }

        public Criteria andCbnoNotBetween(Integer value1, Integer value2) {
            addCriterion("cbno not between", value1, value2, "cbno");
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

        public Criteria andStandardpriceIsNull() {
            addCriterion("standardprice is null");
            return (Criteria) this;
        }

        public Criteria andStandardpriceIsNotNull() {
            addCriterion("standardprice is not null");
            return (Criteria) this;
        }

        public Criteria andStandardpriceEqualTo(Float value) {
            addCriterion("standardprice =", value, "standardprice");
            return (Criteria) this;
        }

        public Criteria andStandardpriceNotEqualTo(Float value) {
            addCriterion("standardprice <>", value, "standardprice");
            return (Criteria) this;
        }

        public Criteria andStandardpriceGreaterThan(Float value) {
            addCriterion("standardprice >", value, "standardprice");
            return (Criteria) this;
        }

        public Criteria andStandardpriceGreaterThanOrEqualTo(Float value) {
            addCriterion("standardprice >=", value, "standardprice");
            return (Criteria) this;
        }

        public Criteria andStandardpriceLessThan(Float value) {
            addCriterion("standardprice <", value, "standardprice");
            return (Criteria) this;
        }

        public Criteria andStandardpriceLessThanOrEqualTo(Float value) {
            addCriterion("standardprice <=", value, "standardprice");
            return (Criteria) this;
        }

        public Criteria andStandardpriceIn(List<Float> values) {
            addCriterion("standardprice in", values, "standardprice");
            return (Criteria) this;
        }

        public Criteria andStandardpriceNotIn(List<Float> values) {
            addCriterion("standardprice not in", values, "standardprice");
            return (Criteria) this;
        }

        public Criteria andStandardpriceBetween(Float value1, Float value2) {
            addCriterion("standardprice between", value1, value2, "standardprice");
            return (Criteria) this;
        }

        public Criteria andStandardpriceNotBetween(Float value1, Float value2) {
            addCriterion("standardprice not between", value1, value2, "standardprice");
            return (Criteria) this;
        }

        public Criteria andMemberpriceIsNull() {
            addCriterion("memberprice is null");
            return (Criteria) this;
        }

        public Criteria andMemberpriceIsNotNull() {
            addCriterion("memberprice is not null");
            return (Criteria) this;
        }

        public Criteria andMemberpriceEqualTo(Float value) {
            addCriterion("memberprice =", value, "memberprice");
            return (Criteria) this;
        }

        public Criteria andMemberpriceNotEqualTo(Float value) {
            addCriterion("memberprice <>", value, "memberprice");
            return (Criteria) this;
        }

        public Criteria andMemberpriceGreaterThan(Float value) {
            addCriterion("memberprice >", value, "memberprice");
            return (Criteria) this;
        }

        public Criteria andMemberpriceGreaterThanOrEqualTo(Float value) {
            addCriterion("memberprice >=", value, "memberprice");
            return (Criteria) this;
        }

        public Criteria andMemberpriceLessThan(Float value) {
            addCriterion("memberprice <", value, "memberprice");
            return (Criteria) this;
        }

        public Criteria andMemberpriceLessThanOrEqualTo(Float value) {
            addCriterion("memberprice <=", value, "memberprice");
            return (Criteria) this;
        }

        public Criteria andMemberpriceIn(List<Float> values) {
            addCriterion("memberprice in", values, "memberprice");
            return (Criteria) this;
        }

        public Criteria andMemberpriceNotIn(List<Float> values) {
            addCriterion("memberprice not in", values, "memberprice");
            return (Criteria) this;
        }

        public Criteria andMemberpriceBetween(Float value1, Float value2) {
            addCriterion("memberprice between", value1, value2, "memberprice");
            return (Criteria) this;
        }

        public Criteria andMemberpriceNotBetween(Float value1, Float value2) {
            addCriterion("memberprice not between", value1, value2, "memberprice");
            return (Criteria) this;
        }

        public Criteria andVippriceIsNull() {
            addCriterion("vipprice is null");
            return (Criteria) this;
        }

        public Criteria andVippriceIsNotNull() {
            addCriterion("vipprice is not null");
            return (Criteria) this;
        }

        public Criteria andVippriceEqualTo(Float value) {
            addCriterion("vipprice =", value, "vipprice");
            return (Criteria) this;
        }

        public Criteria andVippriceNotEqualTo(Float value) {
            addCriterion("vipprice <>", value, "vipprice");
            return (Criteria) this;
        }

        public Criteria andVippriceGreaterThan(Float value) {
            addCriterion("vipprice >", value, "vipprice");
            return (Criteria) this;
        }

        public Criteria andVippriceGreaterThanOrEqualTo(Float value) {
            addCriterion("vipprice >=", value, "vipprice");
            return (Criteria) this;
        }

        public Criteria andVippriceLessThan(Float value) {
            addCriterion("vipprice <", value, "vipprice");
            return (Criteria) this;
        }

        public Criteria andVippriceLessThanOrEqualTo(Float value) {
            addCriterion("vipprice <=", value, "vipprice");
            return (Criteria) this;
        }

        public Criteria andVippriceIn(List<Float> values) {
            addCriterion("vipprice in", values, "vipprice");
            return (Criteria) this;
        }

        public Criteria andVippriceNotIn(List<Float> values) {
            addCriterion("vipprice not in", values, "vipprice");
            return (Criteria) this;
        }

        public Criteria andVippriceBetween(Float value1, Float value2) {
            addCriterion("vipprice between", value1, value2, "vipprice");
            return (Criteria) this;
        }

        public Criteria andVippriceNotBetween(Float value1, Float value2) {
            addCriterion("vipprice not between", value1, value2, "vipprice");
            return (Criteria) this;
        }

        public Criteria andAgreementpriceIsNull() {
            addCriterion("agreementprice is null");
            return (Criteria) this;
        }

        public Criteria andAgreementpriceIsNotNull() {
            addCriterion("agreementprice is not null");
            return (Criteria) this;
        }

        public Criteria andAgreementpriceEqualTo(Float value) {
            addCriterion("agreementprice =", value, "agreementprice");
            return (Criteria) this;
        }

        public Criteria andAgreementpriceNotEqualTo(Float value) {
            addCriterion("agreementprice <>", value, "agreementprice");
            return (Criteria) this;
        }

        public Criteria andAgreementpriceGreaterThan(Float value) {
            addCriterion("agreementprice >", value, "agreementprice");
            return (Criteria) this;
        }

        public Criteria andAgreementpriceGreaterThanOrEqualTo(Float value) {
            addCriterion("agreementprice >=", value, "agreementprice");
            return (Criteria) this;
        }

        public Criteria andAgreementpriceLessThan(Float value) {
            addCriterion("agreementprice <", value, "agreementprice");
            return (Criteria) this;
        }

        public Criteria andAgreementpriceLessThanOrEqualTo(Float value) {
            addCriterion("agreementprice <=", value, "agreementprice");
            return (Criteria) this;
        }

        public Criteria andAgreementpriceIn(List<Float> values) {
            addCriterion("agreementprice in", values, "agreementprice");
            return (Criteria) this;
        }

        public Criteria andAgreementpriceNotIn(List<Float> values) {
            addCriterion("agreementprice not in", values, "agreementprice");
            return (Criteria) this;
        }

        public Criteria andAgreementpriceBetween(Float value1, Float value2) {
            addCriterion("agreementprice between", value1, value2, "agreementprice");
            return (Criteria) this;
        }

        public Criteria andAgreementpriceNotBetween(Float value1, Float value2) {
            addCriterion("agreementprice not between", value1, value2, "agreementprice");
            return (Criteria) this;
        }

        public Criteria andInsurancepriceIsNull() {
            addCriterion("Insuranceprice is null");
            return (Criteria) this;
        }

        public Criteria andInsurancepriceIsNotNull() {
            addCriterion("Insuranceprice is not null");
            return (Criteria) this;
        }

        public Criteria andInsurancepriceEqualTo(Float value) {
            addCriterion("Insuranceprice =", value, "insuranceprice");
            return (Criteria) this;
        }

        public Criteria andInsurancepriceNotEqualTo(Float value) {
            addCriterion("Insuranceprice <>", value, "insuranceprice");
            return (Criteria) this;
        }

        public Criteria andInsurancepriceGreaterThan(Float value) {
            addCriterion("Insuranceprice >", value, "insuranceprice");
            return (Criteria) this;
        }

        public Criteria andInsurancepriceGreaterThanOrEqualTo(Float value) {
            addCriterion("Insuranceprice >=", value, "insuranceprice");
            return (Criteria) this;
        }

        public Criteria andInsurancepriceLessThan(Float value) {
            addCriterion("Insuranceprice <", value, "insuranceprice");
            return (Criteria) this;
        }

        public Criteria andInsurancepriceLessThanOrEqualTo(Float value) {
            addCriterion("Insuranceprice <=", value, "insuranceprice");
            return (Criteria) this;
        }

        public Criteria andInsurancepriceIn(List<Float> values) {
            addCriterion("Insuranceprice in", values, "insuranceprice");
            return (Criteria) this;
        }

        public Criteria andInsurancepriceNotIn(List<Float> values) {
            addCriterion("Insuranceprice not in", values, "insuranceprice");
            return (Criteria) this;
        }

        public Criteria andInsurancepriceBetween(Float value1, Float value2) {
            addCriterion("Insuranceprice between", value1, value2, "insuranceprice");
            return (Criteria) this;
        }

        public Criteria andInsurancepriceNotBetween(Float value1, Float value2) {
            addCriterion("Insuranceprice not between", value1, value2, "insuranceprice");
            return (Criteria) this;
        }

        public Criteria andClaimpriceIsNull() {
            addCriterion("claimprice is null");
            return (Criteria) this;
        }

        public Criteria andClaimpriceIsNotNull() {
            addCriterion("claimprice is not null");
            return (Criteria) this;
        }

        public Criteria andClaimpriceEqualTo(Float value) {
            addCriterion("claimprice =", value, "claimprice");
            return (Criteria) this;
        }

        public Criteria andClaimpriceNotEqualTo(Float value) {
            addCriterion("claimprice <>", value, "claimprice");
            return (Criteria) this;
        }

        public Criteria andClaimpriceGreaterThan(Float value) {
            addCriterion("claimprice >", value, "claimprice");
            return (Criteria) this;
        }

        public Criteria andClaimpriceGreaterThanOrEqualTo(Float value) {
            addCriterion("claimprice >=", value, "claimprice");
            return (Criteria) this;
        }

        public Criteria andClaimpriceLessThan(Float value) {
            addCriterion("claimprice <", value, "claimprice");
            return (Criteria) this;
        }

        public Criteria andClaimpriceLessThanOrEqualTo(Float value) {
            addCriterion("claimprice <=", value, "claimprice");
            return (Criteria) this;
        }

        public Criteria andClaimpriceIn(List<Float> values) {
            addCriterion("claimprice in", values, "claimprice");
            return (Criteria) this;
        }

        public Criteria andClaimpriceNotIn(List<Float> values) {
            addCriterion("claimprice not in", values, "claimprice");
            return (Criteria) this;
        }

        public Criteria andClaimpriceBetween(Float value1, Float value2) {
            addCriterion("claimprice between", value1, value2, "claimprice");
            return (Criteria) this;
        }

        public Criteria andClaimpriceNotBetween(Float value1, Float value2) {
            addCriterion("claimprice not between", value1, value2, "claimprice");
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