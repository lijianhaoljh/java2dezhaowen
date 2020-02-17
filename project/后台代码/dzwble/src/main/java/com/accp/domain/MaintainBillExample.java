package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MaintainBillExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MaintainBillExample() {
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

        public Criteria andMbnameIsNull() {
            addCriterion("mbname is null");
            return (Criteria) this;
        }

        public Criteria andMbnameIsNotNull() {
            addCriterion("mbname is not null");
            return (Criteria) this;
        }

        public Criteria andMbnameEqualTo(String value) {
            addCriterion("mbname =", value, "mbname");
            return (Criteria) this;
        }

        public Criteria andMbnameNotEqualTo(String value) {
            addCriterion("mbname <>", value, "mbname");
            return (Criteria) this;
        }

        public Criteria andMbnameGreaterThan(String value) {
            addCriterion("mbname >", value, "mbname");
            return (Criteria) this;
        }

        public Criteria andMbnameGreaterThanOrEqualTo(String value) {
            addCriterion("mbname >=", value, "mbname");
            return (Criteria) this;
        }

        public Criteria andMbnameLessThan(String value) {
            addCriterion("mbname <", value, "mbname");
            return (Criteria) this;
        }

        public Criteria andMbnameLessThanOrEqualTo(String value) {
            addCriterion("mbname <=", value, "mbname");
            return (Criteria) this;
        }

        public Criteria andMbnameLike(String value) {
            addCriterion("mbname like", value, "mbname");
            return (Criteria) this;
        }

        public Criteria andMbnameNotLike(String value) {
            addCriterion("mbname not like", value, "mbname");
            return (Criteria) this;
        }

        public Criteria andMbnameIn(List<String> values) {
            addCriterion("mbname in", values, "mbname");
            return (Criteria) this;
        }

        public Criteria andMbnameNotIn(List<String> values) {
            addCriterion("mbname not in", values, "mbname");
            return (Criteria) this;
        }

        public Criteria andMbnameBetween(String value1, String value2) {
            addCriterion("mbname between", value1, value2, "mbname");
            return (Criteria) this;
        }

        public Criteria andMbnameNotBetween(String value1, String value2) {
            addCriterion("mbname not between", value1, value2, "mbname");
            return (Criteria) this;
        }

        public Criteria andFactorymeilIsNull() {
            addCriterion("factorymeil is null");
            return (Criteria) this;
        }

        public Criteria andFactorymeilIsNotNull() {
            addCriterion("factorymeil is not null");
            return (Criteria) this;
        }

        public Criteria andFactorymeilEqualTo(Float value) {
            addCriterion("factorymeil =", value, "factorymeil");
            return (Criteria) this;
        }

        public Criteria andFactorymeilNotEqualTo(Float value) {
            addCriterion("factorymeil <>", value, "factorymeil");
            return (Criteria) this;
        }

        public Criteria andFactorymeilGreaterThan(Float value) {
            addCriterion("factorymeil >", value, "factorymeil");
            return (Criteria) this;
        }

        public Criteria andFactorymeilGreaterThanOrEqualTo(Float value) {
            addCriterion("factorymeil >=", value, "factorymeil");
            return (Criteria) this;
        }

        public Criteria andFactorymeilLessThan(Float value) {
            addCriterion("factorymeil <", value, "factorymeil");
            return (Criteria) this;
        }

        public Criteria andFactorymeilLessThanOrEqualTo(Float value) {
            addCriterion("factorymeil <=", value, "factorymeil");
            return (Criteria) this;
        }

        public Criteria andFactorymeilIn(List<Float> values) {
            addCriterion("factorymeil in", values, "factorymeil");
            return (Criteria) this;
        }

        public Criteria andFactorymeilNotIn(List<Float> values) {
            addCriterion("factorymeil not in", values, "factorymeil");
            return (Criteria) this;
        }

        public Criteria andFactorymeilBetween(Float value1, Float value2) {
            addCriterion("factorymeil between", value1, value2, "factorymeil");
            return (Criteria) this;
        }

        public Criteria andFactorymeilNotBetween(Float value1, Float value2) {
            addCriterion("factorymeil not between", value1, value2, "factorymeil");
            return (Criteria) this;
        }

        public Criteria andFactoryoilIsNull() {
            addCriterion("factoryoil is null");
            return (Criteria) this;
        }

        public Criteria andFactoryoilIsNotNull() {
            addCriterion("factoryoil is not null");
            return (Criteria) this;
        }

        public Criteria andFactoryoilEqualTo(Float value) {
            addCriterion("factoryoil =", value, "factoryoil");
            return (Criteria) this;
        }

        public Criteria andFactoryoilNotEqualTo(Float value) {
            addCriterion("factoryoil <>", value, "factoryoil");
            return (Criteria) this;
        }

        public Criteria andFactoryoilGreaterThan(Float value) {
            addCriterion("factoryoil >", value, "factoryoil");
            return (Criteria) this;
        }

        public Criteria andFactoryoilGreaterThanOrEqualTo(Float value) {
            addCriterion("factoryoil >=", value, "factoryoil");
            return (Criteria) this;
        }

        public Criteria andFactoryoilLessThan(Float value) {
            addCriterion("factoryoil <", value, "factoryoil");
            return (Criteria) this;
        }

        public Criteria andFactoryoilLessThanOrEqualTo(Float value) {
            addCriterion("factoryoil <=", value, "factoryoil");
            return (Criteria) this;
        }

        public Criteria andFactoryoilIn(List<Float> values) {
            addCriterion("factoryoil in", values, "factoryoil");
            return (Criteria) this;
        }

        public Criteria andFactoryoilNotIn(List<Float> values) {
            addCriterion("factoryoil not in", values, "factoryoil");
            return (Criteria) this;
        }

        public Criteria andFactoryoilBetween(Float value1, Float value2) {
            addCriterion("factoryoil between", value1, value2, "factoryoil");
            return (Criteria) this;
        }

        public Criteria andFactoryoilNotBetween(Float value1, Float value2) {
            addCriterion("factoryoil not between", value1, value2, "factoryoil");
            return (Criteria) this;
        }

        public Criteria andMileageIsNull() {
            addCriterion("mileage is null");
            return (Criteria) this;
        }

        public Criteria andMileageIsNotNull() {
            addCriterion("mileage is not null");
            return (Criteria) this;
        }

        public Criteria andMileageEqualTo(Float value) {
            addCriterion("mileage =", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageNotEqualTo(Float value) {
            addCriterion("mileage <>", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageGreaterThan(Float value) {
            addCriterion("mileage >", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageGreaterThanOrEqualTo(Float value) {
            addCriterion("mileage >=", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageLessThan(Float value) {
            addCriterion("mileage <", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageLessThanOrEqualTo(Float value) {
            addCriterion("mileage <=", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageIn(List<Float> values) {
            addCriterion("mileage in", values, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageNotIn(List<Float> values) {
            addCriterion("mileage not in", values, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageBetween(Float value1, Float value2) {
            addCriterion("mileage between", value1, value2, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageNotBetween(Float value1, Float value2) {
            addCriterion("mileage not between", value1, value2, "mileage");
            return (Criteria) this;
        }

        public Criteria andIntotimeIsNull() {
            addCriterion("intotime is null");
            return (Criteria) this;
        }

        public Criteria andIntotimeIsNotNull() {
            addCriterion("intotime is not null");
            return (Criteria) this;
        }

        public Criteria andIntotimeEqualTo(Date value) {
            addCriterion("intotime =", value, "intotime");
            return (Criteria) this;
        }

        public Criteria andIntotimeNotEqualTo(Date value) {
            addCriterion("intotime <>", value, "intotime");
            return (Criteria) this;
        }

        public Criteria andIntotimeGreaterThan(Date value) {
            addCriterion("intotime >", value, "intotime");
            return (Criteria) this;
        }

        public Criteria andIntotimeGreaterThanOrEqualTo(Date value) {
            addCriterion("intotime >=", value, "intotime");
            return (Criteria) this;
        }

        public Criteria andIntotimeLessThan(Date value) {
            addCriterion("intotime <", value, "intotime");
            return (Criteria) this;
        }

        public Criteria andIntotimeLessThanOrEqualTo(Date value) {
            addCriterion("intotime <=", value, "intotime");
            return (Criteria) this;
        }

        public Criteria andIntotimeIn(List<Date> values) {
            addCriterion("intotime in", values, "intotime");
            return (Criteria) this;
        }

        public Criteria andIntotimeNotIn(List<Date> values) {
            addCriterion("intotime not in", values, "intotime");
            return (Criteria) this;
        }

        public Criteria andIntotimeBetween(Date value1, Date value2) {
            addCriterion("intotime between", value1, value2, "intotime");
            return (Criteria) this;
        }

        public Criteria andIntotimeNotBetween(Date value1, Date value2) {
            addCriterion("intotime not between", value1, value2, "intotime");
            return (Criteria) this;
        }

        public Criteria andLastintoIsNull() {
            addCriterion("lastinto is null");
            return (Criteria) this;
        }

        public Criteria andLastintoIsNotNull() {
            addCriterion("lastinto is not null");
            return (Criteria) this;
        }

        public Criteria andLastintoEqualTo(Date value) {
            addCriterion("lastinto =", value, "lastinto");
            return (Criteria) this;
        }

        public Criteria andLastintoNotEqualTo(Date value) {
            addCriterion("lastinto <>", value, "lastinto");
            return (Criteria) this;
        }

        public Criteria andLastintoGreaterThan(Date value) {
            addCriterion("lastinto >", value, "lastinto");
            return (Criteria) this;
        }

        public Criteria andLastintoGreaterThanOrEqualTo(Date value) {
            addCriterion("lastinto >=", value, "lastinto");
            return (Criteria) this;
        }

        public Criteria andLastintoLessThan(Date value) {
            addCriterion("lastinto <", value, "lastinto");
            return (Criteria) this;
        }

        public Criteria andLastintoLessThanOrEqualTo(Date value) {
            addCriterion("lastinto <=", value, "lastinto");
            return (Criteria) this;
        }

        public Criteria andLastintoIn(List<Date> values) {
            addCriterion("lastinto in", values, "lastinto");
            return (Criteria) this;
        }

        public Criteria andLastintoNotIn(List<Date> values) {
            addCriterion("lastinto not in", values, "lastinto");
            return (Criteria) this;
        }

        public Criteria andLastintoBetween(Date value1, Date value2) {
            addCriterion("lastinto between", value1, value2, "lastinto");
            return (Criteria) this;
        }

        public Criteria andLastintoNotBetween(Date value1, Date value2) {
            addCriterion("lastinto not between", value1, value2, "lastinto");
            return (Criteria) this;
        }

        public Criteria andReceptionnoteIsNull() {
            addCriterion("Receptionnote is null");
            return (Criteria) this;
        }

        public Criteria andReceptionnoteIsNotNull() {
            addCriterion("Receptionnote is not null");
            return (Criteria) this;
        }

        public Criteria andReceptionnoteEqualTo(String value) {
            addCriterion("Receptionnote =", value, "receptionnote");
            return (Criteria) this;
        }

        public Criteria andReceptionnoteNotEqualTo(String value) {
            addCriterion("Receptionnote <>", value, "receptionnote");
            return (Criteria) this;
        }

        public Criteria andReceptionnoteGreaterThan(String value) {
            addCriterion("Receptionnote >", value, "receptionnote");
            return (Criteria) this;
        }

        public Criteria andReceptionnoteGreaterThanOrEqualTo(String value) {
            addCriterion("Receptionnote >=", value, "receptionnote");
            return (Criteria) this;
        }

        public Criteria andReceptionnoteLessThan(String value) {
            addCriterion("Receptionnote <", value, "receptionnote");
            return (Criteria) this;
        }

        public Criteria andReceptionnoteLessThanOrEqualTo(String value) {
            addCriterion("Receptionnote <=", value, "receptionnote");
            return (Criteria) this;
        }

        public Criteria andReceptionnoteLike(String value) {
            addCriterion("Receptionnote like", value, "receptionnote");
            return (Criteria) this;
        }

        public Criteria andReceptionnoteNotLike(String value) {
            addCriterion("Receptionnote not like", value, "receptionnote");
            return (Criteria) this;
        }

        public Criteria andReceptionnoteIn(List<String> values) {
            addCriterion("Receptionnote in", values, "receptionnote");
            return (Criteria) this;
        }

        public Criteria andReceptionnoteNotIn(List<String> values) {
            addCriterion("Receptionnote not in", values, "receptionnote");
            return (Criteria) this;
        }

        public Criteria andReceptionnoteBetween(String value1, String value2) {
            addCriterion("Receptionnote between", value1, value2, "receptionnote");
            return (Criteria) this;
        }

        public Criteria andReceptionnoteNotBetween(String value1, String value2) {
            addCriterion("Receptionnote not between", value1, value2, "receptionnote");
            return (Criteria) this;
        }

        public Criteria andStatementIsNull() {
            addCriterion("statement is null");
            return (Criteria) this;
        }

        public Criteria andStatementIsNotNull() {
            addCriterion("statement is not null");
            return (Criteria) this;
        }

        public Criteria andStatementEqualTo(String value) {
            addCriterion("statement =", value, "statement");
            return (Criteria) this;
        }

        public Criteria andStatementNotEqualTo(String value) {
            addCriterion("statement <>", value, "statement");
            return (Criteria) this;
        }

        public Criteria andStatementGreaterThan(String value) {
            addCriterion("statement >", value, "statement");
            return (Criteria) this;
        }

        public Criteria andStatementGreaterThanOrEqualTo(String value) {
            addCriterion("statement >=", value, "statement");
            return (Criteria) this;
        }

        public Criteria andStatementLessThan(String value) {
            addCriterion("statement <", value, "statement");
            return (Criteria) this;
        }

        public Criteria andStatementLessThanOrEqualTo(String value) {
            addCriterion("statement <=", value, "statement");
            return (Criteria) this;
        }

        public Criteria andStatementLike(String value) {
            addCriterion("statement like", value, "statement");
            return (Criteria) this;
        }

        public Criteria andStatementNotLike(String value) {
            addCriterion("statement not like", value, "statement");
            return (Criteria) this;
        }

        public Criteria andStatementIn(List<String> values) {
            addCriterion("statement in", values, "statement");
            return (Criteria) this;
        }

        public Criteria andStatementNotIn(List<String> values) {
            addCriterion("statement not in", values, "statement");
            return (Criteria) this;
        }

        public Criteria andStatementBetween(String value1, String value2) {
            addCriterion("statement between", value1, value2, "statement");
            return (Criteria) this;
        }

        public Criteria andStatementNotBetween(String value1, String value2) {
            addCriterion("statement not between", value1, value2, "statement");
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