package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BillsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BillsExample() {
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

        public Criteria andBidIsNull() {
            addCriterion("bid is null");
            return (Criteria) this;
        }

        public Criteria andBidIsNotNull() {
            addCriterion("bid is not null");
            return (Criteria) this;
        }

        public Criteria andBidEqualTo(String value) {
            addCriterion("bid =", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotEqualTo(String value) {
            addCriterion("bid <>", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidGreaterThan(String value) {
            addCriterion("bid >", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidGreaterThanOrEqualTo(String value) {
            addCriterion("bid >=", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidLessThan(String value) {
            addCriterion("bid <", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidLessThanOrEqualTo(String value) {
            addCriterion("bid <=", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidLike(String value) {
            addCriterion("bid like", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotLike(String value) {
            addCriterion("bid not like", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidIn(List<String> values) {
            addCriterion("bid in", values, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotIn(List<String> values) {
            addCriterion("bid not in", values, "bid");
            return (Criteria) this;
        }

        public Criteria andBidBetween(String value1, String value2) {
            addCriterion("bid between", value1, value2, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotBetween(String value1, String value2) {
            addCriterion("bid not between", value1, value2, "bid");
            return (Criteria) this;
        }

        public Criteria andBstateIsNull() {
            addCriterion("bstate is null");
            return (Criteria) this;
        }

        public Criteria andBstateIsNotNull() {
            addCriterion("bstate is not null");
            return (Criteria) this;
        }

        public Criteria andBstateEqualTo(Integer value) {
            addCriterion("bstate =", value, "bstate");
            return (Criteria) this;
        }

        public Criteria andBstateNotEqualTo(Integer value) {
            addCriterion("bstate <>", value, "bstate");
            return (Criteria) this;
        }

        public Criteria andBstateGreaterThan(Integer value) {
            addCriterion("bstate >", value, "bstate");
            return (Criteria) this;
        }

        public Criteria andBstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("bstate >=", value, "bstate");
            return (Criteria) this;
        }

        public Criteria andBstateLessThan(Integer value) {
            addCriterion("bstate <", value, "bstate");
            return (Criteria) this;
        }

        public Criteria andBstateLessThanOrEqualTo(Integer value) {
            addCriterion("bstate <=", value, "bstate");
            return (Criteria) this;
        }

        public Criteria andBstateIn(List<Integer> values) {
            addCriterion("bstate in", values, "bstate");
            return (Criteria) this;
        }

        public Criteria andBstateNotIn(List<Integer> values) {
            addCriterion("bstate not in", values, "bstate");
            return (Criteria) this;
        }

        public Criteria andBstateBetween(Integer value1, Integer value2) {
            addCriterion("bstate between", value1, value2, "bstate");
            return (Criteria) this;
        }

        public Criteria andBstateNotBetween(Integer value1, Integer value2) {
            addCriterion("bstate not between", value1, value2, "bstate");
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

        public Criteria andBtidIsNull() {
            addCriterion("btid is null");
            return (Criteria) this;
        }

        public Criteria andBtidIsNotNull() {
            addCriterion("btid is not null");
            return (Criteria) this;
        }

        public Criteria andBtidEqualTo(Integer value) {
            addCriterion("btid =", value, "btid");
            return (Criteria) this;
        }

        public Criteria andBtidNotEqualTo(Integer value) {
            addCriterion("btid <>", value, "btid");
            return (Criteria) this;
        }

        public Criteria andBtidGreaterThan(Integer value) {
            addCriterion("btid >", value, "btid");
            return (Criteria) this;
        }

        public Criteria andBtidGreaterThanOrEqualTo(Integer value) {
            addCriterion("btid >=", value, "btid");
            return (Criteria) this;
        }

        public Criteria andBtidLessThan(Integer value) {
            addCriterion("btid <", value, "btid");
            return (Criteria) this;
        }

        public Criteria andBtidLessThanOrEqualTo(Integer value) {
            addCriterion("btid <=", value, "btid");
            return (Criteria) this;
        }

        public Criteria andBtidIn(List<Integer> values) {
            addCriterion("btid in", values, "btid");
            return (Criteria) this;
        }

        public Criteria andBtidNotIn(List<Integer> values) {
            addCriterion("btid not in", values, "btid");
            return (Criteria) this;
        }

        public Criteria andBtidBetween(Integer value1, Integer value2) {
            addCriterion("btid between", value1, value2, "btid");
            return (Criteria) this;
        }

        public Criteria andBtidNotBetween(Integer value1, Integer value2) {
            addCriterion("btid not between", value1, value2, "btid");
            return (Criteria) this;
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

        public Criteria andQualifiedIsNull() {
            addCriterion("qualified is null");
            return (Criteria) this;
        }

        public Criteria andQualifiedIsNotNull() {
            addCriterion("qualified is not null");
            return (Criteria) this;
        }

        public Criteria andQualifiedEqualTo(Integer value) {
            addCriterion("qualified =", value, "qualified");
            return (Criteria) this;
        }

        public Criteria andQualifiedNotEqualTo(Integer value) {
            addCriterion("qualified <>", value, "qualified");
            return (Criteria) this;
        }

        public Criteria andQualifiedGreaterThan(Integer value) {
            addCriterion("qualified >", value, "qualified");
            return (Criteria) this;
        }

        public Criteria andQualifiedGreaterThanOrEqualTo(Integer value) {
            addCriterion("qualified >=", value, "qualified");
            return (Criteria) this;
        }

        public Criteria andQualifiedLessThan(Integer value) {
            addCriterion("qualified <", value, "qualified");
            return (Criteria) this;
        }

        public Criteria andQualifiedLessThanOrEqualTo(Integer value) {
            addCriterion("qualified <=", value, "qualified");
            return (Criteria) this;
        }

        public Criteria andQualifiedIn(List<Integer> values) {
            addCriterion("qualified in", values, "qualified");
            return (Criteria) this;
        }

        public Criteria andQualifiedNotIn(List<Integer> values) {
            addCriterion("qualified not in", values, "qualified");
            return (Criteria) this;
        }

        public Criteria andQualifiedBetween(Integer value1, Integer value2) {
            addCriterion("qualified between", value1, value2, "qualified");
            return (Criteria) this;
        }

        public Criteria andQualifiedNotBetween(Integer value1, Integer value2) {
            addCriterion("qualified not between", value1, value2, "qualified");
            return (Criteria) this;
        }

        public Criteria andReworknumIsNull() {
            addCriterion("reworknum is null");
            return (Criteria) this;
        }

        public Criteria andReworknumIsNotNull() {
            addCriterion("reworknum is not null");
            return (Criteria) this;
        }

        public Criteria andReworknumEqualTo(Integer value) {
            addCriterion("reworknum =", value, "reworknum");
            return (Criteria) this;
        }

        public Criteria andReworknumNotEqualTo(Integer value) {
            addCriterion("reworknum <>", value, "reworknum");
            return (Criteria) this;
        }

        public Criteria andReworknumGreaterThan(Integer value) {
            addCriterion("reworknum >", value, "reworknum");
            return (Criteria) this;
        }

        public Criteria andReworknumGreaterThanOrEqualTo(Integer value) {
            addCriterion("reworknum >=", value, "reworknum");
            return (Criteria) this;
        }

        public Criteria andReworknumLessThan(Integer value) {
            addCriterion("reworknum <", value, "reworknum");
            return (Criteria) this;
        }

        public Criteria andReworknumLessThanOrEqualTo(Integer value) {
            addCriterion("reworknum <=", value, "reworknum");
            return (Criteria) this;
        }

        public Criteria andReworknumIn(List<Integer> values) {
            addCriterion("reworknum in", values, "reworknum");
            return (Criteria) this;
        }

        public Criteria andReworknumNotIn(List<Integer> values) {
            addCriterion("reworknum not in", values, "reworknum");
            return (Criteria) this;
        }

        public Criteria andReworknumBetween(Integer value1, Integer value2) {
            addCriterion("reworknum between", value1, value2, "reworknum");
            return (Criteria) this;
        }

        public Criteria andReworknumNotBetween(Integer value1, Integer value2) {
            addCriterion("reworknum not between", value1, value2, "reworknum");
            return (Criteria) this;
        }

        public Criteria andRespeopleIsNull() {
            addCriterion("respeople is null");
            return (Criteria) this;
        }

        public Criteria andRespeopleIsNotNull() {
            addCriterion("respeople is not null");
            return (Criteria) this;
        }

        public Criteria andRespeopleEqualTo(String value) {
            addCriterion("respeople =", value, "respeople");
            return (Criteria) this;
        }

        public Criteria andRespeopleNotEqualTo(String value) {
            addCriterion("respeople <>", value, "respeople");
            return (Criteria) this;
        }

        public Criteria andRespeopleGreaterThan(String value) {
            addCriterion("respeople >", value, "respeople");
            return (Criteria) this;
        }

        public Criteria andRespeopleGreaterThanOrEqualTo(String value) {
            addCriterion("respeople >=", value, "respeople");
            return (Criteria) this;
        }

        public Criteria andRespeopleLessThan(String value) {
            addCriterion("respeople <", value, "respeople");
            return (Criteria) this;
        }

        public Criteria andRespeopleLessThanOrEqualTo(String value) {
            addCriterion("respeople <=", value, "respeople");
            return (Criteria) this;
        }

        public Criteria andRespeopleLike(String value) {
            addCriterion("respeople like", value, "respeople");
            return (Criteria) this;
        }

        public Criteria andRespeopleNotLike(String value) {
            addCriterion("respeople not like", value, "respeople");
            return (Criteria) this;
        }

        public Criteria andRespeopleIn(List<String> values) {
            addCriterion("respeople in", values, "respeople");
            return (Criteria) this;
        }

        public Criteria andRespeopleNotIn(List<String> values) {
            addCriterion("respeople not in", values, "respeople");
            return (Criteria) this;
        }

        public Criteria andRespeopleBetween(String value1, String value2) {
            addCriterion("respeople between", value1, value2, "respeople");
            return (Criteria) this;
        }

        public Criteria andRespeopleNotBetween(String value1, String value2) {
            addCriterion("respeople not between", value1, value2, "respeople");
            return (Criteria) this;
        }

        public Criteria andDelaysreasonIsNull() {
            addCriterion("Delaysreason is null");
            return (Criteria) this;
        }

        public Criteria andDelaysreasonIsNotNull() {
            addCriterion("Delaysreason is not null");
            return (Criteria) this;
        }

        public Criteria andDelaysreasonEqualTo(String value) {
            addCriterion("Delaysreason =", value, "delaysreason");
            return (Criteria) this;
        }

        public Criteria andDelaysreasonNotEqualTo(String value) {
            addCriterion("Delaysreason <>", value, "delaysreason");
            return (Criteria) this;
        }

        public Criteria andDelaysreasonGreaterThan(String value) {
            addCriterion("Delaysreason >", value, "delaysreason");
            return (Criteria) this;
        }

        public Criteria andDelaysreasonGreaterThanOrEqualTo(String value) {
            addCriterion("Delaysreason >=", value, "delaysreason");
            return (Criteria) this;
        }

        public Criteria andDelaysreasonLessThan(String value) {
            addCriterion("Delaysreason <", value, "delaysreason");
            return (Criteria) this;
        }

        public Criteria andDelaysreasonLessThanOrEqualTo(String value) {
            addCriterion("Delaysreason <=", value, "delaysreason");
            return (Criteria) this;
        }

        public Criteria andDelaysreasonLike(String value) {
            addCriterion("Delaysreason like", value, "delaysreason");
            return (Criteria) this;
        }

        public Criteria andDelaysreasonNotLike(String value) {
            addCriterion("Delaysreason not like", value, "delaysreason");
            return (Criteria) this;
        }

        public Criteria andDelaysreasonIn(List<String> values) {
            addCriterion("Delaysreason in", values, "delaysreason");
            return (Criteria) this;
        }

        public Criteria andDelaysreasonNotIn(List<String> values) {
            addCriterion("Delaysreason not in", values, "delaysreason");
            return (Criteria) this;
        }

        public Criteria andDelaysreasonBetween(String value1, String value2) {
            addCriterion("Delaysreason between", value1, value2, "delaysreason");
            return (Criteria) this;
        }

        public Criteria andDelaysreasonNotBetween(String value1, String value2) {
            addCriterion("Delaysreason not between", value1, value2, "delaysreason");
            return (Criteria) this;
        }

        public Criteria andReworkreasonIsNull() {
            addCriterion("Reworkreason is null");
            return (Criteria) this;
        }

        public Criteria andReworkreasonIsNotNull() {
            addCriterion("Reworkreason is not null");
            return (Criteria) this;
        }

        public Criteria andReworkreasonEqualTo(String value) {
            addCriterion("Reworkreason =", value, "reworkreason");
            return (Criteria) this;
        }

        public Criteria andReworkreasonNotEqualTo(String value) {
            addCriterion("Reworkreason <>", value, "reworkreason");
            return (Criteria) this;
        }

        public Criteria andReworkreasonGreaterThan(String value) {
            addCriterion("Reworkreason >", value, "reworkreason");
            return (Criteria) this;
        }

        public Criteria andReworkreasonGreaterThanOrEqualTo(String value) {
            addCriterion("Reworkreason >=", value, "reworkreason");
            return (Criteria) this;
        }

        public Criteria andReworkreasonLessThan(String value) {
            addCriterion("Reworkreason <", value, "reworkreason");
            return (Criteria) this;
        }

        public Criteria andReworkreasonLessThanOrEqualTo(String value) {
            addCriterion("Reworkreason <=", value, "reworkreason");
            return (Criteria) this;
        }

        public Criteria andReworkreasonLike(String value) {
            addCriterion("Reworkreason like", value, "reworkreason");
            return (Criteria) this;
        }

        public Criteria andReworkreasonNotLike(String value) {
            addCriterion("Reworkreason not like", value, "reworkreason");
            return (Criteria) this;
        }

        public Criteria andReworkreasonIn(List<String> values) {
            addCriterion("Reworkreason in", values, "reworkreason");
            return (Criteria) this;
        }

        public Criteria andReworkreasonNotIn(List<String> values) {
            addCriterion("Reworkreason not in", values, "reworkreason");
            return (Criteria) this;
        }

        public Criteria andReworkreasonBetween(String value1, String value2) {
            addCriterion("Reworkreason between", value1, value2, "reworkreason");
            return (Criteria) this;
        }

        public Criteria andReworkreasonNotBetween(String value1, String value2) {
            addCriterion("Reworkreason not between", value1, value2, "reworkreason");
            return (Criteria) this;
        }

        public Criteria andExpectedtimeIsNull() {
            addCriterion("Expectedtime is null");
            return (Criteria) this;
        }

        public Criteria andExpectedtimeIsNotNull() {
            addCriterion("Expectedtime is not null");
            return (Criteria) this;
        }

        public Criteria andExpectedtimeEqualTo(Date value) {
            addCriterion("Expectedtime =", value, "expectedtime");
            return (Criteria) this;
        }

        public Criteria andExpectedtimeNotEqualTo(Date value) {
            addCriterion("Expectedtime <>", value, "expectedtime");
            return (Criteria) this;
        }

        public Criteria andExpectedtimeGreaterThan(Date value) {
            addCriterion("Expectedtime >", value, "expectedtime");
            return (Criteria) this;
        }

        public Criteria andExpectedtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("Expectedtime >=", value, "expectedtime");
            return (Criteria) this;
        }

        public Criteria andExpectedtimeLessThan(Date value) {
            addCriterion("Expectedtime <", value, "expectedtime");
            return (Criteria) this;
        }

        public Criteria andExpectedtimeLessThanOrEqualTo(Date value) {
            addCriterion("Expectedtime <=", value, "expectedtime");
            return (Criteria) this;
        }

        public Criteria andExpectedtimeIn(List<Date> values) {
            addCriterion("Expectedtime in", values, "expectedtime");
            return (Criteria) this;
        }

        public Criteria andExpectedtimeNotIn(List<Date> values) {
            addCriterion("Expectedtime not in", values, "expectedtime");
            return (Criteria) this;
        }

        public Criteria andExpectedtimeBetween(Date value1, Date value2) {
            addCriterion("Expectedtime between", value1, value2, "expectedtime");
            return (Criteria) this;
        }

        public Criteria andExpectedtimeNotBetween(Date value1, Date value2) {
            addCriterion("Expectedtime not between", value1, value2, "expectedtime");
            return (Criteria) this;
        }

        public Criteria andCompletiontimeIsNull() {
            addCriterion("Completiontime is null");
            return (Criteria) this;
        }

        public Criteria andCompletiontimeIsNotNull() {
            addCriterion("Completiontime is not null");
            return (Criteria) this;
        }

        public Criteria andCompletiontimeEqualTo(Date value) {
            addCriterion("Completiontime =", value, "completiontime");
            return (Criteria) this;
        }

        public Criteria andCompletiontimeNotEqualTo(Date value) {
            addCriterion("Completiontime <>", value, "completiontime");
            return (Criteria) this;
        }

        public Criteria andCompletiontimeGreaterThan(Date value) {
            addCriterion("Completiontime >", value, "completiontime");
            return (Criteria) this;
        }

        public Criteria andCompletiontimeGreaterThanOrEqualTo(Date value) {
            addCriterion("Completiontime >=", value, "completiontime");
            return (Criteria) this;
        }

        public Criteria andCompletiontimeLessThan(Date value) {
            addCriterion("Completiontime <", value, "completiontime");
            return (Criteria) this;
        }

        public Criteria andCompletiontimeLessThanOrEqualTo(Date value) {
            addCriterion("Completiontime <=", value, "completiontime");
            return (Criteria) this;
        }

        public Criteria andCompletiontimeIn(List<Date> values) {
            addCriterion("Completiontime in", values, "completiontime");
            return (Criteria) this;
        }

        public Criteria andCompletiontimeNotIn(List<Date> values) {
            addCriterion("Completiontime not in", values, "completiontime");
            return (Criteria) this;
        }

        public Criteria andCompletiontimeBetween(Date value1, Date value2) {
            addCriterion("Completiontime between", value1, value2, "completiontime");
            return (Criteria) this;
        }

        public Criteria andCompletiontimeNotBetween(Date value1, Date value2) {
            addCriterion("Completiontime not between", value1, value2, "completiontime");
            return (Criteria) this;
        }

        public Criteria andPenaltyamountIsNull() {
            addCriterion("Penaltyamount is null");
            return (Criteria) this;
        }

        public Criteria andPenaltyamountIsNotNull() {
            addCriterion("Penaltyamount is not null");
            return (Criteria) this;
        }

        public Criteria andPenaltyamountEqualTo(Float value) {
            addCriterion("Penaltyamount =", value, "penaltyamount");
            return (Criteria) this;
        }

        public Criteria andPenaltyamountNotEqualTo(Float value) {
            addCriterion("Penaltyamount <>", value, "penaltyamount");
            return (Criteria) this;
        }

        public Criteria andPenaltyamountGreaterThan(Float value) {
            addCriterion("Penaltyamount >", value, "penaltyamount");
            return (Criteria) this;
        }

        public Criteria andPenaltyamountGreaterThanOrEqualTo(Float value) {
            addCriterion("Penaltyamount >=", value, "penaltyamount");
            return (Criteria) this;
        }

        public Criteria andPenaltyamountLessThan(Float value) {
            addCriterion("Penaltyamount <", value, "penaltyamount");
            return (Criteria) this;
        }

        public Criteria andPenaltyamountLessThanOrEqualTo(Float value) {
            addCriterion("Penaltyamount <=", value, "penaltyamount");
            return (Criteria) this;
        }

        public Criteria andPenaltyamountIn(List<Float> values) {
            addCriterion("Penaltyamount in", values, "penaltyamount");
            return (Criteria) this;
        }

        public Criteria andPenaltyamountNotIn(List<Float> values) {
            addCriterion("Penaltyamount not in", values, "penaltyamount");
            return (Criteria) this;
        }

        public Criteria andPenaltyamountBetween(Float value1, Float value2) {
            addCriterion("Penaltyamount between", value1, value2, "penaltyamount");
            return (Criteria) this;
        }

        public Criteria andPenaltyamountNotBetween(Float value1, Float value2) {
            addCriterion("Penaltyamount not between", value1, value2, "penaltyamount");
            return (Criteria) this;
        }

        public Criteria andQmemberIsNull() {
            addCriterion("qmember is null");
            return (Criteria) this;
        }

        public Criteria andQmemberIsNotNull() {
            addCriterion("qmember is not null");
            return (Criteria) this;
        }

        public Criteria andQmemberEqualTo(String value) {
            addCriterion("qmember =", value, "qmember");
            return (Criteria) this;
        }

        public Criteria andQmemberNotEqualTo(String value) {
            addCriterion("qmember <>", value, "qmember");
            return (Criteria) this;
        }

        public Criteria andQmemberGreaterThan(String value) {
            addCriterion("qmember >", value, "qmember");
            return (Criteria) this;
        }

        public Criteria andQmemberGreaterThanOrEqualTo(String value) {
            addCriterion("qmember >=", value, "qmember");
            return (Criteria) this;
        }

        public Criteria andQmemberLessThan(String value) {
            addCriterion("qmember <", value, "qmember");
            return (Criteria) this;
        }

        public Criteria andQmemberLessThanOrEqualTo(String value) {
            addCriterion("qmember <=", value, "qmember");
            return (Criteria) this;
        }

        public Criteria andQmemberLike(String value) {
            addCriterion("qmember like", value, "qmember");
            return (Criteria) this;
        }

        public Criteria andQmemberNotLike(String value) {
            addCriterion("qmember not like", value, "qmember");
            return (Criteria) this;
        }

        public Criteria andQmemberIn(List<String> values) {
            addCriterion("qmember in", values, "qmember");
            return (Criteria) this;
        }

        public Criteria andQmemberNotIn(List<String> values) {
            addCriterion("qmember not in", values, "qmember");
            return (Criteria) this;
        }

        public Criteria andQmemberBetween(String value1, String value2) {
            addCriterion("qmember between", value1, value2, "qmember");
            return (Criteria) this;
        }

        public Criteria andQmemberNotBetween(String value1, String value2) {
            addCriterion("qmember not between", value1, value2, "qmember");
            return (Criteria) this;
        }

        public Criteria andPickcarIsNull() {
            addCriterion("Pickcar is null");
            return (Criteria) this;
        }

        public Criteria andPickcarIsNotNull() {
            addCriterion("Pickcar is not null");
            return (Criteria) this;
        }

        public Criteria andPickcarEqualTo(String value) {
            addCriterion("Pickcar =", value, "pickcar");
            return (Criteria) this;
        }

        public Criteria andPickcarNotEqualTo(String value) {
            addCriterion("Pickcar <>", value, "pickcar");
            return (Criteria) this;
        }

        public Criteria andPickcarGreaterThan(String value) {
            addCriterion("Pickcar >", value, "pickcar");
            return (Criteria) this;
        }

        public Criteria andPickcarGreaterThanOrEqualTo(String value) {
            addCriterion("Pickcar >=", value, "pickcar");
            return (Criteria) this;
        }

        public Criteria andPickcarLessThan(String value) {
            addCriterion("Pickcar <", value, "pickcar");
            return (Criteria) this;
        }

        public Criteria andPickcarLessThanOrEqualTo(String value) {
            addCriterion("Pickcar <=", value, "pickcar");
            return (Criteria) this;
        }

        public Criteria andPickcarLike(String value) {
            addCriterion("Pickcar like", value, "pickcar");
            return (Criteria) this;
        }

        public Criteria andPickcarNotLike(String value) {
            addCriterion("Pickcar not like", value, "pickcar");
            return (Criteria) this;
        }

        public Criteria andPickcarIn(List<String> values) {
            addCriterion("Pickcar in", values, "pickcar");
            return (Criteria) this;
        }

        public Criteria andPickcarNotIn(List<String> values) {
            addCriterion("Pickcar not in", values, "pickcar");
            return (Criteria) this;
        }

        public Criteria andPickcarBetween(String value1, String value2) {
            addCriterion("Pickcar between", value1, value2, "pickcar");
            return (Criteria) this;
        }

        public Criteria andPickcarNotBetween(String value1, String value2) {
            addCriterion("Pickcar not between", value1, value2, "pickcar");
            return (Criteria) this;
        }

        public Criteria andOrdertimeIsNull() {
            addCriterion("Ordertime is null");
            return (Criteria) this;
        }

        public Criteria andOrdertimeIsNotNull() {
            addCriterion("Ordertime is not null");
            return (Criteria) this;
        }

        public Criteria andOrdertimeEqualTo(Date value) {
            addCriterion("Ordertime =", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeNotEqualTo(Date value) {
            addCriterion("Ordertime <>", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeGreaterThan(Date value) {
            addCriterion("Ordertime >", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeGreaterThanOrEqualTo(Date value) {
            addCriterion("Ordertime >=", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeLessThan(Date value) {
            addCriterion("Ordertime <", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeLessThanOrEqualTo(Date value) {
            addCriterion("Ordertime <=", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeIn(List<Date> values) {
            addCriterion("Ordertime in", values, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeNotIn(List<Date> values) {
            addCriterion("Ordertime not in", values, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeBetween(Date value1, Date value2) {
            addCriterion("Ordertime between", value1, value2, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeNotBetween(Date value1, Date value2) {
            addCriterion("Ordertime not between", value1, value2, "ordertime");
            return (Criteria) this;
        }

        public Criteria andClearingtimeIsNull() {
            addCriterion("Clearingtime is null");
            return (Criteria) this;
        }

        public Criteria andClearingtimeIsNotNull() {
            addCriterion("Clearingtime is not null");
            return (Criteria) this;
        }

        public Criteria andClearingtimeEqualTo(Date value) {
            addCriterion("Clearingtime =", value, "clearingtime");
            return (Criteria) this;
        }

        public Criteria andClearingtimeNotEqualTo(Date value) {
            addCriterion("Clearingtime <>", value, "clearingtime");
            return (Criteria) this;
        }

        public Criteria andClearingtimeGreaterThan(Date value) {
            addCriterion("Clearingtime >", value, "clearingtime");
            return (Criteria) this;
        }

        public Criteria andClearingtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("Clearingtime >=", value, "clearingtime");
            return (Criteria) this;
        }

        public Criteria andClearingtimeLessThan(Date value) {
            addCriterion("Clearingtime <", value, "clearingtime");
            return (Criteria) this;
        }

        public Criteria andClearingtimeLessThanOrEqualTo(Date value) {
            addCriterion("Clearingtime <=", value, "clearingtime");
            return (Criteria) this;
        }

        public Criteria andClearingtimeIn(List<Date> values) {
            addCriterion("Clearingtime in", values, "clearingtime");
            return (Criteria) this;
        }

        public Criteria andClearingtimeNotIn(List<Date> values) {
            addCriterion("Clearingtime not in", values, "clearingtime");
            return (Criteria) this;
        }

        public Criteria andClearingtimeBetween(Date value1, Date value2) {
            addCriterion("Clearingtime between", value1, value2, "clearingtime");
            return (Criteria) this;
        }

        public Criteria andClearingtimeNotBetween(Date value1, Date value2) {
            addCriterion("Clearingtime not between", value1, value2, "clearingtime");
            return (Criteria) this;
        }

        public Criteria andForecastmoneyIsNull() {
            addCriterion("forecastmoney is null");
            return (Criteria) this;
        }

        public Criteria andForecastmoneyIsNotNull() {
            addCriterion("forecastmoney is not null");
            return (Criteria) this;
        }

        public Criteria andForecastmoneyEqualTo(Float value) {
            addCriterion("forecastmoney =", value, "forecastmoney");
            return (Criteria) this;
        }

        public Criteria andForecastmoneyNotEqualTo(Float value) {
            addCriterion("forecastmoney <>", value, "forecastmoney");
            return (Criteria) this;
        }

        public Criteria andForecastmoneyGreaterThan(Float value) {
            addCriterion("forecastmoney >", value, "forecastmoney");
            return (Criteria) this;
        }

        public Criteria andForecastmoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("forecastmoney >=", value, "forecastmoney");
            return (Criteria) this;
        }

        public Criteria andForecastmoneyLessThan(Float value) {
            addCriterion("forecastmoney <", value, "forecastmoney");
            return (Criteria) this;
        }

        public Criteria andForecastmoneyLessThanOrEqualTo(Float value) {
            addCriterion("forecastmoney <=", value, "forecastmoney");
            return (Criteria) this;
        }

        public Criteria andForecastmoneyIn(List<Float> values) {
            addCriterion("forecastmoney in", values, "forecastmoney");
            return (Criteria) this;
        }

        public Criteria andForecastmoneyNotIn(List<Float> values) {
            addCriterion("forecastmoney not in", values, "forecastmoney");
            return (Criteria) this;
        }

        public Criteria andForecastmoneyBetween(Float value1, Float value2) {
            addCriterion("forecastmoney between", value1, value2, "forecastmoney");
            return (Criteria) this;
        }

        public Criteria andForecastmoneyNotBetween(Float value1, Float value2) {
            addCriterion("forecastmoney not between", value1, value2, "forecastmoney");
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