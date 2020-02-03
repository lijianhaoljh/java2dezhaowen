package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class MotorcycleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MotorcycleExample() {
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

        public Criteria andMoidIsNull() {
            addCriterion("moid is null");
            return (Criteria) this;
        }

        public Criteria andMoidIsNotNull() {
            addCriterion("moid is not null");
            return (Criteria) this;
        }

        public Criteria andMoidEqualTo(Integer value) {
            addCriterion("moid =", value, "moid");
            return (Criteria) this;
        }

        public Criteria andMoidNotEqualTo(Integer value) {
            addCriterion("moid <>", value, "moid");
            return (Criteria) this;
        }

        public Criteria andMoidGreaterThan(Integer value) {
            addCriterion("moid >", value, "moid");
            return (Criteria) this;
        }

        public Criteria andMoidGreaterThanOrEqualTo(Integer value) {
            addCriterion("moid >=", value, "moid");
            return (Criteria) this;
        }

        public Criteria andMoidLessThan(Integer value) {
            addCriterion("moid <", value, "moid");
            return (Criteria) this;
        }

        public Criteria andMoidLessThanOrEqualTo(Integer value) {
            addCriterion("moid <=", value, "moid");
            return (Criteria) this;
        }

        public Criteria andMoidIn(List<Integer> values) {
            addCriterion("moid in", values, "moid");
            return (Criteria) this;
        }

        public Criteria andMoidNotIn(List<Integer> values) {
            addCriterion("moid not in", values, "moid");
            return (Criteria) this;
        }

        public Criteria andMoidBetween(Integer value1, Integer value2) {
            addCriterion("moid between", value1, value2, "moid");
            return (Criteria) this;
        }

        public Criteria andMoidNotBetween(Integer value1, Integer value2) {
            addCriterion("moid not between", value1, value2, "moid");
            return (Criteria) this;
        }

        public Criteria andCbnoIsNull() {
            addCriterion("cbno is null");
            return (Criteria) this;
        }

        public Criteria andCbnoIsNotNull() {
            addCriterion("cbno is not null");
            return (Criteria) this;
        }

        public Criteria andCbnoEqualTo(Integer value) {
            addCriterion("cbno =", value, "cbno");
            return (Criteria) this;
        }

        public Criteria andCbnoNotEqualTo(Integer value) {
            addCriterion("cbno <>", value, "cbno");
            return (Criteria) this;
        }

        public Criteria andCbnoGreaterThan(Integer value) {
            addCriterion("cbno >", value, "cbno");
            return (Criteria) this;
        }

        public Criteria andCbnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("cbno >=", value, "cbno");
            return (Criteria) this;
        }

        public Criteria andCbnoLessThan(Integer value) {
            addCriterion("cbno <", value, "cbno");
            return (Criteria) this;
        }

        public Criteria andCbnoLessThanOrEqualTo(Integer value) {
            addCriterion("cbno <=", value, "cbno");
            return (Criteria) this;
        }

        public Criteria andCbnoIn(List<Integer> values) {
            addCriterion("cbno in", values, "cbno");
            return (Criteria) this;
        }

        public Criteria andCbnoNotIn(List<Integer> values) {
            addCriterion("cbno not in", values, "cbno");
            return (Criteria) this;
        }

        public Criteria andCbnoBetween(Integer value1, Integer value2) {
            addCriterion("cbno between", value1, value2, "cbno");
            return (Criteria) this;
        }

        public Criteria andCbnoNotBetween(Integer value1, Integer value2) {
            addCriterion("cbno not between", value1, value2, "cbno");
            return (Criteria) this;
        }

        public Criteria andMoinameIsNull() {
            addCriterion("moiname is null");
            return (Criteria) this;
        }

        public Criteria andMoinameIsNotNull() {
            addCriterion("moiname is not null");
            return (Criteria) this;
        }

        public Criteria andMoinameEqualTo(String value) {
            addCriterion("moiname =", value, "moiname");
            return (Criteria) this;
        }

        public Criteria andMoinameNotEqualTo(String value) {
            addCriterion("moiname <>", value, "moiname");
            return (Criteria) this;
        }

        public Criteria andMoinameGreaterThan(String value) {
            addCriterion("moiname >", value, "moiname");
            return (Criteria) this;
        }

        public Criteria andMoinameGreaterThanOrEqualTo(String value) {
            addCriterion("moiname >=", value, "moiname");
            return (Criteria) this;
        }

        public Criteria andMoinameLessThan(String value) {
            addCriterion("moiname <", value, "moiname");
            return (Criteria) this;
        }

        public Criteria andMoinameLessThanOrEqualTo(String value) {
            addCriterion("moiname <=", value, "moiname");
            return (Criteria) this;
        }

        public Criteria andMoinameLike(String value) {
            addCriterion("moiname like", value, "moiname");
            return (Criteria) this;
        }

        public Criteria andMoinameNotLike(String value) {
            addCriterion("moiname not like", value, "moiname");
            return (Criteria) this;
        }

        public Criteria andMoinameIn(List<String> values) {
            addCriterion("moiname in", values, "moiname");
            return (Criteria) this;
        }

        public Criteria andMoinameNotIn(List<String> values) {
            addCriterion("moiname not in", values, "moiname");
            return (Criteria) this;
        }

        public Criteria andMoinameBetween(String value1, String value2) {
            addCriterion("moiname between", value1, value2, "moiname");
            return (Criteria) this;
        }

        public Criteria andMoinameNotBetween(String value1, String value2) {
            addCriterion("moiname not between", value1, value2, "moiname");
            return (Criteria) this;
        }

        public Criteria andMopriceIsNull() {
            addCriterion("moprice is null");
            return (Criteria) this;
        }

        public Criteria andMopriceIsNotNull() {
            addCriterion("moprice is not null");
            return (Criteria) this;
        }

        public Criteria andMopriceEqualTo(Float value) {
            addCriterion("moprice =", value, "moprice");
            return (Criteria) this;
        }

        public Criteria andMopriceNotEqualTo(Float value) {
            addCriterion("moprice <>", value, "moprice");
            return (Criteria) this;
        }

        public Criteria andMopriceGreaterThan(Float value) {
            addCriterion("moprice >", value, "moprice");
            return (Criteria) this;
        }

        public Criteria andMopriceGreaterThanOrEqualTo(Float value) {
            addCriterion("moprice >=", value, "moprice");
            return (Criteria) this;
        }

        public Criteria andMopriceLessThan(Float value) {
            addCriterion("moprice <", value, "moprice");
            return (Criteria) this;
        }

        public Criteria andMopriceLessThanOrEqualTo(Float value) {
            addCriterion("moprice <=", value, "moprice");
            return (Criteria) this;
        }

        public Criteria andMopriceIn(List<Float> values) {
            addCriterion("moprice in", values, "moprice");
            return (Criteria) this;
        }

        public Criteria andMopriceNotIn(List<Float> values) {
            addCriterion("moprice not in", values, "moprice");
            return (Criteria) this;
        }

        public Criteria andMopriceBetween(Float value1, Float value2) {
            addCriterion("moprice between", value1, value2, "moprice");
            return (Criteria) this;
        }

        public Criteria andMopriceNotBetween(Float value1, Float value2) {
            addCriterion("moprice not between", value1, value2, "moprice");
            return (Criteria) this;
        }

        public Criteria andMoyearpriceIsNull() {
            addCriterion("moyearprice is null");
            return (Criteria) this;
        }

        public Criteria andMoyearpriceIsNotNull() {
            addCriterion("moyearprice is not null");
            return (Criteria) this;
        }

        public Criteria andMoyearpriceEqualTo(String value) {
            addCriterion("moyearprice =", value, "moyearprice");
            return (Criteria) this;
        }

        public Criteria andMoyearpriceNotEqualTo(String value) {
            addCriterion("moyearprice <>", value, "moyearprice");
            return (Criteria) this;
        }

        public Criteria andMoyearpriceGreaterThan(String value) {
            addCriterion("moyearprice >", value, "moyearprice");
            return (Criteria) this;
        }

        public Criteria andMoyearpriceGreaterThanOrEqualTo(String value) {
            addCriterion("moyearprice >=", value, "moyearprice");
            return (Criteria) this;
        }

        public Criteria andMoyearpriceLessThan(String value) {
            addCriterion("moyearprice <", value, "moyearprice");
            return (Criteria) this;
        }

        public Criteria andMoyearpriceLessThanOrEqualTo(String value) {
            addCriterion("moyearprice <=", value, "moyearprice");
            return (Criteria) this;
        }

        public Criteria andMoyearpriceLike(String value) {
            addCriterion("moyearprice like", value, "moyearprice");
            return (Criteria) this;
        }

        public Criteria andMoyearpriceNotLike(String value) {
            addCriterion("moyearprice not like", value, "moyearprice");
            return (Criteria) this;
        }

        public Criteria andMoyearpriceIn(List<String> values) {
            addCriterion("moyearprice in", values, "moyearprice");
            return (Criteria) this;
        }

        public Criteria andMoyearpriceNotIn(List<String> values) {
            addCriterion("moyearprice not in", values, "moyearprice");
            return (Criteria) this;
        }

        public Criteria andMoyearpriceBetween(String value1, String value2) {
            addCriterion("moyearprice between", value1, value2, "moyearprice");
            return (Criteria) this;
        }

        public Criteria andMoyearpriceNotBetween(String value1, String value2) {
            addCriterion("moyearprice not between", value1, value2, "moyearprice");
            return (Criteria) this;
        }

        public Criteria andModischargeIsNull() {
            addCriterion("modischarge is null");
            return (Criteria) this;
        }

        public Criteria andModischargeIsNotNull() {
            addCriterion("modischarge is not null");
            return (Criteria) this;
        }

        public Criteria andModischargeEqualTo(Float value) {
            addCriterion("modischarge =", value, "modischarge");
            return (Criteria) this;
        }

        public Criteria andModischargeNotEqualTo(Float value) {
            addCriterion("modischarge <>", value, "modischarge");
            return (Criteria) this;
        }

        public Criteria andModischargeGreaterThan(Float value) {
            addCriterion("modischarge >", value, "modischarge");
            return (Criteria) this;
        }

        public Criteria andModischargeGreaterThanOrEqualTo(Float value) {
            addCriterion("modischarge >=", value, "modischarge");
            return (Criteria) this;
        }

        public Criteria andModischargeLessThan(Float value) {
            addCriterion("modischarge <", value, "modischarge");
            return (Criteria) this;
        }

        public Criteria andModischargeLessThanOrEqualTo(Float value) {
            addCriterion("modischarge <=", value, "modischarge");
            return (Criteria) this;
        }

        public Criteria andModischargeIn(List<Float> values) {
            addCriterion("modischarge in", values, "modischarge");
            return (Criteria) this;
        }

        public Criteria andModischargeNotIn(List<Float> values) {
            addCriterion("modischarge not in", values, "modischarge");
            return (Criteria) this;
        }

        public Criteria andModischargeBetween(Float value1, Float value2) {
            addCriterion("modischarge between", value1, value2, "modischarge");
            return (Criteria) this;
        }

        public Criteria andModischargeNotBetween(Float value1, Float value2) {
            addCriterion("modischarge not between", value1, value2, "modischarge");
            return (Criteria) this;
        }

        public Criteria andModomesticIsNull() {
            addCriterion("modomestic is null");
            return (Criteria) this;
        }

        public Criteria andModomesticIsNotNull() {
            addCriterion("modomestic is not null");
            return (Criteria) this;
        }

        public Criteria andModomesticEqualTo(String value) {
            addCriterion("modomestic =", value, "modomestic");
            return (Criteria) this;
        }

        public Criteria andModomesticNotEqualTo(String value) {
            addCriterion("modomestic <>", value, "modomestic");
            return (Criteria) this;
        }

        public Criteria andModomesticGreaterThan(String value) {
            addCriterion("modomestic >", value, "modomestic");
            return (Criteria) this;
        }

        public Criteria andModomesticGreaterThanOrEqualTo(String value) {
            addCriterion("modomestic >=", value, "modomestic");
            return (Criteria) this;
        }

        public Criteria andModomesticLessThan(String value) {
            addCriterion("modomestic <", value, "modomestic");
            return (Criteria) this;
        }

        public Criteria andModomesticLessThanOrEqualTo(String value) {
            addCriterion("modomestic <=", value, "modomestic");
            return (Criteria) this;
        }

        public Criteria andModomesticLike(String value) {
            addCriterion("modomestic like", value, "modomestic");
            return (Criteria) this;
        }

        public Criteria andModomesticNotLike(String value) {
            addCriterion("modomestic not like", value, "modomestic");
            return (Criteria) this;
        }

        public Criteria andModomesticIn(List<String> values) {
            addCriterion("modomestic in", values, "modomestic");
            return (Criteria) this;
        }

        public Criteria andModomesticNotIn(List<String> values) {
            addCriterion("modomestic not in", values, "modomestic");
            return (Criteria) this;
        }

        public Criteria andModomesticBetween(String value1, String value2) {
            addCriterion("modomestic between", value1, value2, "modomestic");
            return (Criteria) this;
        }

        public Criteria andModomesticNotBetween(String value1, String value2) {
            addCriterion("modomestic not between", value1, value2, "modomestic");
            return (Criteria) this;
        }

        public Criteria andMofuelIsNull() {
            addCriterion("mofuel is null");
            return (Criteria) this;
        }

        public Criteria andMofuelIsNotNull() {
            addCriterion("mofuel is not null");
            return (Criteria) this;
        }

        public Criteria andMofuelEqualTo(String value) {
            addCriterion("mofuel =", value, "mofuel");
            return (Criteria) this;
        }

        public Criteria andMofuelNotEqualTo(String value) {
            addCriterion("mofuel <>", value, "mofuel");
            return (Criteria) this;
        }

        public Criteria andMofuelGreaterThan(String value) {
            addCriterion("mofuel >", value, "mofuel");
            return (Criteria) this;
        }

        public Criteria andMofuelGreaterThanOrEqualTo(String value) {
            addCriterion("mofuel >=", value, "mofuel");
            return (Criteria) this;
        }

        public Criteria andMofuelLessThan(String value) {
            addCriterion("mofuel <", value, "mofuel");
            return (Criteria) this;
        }

        public Criteria andMofuelLessThanOrEqualTo(String value) {
            addCriterion("mofuel <=", value, "mofuel");
            return (Criteria) this;
        }

        public Criteria andMofuelLike(String value) {
            addCriterion("mofuel like", value, "mofuel");
            return (Criteria) this;
        }

        public Criteria andMofuelNotLike(String value) {
            addCriterion("mofuel not like", value, "mofuel");
            return (Criteria) this;
        }

        public Criteria andMofuelIn(List<String> values) {
            addCriterion("mofuel in", values, "mofuel");
            return (Criteria) this;
        }

        public Criteria andMofuelNotIn(List<String> values) {
            addCriterion("mofuel not in", values, "mofuel");
            return (Criteria) this;
        }

        public Criteria andMofuelBetween(String value1, String value2) {
            addCriterion("mofuel between", value1, value2, "mofuel");
            return (Criteria) this;
        }

        public Criteria andMofuelNotBetween(String value1, String value2) {
            addCriterion("mofuel not between", value1, value2, "mofuel");
            return (Criteria) this;
        }

        public Criteria andLoadIsNull() {
            addCriterion("load is null");
            return (Criteria) this;
        }

        public Criteria andLoadIsNotNull() {
            addCriterion("load is not null");
            return (Criteria) this;
        }

        public Criteria andLoadEqualTo(Integer value) {
            addCriterion("load =", value, "load");
            return (Criteria) this;
        }

        public Criteria andLoadNotEqualTo(Integer value) {
            addCriterion("load <>", value, "load");
            return (Criteria) this;
        }

        public Criteria andLoadGreaterThan(Integer value) {
            addCriterion("load >", value, "load");
            return (Criteria) this;
        }

        public Criteria andLoadGreaterThanOrEqualTo(Integer value) {
            addCriterion("load >=", value, "load");
            return (Criteria) this;
        }

        public Criteria andLoadLessThan(Integer value) {
            addCriterion("load <", value, "load");
            return (Criteria) this;
        }

        public Criteria andLoadLessThanOrEqualTo(Integer value) {
            addCriterion("load <=", value, "load");
            return (Criteria) this;
        }

        public Criteria andLoadIn(List<Integer> values) {
            addCriterion("load in", values, "load");
            return (Criteria) this;
        }

        public Criteria andLoadNotIn(List<Integer> values) {
            addCriterion("load not in", values, "load");
            return (Criteria) this;
        }

        public Criteria andLoadBetween(Integer value1, Integer value2) {
            addCriterion("load between", value1, value2, "load");
            return (Criteria) this;
        }

        public Criteria andLoadNotBetween(Integer value1, Integer value2) {
            addCriterion("load not between", value1, value2, "load");
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

        public Criteria andImgIsNull() {
            addCriterion("img is null");
            return (Criteria) this;
        }

        public Criteria andImgIsNotNull() {
            addCriterion("img is not null");
            return (Criteria) this;
        }

        public Criteria andImgEqualTo(String value) {
            addCriterion("img =", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotEqualTo(String value) {
            addCriterion("img <>", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgGreaterThan(String value) {
            addCriterion("img >", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgGreaterThanOrEqualTo(String value) {
            addCriterion("img >=", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLessThan(String value) {
            addCriterion("img <", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLessThanOrEqualTo(String value) {
            addCriterion("img <=", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLike(String value) {
            addCriterion("img like", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotLike(String value) {
            addCriterion("img not like", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgIn(List<String> values) {
            addCriterion("img in", values, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotIn(List<String> values) {
            addCriterion("img not in", values, "img");
            return (Criteria) this;
        }

        public Criteria andImgBetween(String value1, String value2) {
            addCriterion("img between", value1, value2, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotBetween(String value1, String value2) {
            addCriterion("img not between", value1, value2, "img");
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