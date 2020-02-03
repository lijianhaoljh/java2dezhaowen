package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VipExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VipExample() {
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

        public Criteria andVnoIsNull() {
            addCriterion("vno is null");
            return (Criteria) this;
        }

        public Criteria andVnoIsNotNull() {
            addCriterion("vno is not null");
            return (Criteria) this;
        }

        public Criteria andVnoEqualTo(String value) {
            addCriterion("vno =", value, "vno");
            return (Criteria) this;
        }

        public Criteria andVnoNotEqualTo(String value) {
            addCriterion("vno <>", value, "vno");
            return (Criteria) this;
        }

        public Criteria andVnoGreaterThan(String value) {
            addCriterion("vno >", value, "vno");
            return (Criteria) this;
        }

        public Criteria andVnoGreaterThanOrEqualTo(String value) {
            addCriterion("vno >=", value, "vno");
            return (Criteria) this;
        }

        public Criteria andVnoLessThan(String value) {
            addCriterion("vno <", value, "vno");
            return (Criteria) this;
        }

        public Criteria andVnoLessThanOrEqualTo(String value) {
            addCriterion("vno <=", value, "vno");
            return (Criteria) this;
        }

        public Criteria andVnoLike(String value) {
            addCriterion("vno like", value, "vno");
            return (Criteria) this;
        }

        public Criteria andVnoNotLike(String value) {
            addCriterion("vno not like", value, "vno");
            return (Criteria) this;
        }

        public Criteria andVnoIn(List<String> values) {
            addCriterion("vno in", values, "vno");
            return (Criteria) this;
        }

        public Criteria andVnoNotIn(List<String> values) {
            addCriterion("vno not in", values, "vno");
            return (Criteria) this;
        }

        public Criteria andVnoBetween(String value1, String value2) {
            addCriterion("vno between", value1, value2, "vno");
            return (Criteria) this;
        }

        public Criteria andVnoNotBetween(String value1, String value2) {
            addCriterion("vno not between", value1, value2, "vno");
            return (Criteria) this;
        }

        public Criteria andVjoindateIsNull() {
            addCriterion("vjoindate is null");
            return (Criteria) this;
        }

        public Criteria andVjoindateIsNotNull() {
            addCriterion("vjoindate is not null");
            return (Criteria) this;
        }

        public Criteria andVjoindateEqualTo(Date value) {
            addCriterion("vjoindate =", value, "vjoindate");
            return (Criteria) this;
        }

        public Criteria andVjoindateNotEqualTo(Date value) {
            addCriterion("vjoindate <>", value, "vjoindate");
            return (Criteria) this;
        }

        public Criteria andVjoindateGreaterThan(Date value) {
            addCriterion("vjoindate >", value, "vjoindate");
            return (Criteria) this;
        }

        public Criteria andVjoindateGreaterThanOrEqualTo(Date value) {
            addCriterion("vjoindate >=", value, "vjoindate");
            return (Criteria) this;
        }

        public Criteria andVjoindateLessThan(Date value) {
            addCriterion("vjoindate <", value, "vjoindate");
            return (Criteria) this;
        }

        public Criteria andVjoindateLessThanOrEqualTo(Date value) {
            addCriterion("vjoindate <=", value, "vjoindate");
            return (Criteria) this;
        }

        public Criteria andVjoindateIn(List<Date> values) {
            addCriterion("vjoindate in", values, "vjoindate");
            return (Criteria) this;
        }

        public Criteria andVjoindateNotIn(List<Date> values) {
            addCriterion("vjoindate not in", values, "vjoindate");
            return (Criteria) this;
        }

        public Criteria andVjoindateBetween(Date value1, Date value2) {
            addCriterion("vjoindate between", value1, value2, "vjoindate");
            return (Criteria) this;
        }

        public Criteria andVjoindateNotBetween(Date value1, Date value2) {
            addCriterion("vjoindate not between", value1, value2, "vjoindate");
            return (Criteria) this;
        }

        public Criteria andVenddateIsNull() {
            addCriterion("venddate is null");
            return (Criteria) this;
        }

        public Criteria andVenddateIsNotNull() {
            addCriterion("venddate is not null");
            return (Criteria) this;
        }

        public Criteria andVenddateEqualTo(Date value) {
            addCriterion("venddate =", value, "venddate");
            return (Criteria) this;
        }

        public Criteria andVenddateNotEqualTo(Date value) {
            addCriterion("venddate <>", value, "venddate");
            return (Criteria) this;
        }

        public Criteria andVenddateGreaterThan(Date value) {
            addCriterion("venddate >", value, "venddate");
            return (Criteria) this;
        }

        public Criteria andVenddateGreaterThanOrEqualTo(Date value) {
            addCriterion("venddate >=", value, "venddate");
            return (Criteria) this;
        }

        public Criteria andVenddateLessThan(Date value) {
            addCriterion("venddate <", value, "venddate");
            return (Criteria) this;
        }

        public Criteria andVenddateLessThanOrEqualTo(Date value) {
            addCriterion("venddate <=", value, "venddate");
            return (Criteria) this;
        }

        public Criteria andVenddateIn(List<Date> values) {
            addCriterion("venddate in", values, "venddate");
            return (Criteria) this;
        }

        public Criteria andVenddateNotIn(List<Date> values) {
            addCriterion("venddate not in", values, "venddate");
            return (Criteria) this;
        }

        public Criteria andVenddateBetween(Date value1, Date value2) {
            addCriterion("venddate between", value1, value2, "venddate");
            return (Criteria) this;
        }

        public Criteria andVenddateNotBetween(Date value1, Date value2) {
            addCriterion("venddate not between", value1, value2, "venddate");
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

        public Criteria andVlidIsNull() {
            addCriterion("vlid is null");
            return (Criteria) this;
        }

        public Criteria andVlidIsNotNull() {
            addCriterion("vlid is not null");
            return (Criteria) this;
        }

        public Criteria andVlidEqualTo(Integer value) {
            addCriterion("vlid =", value, "vlid");
            return (Criteria) this;
        }

        public Criteria andVlidNotEqualTo(Integer value) {
            addCriterion("vlid <>", value, "vlid");
            return (Criteria) this;
        }

        public Criteria andVlidGreaterThan(Integer value) {
            addCriterion("vlid >", value, "vlid");
            return (Criteria) this;
        }

        public Criteria andVlidGreaterThanOrEqualTo(Integer value) {
            addCriterion("vlid >=", value, "vlid");
            return (Criteria) this;
        }

        public Criteria andVlidLessThan(Integer value) {
            addCriterion("vlid <", value, "vlid");
            return (Criteria) this;
        }

        public Criteria andVlidLessThanOrEqualTo(Integer value) {
            addCriterion("vlid <=", value, "vlid");
            return (Criteria) this;
        }

        public Criteria andVlidIn(List<Integer> values) {
            addCriterion("vlid in", values, "vlid");
            return (Criteria) this;
        }

        public Criteria andVlidNotIn(List<Integer> values) {
            addCriterion("vlid not in", values, "vlid");
            return (Criteria) this;
        }

        public Criteria andVlidBetween(Integer value1, Integer value2) {
            addCriterion("vlid between", value1, value2, "vlid");
            return (Criteria) this;
        }

        public Criteria andVlidNotBetween(Integer value1, Integer value2) {
            addCriterion("vlid not between", value1, value2, "vlid");
            return (Criteria) this;
        }

        public Criteria andCurrentjifenIsNull() {
            addCriterion("currentjifen is null");
            return (Criteria) this;
        }

        public Criteria andCurrentjifenIsNotNull() {
            addCriterion("currentjifen is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentjifenEqualTo(Integer value) {
            addCriterion("currentjifen =", value, "currentjifen");
            return (Criteria) this;
        }

        public Criteria andCurrentjifenNotEqualTo(Integer value) {
            addCriterion("currentjifen <>", value, "currentjifen");
            return (Criteria) this;
        }

        public Criteria andCurrentjifenGreaterThan(Integer value) {
            addCriterion("currentjifen >", value, "currentjifen");
            return (Criteria) this;
        }

        public Criteria andCurrentjifenGreaterThanOrEqualTo(Integer value) {
            addCriterion("currentjifen >=", value, "currentjifen");
            return (Criteria) this;
        }

        public Criteria andCurrentjifenLessThan(Integer value) {
            addCriterion("currentjifen <", value, "currentjifen");
            return (Criteria) this;
        }

        public Criteria andCurrentjifenLessThanOrEqualTo(Integer value) {
            addCriterion("currentjifen <=", value, "currentjifen");
            return (Criteria) this;
        }

        public Criteria andCurrentjifenIn(List<Integer> values) {
            addCriterion("currentjifen in", values, "currentjifen");
            return (Criteria) this;
        }

        public Criteria andCurrentjifenNotIn(List<Integer> values) {
            addCriterion("currentjifen not in", values, "currentjifen");
            return (Criteria) this;
        }

        public Criteria andCurrentjifenBetween(Integer value1, Integer value2) {
            addCriterion("currentjifen between", value1, value2, "currentjifen");
            return (Criteria) this;
        }

        public Criteria andCurrentjifenNotBetween(Integer value1, Integer value2) {
            addCriterion("currentjifen not between", value1, value2, "currentjifen");
            return (Criteria) this;
        }

        public Criteria andSummoneyIsNull() {
            addCriterion("sumMoney is null");
            return (Criteria) this;
        }

        public Criteria andSummoneyIsNotNull() {
            addCriterion("sumMoney is not null");
            return (Criteria) this;
        }

        public Criteria andSummoneyEqualTo(Float value) {
            addCriterion("sumMoney =", value, "summoney");
            return (Criteria) this;
        }

        public Criteria andSummoneyNotEqualTo(Float value) {
            addCriterion("sumMoney <>", value, "summoney");
            return (Criteria) this;
        }

        public Criteria andSummoneyGreaterThan(Float value) {
            addCriterion("sumMoney >", value, "summoney");
            return (Criteria) this;
        }

        public Criteria andSummoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("sumMoney >=", value, "summoney");
            return (Criteria) this;
        }

        public Criteria andSummoneyLessThan(Float value) {
            addCriterion("sumMoney <", value, "summoney");
            return (Criteria) this;
        }

        public Criteria andSummoneyLessThanOrEqualTo(Float value) {
            addCriterion("sumMoney <=", value, "summoney");
            return (Criteria) this;
        }

        public Criteria andSummoneyIn(List<Float> values) {
            addCriterion("sumMoney in", values, "summoney");
            return (Criteria) this;
        }

        public Criteria andSummoneyNotIn(List<Float> values) {
            addCriterion("sumMoney not in", values, "summoney");
            return (Criteria) this;
        }

        public Criteria andSummoneyBetween(Float value1, Float value2) {
            addCriterion("sumMoney between", value1, value2, "summoney");
            return (Criteria) this;
        }

        public Criteria andSummoneyNotBetween(Float value1, Float value2) {
            addCriterion("sumMoney not between", value1, value2, "summoney");
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