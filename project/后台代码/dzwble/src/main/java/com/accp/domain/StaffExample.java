package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StaffExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StaffExample() {
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

        public Criteria andSidIsNull() {
            addCriterion("sid is null");
            return (Criteria) this;
        }

        public Criteria andSidIsNotNull() {
            addCriterion("sid is not null");
            return (Criteria) this;
        }

        public Criteria andSidEqualTo(Integer value) {
            addCriterion("sid =", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotEqualTo(Integer value) {
            addCriterion("sid <>", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThan(Integer value) {
            addCriterion("sid >", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sid >=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThan(Integer value) {
            addCriterion("sid <", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThanOrEqualTo(Integer value) {
            addCriterion("sid <=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidIn(List<Integer> values) {
            addCriterion("sid in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotIn(List<Integer> values) {
            addCriterion("sid not in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidBetween(Integer value1, Integer value2) {
            addCriterion("sid between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotBetween(Integer value1, Integer value2) {
            addCriterion("sid not between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andPnoIsNull() {
            addCriterion("pno is null");
            return (Criteria) this;
        }

        public Criteria andPnoIsNotNull() {
            addCriterion("pno is not null");
            return (Criteria) this;
        }

        public Criteria andPnoEqualTo(String value) {
            addCriterion("pno =", value, "pno");
            return (Criteria) this;
        }

        public Criteria andPnoNotEqualTo(String value) {
            addCriterion("pno <>", value, "pno");
            return (Criteria) this;
        }

        public Criteria andPnoGreaterThan(String value) {
            addCriterion("pno >", value, "pno");
            return (Criteria) this;
        }

        public Criteria andPnoGreaterThanOrEqualTo(String value) {
            addCriterion("pno >=", value, "pno");
            return (Criteria) this;
        }

        public Criteria andPnoLessThan(String value) {
            addCriterion("pno <", value, "pno");
            return (Criteria) this;
        }

        public Criteria andPnoLessThanOrEqualTo(String value) {
            addCriterion("pno <=", value, "pno");
            return (Criteria) this;
        }

        public Criteria andPnoLike(String value) {
            addCriterion("pno like", value, "pno");
            return (Criteria) this;
        }

        public Criteria andPnoNotLike(String value) {
            addCriterion("pno not like", value, "pno");
            return (Criteria) this;
        }

        public Criteria andPnoIn(List<String> values) {
            addCriterion("pno in", values, "pno");
            return (Criteria) this;
        }

        public Criteria andPnoNotIn(List<String> values) {
            addCriterion("pno not in", values, "pno");
            return (Criteria) this;
        }

        public Criteria andPnoBetween(String value1, String value2) {
            addCriterion("pno between", value1, value2, "pno");
            return (Criteria) this;
        }

        public Criteria andPnoNotBetween(String value1, String value2) {
            addCriterion("pno not between", value1, value2, "pno");
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

        public Criteria andJidIsNull() {
            addCriterion("jid is null");
            return (Criteria) this;
        }

        public Criteria andJidIsNotNull() {
            addCriterion("jid is not null");
            return (Criteria) this;
        }

        public Criteria andJidEqualTo(Integer value) {
            addCriterion("jid =", value, "jid");
            return (Criteria) this;
        }

        public Criteria andJidNotEqualTo(Integer value) {
            addCriterion("jid <>", value, "jid");
            return (Criteria) this;
        }

        public Criteria andJidGreaterThan(Integer value) {
            addCriterion("jid >", value, "jid");
            return (Criteria) this;
        }

        public Criteria andJidGreaterThanOrEqualTo(Integer value) {
            addCriterion("jid >=", value, "jid");
            return (Criteria) this;
        }

        public Criteria andJidLessThan(Integer value) {
            addCriterion("jid <", value, "jid");
            return (Criteria) this;
        }

        public Criteria andJidLessThanOrEqualTo(Integer value) {
            addCriterion("jid <=", value, "jid");
            return (Criteria) this;
        }

        public Criteria andJidIn(List<Integer> values) {
            addCriterion("jid in", values, "jid");
            return (Criteria) this;
        }

        public Criteria andJidNotIn(List<Integer> values) {
            addCriterion("jid not in", values, "jid");
            return (Criteria) this;
        }

        public Criteria andJidBetween(Integer value1, Integer value2) {
            addCriterion("jid between", value1, value2, "jid");
            return (Criteria) this;
        }

        public Criteria andJidNotBetween(Integer value1, Integer value2) {
            addCriterion("jid not between", value1, value2, "jid");
            return (Criteria) this;
        }

        public Criteria andRidIsNull() {
            addCriterion("rid is null");
            return (Criteria) this;
        }

        public Criteria andRidIsNotNull() {
            addCriterion("rid is not null");
            return (Criteria) this;
        }

        public Criteria andRidEqualTo(Integer value) {
            addCriterion("rid =", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotEqualTo(Integer value) {
            addCriterion("rid <>", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidGreaterThan(Integer value) {
            addCriterion("rid >", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidGreaterThanOrEqualTo(Integer value) {
            addCriterion("rid >=", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidLessThan(Integer value) {
            addCriterion("rid <", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidLessThanOrEqualTo(Integer value) {
            addCriterion("rid <=", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidIn(List<Integer> values) {
            addCriterion("rid in", values, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotIn(List<Integer> values) {
            addCriterion("rid not in", values, "rid");
            return (Criteria) this;
        }

        public Criteria andRidBetween(Integer value1, Integer value2) {
            addCriterion("rid between", value1, value2, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotBetween(Integer value1, Integer value2) {
            addCriterion("rid not between", value1, value2, "rid");
            return (Criteria) this;
        }

        public Criteria andShealthIsNull() {
            addCriterion("shealth is null");
            return (Criteria) this;
        }

        public Criteria andShealthIsNotNull() {
            addCriterion("shealth is not null");
            return (Criteria) this;
        }

        public Criteria andShealthEqualTo(String value) {
            addCriterion("shealth =", value, "shealth");
            return (Criteria) this;
        }

        public Criteria andShealthNotEqualTo(String value) {
            addCriterion("shealth <>", value, "shealth");
            return (Criteria) this;
        }

        public Criteria andShealthGreaterThan(String value) {
            addCriterion("shealth >", value, "shealth");
            return (Criteria) this;
        }

        public Criteria andShealthGreaterThanOrEqualTo(String value) {
            addCriterion("shealth >=", value, "shealth");
            return (Criteria) this;
        }

        public Criteria andShealthLessThan(String value) {
            addCriterion("shealth <", value, "shealth");
            return (Criteria) this;
        }

        public Criteria andShealthLessThanOrEqualTo(String value) {
            addCriterion("shealth <=", value, "shealth");
            return (Criteria) this;
        }

        public Criteria andShealthLike(String value) {
            addCriterion("shealth like", value, "shealth");
            return (Criteria) this;
        }

        public Criteria andShealthNotLike(String value) {
            addCriterion("shealth not like", value, "shealth");
            return (Criteria) this;
        }

        public Criteria andShealthIn(List<String> values) {
            addCriterion("shealth in", values, "shealth");
            return (Criteria) this;
        }

        public Criteria andShealthNotIn(List<String> values) {
            addCriterion("shealth not in", values, "shealth");
            return (Criteria) this;
        }

        public Criteria andShealthBetween(String value1, String value2) {
            addCriterion("shealth between", value1, value2, "shealth");
            return (Criteria) this;
        }

        public Criteria andShealthNotBetween(String value1, String value2) {
            addCriterion("shealth not between", value1, value2, "shealth");
            return (Criteria) this;
        }

        public Criteria andSheightIsNull() {
            addCriterion("sheight is null");
            return (Criteria) this;
        }

        public Criteria andSheightIsNotNull() {
            addCriterion("sheight is not null");
            return (Criteria) this;
        }

        public Criteria andSheightEqualTo(Float value) {
            addCriterion("sheight =", value, "sheight");
            return (Criteria) this;
        }

        public Criteria andSheightNotEqualTo(Float value) {
            addCriterion("sheight <>", value, "sheight");
            return (Criteria) this;
        }

        public Criteria andSheightGreaterThan(Float value) {
            addCriterion("sheight >", value, "sheight");
            return (Criteria) this;
        }

        public Criteria andSheightGreaterThanOrEqualTo(Float value) {
            addCriterion("sheight >=", value, "sheight");
            return (Criteria) this;
        }

        public Criteria andSheightLessThan(Float value) {
            addCriterion("sheight <", value, "sheight");
            return (Criteria) this;
        }

        public Criteria andSheightLessThanOrEqualTo(Float value) {
            addCriterion("sheight <=", value, "sheight");
            return (Criteria) this;
        }

        public Criteria andSheightIn(List<Float> values) {
            addCriterion("sheight in", values, "sheight");
            return (Criteria) this;
        }

        public Criteria andSheightNotIn(List<Float> values) {
            addCriterion("sheight not in", values, "sheight");
            return (Criteria) this;
        }

        public Criteria andSheightBetween(Float value1, Float value2) {
            addCriterion("sheight between", value1, value2, "sheight");
            return (Criteria) this;
        }

        public Criteria andSheightNotBetween(Float value1, Float value2) {
            addCriterion("sheight not between", value1, value2, "sheight");
            return (Criteria) this;
        }

        public Criteria andSplaceIsNull() {
            addCriterion("splace is null");
            return (Criteria) this;
        }

        public Criteria andSplaceIsNotNull() {
            addCriterion("splace is not null");
            return (Criteria) this;
        }

        public Criteria andSplaceEqualTo(String value) {
            addCriterion("splace =", value, "splace");
            return (Criteria) this;
        }

        public Criteria andSplaceNotEqualTo(String value) {
            addCriterion("splace <>", value, "splace");
            return (Criteria) this;
        }

        public Criteria andSplaceGreaterThan(String value) {
            addCriterion("splace >", value, "splace");
            return (Criteria) this;
        }

        public Criteria andSplaceGreaterThanOrEqualTo(String value) {
            addCriterion("splace >=", value, "splace");
            return (Criteria) this;
        }

        public Criteria andSplaceLessThan(String value) {
            addCriterion("splace <", value, "splace");
            return (Criteria) this;
        }

        public Criteria andSplaceLessThanOrEqualTo(String value) {
            addCriterion("splace <=", value, "splace");
            return (Criteria) this;
        }

        public Criteria andSplaceLike(String value) {
            addCriterion("splace like", value, "splace");
            return (Criteria) this;
        }

        public Criteria andSplaceNotLike(String value) {
            addCriterion("splace not like", value, "splace");
            return (Criteria) this;
        }

        public Criteria andSplaceIn(List<String> values) {
            addCriterion("splace in", values, "splace");
            return (Criteria) this;
        }

        public Criteria andSplaceNotIn(List<String> values) {
            addCriterion("splace not in", values, "splace");
            return (Criteria) this;
        }

        public Criteria andSplaceBetween(String value1, String value2) {
            addCriterion("splace between", value1, value2, "splace");
            return (Criteria) this;
        }

        public Criteria andSplaceNotBetween(String value1, String value2) {
            addCriterion("splace not between", value1, value2, "splace");
            return (Criteria) this;
        }

        public Criteria andSnationIsNull() {
            addCriterion("snation is null");
            return (Criteria) this;
        }

        public Criteria andSnationIsNotNull() {
            addCriterion("snation is not null");
            return (Criteria) this;
        }

        public Criteria andSnationEqualTo(String value) {
            addCriterion("snation =", value, "snation");
            return (Criteria) this;
        }

        public Criteria andSnationNotEqualTo(String value) {
            addCriterion("snation <>", value, "snation");
            return (Criteria) this;
        }

        public Criteria andSnationGreaterThan(String value) {
            addCriterion("snation >", value, "snation");
            return (Criteria) this;
        }

        public Criteria andSnationGreaterThanOrEqualTo(String value) {
            addCriterion("snation >=", value, "snation");
            return (Criteria) this;
        }

        public Criteria andSnationLessThan(String value) {
            addCriterion("snation <", value, "snation");
            return (Criteria) this;
        }

        public Criteria andSnationLessThanOrEqualTo(String value) {
            addCriterion("snation <=", value, "snation");
            return (Criteria) this;
        }

        public Criteria andSnationLike(String value) {
            addCriterion("snation like", value, "snation");
            return (Criteria) this;
        }

        public Criteria andSnationNotLike(String value) {
            addCriterion("snation not like", value, "snation");
            return (Criteria) this;
        }

        public Criteria andSnationIn(List<String> values) {
            addCriterion("snation in", values, "snation");
            return (Criteria) this;
        }

        public Criteria andSnationNotIn(List<String> values) {
            addCriterion("snation not in", values, "snation");
            return (Criteria) this;
        }

        public Criteria andSnationBetween(String value1, String value2) {
            addCriterion("snation between", value1, value2, "snation");
            return (Criteria) this;
        }

        public Criteria andSnationNotBetween(String value1, String value2) {
            addCriterion("snation not between", value1, value2, "snation");
            return (Criteria) this;
        }

        public Criteria andSmarryIsNull() {
            addCriterion("smarry is null");
            return (Criteria) this;
        }

        public Criteria andSmarryIsNotNull() {
            addCriterion("smarry is not null");
            return (Criteria) this;
        }

        public Criteria andSmarryEqualTo(String value) {
            addCriterion("smarry =", value, "smarry");
            return (Criteria) this;
        }

        public Criteria andSmarryNotEqualTo(String value) {
            addCriterion("smarry <>", value, "smarry");
            return (Criteria) this;
        }

        public Criteria andSmarryGreaterThan(String value) {
            addCriterion("smarry >", value, "smarry");
            return (Criteria) this;
        }

        public Criteria andSmarryGreaterThanOrEqualTo(String value) {
            addCriterion("smarry >=", value, "smarry");
            return (Criteria) this;
        }

        public Criteria andSmarryLessThan(String value) {
            addCriterion("smarry <", value, "smarry");
            return (Criteria) this;
        }

        public Criteria andSmarryLessThanOrEqualTo(String value) {
            addCriterion("smarry <=", value, "smarry");
            return (Criteria) this;
        }

        public Criteria andSmarryLike(String value) {
            addCriterion("smarry like", value, "smarry");
            return (Criteria) this;
        }

        public Criteria andSmarryNotLike(String value) {
            addCriterion("smarry not like", value, "smarry");
            return (Criteria) this;
        }

        public Criteria andSmarryIn(List<String> values) {
            addCriterion("smarry in", values, "smarry");
            return (Criteria) this;
        }

        public Criteria andSmarryNotIn(List<String> values) {
            addCriterion("smarry not in", values, "smarry");
            return (Criteria) this;
        }

        public Criteria andSmarryBetween(String value1, String value2) {
            addCriterion("smarry between", value1, value2, "smarry");
            return (Criteria) this;
        }

        public Criteria andSmarryNotBetween(String value1, String value2) {
            addCriterion("smarry not between", value1, value2, "smarry");
            return (Criteria) this;
        }

        public Criteria andSeducationIsNull() {
            addCriterion("seducation is null");
            return (Criteria) this;
        }

        public Criteria andSeducationIsNotNull() {
            addCriterion("seducation is not null");
            return (Criteria) this;
        }

        public Criteria andSeducationEqualTo(String value) {
            addCriterion("seducation =", value, "seducation");
            return (Criteria) this;
        }

        public Criteria andSeducationNotEqualTo(String value) {
            addCriterion("seducation <>", value, "seducation");
            return (Criteria) this;
        }

        public Criteria andSeducationGreaterThan(String value) {
            addCriterion("seducation >", value, "seducation");
            return (Criteria) this;
        }

        public Criteria andSeducationGreaterThanOrEqualTo(String value) {
            addCriterion("seducation >=", value, "seducation");
            return (Criteria) this;
        }

        public Criteria andSeducationLessThan(String value) {
            addCriterion("seducation <", value, "seducation");
            return (Criteria) this;
        }

        public Criteria andSeducationLessThanOrEqualTo(String value) {
            addCriterion("seducation <=", value, "seducation");
            return (Criteria) this;
        }

        public Criteria andSeducationLike(String value) {
            addCriterion("seducation like", value, "seducation");
            return (Criteria) this;
        }

        public Criteria andSeducationNotLike(String value) {
            addCriterion("seducation not like", value, "seducation");
            return (Criteria) this;
        }

        public Criteria andSeducationIn(List<String> values) {
            addCriterion("seducation in", values, "seducation");
            return (Criteria) this;
        }

        public Criteria andSeducationNotIn(List<String> values) {
            addCriterion("seducation not in", values, "seducation");
            return (Criteria) this;
        }

        public Criteria andSeducationBetween(String value1, String value2) {
            addCriterion("seducation between", value1, value2, "seducation");
            return (Criteria) this;
        }

        public Criteria andSeducationNotBetween(String value1, String value2) {
            addCriterion("seducation not between", value1, value2, "seducation");
            return (Criteria) this;
        }

        public Criteria andSschoolIsNull() {
            addCriterion("sschool is null");
            return (Criteria) this;
        }

        public Criteria andSschoolIsNotNull() {
            addCriterion("sschool is not null");
            return (Criteria) this;
        }

        public Criteria andSschoolEqualTo(String value) {
            addCriterion("sschool =", value, "sschool");
            return (Criteria) this;
        }

        public Criteria andSschoolNotEqualTo(String value) {
            addCriterion("sschool <>", value, "sschool");
            return (Criteria) this;
        }

        public Criteria andSschoolGreaterThan(String value) {
            addCriterion("sschool >", value, "sschool");
            return (Criteria) this;
        }

        public Criteria andSschoolGreaterThanOrEqualTo(String value) {
            addCriterion("sschool >=", value, "sschool");
            return (Criteria) this;
        }

        public Criteria andSschoolLessThan(String value) {
            addCriterion("sschool <", value, "sschool");
            return (Criteria) this;
        }

        public Criteria andSschoolLessThanOrEqualTo(String value) {
            addCriterion("sschool <=", value, "sschool");
            return (Criteria) this;
        }

        public Criteria andSschoolLike(String value) {
            addCriterion("sschool like", value, "sschool");
            return (Criteria) this;
        }

        public Criteria andSschoolNotLike(String value) {
            addCriterion("sschool not like", value, "sschool");
            return (Criteria) this;
        }

        public Criteria andSschoolIn(List<String> values) {
            addCriterion("sschool in", values, "sschool");
            return (Criteria) this;
        }

        public Criteria andSschoolNotIn(List<String> values) {
            addCriterion("sschool not in", values, "sschool");
            return (Criteria) this;
        }

        public Criteria andSschoolBetween(String value1, String value2) {
            addCriterion("sschool between", value1, value2, "sschool");
            return (Criteria) this;
        }

        public Criteria andSschoolNotBetween(String value1, String value2) {
            addCriterion("sschool not between", value1, value2, "sschool");
            return (Criteria) this;
        }

        public Criteria andSmajorIsNull() {
            addCriterion("smajor is null");
            return (Criteria) this;
        }

        public Criteria andSmajorIsNotNull() {
            addCriterion("smajor is not null");
            return (Criteria) this;
        }

        public Criteria andSmajorEqualTo(String value) {
            addCriterion("smajor =", value, "smajor");
            return (Criteria) this;
        }

        public Criteria andSmajorNotEqualTo(String value) {
            addCriterion("smajor <>", value, "smajor");
            return (Criteria) this;
        }

        public Criteria andSmajorGreaterThan(String value) {
            addCriterion("smajor >", value, "smajor");
            return (Criteria) this;
        }

        public Criteria andSmajorGreaterThanOrEqualTo(String value) {
            addCriterion("smajor >=", value, "smajor");
            return (Criteria) this;
        }

        public Criteria andSmajorLessThan(String value) {
            addCriterion("smajor <", value, "smajor");
            return (Criteria) this;
        }

        public Criteria andSmajorLessThanOrEqualTo(String value) {
            addCriterion("smajor <=", value, "smajor");
            return (Criteria) this;
        }

        public Criteria andSmajorLike(String value) {
            addCriterion("smajor like", value, "smajor");
            return (Criteria) this;
        }

        public Criteria andSmajorNotLike(String value) {
            addCriterion("smajor not like", value, "smajor");
            return (Criteria) this;
        }

        public Criteria andSmajorIn(List<String> values) {
            addCriterion("smajor in", values, "smajor");
            return (Criteria) this;
        }

        public Criteria andSmajorNotIn(List<String> values) {
            addCriterion("smajor not in", values, "smajor");
            return (Criteria) this;
        }

        public Criteria andSmajorBetween(String value1, String value2) {
            addCriterion("smajor between", value1, value2, "smajor");
            return (Criteria) this;
        }

        public Criteria andSmajorNotBetween(String value1, String value2) {
            addCriterion("smajor not between", value1, value2, "smajor");
            return (Criteria) this;
        }

        public Criteria andSmajorlevelIsNull() {
            addCriterion("smajorlevel is null");
            return (Criteria) this;
        }

        public Criteria andSmajorlevelIsNotNull() {
            addCriterion("smajorlevel is not null");
            return (Criteria) this;
        }

        public Criteria andSmajorlevelEqualTo(String value) {
            addCriterion("smajorlevel =", value, "smajorlevel");
            return (Criteria) this;
        }

        public Criteria andSmajorlevelNotEqualTo(String value) {
            addCriterion("smajorlevel <>", value, "smajorlevel");
            return (Criteria) this;
        }

        public Criteria andSmajorlevelGreaterThan(String value) {
            addCriterion("smajorlevel >", value, "smajorlevel");
            return (Criteria) this;
        }

        public Criteria andSmajorlevelGreaterThanOrEqualTo(String value) {
            addCriterion("smajorlevel >=", value, "smajorlevel");
            return (Criteria) this;
        }

        public Criteria andSmajorlevelLessThan(String value) {
            addCriterion("smajorlevel <", value, "smajorlevel");
            return (Criteria) this;
        }

        public Criteria andSmajorlevelLessThanOrEqualTo(String value) {
            addCriterion("smajorlevel <=", value, "smajorlevel");
            return (Criteria) this;
        }

        public Criteria andSmajorlevelLike(String value) {
            addCriterion("smajorlevel like", value, "smajorlevel");
            return (Criteria) this;
        }

        public Criteria andSmajorlevelNotLike(String value) {
            addCriterion("smajorlevel not like", value, "smajorlevel");
            return (Criteria) this;
        }

        public Criteria andSmajorlevelIn(List<String> values) {
            addCriterion("smajorlevel in", values, "smajorlevel");
            return (Criteria) this;
        }

        public Criteria andSmajorlevelNotIn(List<String> values) {
            addCriterion("smajorlevel not in", values, "smajorlevel");
            return (Criteria) this;
        }

        public Criteria andSmajorlevelBetween(String value1, String value2) {
            addCriterion("smajorlevel between", value1, value2, "smajorlevel");
            return (Criteria) this;
        }

        public Criteria andSmajorlevelNotBetween(String value1, String value2) {
            addCriterion("smajorlevel not between", value1, value2, "smajorlevel");
            return (Criteria) this;
        }

        public Criteria andSfielIsNull() {
            addCriterion("sfiel is null");
            return (Criteria) this;
        }

        public Criteria andSfielIsNotNull() {
            addCriterion("sfiel is not null");
            return (Criteria) this;
        }

        public Criteria andSfielEqualTo(String value) {
            addCriterion("sfiel =", value, "sfiel");
            return (Criteria) this;
        }

        public Criteria andSfielNotEqualTo(String value) {
            addCriterion("sfiel <>", value, "sfiel");
            return (Criteria) this;
        }

        public Criteria andSfielGreaterThan(String value) {
            addCriterion("sfiel >", value, "sfiel");
            return (Criteria) this;
        }

        public Criteria andSfielGreaterThanOrEqualTo(String value) {
            addCriterion("sfiel >=", value, "sfiel");
            return (Criteria) this;
        }

        public Criteria andSfielLessThan(String value) {
            addCriterion("sfiel <", value, "sfiel");
            return (Criteria) this;
        }

        public Criteria andSfielLessThanOrEqualTo(String value) {
            addCriterion("sfiel <=", value, "sfiel");
            return (Criteria) this;
        }

        public Criteria andSfielLike(String value) {
            addCriterion("sfiel like", value, "sfiel");
            return (Criteria) this;
        }

        public Criteria andSfielNotLike(String value) {
            addCriterion("sfiel not like", value, "sfiel");
            return (Criteria) this;
        }

        public Criteria andSfielIn(List<String> values) {
            addCriterion("sfiel in", values, "sfiel");
            return (Criteria) this;
        }

        public Criteria andSfielNotIn(List<String> values) {
            addCriterion("sfiel not in", values, "sfiel");
            return (Criteria) this;
        }

        public Criteria andSfielBetween(String value1, String value2) {
            addCriterion("sfiel between", value1, value2, "sfiel");
            return (Criteria) this;
        }

        public Criteria andSfielNotBetween(String value1, String value2) {
            addCriterion("sfiel not between", value1, value2, "sfiel");
            return (Criteria) this;
        }

        public Criteria andSpeopleIsNull() {
            addCriterion("speople is null");
            return (Criteria) this;
        }

        public Criteria andSpeopleIsNotNull() {
            addCriterion("speople is not null");
            return (Criteria) this;
        }

        public Criteria andSpeopleEqualTo(String value) {
            addCriterion("speople =", value, "speople");
            return (Criteria) this;
        }

        public Criteria andSpeopleNotEqualTo(String value) {
            addCriterion("speople <>", value, "speople");
            return (Criteria) this;
        }

        public Criteria andSpeopleGreaterThan(String value) {
            addCriterion("speople >", value, "speople");
            return (Criteria) this;
        }

        public Criteria andSpeopleGreaterThanOrEqualTo(String value) {
            addCriterion("speople >=", value, "speople");
            return (Criteria) this;
        }

        public Criteria andSpeopleLessThan(String value) {
            addCriterion("speople <", value, "speople");
            return (Criteria) this;
        }

        public Criteria andSpeopleLessThanOrEqualTo(String value) {
            addCriterion("speople <=", value, "speople");
            return (Criteria) this;
        }

        public Criteria andSpeopleLike(String value) {
            addCriterion("speople like", value, "speople");
            return (Criteria) this;
        }

        public Criteria andSpeopleNotLike(String value) {
            addCriterion("speople not like", value, "speople");
            return (Criteria) this;
        }

        public Criteria andSpeopleIn(List<String> values) {
            addCriterion("speople in", values, "speople");
            return (Criteria) this;
        }

        public Criteria andSpeopleNotIn(List<String> values) {
            addCriterion("speople not in", values, "speople");
            return (Criteria) this;
        }

        public Criteria andSpeopleBetween(String value1, String value2) {
            addCriterion("speople between", value1, value2, "speople");
            return (Criteria) this;
        }

        public Criteria andSpeopleNotBetween(String value1, String value2) {
            addCriterion("speople not between", value1, value2, "speople");
            return (Criteria) this;
        }

        public Criteria andSpeoplephoneIsNull() {
            addCriterion("speoplephone is null");
            return (Criteria) this;
        }

        public Criteria andSpeoplephoneIsNotNull() {
            addCriterion("speoplephone is not null");
            return (Criteria) this;
        }

        public Criteria andSpeoplephoneEqualTo(String value) {
            addCriterion("speoplephone =", value, "speoplephone");
            return (Criteria) this;
        }

        public Criteria andSpeoplephoneNotEqualTo(String value) {
            addCriterion("speoplephone <>", value, "speoplephone");
            return (Criteria) this;
        }

        public Criteria andSpeoplephoneGreaterThan(String value) {
            addCriterion("speoplephone >", value, "speoplephone");
            return (Criteria) this;
        }

        public Criteria andSpeoplephoneGreaterThanOrEqualTo(String value) {
            addCriterion("speoplephone >=", value, "speoplephone");
            return (Criteria) this;
        }

        public Criteria andSpeoplephoneLessThan(String value) {
            addCriterion("speoplephone <", value, "speoplephone");
            return (Criteria) this;
        }

        public Criteria andSpeoplephoneLessThanOrEqualTo(String value) {
            addCriterion("speoplephone <=", value, "speoplephone");
            return (Criteria) this;
        }

        public Criteria andSpeoplephoneLike(String value) {
            addCriterion("speoplephone like", value, "speoplephone");
            return (Criteria) this;
        }

        public Criteria andSpeoplephoneNotLike(String value) {
            addCriterion("speoplephone not like", value, "speoplephone");
            return (Criteria) this;
        }

        public Criteria andSpeoplephoneIn(List<String> values) {
            addCriterion("speoplephone in", values, "speoplephone");
            return (Criteria) this;
        }

        public Criteria andSpeoplephoneNotIn(List<String> values) {
            addCriterion("speoplephone not in", values, "speoplephone");
            return (Criteria) this;
        }

        public Criteria andSpeoplephoneBetween(String value1, String value2) {
            addCriterion("speoplephone between", value1, value2, "speoplephone");
            return (Criteria) this;
        }

        public Criteria andSpeoplephoneNotBetween(String value1, String value2) {
            addCriterion("speoplephone not between", value1, value2, "speoplephone");
            return (Criteria) this;
        }

        public Criteria andSindateIsNull() {
            addCriterion("sindate is null");
            return (Criteria) this;
        }

        public Criteria andSindateIsNotNull() {
            addCriterion("sindate is not null");
            return (Criteria) this;
        }

        public Criteria andSindateEqualTo(Date value) {
            addCriterion("sindate =", value, "sindate");
            return (Criteria) this;
        }

        public Criteria andSindateNotEqualTo(Date value) {
            addCriterion("sindate <>", value, "sindate");
            return (Criteria) this;
        }

        public Criteria andSindateGreaterThan(Date value) {
            addCriterion("sindate >", value, "sindate");
            return (Criteria) this;
        }

        public Criteria andSindateGreaterThanOrEqualTo(Date value) {
            addCriterion("sindate >=", value, "sindate");
            return (Criteria) this;
        }

        public Criteria andSindateLessThan(Date value) {
            addCriterion("sindate <", value, "sindate");
            return (Criteria) this;
        }

        public Criteria andSindateLessThanOrEqualTo(Date value) {
            addCriterion("sindate <=", value, "sindate");
            return (Criteria) this;
        }

        public Criteria andSindateIn(List<Date> values) {
            addCriterion("sindate in", values, "sindate");
            return (Criteria) this;
        }

        public Criteria andSindateNotIn(List<Date> values) {
            addCriterion("sindate not in", values, "sindate");
            return (Criteria) this;
        }

        public Criteria andSindateBetween(Date value1, Date value2) {
            addCriterion("sindate between", value1, value2, "sindate");
            return (Criteria) this;
        }

        public Criteria andSindateNotBetween(Date value1, Date value2) {
            addCriterion("sindate not between", value1, value2, "sindate");
            return (Criteria) this;
        }

        public Criteria andSinternishipIsNull() {
            addCriterion("sinterniship is null");
            return (Criteria) this;
        }

        public Criteria andSinternishipIsNotNull() {
            addCriterion("sinterniship is not null");
            return (Criteria) this;
        }

        public Criteria andSinternishipEqualTo(Date value) {
            addCriterion("sinterniship =", value, "sinterniship");
            return (Criteria) this;
        }

        public Criteria andSinternishipNotEqualTo(Date value) {
            addCriterion("sinterniship <>", value, "sinterniship");
            return (Criteria) this;
        }

        public Criteria andSinternishipGreaterThan(Date value) {
            addCriterion("sinterniship >", value, "sinterniship");
            return (Criteria) this;
        }

        public Criteria andSinternishipGreaterThanOrEqualTo(Date value) {
            addCriterion("sinterniship >=", value, "sinterniship");
            return (Criteria) this;
        }

        public Criteria andSinternishipLessThan(Date value) {
            addCriterion("sinterniship <", value, "sinterniship");
            return (Criteria) this;
        }

        public Criteria andSinternishipLessThanOrEqualTo(Date value) {
            addCriterion("sinterniship <=", value, "sinterniship");
            return (Criteria) this;
        }

        public Criteria andSinternishipIn(List<Date> values) {
            addCriterion("sinterniship in", values, "sinterniship");
            return (Criteria) this;
        }

        public Criteria andSinternishipNotIn(List<Date> values) {
            addCriterion("sinterniship not in", values, "sinterniship");
            return (Criteria) this;
        }

        public Criteria andSinternishipBetween(Date value1, Date value2) {
            addCriterion("sinterniship between", value1, value2, "sinterniship");
            return (Criteria) this;
        }

        public Criteria andSinternishipNotBetween(Date value1, Date value2) {
            addCriterion("sinterniship not between", value1, value2, "sinterniship");
            return (Criteria) this;
        }

        public Criteria andSbirthdayIsNull() {
            addCriterion("sbirthday is null");
            return (Criteria) this;
        }

        public Criteria andSbirthdayIsNotNull() {
            addCriterion("sbirthday is not null");
            return (Criteria) this;
        }

        public Criteria andSbirthdayEqualTo(Date value) {
            addCriterion("sbirthday =", value, "sbirthday");
            return (Criteria) this;
        }

        public Criteria andSbirthdayNotEqualTo(Date value) {
            addCriterion("sbirthday <>", value, "sbirthday");
            return (Criteria) this;
        }

        public Criteria andSbirthdayGreaterThan(Date value) {
            addCriterion("sbirthday >", value, "sbirthday");
            return (Criteria) this;
        }

        public Criteria andSbirthdayGreaterThanOrEqualTo(Date value) {
            addCriterion("sbirthday >=", value, "sbirthday");
            return (Criteria) this;
        }

        public Criteria andSbirthdayLessThan(Date value) {
            addCriterion("sbirthday <", value, "sbirthday");
            return (Criteria) this;
        }

        public Criteria andSbirthdayLessThanOrEqualTo(Date value) {
            addCriterion("sbirthday <=", value, "sbirthday");
            return (Criteria) this;
        }

        public Criteria andSbirthdayIn(List<Date> values) {
            addCriterion("sbirthday in", values, "sbirthday");
            return (Criteria) this;
        }

        public Criteria andSbirthdayNotIn(List<Date> values) {
            addCriterion("sbirthday not in", values, "sbirthday");
            return (Criteria) this;
        }

        public Criteria andSbirthdayBetween(Date value1, Date value2) {
            addCriterion("sbirthday between", value1, value2, "sbirthday");
            return (Criteria) this;
        }

        public Criteria andSbirthdayNotBetween(Date value1, Date value2) {
            addCriterion("sbirthday not between", value1, value2, "sbirthday");
            return (Criteria) this;
        }

        public Criteria andSstarttimeIsNull() {
            addCriterion("sstarttime is null");
            return (Criteria) this;
        }

        public Criteria andSstarttimeIsNotNull() {
            addCriterion("sstarttime is not null");
            return (Criteria) this;
        }

        public Criteria andSstarttimeEqualTo(Date value) {
            addCriterion("sstarttime =", value, "sstarttime");
            return (Criteria) this;
        }

        public Criteria andSstarttimeNotEqualTo(Date value) {
            addCriterion("sstarttime <>", value, "sstarttime");
            return (Criteria) this;
        }

        public Criteria andSstarttimeGreaterThan(Date value) {
            addCriterion("sstarttime >", value, "sstarttime");
            return (Criteria) this;
        }

        public Criteria andSstarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sstarttime >=", value, "sstarttime");
            return (Criteria) this;
        }

        public Criteria andSstarttimeLessThan(Date value) {
            addCriterion("sstarttime <", value, "sstarttime");
            return (Criteria) this;
        }

        public Criteria andSstarttimeLessThanOrEqualTo(Date value) {
            addCriterion("sstarttime <=", value, "sstarttime");
            return (Criteria) this;
        }

        public Criteria andSstarttimeIn(List<Date> values) {
            addCriterion("sstarttime in", values, "sstarttime");
            return (Criteria) this;
        }

        public Criteria andSstarttimeNotIn(List<Date> values) {
            addCriterion("sstarttime not in", values, "sstarttime");
            return (Criteria) this;
        }

        public Criteria andSstarttimeBetween(Date value1, Date value2) {
            addCriterion("sstarttime between", value1, value2, "sstarttime");
            return (Criteria) this;
        }

        public Criteria andSstarttimeNotBetween(Date value1, Date value2) {
            addCriterion("sstarttime not between", value1, value2, "sstarttime");
            return (Criteria) this;
        }

        public Criteria andSendtimeIsNull() {
            addCriterion("sendtime is null");
            return (Criteria) this;
        }

        public Criteria andSendtimeIsNotNull() {
            addCriterion("sendtime is not null");
            return (Criteria) this;
        }

        public Criteria andSendtimeEqualTo(Date value) {
            addCriterion("sendtime =", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeNotEqualTo(Date value) {
            addCriterion("sendtime <>", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeGreaterThan(Date value) {
            addCriterion("sendtime >", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sendtime >=", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeLessThan(Date value) {
            addCriterion("sendtime <", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeLessThanOrEqualTo(Date value) {
            addCriterion("sendtime <=", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeIn(List<Date> values) {
            addCriterion("sendtime in", values, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeNotIn(List<Date> values) {
            addCriterion("sendtime not in", values, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeBetween(Date value1, Date value2) {
            addCriterion("sendtime between", value1, value2, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeNotBetween(Date value1, Date value2) {
            addCriterion("sendtime not between", value1, value2, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSrecommedIsNull() {
            addCriterion("srecommed is null");
            return (Criteria) this;
        }

        public Criteria andSrecommedIsNotNull() {
            addCriterion("srecommed is not null");
            return (Criteria) this;
        }

        public Criteria andSrecommedEqualTo(String value) {
            addCriterion("srecommed =", value, "srecommed");
            return (Criteria) this;
        }

        public Criteria andSrecommedNotEqualTo(String value) {
            addCriterion("srecommed <>", value, "srecommed");
            return (Criteria) this;
        }

        public Criteria andSrecommedGreaterThan(String value) {
            addCriterion("srecommed >", value, "srecommed");
            return (Criteria) this;
        }

        public Criteria andSrecommedGreaterThanOrEqualTo(String value) {
            addCriterion("srecommed >=", value, "srecommed");
            return (Criteria) this;
        }

        public Criteria andSrecommedLessThan(String value) {
            addCriterion("srecommed <", value, "srecommed");
            return (Criteria) this;
        }

        public Criteria andSrecommedLessThanOrEqualTo(String value) {
            addCriterion("srecommed <=", value, "srecommed");
            return (Criteria) this;
        }

        public Criteria andSrecommedLike(String value) {
            addCriterion("srecommed like", value, "srecommed");
            return (Criteria) this;
        }

        public Criteria andSrecommedNotLike(String value) {
            addCriterion("srecommed not like", value, "srecommed");
            return (Criteria) this;
        }

        public Criteria andSrecommedIn(List<String> values) {
            addCriterion("srecommed in", values, "srecommed");
            return (Criteria) this;
        }

        public Criteria andSrecommedNotIn(List<String> values) {
            addCriterion("srecommed not in", values, "srecommed");
            return (Criteria) this;
        }

        public Criteria andSrecommedBetween(String value1, String value2) {
            addCriterion("srecommed between", value1, value2, "srecommed");
            return (Criteria) this;
        }

        public Criteria andSrecommedNotBetween(String value1, String value2) {
            addCriterion("srecommed not between", value1, value2, "srecommed");
            return (Criteria) this;
        }

        public Criteria andSnonumberIsNull() {
            addCriterion("snonumber is null");
            return (Criteria) this;
        }

        public Criteria andSnonumberIsNotNull() {
            addCriterion("snonumber is not null");
            return (Criteria) this;
        }

        public Criteria andSnonumberEqualTo(String value) {
            addCriterion("snonumber =", value, "snonumber");
            return (Criteria) this;
        }

        public Criteria andSnonumberNotEqualTo(String value) {
            addCriterion("snonumber <>", value, "snonumber");
            return (Criteria) this;
        }

        public Criteria andSnonumberGreaterThan(String value) {
            addCriterion("snonumber >", value, "snonumber");
            return (Criteria) this;
        }

        public Criteria andSnonumberGreaterThanOrEqualTo(String value) {
            addCriterion("snonumber >=", value, "snonumber");
            return (Criteria) this;
        }

        public Criteria andSnonumberLessThan(String value) {
            addCriterion("snonumber <", value, "snonumber");
            return (Criteria) this;
        }

        public Criteria andSnonumberLessThanOrEqualTo(String value) {
            addCriterion("snonumber <=", value, "snonumber");
            return (Criteria) this;
        }

        public Criteria andSnonumberLike(String value) {
            addCriterion("snonumber like", value, "snonumber");
            return (Criteria) this;
        }

        public Criteria andSnonumberNotLike(String value) {
            addCriterion("snonumber not like", value, "snonumber");
            return (Criteria) this;
        }

        public Criteria andSnonumberIn(List<String> values) {
            addCriterion("snonumber in", values, "snonumber");
            return (Criteria) this;
        }

        public Criteria andSnonumberNotIn(List<String> values) {
            addCriterion("snonumber not in", values, "snonumber");
            return (Criteria) this;
        }

        public Criteria andSnonumberBetween(String value1, String value2) {
            addCriterion("snonumber between", value1, value2, "snonumber");
            return (Criteria) this;
        }

        public Criteria andSnonumberNotBetween(String value1, String value2) {
            addCriterion("snonumber not between", value1, value2, "snonumber");
            return (Criteria) this;
        }

        public Criteria andSinnumberIsNull() {
            addCriterion("sinnumber is null");
            return (Criteria) this;
        }

        public Criteria andSinnumberIsNotNull() {
            addCriterion("sinnumber is not null");
            return (Criteria) this;
        }

        public Criteria andSinnumberEqualTo(String value) {
            addCriterion("sinnumber =", value, "sinnumber");
            return (Criteria) this;
        }

        public Criteria andSinnumberNotEqualTo(String value) {
            addCriterion("sinnumber <>", value, "sinnumber");
            return (Criteria) this;
        }

        public Criteria andSinnumberGreaterThan(String value) {
            addCriterion("sinnumber >", value, "sinnumber");
            return (Criteria) this;
        }

        public Criteria andSinnumberGreaterThanOrEqualTo(String value) {
            addCriterion("sinnumber >=", value, "sinnumber");
            return (Criteria) this;
        }

        public Criteria andSinnumberLessThan(String value) {
            addCriterion("sinnumber <", value, "sinnumber");
            return (Criteria) this;
        }

        public Criteria andSinnumberLessThanOrEqualTo(String value) {
            addCriterion("sinnumber <=", value, "sinnumber");
            return (Criteria) this;
        }

        public Criteria andSinnumberLike(String value) {
            addCriterion("sinnumber like", value, "sinnumber");
            return (Criteria) this;
        }

        public Criteria andSinnumberNotLike(String value) {
            addCriterion("sinnumber not like", value, "sinnumber");
            return (Criteria) this;
        }

        public Criteria andSinnumberIn(List<String> values) {
            addCriterion("sinnumber in", values, "sinnumber");
            return (Criteria) this;
        }

        public Criteria andSinnumberNotIn(List<String> values) {
            addCriterion("sinnumber not in", values, "sinnumber");
            return (Criteria) this;
        }

        public Criteria andSinnumberBetween(String value1, String value2) {
            addCriterion("sinnumber between", value1, value2, "sinnumber");
            return (Criteria) this;
        }

        public Criteria andSinnumberNotBetween(String value1, String value2) {
            addCriterion("sinnumber not between", value1, value2, "sinnumber");
            return (Criteria) this;
        }

        public Criteria andSalldiscountIsNull() {
            addCriterion("salldiscount is null");
            return (Criteria) this;
        }

        public Criteria andSalldiscountIsNotNull() {
            addCriterion("salldiscount is not null");
            return (Criteria) this;
        }

        public Criteria andSalldiscountEqualTo(Float value) {
            addCriterion("salldiscount =", value, "salldiscount");
            return (Criteria) this;
        }

        public Criteria andSalldiscountNotEqualTo(Float value) {
            addCriterion("salldiscount <>", value, "salldiscount");
            return (Criteria) this;
        }

        public Criteria andSalldiscountGreaterThan(Float value) {
            addCriterion("salldiscount >", value, "salldiscount");
            return (Criteria) this;
        }

        public Criteria andSalldiscountGreaterThanOrEqualTo(Float value) {
            addCriterion("salldiscount >=", value, "salldiscount");
            return (Criteria) this;
        }

        public Criteria andSalldiscountLessThan(Float value) {
            addCriterion("salldiscount <", value, "salldiscount");
            return (Criteria) this;
        }

        public Criteria andSalldiscountLessThanOrEqualTo(Float value) {
            addCriterion("salldiscount <=", value, "salldiscount");
            return (Criteria) this;
        }

        public Criteria andSalldiscountIn(List<Float> values) {
            addCriterion("salldiscount in", values, "salldiscount");
            return (Criteria) this;
        }

        public Criteria andSalldiscountNotIn(List<Float> values) {
            addCriterion("salldiscount not in", values, "salldiscount");
            return (Criteria) this;
        }

        public Criteria andSalldiscountBetween(Float value1, Float value2) {
            addCriterion("salldiscount between", value1, value2, "salldiscount");
            return (Criteria) this;
        }

        public Criteria andSalldiscountNotBetween(Float value1, Float value2) {
            addCriterion("salldiscount not between", value1, value2, "salldiscount");
            return (Criteria) this;
        }

        public Criteria andSworkdiscountIsNull() {
            addCriterion("sworkdiscount is null");
            return (Criteria) this;
        }

        public Criteria andSworkdiscountIsNotNull() {
            addCriterion("sworkdiscount is not null");
            return (Criteria) this;
        }

        public Criteria andSworkdiscountEqualTo(Float value) {
            addCriterion("sworkdiscount =", value, "sworkdiscount");
            return (Criteria) this;
        }

        public Criteria andSworkdiscountNotEqualTo(Float value) {
            addCriterion("sworkdiscount <>", value, "sworkdiscount");
            return (Criteria) this;
        }

        public Criteria andSworkdiscountGreaterThan(Float value) {
            addCriterion("sworkdiscount >", value, "sworkdiscount");
            return (Criteria) this;
        }

        public Criteria andSworkdiscountGreaterThanOrEqualTo(Float value) {
            addCriterion("sworkdiscount >=", value, "sworkdiscount");
            return (Criteria) this;
        }

        public Criteria andSworkdiscountLessThan(Float value) {
            addCriterion("sworkdiscount <", value, "sworkdiscount");
            return (Criteria) this;
        }

        public Criteria andSworkdiscountLessThanOrEqualTo(Float value) {
            addCriterion("sworkdiscount <=", value, "sworkdiscount");
            return (Criteria) this;
        }

        public Criteria andSworkdiscountIn(List<Float> values) {
            addCriterion("sworkdiscount in", values, "sworkdiscount");
            return (Criteria) this;
        }

        public Criteria andSworkdiscountNotIn(List<Float> values) {
            addCriterion("sworkdiscount not in", values, "sworkdiscount");
            return (Criteria) this;
        }

        public Criteria andSworkdiscountBetween(Float value1, Float value2) {
            addCriterion("sworkdiscount between", value1, value2, "sworkdiscount");
            return (Criteria) this;
        }

        public Criteria andSworkdiscountNotBetween(Float value1, Float value2) {
            addCriterion("sworkdiscount not between", value1, value2, "sworkdiscount");
            return (Criteria) this;
        }

        public Criteria andSshopdiscountIsNull() {
            addCriterion("sshopdiscount is null");
            return (Criteria) this;
        }

        public Criteria andSshopdiscountIsNotNull() {
            addCriterion("sshopdiscount is not null");
            return (Criteria) this;
        }

        public Criteria andSshopdiscountEqualTo(Float value) {
            addCriterion("sshopdiscount =", value, "sshopdiscount");
            return (Criteria) this;
        }

        public Criteria andSshopdiscountNotEqualTo(Float value) {
            addCriterion("sshopdiscount <>", value, "sshopdiscount");
            return (Criteria) this;
        }

        public Criteria andSshopdiscountGreaterThan(Float value) {
            addCriterion("sshopdiscount >", value, "sshopdiscount");
            return (Criteria) this;
        }

        public Criteria andSshopdiscountGreaterThanOrEqualTo(Float value) {
            addCriterion("sshopdiscount >=", value, "sshopdiscount");
            return (Criteria) this;
        }

        public Criteria andSshopdiscountLessThan(Float value) {
            addCriterion("sshopdiscount <", value, "sshopdiscount");
            return (Criteria) this;
        }

        public Criteria andSshopdiscountLessThanOrEqualTo(Float value) {
            addCriterion("sshopdiscount <=", value, "sshopdiscount");
            return (Criteria) this;
        }

        public Criteria andSshopdiscountIn(List<Float> values) {
            addCriterion("sshopdiscount in", values, "sshopdiscount");
            return (Criteria) this;
        }

        public Criteria andSshopdiscountNotIn(List<Float> values) {
            addCriterion("sshopdiscount not in", values, "sshopdiscount");
            return (Criteria) this;
        }

        public Criteria andSshopdiscountBetween(Float value1, Float value2) {
            addCriterion("sshopdiscount between", value1, value2, "sshopdiscount");
            return (Criteria) this;
        }

        public Criteria andSshopdiscountNotBetween(Float value1, Float value2) {
            addCriterion("sshopdiscount not between", value1, value2, "sshopdiscount");
            return (Criteria) this;
        }

        public Criteria andSdiscountIsNull() {
            addCriterion("sdiscount is null");
            return (Criteria) this;
        }

        public Criteria andSdiscountIsNotNull() {
            addCriterion("sdiscount is not null");
            return (Criteria) this;
        }

        public Criteria andSdiscountEqualTo(Float value) {
            addCriterion("sdiscount =", value, "sdiscount");
            return (Criteria) this;
        }

        public Criteria andSdiscountNotEqualTo(Float value) {
            addCriterion("sdiscount <>", value, "sdiscount");
            return (Criteria) this;
        }

        public Criteria andSdiscountGreaterThan(Float value) {
            addCriterion("sdiscount >", value, "sdiscount");
            return (Criteria) this;
        }

        public Criteria andSdiscountGreaterThanOrEqualTo(Float value) {
            addCriterion("sdiscount >=", value, "sdiscount");
            return (Criteria) this;
        }

        public Criteria andSdiscountLessThan(Float value) {
            addCriterion("sdiscount <", value, "sdiscount");
            return (Criteria) this;
        }

        public Criteria andSdiscountLessThanOrEqualTo(Float value) {
            addCriterion("sdiscount <=", value, "sdiscount");
            return (Criteria) this;
        }

        public Criteria andSdiscountIn(List<Float> values) {
            addCriterion("sdiscount in", values, "sdiscount");
            return (Criteria) this;
        }

        public Criteria andSdiscountNotIn(List<Float> values) {
            addCriterion("sdiscount not in", values, "sdiscount");
            return (Criteria) this;
        }

        public Criteria andSdiscountBetween(Float value1, Float value2) {
            addCriterion("sdiscount between", value1, value2, "sdiscount");
            return (Criteria) this;
        }

        public Criteria andSdiscountNotBetween(Float value1, Float value2) {
            addCriterion("sdiscount not between", value1, value2, "sdiscount");
            return (Criteria) this;
        }

        public Criteria andJobResumeIsNull() {
            addCriterion("job_resume is null");
            return (Criteria) this;
        }

        public Criteria andJobResumeIsNotNull() {
            addCriterion("job_resume is not null");
            return (Criteria) this;
        }

        public Criteria andJobResumeEqualTo(String value) {
            addCriterion("job_resume =", value, "jobResume");
            return (Criteria) this;
        }

        public Criteria andJobResumeNotEqualTo(String value) {
            addCriterion("job_resume <>", value, "jobResume");
            return (Criteria) this;
        }

        public Criteria andJobResumeGreaterThan(String value) {
            addCriterion("job_resume >", value, "jobResume");
            return (Criteria) this;
        }

        public Criteria andJobResumeGreaterThanOrEqualTo(String value) {
            addCriterion("job_resume >=", value, "jobResume");
            return (Criteria) this;
        }

        public Criteria andJobResumeLessThan(String value) {
            addCriterion("job_resume <", value, "jobResume");
            return (Criteria) this;
        }

        public Criteria andJobResumeLessThanOrEqualTo(String value) {
            addCriterion("job_resume <=", value, "jobResume");
            return (Criteria) this;
        }

        public Criteria andJobResumeLike(String value) {
            addCriterion("job_resume like", value, "jobResume");
            return (Criteria) this;
        }

        public Criteria andJobResumeNotLike(String value) {
            addCriterion("job_resume not like", value, "jobResume");
            return (Criteria) this;
        }

        public Criteria andJobResumeIn(List<String> values) {
            addCriterion("job_resume in", values, "jobResume");
            return (Criteria) this;
        }

        public Criteria andJobResumeNotIn(List<String> values) {
            addCriterion("job_resume not in", values, "jobResume");
            return (Criteria) this;
        }

        public Criteria andJobResumeBetween(String value1, String value2) {
            addCriterion("job_resume between", value1, value2, "jobResume");
            return (Criteria) this;
        }

        public Criteria andJobResumeNotBetween(String value1, String value2) {
            addCriterion("job_resume not between", value1, value2, "jobResume");
            return (Criteria) this;
        }

        public Criteria andEducationExperienceIsNull() {
            addCriterion("education_experience is null");
            return (Criteria) this;
        }

        public Criteria andEducationExperienceIsNotNull() {
            addCriterion("education_experience is not null");
            return (Criteria) this;
        }

        public Criteria andEducationExperienceEqualTo(String value) {
            addCriterion("education_experience =", value, "educationExperience");
            return (Criteria) this;
        }

        public Criteria andEducationExperienceNotEqualTo(String value) {
            addCriterion("education_experience <>", value, "educationExperience");
            return (Criteria) this;
        }

        public Criteria andEducationExperienceGreaterThan(String value) {
            addCriterion("education_experience >", value, "educationExperience");
            return (Criteria) this;
        }

        public Criteria andEducationExperienceGreaterThanOrEqualTo(String value) {
            addCriterion("education_experience >=", value, "educationExperience");
            return (Criteria) this;
        }

        public Criteria andEducationExperienceLessThan(String value) {
            addCriterion("education_experience <", value, "educationExperience");
            return (Criteria) this;
        }

        public Criteria andEducationExperienceLessThanOrEqualTo(String value) {
            addCriterion("education_experience <=", value, "educationExperience");
            return (Criteria) this;
        }

        public Criteria andEducationExperienceLike(String value) {
            addCriterion("education_experience like", value, "educationExperience");
            return (Criteria) this;
        }

        public Criteria andEducationExperienceNotLike(String value) {
            addCriterion("education_experience not like", value, "educationExperience");
            return (Criteria) this;
        }

        public Criteria andEducationExperienceIn(List<String> values) {
            addCriterion("education_experience in", values, "educationExperience");
            return (Criteria) this;
        }

        public Criteria andEducationExperienceNotIn(List<String> values) {
            addCriterion("education_experience not in", values, "educationExperience");
            return (Criteria) this;
        }

        public Criteria andEducationExperienceBetween(String value1, String value2) {
            addCriterion("education_experience between", value1, value2, "educationExperience");
            return (Criteria) this;
        }

        public Criteria andEducationExperienceNotBetween(String value1, String value2) {
            addCriterion("education_experience not between", value1, value2, "educationExperience");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberIsNull() {
            addCriterion("family_member is null");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberIsNotNull() {
            addCriterion("family_member is not null");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberEqualTo(String value) {
            addCriterion("family_member =", value, "familyMember");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberNotEqualTo(String value) {
            addCriterion("family_member <>", value, "familyMember");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberGreaterThan(String value) {
            addCriterion("family_member >", value, "familyMember");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberGreaterThanOrEqualTo(String value) {
            addCriterion("family_member >=", value, "familyMember");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberLessThan(String value) {
            addCriterion("family_member <", value, "familyMember");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberLessThanOrEqualTo(String value) {
            addCriterion("family_member <=", value, "familyMember");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberLike(String value) {
            addCriterion("family_member like", value, "familyMember");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberNotLike(String value) {
            addCriterion("family_member not like", value, "familyMember");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberIn(List<String> values) {
            addCriterion("family_member in", values, "familyMember");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberNotIn(List<String> values) {
            addCriterion("family_member not in", values, "familyMember");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberBetween(String value1, String value2) {
            addCriterion("family_member between", value1, value2, "familyMember");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberNotBetween(String value1, String value2) {
            addCriterion("family_member not between", value1, value2, "familyMember");
            return (Criteria) this;
        }

        public Criteria andDisciplinaryRecordsIsNull() {
            addCriterion("Disciplinary_records is null");
            return (Criteria) this;
        }

        public Criteria andDisciplinaryRecordsIsNotNull() {
            addCriterion("Disciplinary_records is not null");
            return (Criteria) this;
        }

        public Criteria andDisciplinaryRecordsEqualTo(String value) {
            addCriterion("Disciplinary_records =", value, "disciplinaryRecords");
            return (Criteria) this;
        }

        public Criteria andDisciplinaryRecordsNotEqualTo(String value) {
            addCriterion("Disciplinary_records <>", value, "disciplinaryRecords");
            return (Criteria) this;
        }

        public Criteria andDisciplinaryRecordsGreaterThan(String value) {
            addCriterion("Disciplinary_records >", value, "disciplinaryRecords");
            return (Criteria) this;
        }

        public Criteria andDisciplinaryRecordsGreaterThanOrEqualTo(String value) {
            addCriterion("Disciplinary_records >=", value, "disciplinaryRecords");
            return (Criteria) this;
        }

        public Criteria andDisciplinaryRecordsLessThan(String value) {
            addCriterion("Disciplinary_records <", value, "disciplinaryRecords");
            return (Criteria) this;
        }

        public Criteria andDisciplinaryRecordsLessThanOrEqualTo(String value) {
            addCriterion("Disciplinary_records <=", value, "disciplinaryRecords");
            return (Criteria) this;
        }

        public Criteria andDisciplinaryRecordsLike(String value) {
            addCriterion("Disciplinary_records like", value, "disciplinaryRecords");
            return (Criteria) this;
        }

        public Criteria andDisciplinaryRecordsNotLike(String value) {
            addCriterion("Disciplinary_records not like", value, "disciplinaryRecords");
            return (Criteria) this;
        }

        public Criteria andDisciplinaryRecordsIn(List<String> values) {
            addCriterion("Disciplinary_records in", values, "disciplinaryRecords");
            return (Criteria) this;
        }

        public Criteria andDisciplinaryRecordsNotIn(List<String> values) {
            addCriterion("Disciplinary_records not in", values, "disciplinaryRecords");
            return (Criteria) this;
        }

        public Criteria andDisciplinaryRecordsBetween(String value1, String value2) {
            addCriterion("Disciplinary_records between", value1, value2, "disciplinaryRecords");
            return (Criteria) this;
        }

        public Criteria andDisciplinaryRecordsNotBetween(String value1, String value2) {
            addCriterion("Disciplinary_records not between", value1, value2, "disciplinaryRecords");
            return (Criteria) this;
        }

        public Criteria andEmploymentAdviceIsNull() {
            addCriterion("Employment_advice is null");
            return (Criteria) this;
        }

        public Criteria andEmploymentAdviceIsNotNull() {
            addCriterion("Employment_advice is not null");
            return (Criteria) this;
        }

        public Criteria andEmploymentAdviceEqualTo(String value) {
            addCriterion("Employment_advice =", value, "employmentAdvice");
            return (Criteria) this;
        }

        public Criteria andEmploymentAdviceNotEqualTo(String value) {
            addCriterion("Employment_advice <>", value, "employmentAdvice");
            return (Criteria) this;
        }

        public Criteria andEmploymentAdviceGreaterThan(String value) {
            addCriterion("Employment_advice >", value, "employmentAdvice");
            return (Criteria) this;
        }

        public Criteria andEmploymentAdviceGreaterThanOrEqualTo(String value) {
            addCriterion("Employment_advice >=", value, "employmentAdvice");
            return (Criteria) this;
        }

        public Criteria andEmploymentAdviceLessThan(String value) {
            addCriterion("Employment_advice <", value, "employmentAdvice");
            return (Criteria) this;
        }

        public Criteria andEmploymentAdviceLessThanOrEqualTo(String value) {
            addCriterion("Employment_advice <=", value, "employmentAdvice");
            return (Criteria) this;
        }

        public Criteria andEmploymentAdviceLike(String value) {
            addCriterion("Employment_advice like", value, "employmentAdvice");
            return (Criteria) this;
        }

        public Criteria andEmploymentAdviceNotLike(String value) {
            addCriterion("Employment_advice not like", value, "employmentAdvice");
            return (Criteria) this;
        }

        public Criteria andEmploymentAdviceIn(List<String> values) {
            addCriterion("Employment_advice in", values, "employmentAdvice");
            return (Criteria) this;
        }

        public Criteria andEmploymentAdviceNotIn(List<String> values) {
            addCriterion("Employment_advice not in", values, "employmentAdvice");
            return (Criteria) this;
        }

        public Criteria andEmploymentAdviceBetween(String value1, String value2) {
            addCriterion("Employment_advice between", value1, value2, "employmentAdvice");
            return (Criteria) this;
        }

        public Criteria andEmploymentAdviceNotBetween(String value1, String value2) {
            addCriterion("Employment_advice not between", value1, value2, "employmentAdvice");
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