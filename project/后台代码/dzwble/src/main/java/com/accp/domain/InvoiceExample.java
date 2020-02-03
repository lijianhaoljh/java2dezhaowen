package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InvoiceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InvoiceExample() {
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

        public Criteria andInvidIsNull() {
            addCriterion("invid is null");
            return (Criteria) this;
        }

        public Criteria andInvidIsNotNull() {
            addCriterion("invid is not null");
            return (Criteria) this;
        }

        public Criteria andInvidEqualTo(String value) {
            addCriterion("invid =", value, "invid");
            return (Criteria) this;
        }

        public Criteria andInvidNotEqualTo(String value) {
            addCriterion("invid <>", value, "invid");
            return (Criteria) this;
        }

        public Criteria andInvidGreaterThan(String value) {
            addCriterion("invid >", value, "invid");
            return (Criteria) this;
        }

        public Criteria andInvidGreaterThanOrEqualTo(String value) {
            addCriterion("invid >=", value, "invid");
            return (Criteria) this;
        }

        public Criteria andInvidLessThan(String value) {
            addCriterion("invid <", value, "invid");
            return (Criteria) this;
        }

        public Criteria andInvidLessThanOrEqualTo(String value) {
            addCriterion("invid <=", value, "invid");
            return (Criteria) this;
        }

        public Criteria andInvidLike(String value) {
            addCriterion("invid like", value, "invid");
            return (Criteria) this;
        }

        public Criteria andInvidNotLike(String value) {
            addCriterion("invid not like", value, "invid");
            return (Criteria) this;
        }

        public Criteria andInvidIn(List<String> values) {
            addCriterion("invid in", values, "invid");
            return (Criteria) this;
        }

        public Criteria andInvidNotIn(List<String> values) {
            addCriterion("invid not in", values, "invid");
            return (Criteria) this;
        }

        public Criteria andInvidBetween(String value1, String value2) {
            addCriterion("invid between", value1, value2, "invid");
            return (Criteria) this;
        }

        public Criteria andInvidNotBetween(String value1, String value2) {
            addCriterion("invid not between", value1, value2, "invid");
            return (Criteria) this;
        }

        public Criteria andInvdateIsNull() {
            addCriterion("invdate is null");
            return (Criteria) this;
        }

        public Criteria andInvdateIsNotNull() {
            addCriterion("invdate is not null");
            return (Criteria) this;
        }

        public Criteria andInvdateEqualTo(Date value) {
            addCriterion("invdate =", value, "invdate");
            return (Criteria) this;
        }

        public Criteria andInvdateNotEqualTo(Date value) {
            addCriterion("invdate <>", value, "invdate");
            return (Criteria) this;
        }

        public Criteria andInvdateGreaterThan(Date value) {
            addCriterion("invdate >", value, "invdate");
            return (Criteria) this;
        }

        public Criteria andInvdateGreaterThanOrEqualTo(Date value) {
            addCriterion("invdate >=", value, "invdate");
            return (Criteria) this;
        }

        public Criteria andInvdateLessThan(Date value) {
            addCriterion("invdate <", value, "invdate");
            return (Criteria) this;
        }

        public Criteria andInvdateLessThanOrEqualTo(Date value) {
            addCriterion("invdate <=", value, "invdate");
            return (Criteria) this;
        }

        public Criteria andInvdateIn(List<Date> values) {
            addCriterion("invdate in", values, "invdate");
            return (Criteria) this;
        }

        public Criteria andInvdateNotIn(List<Date> values) {
            addCriterion("invdate not in", values, "invdate");
            return (Criteria) this;
        }

        public Criteria andInvdateBetween(Date value1, Date value2) {
            addCriterion("invdate between", value1, value2, "invdate");
            return (Criteria) this;
        }

        public Criteria andInvdateNotBetween(Date value1, Date value2) {
            addCriterion("invdate not between", value1, value2, "invdate");
            return (Criteria) this;
        }

        public Criteria andInvmoneyIsNull() {
            addCriterion("invmoney is null");
            return (Criteria) this;
        }

        public Criteria andInvmoneyIsNotNull() {
            addCriterion("invmoney is not null");
            return (Criteria) this;
        }

        public Criteria andInvmoneyEqualTo(Float value) {
            addCriterion("invmoney =", value, "invmoney");
            return (Criteria) this;
        }

        public Criteria andInvmoneyNotEqualTo(Float value) {
            addCriterion("invmoney <>", value, "invmoney");
            return (Criteria) this;
        }

        public Criteria andInvmoneyGreaterThan(Float value) {
            addCriterion("invmoney >", value, "invmoney");
            return (Criteria) this;
        }

        public Criteria andInvmoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("invmoney >=", value, "invmoney");
            return (Criteria) this;
        }

        public Criteria andInvmoneyLessThan(Float value) {
            addCriterion("invmoney <", value, "invmoney");
            return (Criteria) this;
        }

        public Criteria andInvmoneyLessThanOrEqualTo(Float value) {
            addCriterion("invmoney <=", value, "invmoney");
            return (Criteria) this;
        }

        public Criteria andInvmoneyIn(List<Float> values) {
            addCriterion("invmoney in", values, "invmoney");
            return (Criteria) this;
        }

        public Criteria andInvmoneyNotIn(List<Float> values) {
            addCriterion("invmoney not in", values, "invmoney");
            return (Criteria) this;
        }

        public Criteria andInvmoneyBetween(Float value1, Float value2) {
            addCriterion("invmoney between", value1, value2, "invmoney");
            return (Criteria) this;
        }

        public Criteria andInvmoneyNotBetween(Float value1, Float value2) {
            addCriterion("invmoney not between", value1, value2, "invmoney");
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