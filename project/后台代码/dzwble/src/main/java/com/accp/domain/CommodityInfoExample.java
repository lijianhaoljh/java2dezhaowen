package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class CommodityInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommodityInfoExample() {
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

        public Criteria andCnameIsNull() {
            addCriterion("cname is null");
            return (Criteria) this;
        }

        public Criteria andCnameIsNotNull() {
            addCriterion("cname is not null");
            return (Criteria) this;
        }

        public Criteria andCnameEqualTo(String value) {
            addCriterion("cname =", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotEqualTo(String value) {
            addCriterion("cname <>", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameGreaterThan(String value) {
            addCriterion("cname >", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameGreaterThanOrEqualTo(String value) {
            addCriterion("cname >=", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLessThan(String value) {
            addCriterion("cname <", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLessThanOrEqualTo(String value) {
            addCriterion("cname <=", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLike(String value) {
            addCriterion("cname like", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotLike(String value) {
            addCriterion("cname not like", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameIn(List<String> values) {
            addCriterion("cname in", values, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotIn(List<String> values) {
            addCriterion("cname not in", values, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameBetween(String value1, String value2) {
            addCriterion("cname between", value1, value2, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotBetween(String value1, String value2) {
            addCriterion("cname not between", value1, value2, "cname");
            return (Criteria) this;
        }

        public Criteria andCbidIsNull() {
            addCriterion("cbid is null");
            return (Criteria) this;
        }

        public Criteria andCbidIsNotNull() {
            addCriterion("cbid is not null");
            return (Criteria) this;
        }

        public Criteria andCbidEqualTo(Integer value) {
            addCriterion("cbid =", value, "cbid");
            return (Criteria) this;
        }

        public Criteria andCbidNotEqualTo(Integer value) {
            addCriterion("cbid <>", value, "cbid");
            return (Criteria) this;
        }

        public Criteria andCbidGreaterThan(Integer value) {
            addCriterion("cbid >", value, "cbid");
            return (Criteria) this;
        }

        public Criteria andCbidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cbid >=", value, "cbid");
            return (Criteria) this;
        }

        public Criteria andCbidLessThan(Integer value) {
            addCriterion("cbid <", value, "cbid");
            return (Criteria) this;
        }

        public Criteria andCbidLessThanOrEqualTo(Integer value) {
            addCriterion("cbid <=", value, "cbid");
            return (Criteria) this;
        }

        public Criteria andCbidIn(List<Integer> values) {
            addCriterion("cbid in", values, "cbid");
            return (Criteria) this;
        }

        public Criteria andCbidNotIn(List<Integer> values) {
            addCriterion("cbid not in", values, "cbid");
            return (Criteria) this;
        }

        public Criteria andCbidBetween(Integer value1, Integer value2) {
            addCriterion("cbid between", value1, value2, "cbid");
            return (Criteria) this;
        }

        public Criteria andCbidNotBetween(Integer value1, Integer value2) {
            addCriterion("cbid not between", value1, value2, "cbid");
            return (Criteria) this;
        }

        public Criteria andCuidIsNull() {
            addCriterion("cuid is null");
            return (Criteria) this;
        }

        public Criteria andCuidIsNotNull() {
            addCriterion("cuid is not null");
            return (Criteria) this;
        }

        public Criteria andCuidEqualTo(Integer value) {
            addCriterion("cuid =", value, "cuid");
            return (Criteria) this;
        }

        public Criteria andCuidNotEqualTo(Integer value) {
            addCriterion("cuid <>", value, "cuid");
            return (Criteria) this;
        }

        public Criteria andCuidGreaterThan(Integer value) {
            addCriterion("cuid >", value, "cuid");
            return (Criteria) this;
        }

        public Criteria andCuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cuid >=", value, "cuid");
            return (Criteria) this;
        }

        public Criteria andCuidLessThan(Integer value) {
            addCriterion("cuid <", value, "cuid");
            return (Criteria) this;
        }

        public Criteria andCuidLessThanOrEqualTo(Integer value) {
            addCriterion("cuid <=", value, "cuid");
            return (Criteria) this;
        }

        public Criteria andCuidIn(List<Integer> values) {
            addCriterion("cuid in", values, "cuid");
            return (Criteria) this;
        }

        public Criteria andCuidNotIn(List<Integer> values) {
            addCriterion("cuid not in", values, "cuid");
            return (Criteria) this;
        }

        public Criteria andCuidBetween(Integer value1, Integer value2) {
            addCriterion("cuid between", value1, value2, "cuid");
            return (Criteria) this;
        }

        public Criteria andCuidNotBetween(Integer value1, Integer value2) {
            addCriterion("cuid not between", value1, value2, "cuid");
            return (Criteria) this;
        }

        public Criteria andVehicletypeIsNull() {
            addCriterion("vehicletype is null");
            return (Criteria) this;
        }

        public Criteria andVehicletypeIsNotNull() {
            addCriterion("vehicletype is not null");
            return (Criteria) this;
        }

        public Criteria andVehicletypeEqualTo(String value) {
            addCriterion("vehicletype =", value, "vehicletype");
            return (Criteria) this;
        }

        public Criteria andVehicletypeNotEqualTo(String value) {
            addCriterion("vehicletype <>", value, "vehicletype");
            return (Criteria) this;
        }

        public Criteria andVehicletypeGreaterThan(String value) {
            addCriterion("vehicletype >", value, "vehicletype");
            return (Criteria) this;
        }

        public Criteria andVehicletypeGreaterThanOrEqualTo(String value) {
            addCriterion("vehicletype >=", value, "vehicletype");
            return (Criteria) this;
        }

        public Criteria andVehicletypeLessThan(String value) {
            addCriterion("vehicletype <", value, "vehicletype");
            return (Criteria) this;
        }

        public Criteria andVehicletypeLessThanOrEqualTo(String value) {
            addCriterion("vehicletype <=", value, "vehicletype");
            return (Criteria) this;
        }

        public Criteria andVehicletypeLike(String value) {
            addCriterion("vehicletype like", value, "vehicletype");
            return (Criteria) this;
        }

        public Criteria andVehicletypeNotLike(String value) {
            addCriterion("vehicletype not like", value, "vehicletype");
            return (Criteria) this;
        }

        public Criteria andVehicletypeIn(List<String> values) {
            addCriterion("vehicletype in", values, "vehicletype");
            return (Criteria) this;
        }

        public Criteria andVehicletypeNotIn(List<String> values) {
            addCriterion("vehicletype not in", values, "vehicletype");
            return (Criteria) this;
        }

        public Criteria andVehicletypeBetween(String value1, String value2) {
            addCriterion("vehicletype between", value1, value2, "vehicletype");
            return (Criteria) this;
        }

        public Criteria andVehicletypeNotBetween(String value1, String value2) {
            addCriterion("vehicletype not between", value1, value2, "vehicletype");
            return (Criteria) this;
        }

        public Criteria andGidIsNull() {
            addCriterion("gid is null");
            return (Criteria) this;
        }

        public Criteria andGidIsNotNull() {
            addCriterion("gid is not null");
            return (Criteria) this;
        }

        public Criteria andGidEqualTo(Integer value) {
            addCriterion("gid =", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotEqualTo(Integer value) {
            addCriterion("gid <>", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidGreaterThan(Integer value) {
            addCriterion("gid >", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidGreaterThanOrEqualTo(Integer value) {
            addCriterion("gid >=", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidLessThan(Integer value) {
            addCriterion("gid <", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidLessThanOrEqualTo(Integer value) {
            addCriterion("gid <=", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidIn(List<Integer> values) {
            addCriterion("gid in", values, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotIn(List<Integer> values) {
            addCriterion("gid not in", values, "gid");
            return (Criteria) this;
        }

        public Criteria andGidBetween(Integer value1, Integer value2) {
            addCriterion("gid between", value1, value2, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotBetween(Integer value1, Integer value2) {
            addCriterion("gid not between", value1, value2, "gid");
            return (Criteria) this;
        }

        public Criteria andToinoIsNull() {
            addCriterion("toino is null");
            return (Criteria) this;
        }

        public Criteria andToinoIsNotNull() {
            addCriterion("toino is not null");
            return (Criteria) this;
        }

        public Criteria andToinoEqualTo(Integer value) {
            addCriterion("toino =", value, "toino");
            return (Criteria) this;
        }

        public Criteria andToinoNotEqualTo(Integer value) {
            addCriterion("toino <>", value, "toino");
            return (Criteria) this;
        }

        public Criteria andToinoGreaterThan(Integer value) {
            addCriterion("toino >", value, "toino");
            return (Criteria) this;
        }

        public Criteria andToinoGreaterThanOrEqualTo(Integer value) {
            addCriterion("toino >=", value, "toino");
            return (Criteria) this;
        }

        public Criteria andToinoLessThan(Integer value) {
            addCriterion("toino <", value, "toino");
            return (Criteria) this;
        }

        public Criteria andToinoLessThanOrEqualTo(Integer value) {
            addCriterion("toino <=", value, "toino");
            return (Criteria) this;
        }

        public Criteria andToinoIn(List<Integer> values) {
            addCriterion("toino in", values, "toino");
            return (Criteria) this;
        }

        public Criteria andToinoNotIn(List<Integer> values) {
            addCriterion("toino not in", values, "toino");
            return (Criteria) this;
        }

        public Criteria andToinoBetween(Integer value1, Integer value2) {
            addCriterion("toino between", value1, value2, "toino");
            return (Criteria) this;
        }

        public Criteria andToinoNotBetween(Integer value1, Integer value2) {
            addCriterion("toino not between", value1, value2, "toino");
            return (Criteria) this;
        }

        public Criteria andCoidIsNull() {
            addCriterion("coid is null");
            return (Criteria) this;
        }

        public Criteria andCoidIsNotNull() {
            addCriterion("coid is not null");
            return (Criteria) this;
        }

        public Criteria andCoidEqualTo(Integer value) {
            addCriterion("coid =", value, "coid");
            return (Criteria) this;
        }

        public Criteria andCoidNotEqualTo(Integer value) {
            addCriterion("coid <>", value, "coid");
            return (Criteria) this;
        }

        public Criteria andCoidGreaterThan(Integer value) {
            addCriterion("coid >", value, "coid");
            return (Criteria) this;
        }

        public Criteria andCoidGreaterThanOrEqualTo(Integer value) {
            addCriterion("coid >=", value, "coid");
            return (Criteria) this;
        }

        public Criteria andCoidLessThan(Integer value) {
            addCriterion("coid <", value, "coid");
            return (Criteria) this;
        }

        public Criteria andCoidLessThanOrEqualTo(Integer value) {
            addCriterion("coid <=", value, "coid");
            return (Criteria) this;
        }

        public Criteria andCoidIn(List<Integer> values) {
            addCriterion("coid in", values, "coid");
            return (Criteria) this;
        }

        public Criteria andCoidNotIn(List<Integer> values) {
            addCriterion("coid not in", values, "coid");
            return (Criteria) this;
        }

        public Criteria andCoidBetween(Integer value1, Integer value2) {
            addCriterion("coid between", value1, value2, "coid");
            return (Criteria) this;
        }

        public Criteria andCoidNotBetween(Integer value1, Integer value2) {
            addCriterion("coid not between", value1, value2, "coid");
            return (Criteria) this;
        }

        public Criteria andGcidIsNull() {
            addCriterion("gcid is null");
            return (Criteria) this;
        }

        public Criteria andGcidIsNotNull() {
            addCriterion("gcid is not null");
            return (Criteria) this;
        }

        public Criteria andGcidEqualTo(Integer value) {
            addCriterion("gcid =", value, "gcid");
            return (Criteria) this;
        }

        public Criteria andGcidNotEqualTo(Integer value) {
            addCriterion("gcid <>", value, "gcid");
            return (Criteria) this;
        }

        public Criteria andGcidGreaterThan(Integer value) {
            addCriterion("gcid >", value, "gcid");
            return (Criteria) this;
        }

        public Criteria andGcidGreaterThanOrEqualTo(Integer value) {
            addCriterion("gcid >=", value, "gcid");
            return (Criteria) this;
        }

        public Criteria andGcidLessThan(Integer value) {
            addCriterion("gcid <", value, "gcid");
            return (Criteria) this;
        }

        public Criteria andGcidLessThanOrEqualTo(Integer value) {
            addCriterion("gcid <=", value, "gcid");
            return (Criteria) this;
        }

        public Criteria andGcidIn(List<Integer> values) {
            addCriterion("gcid in", values, "gcid");
            return (Criteria) this;
        }

        public Criteria andGcidNotIn(List<Integer> values) {
            addCriterion("gcid not in", values, "gcid");
            return (Criteria) this;
        }

        public Criteria andGcidBetween(Integer value1, Integer value2) {
            addCriterion("gcid between", value1, value2, "gcid");
            return (Criteria) this;
        }

        public Criteria andGcidNotBetween(Integer value1, Integer value2) {
            addCriterion("gcid not between", value1, value2, "gcid");
            return (Criteria) this;
        }

        public Criteria andPidIsNull() {
            addCriterion("pid is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("pid is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(Integer value) {
            addCriterion("pid =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(Integer value) {
            addCriterion("pid <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(Integer value) {
            addCriterion("pid >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pid >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(Integer value) {
            addCriterion("pid <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(Integer value) {
            addCriterion("pid <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<Integer> values) {
            addCriterion("pid in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<Integer> values) {
            addCriterion("pid not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(Integer value1, Integer value2) {
            addCriterion("pid between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(Integer value1, Integer value2) {
            addCriterion("pid not between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andMfidIsNull() {
            addCriterion("mfid is null");
            return (Criteria) this;
        }

        public Criteria andMfidIsNotNull() {
            addCriterion("mfid is not null");
            return (Criteria) this;
        }

        public Criteria andMfidEqualTo(Integer value) {
            addCriterion("mfid =", value, "mfid");
            return (Criteria) this;
        }

        public Criteria andMfidNotEqualTo(Integer value) {
            addCriterion("mfid <>", value, "mfid");
            return (Criteria) this;
        }

        public Criteria andMfidGreaterThan(Integer value) {
            addCriterion("mfid >", value, "mfid");
            return (Criteria) this;
        }

        public Criteria andMfidGreaterThanOrEqualTo(Integer value) {
            addCriterion("mfid >=", value, "mfid");
            return (Criteria) this;
        }

        public Criteria andMfidLessThan(Integer value) {
            addCriterion("mfid <", value, "mfid");
            return (Criteria) this;
        }

        public Criteria andMfidLessThanOrEqualTo(Integer value) {
            addCriterion("mfid <=", value, "mfid");
            return (Criteria) this;
        }

        public Criteria andMfidIn(List<Integer> values) {
            addCriterion("mfid in", values, "mfid");
            return (Criteria) this;
        }

        public Criteria andMfidNotIn(List<Integer> values) {
            addCriterion("mfid not in", values, "mfid");
            return (Criteria) this;
        }

        public Criteria andMfidBetween(Integer value1, Integer value2) {
            addCriterion("mfid between", value1, value2, "mfid");
            return (Criteria) this;
        }

        public Criteria andMfidNotBetween(Integer value1, Integer value2) {
            addCriterion("mfid not between", value1, value2, "mfid");
            return (Criteria) this;
        }

        public Criteria andOriginIsNull() {
            addCriterion("origin is null");
            return (Criteria) this;
        }

        public Criteria andOriginIsNotNull() {
            addCriterion("origin is not null");
            return (Criteria) this;
        }

        public Criteria andOriginEqualTo(String value) {
            addCriterion("origin =", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginNotEqualTo(String value) {
            addCriterion("origin <>", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginGreaterThan(String value) {
            addCriterion("origin >", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginGreaterThanOrEqualTo(String value) {
            addCriterion("origin >=", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginLessThan(String value) {
            addCriterion("origin <", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginLessThanOrEqualTo(String value) {
            addCriterion("origin <=", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginLike(String value) {
            addCriterion("origin like", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginNotLike(String value) {
            addCriterion("origin not like", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginIn(List<String> values) {
            addCriterion("origin in", values, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginNotIn(List<String> values) {
            addCriterion("origin not in", values, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginBetween(String value1, String value2) {
            addCriterion("origin between", value1, value2, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginNotBetween(String value1, String value2) {
            addCriterion("origin not between", value1, value2, "origin");
            return (Criteria) this;
        }

        public Criteria andBarcodeIsNull() {
            addCriterion("barcode is null");
            return (Criteria) this;
        }

        public Criteria andBarcodeIsNotNull() {
            addCriterion("barcode is not null");
            return (Criteria) this;
        }

        public Criteria andBarcodeEqualTo(String value) {
            addCriterion("barcode =", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeNotEqualTo(String value) {
            addCriterion("barcode <>", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeGreaterThan(String value) {
            addCriterion("barcode >", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeGreaterThanOrEqualTo(String value) {
            addCriterion("barcode >=", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeLessThan(String value) {
            addCriterion("barcode <", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeLessThanOrEqualTo(String value) {
            addCriterion("barcode <=", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeLike(String value) {
            addCriterion("barcode like", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeNotLike(String value) {
            addCriterion("barcode not like", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeIn(List<String> values) {
            addCriterion("barcode in", values, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeNotIn(List<String> values) {
            addCriterion("barcode not in", values, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeBetween(String value1, String value2) {
            addCriterion("barcode between", value1, value2, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeNotBetween(String value1, String value2) {
            addCriterion("barcode not between", value1, value2, "barcode");
            return (Criteria) this;
        }

        public Criteria andPackagIsNull() {
            addCriterion("packag is null");
            return (Criteria) this;
        }

        public Criteria andPackagIsNotNull() {
            addCriterion("packag is not null");
            return (Criteria) this;
        }

        public Criteria andPackagEqualTo(String value) {
            addCriterion("packag =", value, "packag");
            return (Criteria) this;
        }

        public Criteria andPackagNotEqualTo(String value) {
            addCriterion("packag <>", value, "packag");
            return (Criteria) this;
        }

        public Criteria andPackagGreaterThan(String value) {
            addCriterion("packag >", value, "packag");
            return (Criteria) this;
        }

        public Criteria andPackagGreaterThanOrEqualTo(String value) {
            addCriterion("packag >=", value, "packag");
            return (Criteria) this;
        }

        public Criteria andPackagLessThan(String value) {
            addCriterion("packag <", value, "packag");
            return (Criteria) this;
        }

        public Criteria andPackagLessThanOrEqualTo(String value) {
            addCriterion("packag <=", value, "packag");
            return (Criteria) this;
        }

        public Criteria andPackagLike(String value) {
            addCriterion("packag like", value, "packag");
            return (Criteria) this;
        }

        public Criteria andPackagNotLike(String value) {
            addCriterion("packag not like", value, "packag");
            return (Criteria) this;
        }

        public Criteria andPackagIn(List<String> values) {
            addCriterion("packag in", values, "packag");
            return (Criteria) this;
        }

        public Criteria andPackagNotIn(List<String> values) {
            addCriterion("packag not in", values, "packag");
            return (Criteria) this;
        }

        public Criteria andPackagBetween(String value1, String value2) {
            addCriterion("packag between", value1, value2, "packag");
            return (Criteria) this;
        }

        public Criteria andPackagNotBetween(String value1, String value2) {
            addCriterion("packag not between", value1, value2, "packag");
            return (Criteria) this;
        }

        public Criteria andVolumeIsNull() {
            addCriterion("volume is null");
            return (Criteria) this;
        }

        public Criteria andVolumeIsNotNull() {
            addCriterion("volume is not null");
            return (Criteria) this;
        }

        public Criteria andVolumeEqualTo(Float value) {
            addCriterion("volume =", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotEqualTo(Float value) {
            addCriterion("volume <>", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeGreaterThan(Float value) {
            addCriterion("volume >", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeGreaterThanOrEqualTo(Float value) {
            addCriterion("volume >=", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeLessThan(Float value) {
            addCriterion("volume <", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeLessThanOrEqualTo(Float value) {
            addCriterion("volume <=", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeIn(List<Float> values) {
            addCriterion("volume in", values, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotIn(List<Float> values) {
            addCriterion("volume not in", values, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeBetween(Float value1, Float value2) {
            addCriterion("volume between", value1, value2, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotBetween(Float value1, Float value2) {
            addCriterion("volume not between", value1, value2, "volume");
            return (Criteria) this;
        }

        public Criteria andGrossweightIsNull() {
            addCriterion("grossweight is null");
            return (Criteria) this;
        }

        public Criteria andGrossweightIsNotNull() {
            addCriterion("grossweight is not null");
            return (Criteria) this;
        }

        public Criteria andGrossweightEqualTo(Float value) {
            addCriterion("grossweight =", value, "grossweight");
            return (Criteria) this;
        }

        public Criteria andGrossweightNotEqualTo(Float value) {
            addCriterion("grossweight <>", value, "grossweight");
            return (Criteria) this;
        }

        public Criteria andGrossweightGreaterThan(Float value) {
            addCriterion("grossweight >", value, "grossweight");
            return (Criteria) this;
        }

        public Criteria andGrossweightGreaterThanOrEqualTo(Float value) {
            addCriterion("grossweight >=", value, "grossweight");
            return (Criteria) this;
        }

        public Criteria andGrossweightLessThan(Float value) {
            addCriterion("grossweight <", value, "grossweight");
            return (Criteria) this;
        }

        public Criteria andGrossweightLessThanOrEqualTo(Float value) {
            addCriterion("grossweight <=", value, "grossweight");
            return (Criteria) this;
        }

        public Criteria andGrossweightIn(List<Float> values) {
            addCriterion("grossweight in", values, "grossweight");
            return (Criteria) this;
        }

        public Criteria andGrossweightNotIn(List<Float> values) {
            addCriterion("grossweight not in", values, "grossweight");
            return (Criteria) this;
        }

        public Criteria andGrossweightBetween(Float value1, Float value2) {
            addCriterion("grossweight between", value1, value2, "grossweight");
            return (Criteria) this;
        }

        public Criteria andGrossweightNotBetween(Float value1, Float value2) {
            addCriterion("grossweight not between", value1, value2, "grossweight");
            return (Criteria) this;
        }

        public Criteria andNetweightIsNull() {
            addCriterion("netweight is null");
            return (Criteria) this;
        }

        public Criteria andNetweightIsNotNull() {
            addCriterion("netweight is not null");
            return (Criteria) this;
        }

        public Criteria andNetweightEqualTo(Float value) {
            addCriterion("netweight =", value, "netweight");
            return (Criteria) this;
        }

        public Criteria andNetweightNotEqualTo(Float value) {
            addCriterion("netweight <>", value, "netweight");
            return (Criteria) this;
        }

        public Criteria andNetweightGreaterThan(Float value) {
            addCriterion("netweight >", value, "netweight");
            return (Criteria) this;
        }

        public Criteria andNetweightGreaterThanOrEqualTo(Float value) {
            addCriterion("netweight >=", value, "netweight");
            return (Criteria) this;
        }

        public Criteria andNetweightLessThan(Float value) {
            addCriterion("netweight <", value, "netweight");
            return (Criteria) this;
        }

        public Criteria andNetweightLessThanOrEqualTo(Float value) {
            addCriterion("netweight <=", value, "netweight");
            return (Criteria) this;
        }

        public Criteria andNetweightIn(List<Float> values) {
            addCriterion("netweight in", values, "netweight");
            return (Criteria) this;
        }

        public Criteria andNetweightNotIn(List<Float> values) {
            addCriterion("netweight not in", values, "netweight");
            return (Criteria) this;
        }

        public Criteria andNetweightBetween(Float value1, Float value2) {
            addCriterion("netweight between", value1, value2, "netweight");
            return (Criteria) this;
        }

        public Criteria andNetweightNotBetween(Float value1, Float value2) {
            addCriterion("netweight not between", value1, value2, "netweight");
            return (Criteria) this;
        }

        public Criteria andStockpriceIsNull() {
            addCriterion("stockprice is null");
            return (Criteria) this;
        }

        public Criteria andStockpriceIsNotNull() {
            addCriterion("stockprice is not null");
            return (Criteria) this;
        }

        public Criteria andStockpriceEqualTo(Float value) {
            addCriterion("stockprice =", value, "stockprice");
            return (Criteria) this;
        }

        public Criteria andStockpriceNotEqualTo(Float value) {
            addCriterion("stockprice <>", value, "stockprice");
            return (Criteria) this;
        }

        public Criteria andStockpriceGreaterThan(Float value) {
            addCriterion("stockprice >", value, "stockprice");
            return (Criteria) this;
        }

        public Criteria andStockpriceGreaterThanOrEqualTo(Float value) {
            addCriterion("stockprice >=", value, "stockprice");
            return (Criteria) this;
        }

        public Criteria andStockpriceLessThan(Float value) {
            addCriterion("stockprice <", value, "stockprice");
            return (Criteria) this;
        }

        public Criteria andStockpriceLessThanOrEqualTo(Float value) {
            addCriterion("stockprice <=", value, "stockprice");
            return (Criteria) this;
        }

        public Criteria andStockpriceIn(List<Float> values) {
            addCriterion("stockprice in", values, "stockprice");
            return (Criteria) this;
        }

        public Criteria andStockpriceNotIn(List<Float> values) {
            addCriterion("stockprice not in", values, "stockprice");
            return (Criteria) this;
        }

        public Criteria andStockpriceBetween(Float value1, Float value2) {
            addCriterion("stockprice between", value1, value2, "stockprice");
            return (Criteria) this;
        }

        public Criteria andStockpriceNotBetween(Float value1, Float value2) {
            addCriterion("stockprice not between", value1, value2, "stockprice");
            return (Criteria) this;
        }

        public Criteria andMarkupIsNull() {
            addCriterion("markup is null");
            return (Criteria) this;
        }

        public Criteria andMarkupIsNotNull() {
            addCriterion("markup is not null");
            return (Criteria) this;
        }

        public Criteria andMarkupEqualTo(Float value) {
            addCriterion("markup =", value, "markup");
            return (Criteria) this;
        }

        public Criteria andMarkupNotEqualTo(Float value) {
            addCriterion("markup <>", value, "markup");
            return (Criteria) this;
        }

        public Criteria andMarkupGreaterThan(Float value) {
            addCriterion("markup >", value, "markup");
            return (Criteria) this;
        }

        public Criteria andMarkupGreaterThanOrEqualTo(Float value) {
            addCriterion("markup >=", value, "markup");
            return (Criteria) this;
        }

        public Criteria andMarkupLessThan(Float value) {
            addCriterion("markup <", value, "markup");
            return (Criteria) this;
        }

        public Criteria andMarkupLessThanOrEqualTo(Float value) {
            addCriterion("markup <=", value, "markup");
            return (Criteria) this;
        }

        public Criteria andMarkupIn(List<Float> values) {
            addCriterion("markup in", values, "markup");
            return (Criteria) this;
        }

        public Criteria andMarkupNotIn(List<Float> values) {
            addCriterion("markup not in", values, "markup");
            return (Criteria) this;
        }

        public Criteria andMarkupBetween(Float value1, Float value2) {
            addCriterion("markup between", value1, value2, "markup");
            return (Criteria) this;
        }

        public Criteria andMarkupNotBetween(Float value1, Float value2) {
            addCriterion("markup not between", value1, value2, "markup");
            return (Criteria) this;
        }

        public Criteria andExchangecodeIsNull() {
            addCriterion("exchangecode is null");
            return (Criteria) this;
        }

        public Criteria andExchangecodeIsNotNull() {
            addCriterion("exchangecode is not null");
            return (Criteria) this;
        }

        public Criteria andExchangecodeEqualTo(String value) {
            addCriterion("exchangecode =", value, "exchangecode");
            return (Criteria) this;
        }

        public Criteria andExchangecodeNotEqualTo(String value) {
            addCriterion("exchangecode <>", value, "exchangecode");
            return (Criteria) this;
        }

        public Criteria andExchangecodeGreaterThan(String value) {
            addCriterion("exchangecode >", value, "exchangecode");
            return (Criteria) this;
        }

        public Criteria andExchangecodeGreaterThanOrEqualTo(String value) {
            addCriterion("exchangecode >=", value, "exchangecode");
            return (Criteria) this;
        }

        public Criteria andExchangecodeLessThan(String value) {
            addCriterion("exchangecode <", value, "exchangecode");
            return (Criteria) this;
        }

        public Criteria andExchangecodeLessThanOrEqualTo(String value) {
            addCriterion("exchangecode <=", value, "exchangecode");
            return (Criteria) this;
        }

        public Criteria andExchangecodeLike(String value) {
            addCriterion("exchangecode like", value, "exchangecode");
            return (Criteria) this;
        }

        public Criteria andExchangecodeNotLike(String value) {
            addCriterion("exchangecode not like", value, "exchangecode");
            return (Criteria) this;
        }

        public Criteria andExchangecodeIn(List<String> values) {
            addCriterion("exchangecode in", values, "exchangecode");
            return (Criteria) this;
        }

        public Criteria andExchangecodeNotIn(List<String> values) {
            addCriterion("exchangecode not in", values, "exchangecode");
            return (Criteria) this;
        }

        public Criteria andExchangecodeBetween(String value1, String value2) {
            addCriterion("exchangecode between", value1, value2, "exchangecode");
            return (Criteria) this;
        }

        public Criteria andExchangecodeNotBetween(String value1, String value2) {
            addCriterion("exchangecode not between", value1, value2, "exchangecode");
            return (Criteria) this;
        }

        public Criteria andStandardpriceIsNull() {
            addCriterion("standardprice is null");
            return (Criteria) this;
        }

        public Criteria andStandardpriceIsNotNull() {
            addCriterion("standardprice is not null");
            return (Criteria) this;
        }

        public Criteria andStandardpriceEqualTo(Float value) {
            addCriterion("standardprice =", value, "standardprice");
            return (Criteria) this;
        }

        public Criteria andStandardpriceNotEqualTo(Float value) {
            addCriterion("standardprice <>", value, "standardprice");
            return (Criteria) this;
        }

        public Criteria andStandardpriceGreaterThan(Float value) {
            addCriterion("standardprice >", value, "standardprice");
            return (Criteria) this;
        }

        public Criteria andStandardpriceGreaterThanOrEqualTo(Float value) {
            addCriterion("standardprice >=", value, "standardprice");
            return (Criteria) this;
        }

        public Criteria andStandardpriceLessThan(Float value) {
            addCriterion("standardprice <", value, "standardprice");
            return (Criteria) this;
        }

        public Criteria andStandardpriceLessThanOrEqualTo(Float value) {
            addCriterion("standardprice <=", value, "standardprice");
            return (Criteria) this;
        }

        public Criteria andStandardpriceIn(List<Float> values) {
            addCriterion("standardprice in", values, "standardprice");
            return (Criteria) this;
        }

        public Criteria andStandardpriceNotIn(List<Float> values) {
            addCriterion("standardprice not in", values, "standardprice");
            return (Criteria) this;
        }

        public Criteria andStandardpriceBetween(Float value1, Float value2) {
            addCriterion("standardprice between", value1, value2, "standardprice");
            return (Criteria) this;
        }

        public Criteria andStandardpriceNotBetween(Float value1, Float value2) {
            addCriterion("standardprice not between", value1, value2, "standardprice");
            return (Criteria) this;
        }

        public Criteria andMemberpriceIsNull() {
            addCriterion("memberprice is null");
            return (Criteria) this;
        }

        public Criteria andMemberpriceIsNotNull() {
            addCriterion("memberprice is not null");
            return (Criteria) this;
        }

        public Criteria andMemberpriceEqualTo(Float value) {
            addCriterion("memberprice =", value, "memberprice");
            return (Criteria) this;
        }

        public Criteria andMemberpriceNotEqualTo(Float value) {
            addCriterion("memberprice <>", value, "memberprice");
            return (Criteria) this;
        }

        public Criteria andMemberpriceGreaterThan(Float value) {
            addCriterion("memberprice >", value, "memberprice");
            return (Criteria) this;
        }

        public Criteria andMemberpriceGreaterThanOrEqualTo(Float value) {
            addCriterion("memberprice >=", value, "memberprice");
            return (Criteria) this;
        }

        public Criteria andMemberpriceLessThan(Float value) {
            addCriterion("memberprice <", value, "memberprice");
            return (Criteria) this;
        }

        public Criteria andMemberpriceLessThanOrEqualTo(Float value) {
            addCriterion("memberprice <=", value, "memberprice");
            return (Criteria) this;
        }

        public Criteria andMemberpriceIn(List<Float> values) {
            addCriterion("memberprice in", values, "memberprice");
            return (Criteria) this;
        }

        public Criteria andMemberpriceNotIn(List<Float> values) {
            addCriterion("memberprice not in", values, "memberprice");
            return (Criteria) this;
        }

        public Criteria andMemberpriceBetween(Float value1, Float value2) {
            addCriterion("memberprice between", value1, value2, "memberprice");
            return (Criteria) this;
        }

        public Criteria andMemberpriceNotBetween(Float value1, Float value2) {
            addCriterion("memberprice not between", value1, value2, "memberprice");
            return (Criteria) this;
        }

        public Criteria andVippriceIsNull() {
            addCriterion("vipprice is null");
            return (Criteria) this;
        }

        public Criteria andVippriceIsNotNull() {
            addCriterion("vipprice is not null");
            return (Criteria) this;
        }

        public Criteria andVippriceEqualTo(Float value) {
            addCriterion("vipprice =", value, "vipprice");
            return (Criteria) this;
        }

        public Criteria andVippriceNotEqualTo(Float value) {
            addCriterion("vipprice <>", value, "vipprice");
            return (Criteria) this;
        }

        public Criteria andVippriceGreaterThan(Float value) {
            addCriterion("vipprice >", value, "vipprice");
            return (Criteria) this;
        }

        public Criteria andVippriceGreaterThanOrEqualTo(Float value) {
            addCriterion("vipprice >=", value, "vipprice");
            return (Criteria) this;
        }

        public Criteria andVippriceLessThan(Float value) {
            addCriterion("vipprice <", value, "vipprice");
            return (Criteria) this;
        }

        public Criteria andVippriceLessThanOrEqualTo(Float value) {
            addCriterion("vipprice <=", value, "vipprice");
            return (Criteria) this;
        }

        public Criteria andVippriceIn(List<Float> values) {
            addCriterion("vipprice in", values, "vipprice");
            return (Criteria) this;
        }

        public Criteria andVippriceNotIn(List<Float> values) {
            addCriterion("vipprice not in", values, "vipprice");
            return (Criteria) this;
        }

        public Criteria andVippriceBetween(Float value1, Float value2) {
            addCriterion("vipprice between", value1, value2, "vipprice");
            return (Criteria) this;
        }

        public Criteria andVippriceNotBetween(Float value1, Float value2) {
            addCriterion("vipprice not between", value1, value2, "vipprice");
            return (Criteria) this;
        }

        public Criteria andAgreementpriceIsNull() {
            addCriterion("agreementprice is null");
            return (Criteria) this;
        }

        public Criteria andAgreementpriceIsNotNull() {
            addCriterion("agreementprice is not null");
            return (Criteria) this;
        }

        public Criteria andAgreementpriceEqualTo(Float value) {
            addCriterion("agreementprice =", value, "agreementprice");
            return (Criteria) this;
        }

        public Criteria andAgreementpriceNotEqualTo(Float value) {
            addCriterion("agreementprice <>", value, "agreementprice");
            return (Criteria) this;
        }

        public Criteria andAgreementpriceGreaterThan(Float value) {
            addCriterion("agreementprice >", value, "agreementprice");
            return (Criteria) this;
        }

        public Criteria andAgreementpriceGreaterThanOrEqualTo(Float value) {
            addCriterion("agreementprice >=", value, "agreementprice");
            return (Criteria) this;
        }

        public Criteria andAgreementpriceLessThan(Float value) {
            addCriterion("agreementprice <", value, "agreementprice");
            return (Criteria) this;
        }

        public Criteria andAgreementpriceLessThanOrEqualTo(Float value) {
            addCriterion("agreementprice <=", value, "agreementprice");
            return (Criteria) this;
        }

        public Criteria andAgreementpriceIn(List<Float> values) {
            addCriterion("agreementprice in", values, "agreementprice");
            return (Criteria) this;
        }

        public Criteria andAgreementpriceNotIn(List<Float> values) {
            addCriterion("agreementprice not in", values, "agreementprice");
            return (Criteria) this;
        }

        public Criteria andAgreementpriceBetween(Float value1, Float value2) {
            addCriterion("agreementprice between", value1, value2, "agreementprice");
            return (Criteria) this;
        }

        public Criteria andAgreementpriceNotBetween(Float value1, Float value2) {
            addCriterion("agreementprice not between", value1, value2, "agreementprice");
            return (Criteria) this;
        }

        public Criteria andInsurancepriceIsNull() {
            addCriterion("Insuranceprice is null");
            return (Criteria) this;
        }

        public Criteria andInsurancepriceIsNotNull() {
            addCriterion("Insuranceprice is not null");
            return (Criteria) this;
        }

        public Criteria andInsurancepriceEqualTo(Float value) {
            addCriterion("Insuranceprice =", value, "insuranceprice");
            return (Criteria) this;
        }

        public Criteria andInsurancepriceNotEqualTo(Float value) {
            addCriterion("Insuranceprice <>", value, "insuranceprice");
            return (Criteria) this;
        }

        public Criteria andInsurancepriceGreaterThan(Float value) {
            addCriterion("Insuranceprice >", value, "insuranceprice");
            return (Criteria) this;
        }

        public Criteria andInsurancepriceGreaterThanOrEqualTo(Float value) {
            addCriterion("Insuranceprice >=", value, "insuranceprice");
            return (Criteria) this;
        }

        public Criteria andInsurancepriceLessThan(Float value) {
            addCriterion("Insuranceprice <", value, "insuranceprice");
            return (Criteria) this;
        }

        public Criteria andInsurancepriceLessThanOrEqualTo(Float value) {
            addCriterion("Insuranceprice <=", value, "insuranceprice");
            return (Criteria) this;
        }

        public Criteria andInsurancepriceIn(List<Float> values) {
            addCriterion("Insuranceprice in", values, "insuranceprice");
            return (Criteria) this;
        }

        public Criteria andInsurancepriceNotIn(List<Float> values) {
            addCriterion("Insuranceprice not in", values, "insuranceprice");
            return (Criteria) this;
        }

        public Criteria andInsurancepriceBetween(Float value1, Float value2) {
            addCriterion("Insuranceprice between", value1, value2, "insuranceprice");
            return (Criteria) this;
        }

        public Criteria andInsurancepriceNotBetween(Float value1, Float value2) {
            addCriterion("Insuranceprice not between", value1, value2, "insuranceprice");
            return (Criteria) this;
        }

        public Criteria andClaimpriceIsNull() {
            addCriterion("claimprice is null");
            return (Criteria) this;
        }

        public Criteria andClaimpriceIsNotNull() {
            addCriterion("claimprice is not null");
            return (Criteria) this;
        }

        public Criteria andClaimpriceEqualTo(Float value) {
            addCriterion("claimprice =", value, "claimprice");
            return (Criteria) this;
        }

        public Criteria andClaimpriceNotEqualTo(Float value) {
            addCriterion("claimprice <>", value, "claimprice");
            return (Criteria) this;
        }

        public Criteria andClaimpriceGreaterThan(Float value) {
            addCriterion("claimprice >", value, "claimprice");
            return (Criteria) this;
        }

        public Criteria andClaimpriceGreaterThanOrEqualTo(Float value) {
            addCriterion("claimprice >=", value, "claimprice");
            return (Criteria) this;
        }

        public Criteria andClaimpriceLessThan(Float value) {
            addCriterion("claimprice <", value, "claimprice");
            return (Criteria) this;
        }

        public Criteria andClaimpriceLessThanOrEqualTo(Float value) {
            addCriterion("claimprice <=", value, "claimprice");
            return (Criteria) this;
        }

        public Criteria andClaimpriceIn(List<Float> values) {
            addCriterion("claimprice in", values, "claimprice");
            return (Criteria) this;
        }

        public Criteria andClaimpriceNotIn(List<Float> values) {
            addCriterion("claimprice not in", values, "claimprice");
            return (Criteria) this;
        }

        public Criteria andClaimpriceBetween(Float value1, Float value2) {
            addCriterion("claimprice between", value1, value2, "claimprice");
            return (Criteria) this;
        }

        public Criteria andClaimpriceNotBetween(Float value1, Float value2) {
            addCriterion("claimprice not between", value1, value2, "claimprice");
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