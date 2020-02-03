package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class CustomerTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomerTypeExample() {
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

        public Criteria andCtnoIsNull() {
            addCriterion("ctno is null");
            return (Criteria) this;
        }

        public Criteria andCtnoIsNotNull() {
            addCriterion("ctno is not null");
            return (Criteria) this;
        }

        public Criteria andCtnoEqualTo(String value) {
            addCriterion("ctno =", value, "ctno");
            return (Criteria) this;
        }

        public Criteria andCtnoNotEqualTo(String value) {
            addCriterion("ctno <>", value, "ctno");
            return (Criteria) this;
        }

        public Criteria andCtnoGreaterThan(String value) {
            addCriterion("ctno >", value, "ctno");
            return (Criteria) this;
        }

        public Criteria andCtnoGreaterThanOrEqualTo(String value) {
            addCriterion("ctno >=", value, "ctno");
            return (Criteria) this;
        }

        public Criteria andCtnoLessThan(String value) {
            addCriterion("ctno <", value, "ctno");
            return (Criteria) this;
        }

        public Criteria andCtnoLessThanOrEqualTo(String value) {
            addCriterion("ctno <=", value, "ctno");
            return (Criteria) this;
        }

        public Criteria andCtnoLike(String value) {
            addCriterion("ctno like", value, "ctno");
            return (Criteria) this;
        }

        public Criteria andCtnoNotLike(String value) {
            addCriterion("ctno not like", value, "ctno");
            return (Criteria) this;
        }

        public Criteria andCtnoIn(List<String> values) {
            addCriterion("ctno in", values, "ctno");
            return (Criteria) this;
        }

        public Criteria andCtnoNotIn(List<String> values) {
            addCriterion("ctno not in", values, "ctno");
            return (Criteria) this;
        }

        public Criteria andCtnoBetween(String value1, String value2) {
            addCriterion("ctno between", value1, value2, "ctno");
            return (Criteria) this;
        }

        public Criteria andCtnoNotBetween(String value1, String value2) {
            addCriterion("ctno not between", value1, value2, "ctno");
            return (Criteria) this;
        }

        public Criteria andCtnameIsNull() {
            addCriterion("ctname is null");
            return (Criteria) this;
        }

        public Criteria andCtnameIsNotNull() {
            addCriterion("ctname is not null");
            return (Criteria) this;
        }

        public Criteria andCtnameEqualTo(String value) {
            addCriterion("ctname =", value, "ctname");
            return (Criteria) this;
        }

        public Criteria andCtnameNotEqualTo(String value) {
            addCriterion("ctname <>", value, "ctname");
            return (Criteria) this;
        }

        public Criteria andCtnameGreaterThan(String value) {
            addCriterion("ctname >", value, "ctname");
            return (Criteria) this;
        }

        public Criteria andCtnameGreaterThanOrEqualTo(String value) {
            addCriterion("ctname >=", value, "ctname");
            return (Criteria) this;
        }

        public Criteria andCtnameLessThan(String value) {
            addCriterion("ctname <", value, "ctname");
            return (Criteria) this;
        }

        public Criteria andCtnameLessThanOrEqualTo(String value) {
            addCriterion("ctname <=", value, "ctname");
            return (Criteria) this;
        }

        public Criteria andCtnameLike(String value) {
            addCriterion("ctname like", value, "ctname");
            return (Criteria) this;
        }

        public Criteria andCtnameNotLike(String value) {
            addCriterion("ctname not like", value, "ctname");
            return (Criteria) this;
        }

        public Criteria andCtnameIn(List<String> values) {
            addCriterion("ctname in", values, "ctname");
            return (Criteria) this;
        }

        public Criteria andCtnameNotIn(List<String> values) {
            addCriterion("ctname not in", values, "ctname");
            return (Criteria) this;
        }

        public Criteria andCtnameBetween(String value1, String value2) {
            addCriterion("ctname between", value1, value2, "ctname");
            return (Criteria) this;
        }

        public Criteria andCtnameNotBetween(String value1, String value2) {
            addCriterion("ctname not between", value1, value2, "ctname");
            return (Criteria) this;
        }

        public Criteria andPtidIsNull() {
            addCriterion("ptid is null");
            return (Criteria) this;
        }

        public Criteria andPtidIsNotNull() {
            addCriterion("ptid is not null");
            return (Criteria) this;
        }

        public Criteria andPtidEqualTo(Integer value) {
            addCriterion("ptid =", value, "ptid");
            return (Criteria) this;
        }

        public Criteria andPtidNotEqualTo(Integer value) {
            addCriterion("ptid <>", value, "ptid");
            return (Criteria) this;
        }

        public Criteria andPtidGreaterThan(Integer value) {
            addCriterion("ptid >", value, "ptid");
            return (Criteria) this;
        }

        public Criteria andPtidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ptid >=", value, "ptid");
            return (Criteria) this;
        }

        public Criteria andPtidLessThan(Integer value) {
            addCriterion("ptid <", value, "ptid");
            return (Criteria) this;
        }

        public Criteria andPtidLessThanOrEqualTo(Integer value) {
            addCriterion("ptid <=", value, "ptid");
            return (Criteria) this;
        }

        public Criteria andPtidIn(List<Integer> values) {
            addCriterion("ptid in", values, "ptid");
            return (Criteria) this;
        }

        public Criteria andPtidNotIn(List<Integer> values) {
            addCriterion("ptid not in", values, "ptid");
            return (Criteria) this;
        }

        public Criteria andPtidBetween(Integer value1, Integer value2) {
            addCriterion("ptid between", value1, value2, "ptid");
            return (Criteria) this;
        }

        public Criteria andPtidNotBetween(Integer value1, Integer value2) {
            addCriterion("ptid not between", value1, value2, "ptid");
            return (Criteria) this;
        }

        public Criteria andCteffectiveIsNull() {
            addCriterion("cteffective is null");
            return (Criteria) this;
        }

        public Criteria andCteffectiveIsNotNull() {
            addCriterion("cteffective is not null");
            return (Criteria) this;
        }

        public Criteria andCteffectiveEqualTo(Integer value) {
            addCriterion("cteffective =", value, "cteffective");
            return (Criteria) this;
        }

        public Criteria andCteffectiveNotEqualTo(Integer value) {
            addCriterion("cteffective <>", value, "cteffective");
            return (Criteria) this;
        }

        public Criteria andCteffectiveGreaterThan(Integer value) {
            addCriterion("cteffective >", value, "cteffective");
            return (Criteria) this;
        }

        public Criteria andCteffectiveGreaterThanOrEqualTo(Integer value) {
            addCriterion("cteffective >=", value, "cteffective");
            return (Criteria) this;
        }

        public Criteria andCteffectiveLessThan(Integer value) {
            addCriterion("cteffective <", value, "cteffective");
            return (Criteria) this;
        }

        public Criteria andCteffectiveLessThanOrEqualTo(Integer value) {
            addCriterion("cteffective <=", value, "cteffective");
            return (Criteria) this;
        }

        public Criteria andCteffectiveIn(List<Integer> values) {
            addCriterion("cteffective in", values, "cteffective");
            return (Criteria) this;
        }

        public Criteria andCteffectiveNotIn(List<Integer> values) {
            addCriterion("cteffective not in", values, "cteffective");
            return (Criteria) this;
        }

        public Criteria andCteffectiveBetween(Integer value1, Integer value2) {
            addCriterion("cteffective between", value1, value2, "cteffective");
            return (Criteria) this;
        }

        public Criteria andCteffectiveNotBetween(Integer value1, Integer value2) {
            addCriterion("cteffective not between", value1, value2, "cteffective");
            return (Criteria) this;
        }

        public Criteria andCtisvipIsNull() {
            addCriterion("ctisvip is null");
            return (Criteria) this;
        }

        public Criteria andCtisvipIsNotNull() {
            addCriterion("ctisvip is not null");
            return (Criteria) this;
        }

        public Criteria andCtisvipEqualTo(Integer value) {
            addCriterion("ctisvip =", value, "ctisvip");
            return (Criteria) this;
        }

        public Criteria andCtisvipNotEqualTo(Integer value) {
            addCriterion("ctisvip <>", value, "ctisvip");
            return (Criteria) this;
        }

        public Criteria andCtisvipGreaterThan(Integer value) {
            addCriterion("ctisvip >", value, "ctisvip");
            return (Criteria) this;
        }

        public Criteria andCtisvipGreaterThanOrEqualTo(Integer value) {
            addCriterion("ctisvip >=", value, "ctisvip");
            return (Criteria) this;
        }

        public Criteria andCtisvipLessThan(Integer value) {
            addCriterion("ctisvip <", value, "ctisvip");
            return (Criteria) this;
        }

        public Criteria andCtisvipLessThanOrEqualTo(Integer value) {
            addCriterion("ctisvip <=", value, "ctisvip");
            return (Criteria) this;
        }

        public Criteria andCtisvipIn(List<Integer> values) {
            addCriterion("ctisvip in", values, "ctisvip");
            return (Criteria) this;
        }

        public Criteria andCtisvipNotIn(List<Integer> values) {
            addCriterion("ctisvip not in", values, "ctisvip");
            return (Criteria) this;
        }

        public Criteria andCtisvipBetween(Integer value1, Integer value2) {
            addCriterion("ctisvip between", value1, value2, "ctisvip");
            return (Criteria) this;
        }

        public Criteria andCtisvipNotBetween(Integer value1, Integer value2) {
            addCriterion("ctisvip not between", value1, value2, "ctisvip");
            return (Criteria) this;
        }

        public Criteria andCtpriceIsNull() {
            addCriterion("ctprice is null");
            return (Criteria) this;
        }

        public Criteria andCtpriceIsNotNull() {
            addCriterion("ctprice is not null");
            return (Criteria) this;
        }

        public Criteria andCtpriceEqualTo(Float value) {
            addCriterion("ctprice =", value, "ctprice");
            return (Criteria) this;
        }

        public Criteria andCtpriceNotEqualTo(Float value) {
            addCriterion("ctprice <>", value, "ctprice");
            return (Criteria) this;
        }

        public Criteria andCtpriceGreaterThan(Float value) {
            addCriterion("ctprice >", value, "ctprice");
            return (Criteria) this;
        }

        public Criteria andCtpriceGreaterThanOrEqualTo(Float value) {
            addCriterion("ctprice >=", value, "ctprice");
            return (Criteria) this;
        }

        public Criteria andCtpriceLessThan(Float value) {
            addCriterion("ctprice <", value, "ctprice");
            return (Criteria) this;
        }

        public Criteria andCtpriceLessThanOrEqualTo(Float value) {
            addCriterion("ctprice <=", value, "ctprice");
            return (Criteria) this;
        }

        public Criteria andCtpriceIn(List<Float> values) {
            addCriterion("ctprice in", values, "ctprice");
            return (Criteria) this;
        }

        public Criteria andCtpriceNotIn(List<Float> values) {
            addCriterion("ctprice not in", values, "ctprice");
            return (Criteria) this;
        }

        public Criteria andCtpriceBetween(Float value1, Float value2) {
            addCriterion("ctprice between", value1, value2, "ctprice");
            return (Criteria) this;
        }

        public Criteria andCtpriceNotBetween(Float value1, Float value2) {
            addCriterion("ctprice not between", value1, value2, "ctprice");
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