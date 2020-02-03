package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class InvoiceTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InvoiceTypeExample() {
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

        public Criteria andItidIsNull() {
            addCriterion("itid is null");
            return (Criteria) this;
        }

        public Criteria andItidIsNotNull() {
            addCriterion("itid is not null");
            return (Criteria) this;
        }

        public Criteria andItidEqualTo(Integer value) {
            addCriterion("itid =", value, "itid");
            return (Criteria) this;
        }

        public Criteria andItidNotEqualTo(Integer value) {
            addCriterion("itid <>", value, "itid");
            return (Criteria) this;
        }

        public Criteria andItidGreaterThan(Integer value) {
            addCriterion("itid >", value, "itid");
            return (Criteria) this;
        }

        public Criteria andItidGreaterThanOrEqualTo(Integer value) {
            addCriterion("itid >=", value, "itid");
            return (Criteria) this;
        }

        public Criteria andItidLessThan(Integer value) {
            addCriterion("itid <", value, "itid");
            return (Criteria) this;
        }

        public Criteria andItidLessThanOrEqualTo(Integer value) {
            addCriterion("itid <=", value, "itid");
            return (Criteria) this;
        }

        public Criteria andItidIn(List<Integer> values) {
            addCriterion("itid in", values, "itid");
            return (Criteria) this;
        }

        public Criteria andItidNotIn(List<Integer> values) {
            addCriterion("itid not in", values, "itid");
            return (Criteria) this;
        }

        public Criteria andItidBetween(Integer value1, Integer value2) {
            addCriterion("itid between", value1, value2, "itid");
            return (Criteria) this;
        }

        public Criteria andItidNotBetween(Integer value1, Integer value2) {
            addCriterion("itid not between", value1, value2, "itid");
            return (Criteria) this;
        }

        public Criteria andItnameIsNull() {
            addCriterion("itname is null");
            return (Criteria) this;
        }

        public Criteria andItnameIsNotNull() {
            addCriterion("itname is not null");
            return (Criteria) this;
        }

        public Criteria andItnameEqualTo(String value) {
            addCriterion("itname =", value, "itname");
            return (Criteria) this;
        }

        public Criteria andItnameNotEqualTo(String value) {
            addCriterion("itname <>", value, "itname");
            return (Criteria) this;
        }

        public Criteria andItnameGreaterThan(String value) {
            addCriterion("itname >", value, "itname");
            return (Criteria) this;
        }

        public Criteria andItnameGreaterThanOrEqualTo(String value) {
            addCriterion("itname >=", value, "itname");
            return (Criteria) this;
        }

        public Criteria andItnameLessThan(String value) {
            addCriterion("itname <", value, "itname");
            return (Criteria) this;
        }

        public Criteria andItnameLessThanOrEqualTo(String value) {
            addCriterion("itname <=", value, "itname");
            return (Criteria) this;
        }

        public Criteria andItnameLike(String value) {
            addCriterion("itname like", value, "itname");
            return (Criteria) this;
        }

        public Criteria andItnameNotLike(String value) {
            addCriterion("itname not like", value, "itname");
            return (Criteria) this;
        }

        public Criteria andItnameIn(List<String> values) {
            addCriterion("itname in", values, "itname");
            return (Criteria) this;
        }

        public Criteria andItnameNotIn(List<String> values) {
            addCriterion("itname not in", values, "itname");
            return (Criteria) this;
        }

        public Criteria andItnameBetween(String value1, String value2) {
            addCriterion("itname between", value1, value2, "itname");
            return (Criteria) this;
        }

        public Criteria andItnameNotBetween(String value1, String value2) {
            addCriterion("itname not between", value1, value2, "itname");
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