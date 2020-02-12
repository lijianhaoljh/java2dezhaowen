package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class DMaintenanceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DMaintenanceExample() {
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

        public Criteria andCnoIsNull() {
            addCriterion("cno is null");
            return (Criteria) this;
        }

        public Criteria andCnoIsNotNull() {
            addCriterion("cno is not null");
            return (Criteria) this;
        }

        public Criteria andCnoEqualTo(Integer value) {
            addCriterion("cno =", value, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoNotEqualTo(Integer value) {
            addCriterion("cno <>", value, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoGreaterThan(Integer value) {
            addCriterion("cno >", value, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("cno >=", value, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoLessThan(Integer value) {
            addCriterion("cno <", value, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoLessThanOrEqualTo(Integer value) {
            addCriterion("cno <=", value, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoIn(List<Integer> values) {
            addCriterion("cno in", values, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoNotIn(List<Integer> values) {
            addCriterion("cno not in", values, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoBetween(Integer value1, Integer value2) {
            addCriterion("cno between", value1, value2, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoNotBetween(Integer value1, Integer value2) {
            addCriterion("cno not between", value1, value2, "cno");
            return (Criteria) this;
        }

        public Criteria andNumIsNull() {
            addCriterion("num is null");
            return (Criteria) this;
        }

        public Criteria andNumIsNotNull() {
            addCriterion("num is not null");
            return (Criteria) this;
        }

        public Criteria andNumEqualTo(Integer value) {
            addCriterion("num =", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotEqualTo(Integer value) {
            addCriterion("num <>", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThan(Integer value) {
            addCriterion("num >", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("num >=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThan(Integer value) {
            addCriterion("num <", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThanOrEqualTo(Integer value) {
            addCriterion("num <=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumIn(List<Integer> values) {
            addCriterion("num in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotIn(List<Integer> values) {
            addCriterion("num not in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumBetween(Integer value1, Integer value2) {
            addCriterion("num between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotBetween(Integer value1, Integer value2) {
            addCriterion("num not between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andPcidIsNull() {
            addCriterion("pcid is null");
            return (Criteria) this;
        }

        public Criteria andPcidIsNotNull() {
            addCriterion("pcid is not null");
            return (Criteria) this;
        }

        public Criteria andPcidEqualTo(Integer value) {
            addCriterion("pcid =", value, "pcid");
            return (Criteria) this;
        }

        public Criteria andPcidNotEqualTo(Integer value) {
            addCriterion("pcid <>", value, "pcid");
            return (Criteria) this;
        }

        public Criteria andPcidGreaterThan(Integer value) {
            addCriterion("pcid >", value, "pcid");
            return (Criteria) this;
        }

        public Criteria andPcidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pcid >=", value, "pcid");
            return (Criteria) this;
        }

        public Criteria andPcidLessThan(Integer value) {
            addCriterion("pcid <", value, "pcid");
            return (Criteria) this;
        }

        public Criteria andPcidLessThanOrEqualTo(Integer value) {
            addCriterion("pcid <=", value, "pcid");
            return (Criteria) this;
        }

        public Criteria andPcidIn(List<Integer> values) {
            addCriterion("pcid in", values, "pcid");
            return (Criteria) this;
        }

        public Criteria andPcidNotIn(List<Integer> values) {
            addCriterion("pcid not in", values, "pcid");
            return (Criteria) this;
        }

        public Criteria andPcidBetween(Integer value1, Integer value2) {
            addCriterion("pcid between", value1, value2, "pcid");
            return (Criteria) this;
        }

        public Criteria andPcidNotBetween(Integer value1, Integer value2) {
            addCriterion("pcid not between", value1, value2, "pcid");
            return (Criteria) this;
        }

        public Criteria andBpreferentialIsNull() {
            addCriterion("Bpreferential is null");
            return (Criteria) this;
        }

        public Criteria andBpreferentialIsNotNull() {
            addCriterion("Bpreferential is not null");
            return (Criteria) this;
        }

        public Criteria andBpreferentialEqualTo(Float value) {
            addCriterion("Bpreferential =", value, "bpreferential");
            return (Criteria) this;
        }

        public Criteria andBpreferentialNotEqualTo(Float value) {
            addCriterion("Bpreferential <>", value, "bpreferential");
            return (Criteria) this;
        }

        public Criteria andBpreferentialGreaterThan(Float value) {
            addCriterion("Bpreferential >", value, "bpreferential");
            return (Criteria) this;
        }

        public Criteria andBpreferentialGreaterThanOrEqualTo(Float value) {
            addCriterion("Bpreferential >=", value, "bpreferential");
            return (Criteria) this;
        }

        public Criteria andBpreferentialLessThan(Float value) {
            addCriterion("Bpreferential <", value, "bpreferential");
            return (Criteria) this;
        }

        public Criteria andBpreferentialLessThanOrEqualTo(Float value) {
            addCriterion("Bpreferential <=", value, "bpreferential");
            return (Criteria) this;
        }

        public Criteria andBpreferentialIn(List<Float> values) {
            addCriterion("Bpreferential in", values, "bpreferential");
            return (Criteria) this;
        }

        public Criteria andBpreferentialNotIn(List<Float> values) {
            addCriterion("Bpreferential not in", values, "bpreferential");
            return (Criteria) this;
        }

        public Criteria andBpreferentialBetween(Float value1, Float value2) {
            addCriterion("Bpreferential between", value1, value2, "bpreferential");
            return (Criteria) this;
        }

        public Criteria andBpreferentialNotBetween(Float value1, Float value2) {
            addCriterion("Bpreferential not between", value1, value2, "bpreferential");
            return (Criteria) this;
        }

        public Criteria andApreferentialIsNull() {
            addCriterion("apreferential is null");
            return (Criteria) this;
        }

        public Criteria andApreferentialIsNotNull() {
            addCriterion("apreferential is not null");
            return (Criteria) this;
        }

        public Criteria andApreferentialEqualTo(Float value) {
            addCriterion("apreferential =", value, "apreferential");
            return (Criteria) this;
        }

        public Criteria andApreferentialNotEqualTo(Float value) {
            addCriterion("apreferential <>", value, "apreferential");
            return (Criteria) this;
        }

        public Criteria andApreferentialGreaterThan(Float value) {
            addCriterion("apreferential >", value, "apreferential");
            return (Criteria) this;
        }

        public Criteria andApreferentialGreaterThanOrEqualTo(Float value) {
            addCriterion("apreferential >=", value, "apreferential");
            return (Criteria) this;
        }

        public Criteria andApreferentialLessThan(Float value) {
            addCriterion("apreferential <", value, "apreferential");
            return (Criteria) this;
        }

        public Criteria andApreferentialLessThanOrEqualTo(Float value) {
            addCriterion("apreferential <=", value, "apreferential");
            return (Criteria) this;
        }

        public Criteria andApreferentialIn(List<Float> values) {
            addCriterion("apreferential in", values, "apreferential");
            return (Criteria) this;
        }

        public Criteria andApreferentialNotIn(List<Float> values) {
            addCriterion("apreferential not in", values, "apreferential");
            return (Criteria) this;
        }

        public Criteria andApreferentialBetween(Float value1, Float value2) {
            addCriterion("apreferential between", value1, value2, "apreferential");
            return (Criteria) this;
        }

        public Criteria andApreferentialNotBetween(Float value1, Float value2) {
            addCriterion("apreferential not between", value1, value2, "apreferential");
            return (Criteria) this;
        }

        public Criteria andBpreferentialmIsNull() {
            addCriterion("bpreferentialM is null");
            return (Criteria) this;
        }

        public Criteria andBpreferentialmIsNotNull() {
            addCriterion("bpreferentialM is not null");
            return (Criteria) this;
        }

        public Criteria andBpreferentialmEqualTo(Float value) {
            addCriterion("bpreferentialM =", value, "bpreferentialm");
            return (Criteria) this;
        }

        public Criteria andBpreferentialmNotEqualTo(Float value) {
            addCriterion("bpreferentialM <>", value, "bpreferentialm");
            return (Criteria) this;
        }

        public Criteria andBpreferentialmGreaterThan(Float value) {
            addCriterion("bpreferentialM >", value, "bpreferentialm");
            return (Criteria) this;
        }

        public Criteria andBpreferentialmGreaterThanOrEqualTo(Float value) {
            addCriterion("bpreferentialM >=", value, "bpreferentialm");
            return (Criteria) this;
        }

        public Criteria andBpreferentialmLessThan(Float value) {
            addCriterion("bpreferentialM <", value, "bpreferentialm");
            return (Criteria) this;
        }

        public Criteria andBpreferentialmLessThanOrEqualTo(Float value) {
            addCriterion("bpreferentialM <=", value, "bpreferentialm");
            return (Criteria) this;
        }

        public Criteria andBpreferentialmIn(List<Float> values) {
            addCriterion("bpreferentialM in", values, "bpreferentialm");
            return (Criteria) this;
        }

        public Criteria andBpreferentialmNotIn(List<Float> values) {
            addCriterion("bpreferentialM not in", values, "bpreferentialm");
            return (Criteria) this;
        }

        public Criteria andBpreferentialmBetween(Float value1, Float value2) {
            addCriterion("bpreferentialM between", value1, value2, "bpreferentialm");
            return (Criteria) this;
        }

        public Criteria andBpreferentialmNotBetween(Float value1, Float value2) {
            addCriterion("bpreferentialM not between", value1, value2, "bpreferentialm");
            return (Criteria) this;
        }

        public Criteria andFaultdescriptionIsNull() {
            addCriterion("Faultdescription is null");
            return (Criteria) this;
        }

        public Criteria andFaultdescriptionIsNotNull() {
            addCriterion("Faultdescription is not null");
            return (Criteria) this;
        }

        public Criteria andFaultdescriptionEqualTo(String value) {
            addCriterion("Faultdescription =", value, "faultdescription");
            return (Criteria) this;
        }

        public Criteria andFaultdescriptionNotEqualTo(String value) {
            addCriterion("Faultdescription <>", value, "faultdescription");
            return (Criteria) this;
        }

        public Criteria andFaultdescriptionGreaterThan(String value) {
            addCriterion("Faultdescription >", value, "faultdescription");
            return (Criteria) this;
        }

        public Criteria andFaultdescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("Faultdescription >=", value, "faultdescription");
            return (Criteria) this;
        }

        public Criteria andFaultdescriptionLessThan(String value) {
            addCriterion("Faultdescription <", value, "faultdescription");
            return (Criteria) this;
        }

        public Criteria andFaultdescriptionLessThanOrEqualTo(String value) {
            addCriterion("Faultdescription <=", value, "faultdescription");
            return (Criteria) this;
        }

        public Criteria andFaultdescriptionLike(String value) {
            addCriterion("Faultdescription like", value, "faultdescription");
            return (Criteria) this;
        }

        public Criteria andFaultdescriptionNotLike(String value) {
            addCriterion("Faultdescription not like", value, "faultdescription");
            return (Criteria) this;
        }

        public Criteria andFaultdescriptionIn(List<String> values) {
            addCriterion("Faultdescription in", values, "faultdescription");
            return (Criteria) this;
        }

        public Criteria andFaultdescriptionNotIn(List<String> values) {
            addCriterion("Faultdescription not in", values, "faultdescription");
            return (Criteria) this;
        }

        public Criteria andFaultdescriptionBetween(String value1, String value2) {
            addCriterion("Faultdescription between", value1, value2, "faultdescription");
            return (Criteria) this;
        }

        public Criteria andFaultdescriptionNotBetween(String value1, String value2) {
            addCriterion("Faultdescription not between", value1, value2, "faultdescription");
            return (Criteria) this;
        }

        public Criteria andProblemIsNull() {
            addCriterion("problem is null");
            return (Criteria) this;
        }

        public Criteria andProblemIsNotNull() {
            addCriterion("problem is not null");
            return (Criteria) this;
        }

        public Criteria andProblemEqualTo(String value) {
            addCriterion("problem =", value, "problem");
            return (Criteria) this;
        }

        public Criteria andProblemNotEqualTo(String value) {
            addCriterion("problem <>", value, "problem");
            return (Criteria) this;
        }

        public Criteria andProblemGreaterThan(String value) {
            addCriterion("problem >", value, "problem");
            return (Criteria) this;
        }

        public Criteria andProblemGreaterThanOrEqualTo(String value) {
            addCriterion("problem >=", value, "problem");
            return (Criteria) this;
        }

        public Criteria andProblemLessThan(String value) {
            addCriterion("problem <", value, "problem");
            return (Criteria) this;
        }

        public Criteria andProblemLessThanOrEqualTo(String value) {
            addCriterion("problem <=", value, "problem");
            return (Criteria) this;
        }

        public Criteria andProblemLike(String value) {
            addCriterion("problem like", value, "problem");
            return (Criteria) this;
        }

        public Criteria andProblemNotLike(String value) {
            addCriterion("problem not like", value, "problem");
            return (Criteria) this;
        }

        public Criteria andProblemIn(List<String> values) {
            addCriterion("problem in", values, "problem");
            return (Criteria) this;
        }

        public Criteria andProblemNotIn(List<String> values) {
            addCriterion("problem not in", values, "problem");
            return (Criteria) this;
        }

        public Criteria andProblemBetween(String value1, String value2) {
            addCriterion("problem between", value1, value2, "problem");
            return (Criteria) this;
        }

        public Criteria andProblemNotBetween(String value1, String value2) {
            addCriterion("problem not between", value1, value2, "problem");
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

        public Criteria andServicepeoIsNull() {
            addCriterion("servicepeo is null");
            return (Criteria) this;
        }

        public Criteria andServicepeoIsNotNull() {
            addCriterion("servicepeo is not null");
            return (Criteria) this;
        }

        public Criteria andServicepeoEqualTo(String value) {
            addCriterion("servicepeo =", value, "servicepeo");
            return (Criteria) this;
        }

        public Criteria andServicepeoNotEqualTo(String value) {
            addCriterion("servicepeo <>", value, "servicepeo");
            return (Criteria) this;
        }

        public Criteria andServicepeoGreaterThan(String value) {
            addCriterion("servicepeo >", value, "servicepeo");
            return (Criteria) this;
        }

        public Criteria andServicepeoGreaterThanOrEqualTo(String value) {
            addCriterion("servicepeo >=", value, "servicepeo");
            return (Criteria) this;
        }

        public Criteria andServicepeoLessThan(String value) {
            addCriterion("servicepeo <", value, "servicepeo");
            return (Criteria) this;
        }

        public Criteria andServicepeoLessThanOrEqualTo(String value) {
            addCriterion("servicepeo <=", value, "servicepeo");
            return (Criteria) this;
        }

        public Criteria andServicepeoLike(String value) {
            addCriterion("servicepeo like", value, "servicepeo");
            return (Criteria) this;
        }

        public Criteria andServicepeoNotLike(String value) {
            addCriterion("servicepeo not like", value, "servicepeo");
            return (Criteria) this;
        }

        public Criteria andServicepeoIn(List<String> values) {
            addCriterion("servicepeo in", values, "servicepeo");
            return (Criteria) this;
        }

        public Criteria andServicepeoNotIn(List<String> values) {
            addCriterion("servicepeo not in", values, "servicepeo");
            return (Criteria) this;
        }

        public Criteria andServicepeoBetween(String value1, String value2) {
            addCriterion("servicepeo between", value1, value2, "servicepeo");
            return (Criteria) this;
        }

        public Criteria andServicepeoNotBetween(String value1, String value2) {
            addCriterion("servicepeo not between", value1, value2, "servicepeo");
            return (Criteria) this;
        }

        public Criteria andFreeIsNull() {
            addCriterion("Free is null");
            return (Criteria) this;
        }

        public Criteria andFreeIsNotNull() {
            addCriterion("Free is not null");
            return (Criteria) this;
        }

        public Criteria andFreeEqualTo(String value) {
            addCriterion("Free =", value, "free");
            return (Criteria) this;
        }

        public Criteria andFreeNotEqualTo(String value) {
            addCriterion("Free <>", value, "free");
            return (Criteria) this;
        }

        public Criteria andFreeGreaterThan(String value) {
            addCriterion("Free >", value, "free");
            return (Criteria) this;
        }

        public Criteria andFreeGreaterThanOrEqualTo(String value) {
            addCriterion("Free >=", value, "free");
            return (Criteria) this;
        }

        public Criteria andFreeLessThan(String value) {
            addCriterion("Free <", value, "free");
            return (Criteria) this;
        }

        public Criteria andFreeLessThanOrEqualTo(String value) {
            addCriterion("Free <=", value, "free");
            return (Criteria) this;
        }

        public Criteria andFreeLike(String value) {
            addCriterion("Free like", value, "free");
            return (Criteria) this;
        }

        public Criteria andFreeNotLike(String value) {
            addCriterion("Free not like", value, "free");
            return (Criteria) this;
        }

        public Criteria andFreeIn(List<String> values) {
            addCriterion("Free in", values, "free");
            return (Criteria) this;
        }

        public Criteria andFreeNotIn(List<String> values) {
            addCriterion("Free not in", values, "free");
            return (Criteria) this;
        }

        public Criteria andFreeBetween(String value1, String value2) {
            addCriterion("Free between", value1, value2, "free");
            return (Criteria) this;
        }

        public Criteria andFreeNotBetween(String value1, String value2) {
            addCriterion("Free not between", value1, value2, "free");
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