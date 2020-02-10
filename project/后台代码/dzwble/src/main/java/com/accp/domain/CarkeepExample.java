package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CarkeepExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CarkeepExample() {
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

        public Criteria andCkidIsNull() {
            addCriterion("ckid is null");
            return (Criteria) this;
        }

        public Criteria andCkidIsNotNull() {
            addCriterion("ckid is not null");
            return (Criteria) this;
        }

        public Criteria andCkidEqualTo(Integer value) {
            addCriterion("ckid =", value, "ckid");
            return (Criteria) this;
        }

        public Criteria andCkidNotEqualTo(Integer value) {
            addCriterion("ckid <>", value, "ckid");
            return (Criteria) this;
        }

        public Criteria andCkidGreaterThan(Integer value) {
            addCriterion("ckid >", value, "ckid");
            return (Criteria) this;
        }

        public Criteria andCkidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ckid >=", value, "ckid");
            return (Criteria) this;
        }

        public Criteria andCkidLessThan(Integer value) {
            addCriterion("ckid <", value, "ckid");
            return (Criteria) this;
        }

        public Criteria andCkidLessThanOrEqualTo(Integer value) {
            addCriterion("ckid <=", value, "ckid");
            return (Criteria) this;
        }

        public Criteria andCkidIn(List<Integer> values) {
            addCriterion("ckid in", values, "ckid");
            return (Criteria) this;
        }

        public Criteria andCkidNotIn(List<Integer> values) {
            addCriterion("ckid not in", values, "ckid");
            return (Criteria) this;
        }

        public Criteria andCkidBetween(Integer value1, Integer value2) {
            addCriterion("ckid between", value1, value2, "ckid");
            return (Criteria) this;
        }

        public Criteria andCkidNotBetween(Integer value1, Integer value2) {
            addCriterion("ckid not between", value1, value2, "ckid");
            return (Criteria) this;
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

        public Criteria andPlandateIsNull() {
            addCriterion("plandate is null");
            return (Criteria) this;
        }

        public Criteria andPlandateIsNotNull() {
            addCriterion("plandate is not null");
            return (Criteria) this;
        }

        public Criteria andPlandateEqualTo(Date value) {
            addCriterion("plandate =", value, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateNotEqualTo(Date value) {
            addCriterion("plandate <>", value, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateGreaterThan(Date value) {
            addCriterion("plandate >", value, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateGreaterThanOrEqualTo(Date value) {
            addCriterion("plandate >=", value, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateLessThan(Date value) {
            addCriterion("plandate <", value, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateLessThanOrEqualTo(Date value) {
            addCriterion("plandate <=", value, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateIn(List<Date> values) {
            addCriterion("plandate in", values, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateNotIn(List<Date> values) {
            addCriterion("plandate not in", values, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateBetween(Date value1, Date value2) {
            addCriterion("plandate between", value1, value2, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateNotBetween(Date value1, Date value2) {
            addCriterion("plandate not between", value1, value2, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlanmillageIsNull() {
            addCriterion("planmillage is null");
            return (Criteria) this;
        }

        public Criteria andPlanmillageIsNotNull() {
            addCriterion("planmillage is not null");
            return (Criteria) this;
        }

        public Criteria andPlanmillageEqualTo(Integer value) {
            addCriterion("planmillage =", value, "planmillage");
            return (Criteria) this;
        }

        public Criteria andPlanmillageNotEqualTo(Integer value) {
            addCriterion("planmillage <>", value, "planmillage");
            return (Criteria) this;
        }

        public Criteria andPlanmillageGreaterThan(Integer value) {
            addCriterion("planmillage >", value, "planmillage");
            return (Criteria) this;
        }

        public Criteria andPlanmillageGreaterThanOrEqualTo(Integer value) {
            addCriterion("planmillage >=", value, "planmillage");
            return (Criteria) this;
        }

        public Criteria andPlanmillageLessThan(Integer value) {
            addCriterion("planmillage <", value, "planmillage");
            return (Criteria) this;
        }

        public Criteria andPlanmillageLessThanOrEqualTo(Integer value) {
            addCriterion("planmillage <=", value, "planmillage");
            return (Criteria) this;
        }

        public Criteria andPlanmillageIn(List<Integer> values) {
            addCriterion("planmillage in", values, "planmillage");
            return (Criteria) this;
        }

        public Criteria andPlanmillageNotIn(List<Integer> values) {
            addCriterion("planmillage not in", values, "planmillage");
            return (Criteria) this;
        }

        public Criteria andPlanmillageBetween(Integer value1, Integer value2) {
            addCriterion("planmillage between", value1, value2, "planmillage");
            return (Criteria) this;
        }

        public Criteria andPlanmillageNotBetween(Integer value1, Integer value2) {
            addCriterion("planmillage not between", value1, value2, "planmillage");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCknameIsNull() {
            addCriterion("ckname is null");
            return (Criteria) this;
        }

        public Criteria andCknameIsNotNull() {
            addCriterion("ckname is not null");
            return (Criteria) this;
        }

        public Criteria andCknameEqualTo(String value) {
            addCriterion("ckname =", value, "ckname");
            return (Criteria) this;
        }

        public Criteria andCknameNotEqualTo(String value) {
            addCriterion("ckname <>", value, "ckname");
            return (Criteria) this;
        }

        public Criteria andCknameGreaterThan(String value) {
            addCriterion("ckname >", value, "ckname");
            return (Criteria) this;
        }

        public Criteria andCknameGreaterThanOrEqualTo(String value) {
            addCriterion("ckname >=", value, "ckname");
            return (Criteria) this;
        }

        public Criteria andCknameLessThan(String value) {
            addCriterion("ckname <", value, "ckname");
            return (Criteria) this;
        }

        public Criteria andCknameLessThanOrEqualTo(String value) {
            addCriterion("ckname <=", value, "ckname");
            return (Criteria) this;
        }

        public Criteria andCknameLike(String value) {
            addCriterion("ckname like", value, "ckname");
            return (Criteria) this;
        }

        public Criteria andCknameNotLike(String value) {
            addCriterion("ckname not like", value, "ckname");
            return (Criteria) this;
        }

        public Criteria andCknameIn(List<String> values) {
            addCriterion("ckname in", values, "ckname");
            return (Criteria) this;
        }

        public Criteria andCknameNotIn(List<String> values) {
            addCriterion("ckname not in", values, "ckname");
            return (Criteria) this;
        }

        public Criteria andCknameBetween(String value1, String value2) {
            addCriterion("ckname between", value1, value2, "ckname");
            return (Criteria) this;
        }

        public Criteria andCknameNotBetween(String value1, String value2) {
            addCriterion("ckname not between", value1, value2, "ckname");
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