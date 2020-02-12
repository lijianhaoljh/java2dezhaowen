package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WorkExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WorkExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTidIsNull() {
            addCriterion("tid is null");
            return (Criteria) this;
        }

        public Criteria andTidIsNotNull() {
            addCriterion("tid is not null");
            return (Criteria) this;
        }

        public Criteria andTidEqualTo(Integer value) {
            addCriterion("tid =", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotEqualTo(Integer value) {
            addCriterion("tid <>", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThan(Integer value) {
            addCriterion("tid >", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThanOrEqualTo(Integer value) {
            addCriterion("tid >=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThan(Integer value) {
            addCriterion("tid <", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThanOrEqualTo(Integer value) {
            addCriterion("tid <=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidIn(List<Integer> values) {
            addCriterion("tid in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotIn(List<Integer> values) {
            addCriterion("tid not in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidBetween(Integer value1, Integer value2) {
            addCriterion("tid between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotBetween(Integer value1, Integer value2) {
            addCriterion("tid not between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andWinmorningIsNull() {
            addCriterion("winmorning is null");
            return (Criteria) this;
        }

        public Criteria andWinmorningIsNotNull() {
            addCriterion("winmorning is not null");
            return (Criteria) this;
        }

        public Criteria andWinmorningEqualTo(Integer value) {
            addCriterion("winmorning =", value, "winmorning");
            return (Criteria) this;
        }

        public Criteria andWinmorningNotEqualTo(Integer value) {
            addCriterion("winmorning <>", value, "winmorning");
            return (Criteria) this;
        }

        public Criteria andWinmorningGreaterThan(Integer value) {
            addCriterion("winmorning >", value, "winmorning");
            return (Criteria) this;
        }

        public Criteria andWinmorningGreaterThanOrEqualTo(Integer value) {
            addCriterion("winmorning >=", value, "winmorning");
            return (Criteria) this;
        }

        public Criteria andWinmorningLessThan(Integer value) {
            addCriterion("winmorning <", value, "winmorning");
            return (Criteria) this;
        }

        public Criteria andWinmorningLessThanOrEqualTo(Integer value) {
            addCriterion("winmorning <=", value, "winmorning");
            return (Criteria) this;
        }

        public Criteria andWinmorningIn(List<Integer> values) {
            addCriterion("winmorning in", values, "winmorning");
            return (Criteria) this;
        }

        public Criteria andWinmorningNotIn(List<Integer> values) {
            addCriterion("winmorning not in", values, "winmorning");
            return (Criteria) this;
        }

        public Criteria andWinmorningBetween(Integer value1, Integer value2) {
            addCriterion("winmorning between", value1, value2, "winmorning");
            return (Criteria) this;
        }

        public Criteria andWinmorningNotBetween(Integer value1, Integer value2) {
            addCriterion("winmorning not between", value1, value2, "winmorning");
            return (Criteria) this;
        }

        public Criteria andWinnightIsNull() {
            addCriterion("winnight is null");
            return (Criteria) this;
        }

        public Criteria andWinnightIsNotNull() {
            addCriterion("winnight is not null");
            return (Criteria) this;
        }

        public Criteria andWinnightEqualTo(Integer value) {
            addCriterion("winnight =", value, "winnight");
            return (Criteria) this;
        }

        public Criteria andWinnightNotEqualTo(Integer value) {
            addCriterion("winnight <>", value, "winnight");
            return (Criteria) this;
        }

        public Criteria andWinnightGreaterThan(Integer value) {
            addCriterion("winnight >", value, "winnight");
            return (Criteria) this;
        }

        public Criteria andWinnightGreaterThanOrEqualTo(Integer value) {
            addCriterion("winnight >=", value, "winnight");
            return (Criteria) this;
        }

        public Criteria andWinnightLessThan(Integer value) {
            addCriterion("winnight <", value, "winnight");
            return (Criteria) this;
        }

        public Criteria andWinnightLessThanOrEqualTo(Integer value) {
            addCriterion("winnight <=", value, "winnight");
            return (Criteria) this;
        }

        public Criteria andWinnightIn(List<Integer> values) {
            addCriterion("winnight in", values, "winnight");
            return (Criteria) this;
        }

        public Criteria andWinnightNotIn(List<Integer> values) {
            addCriterion("winnight not in", values, "winnight");
            return (Criteria) this;
        }

        public Criteria andWinnightBetween(Integer value1, Integer value2) {
            addCriterion("winnight between", value1, value2, "winnight");
            return (Criteria) this;
        }

        public Criteria andWinnightNotBetween(Integer value1, Integer value2) {
            addCriterion("winnight not between", value1, value2, "winnight");
            return (Criteria) this;
        }

        public Criteria andWoutmoningIsNull() {
            addCriterion("woutmoning is null");
            return (Criteria) this;
        }

        public Criteria andWoutmoningIsNotNull() {
            addCriterion("woutmoning is not null");
            return (Criteria) this;
        }

        public Criteria andWoutmoningEqualTo(Integer value) {
            addCriterion("woutmoning =", value, "woutmoning");
            return (Criteria) this;
        }

        public Criteria andWoutmoningNotEqualTo(Integer value) {
            addCriterion("woutmoning <>", value, "woutmoning");
            return (Criteria) this;
        }

        public Criteria andWoutmoningGreaterThan(Integer value) {
            addCriterion("woutmoning >", value, "woutmoning");
            return (Criteria) this;
        }

        public Criteria andWoutmoningGreaterThanOrEqualTo(Integer value) {
            addCriterion("woutmoning >=", value, "woutmoning");
            return (Criteria) this;
        }

        public Criteria andWoutmoningLessThan(Integer value) {
            addCriterion("woutmoning <", value, "woutmoning");
            return (Criteria) this;
        }

        public Criteria andWoutmoningLessThanOrEqualTo(Integer value) {
            addCriterion("woutmoning <=", value, "woutmoning");
            return (Criteria) this;
        }

        public Criteria andWoutmoningIn(List<Integer> values) {
            addCriterion("woutmoning in", values, "woutmoning");
            return (Criteria) this;
        }

        public Criteria andWoutmoningNotIn(List<Integer> values) {
            addCriterion("woutmoning not in", values, "woutmoning");
            return (Criteria) this;
        }

        public Criteria andWoutmoningBetween(Integer value1, Integer value2) {
            addCriterion("woutmoning between", value1, value2, "woutmoning");
            return (Criteria) this;
        }

        public Criteria andWoutmoningNotBetween(Integer value1, Integer value2) {
            addCriterion("woutmoning not between", value1, value2, "woutmoning");
            return (Criteria) this;
        }

        public Criteria andWoutnightIsNull() {
            addCriterion("woutnight is null");
            return (Criteria) this;
        }

        public Criteria andWoutnightIsNotNull() {
            addCriterion("woutnight is not null");
            return (Criteria) this;
        }

        public Criteria andWoutnightEqualTo(Integer value) {
            addCriterion("woutnight =", value, "woutnight");
            return (Criteria) this;
        }

        public Criteria andWoutnightNotEqualTo(Integer value) {
            addCriterion("woutnight <>", value, "woutnight");
            return (Criteria) this;
        }

        public Criteria andWoutnightGreaterThan(Integer value) {
            addCriterion("woutnight >", value, "woutnight");
            return (Criteria) this;
        }

        public Criteria andWoutnightGreaterThanOrEqualTo(Integer value) {
            addCriterion("woutnight >=", value, "woutnight");
            return (Criteria) this;
        }

        public Criteria andWoutnightLessThan(Integer value) {
            addCriterion("woutnight <", value, "woutnight");
            return (Criteria) this;
        }

        public Criteria andWoutnightLessThanOrEqualTo(Integer value) {
            addCriterion("woutnight <=", value, "woutnight");
            return (Criteria) this;
        }

        public Criteria andWoutnightIn(List<Integer> values) {
            addCriterion("woutnight in", values, "woutnight");
            return (Criteria) this;
        }

        public Criteria andWoutnightNotIn(List<Integer> values) {
            addCriterion("woutnight not in", values, "woutnight");
            return (Criteria) this;
        }

        public Criteria andWoutnightBetween(Integer value1, Integer value2) {
            addCriterion("woutnight between", value1, value2, "woutnight");
            return (Criteria) this;
        }

        public Criteria andWoutnightNotBetween(Integer value1, Integer value2) {
            addCriterion("woutnight not between", value1, value2, "woutnight");
            return (Criteria) this;
        }

        public Criteria andWdateIsNull() {
            addCriterion("wdate is null");
            return (Criteria) this;
        }

        public Criteria andWdateIsNotNull() {
            addCriterion("wdate is not null");
            return (Criteria) this;
        }

        public Criteria andWdateEqualTo(Date value) {
            addCriterion("wdate =", value, "wdate");
            return (Criteria) this;
        }

        public Criteria andWdateNotEqualTo(Date value) {
            addCriterion("wdate <>", value, "wdate");
            return (Criteria) this;
        }

        public Criteria andWdateGreaterThan(Date value) {
            addCriterion("wdate >", value, "wdate");
            return (Criteria) this;
        }

        public Criteria andWdateGreaterThanOrEqualTo(Date value) {
            addCriterion("wdate >=", value, "wdate");
            return (Criteria) this;
        }

        public Criteria andWdateLessThan(Date value) {
            addCriterion("wdate <", value, "wdate");
            return (Criteria) this;
        }

        public Criteria andWdateLessThanOrEqualTo(Date value) {
            addCriterion("wdate <=", value, "wdate");
            return (Criteria) this;
        }

        public Criteria andWdateIn(List<Date> values) {
            addCriterion("wdate in", values, "wdate");
            return (Criteria) this;
        }

        public Criteria andWdateNotIn(List<Date> values) {
            addCriterion("wdate not in", values, "wdate");
            return (Criteria) this;
        }

        public Criteria andWdateBetween(Date value1, Date value2) {
            addCriterion("wdate between", value1, value2, "wdate");
            return (Criteria) this;
        }

        public Criteria andWdateNotBetween(Date value1, Date value2) {
            addCriterion("wdate not between", value1, value2, "wdate");
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