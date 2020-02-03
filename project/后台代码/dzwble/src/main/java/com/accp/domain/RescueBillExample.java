package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RescueBillExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RescueBillExample() {
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

        public Criteria andRbnameIsNull() {
            addCriterion("rbname is null");
            return (Criteria) this;
        }

        public Criteria andRbnameIsNotNull() {
            addCriterion("rbname is not null");
            return (Criteria) this;
        }

        public Criteria andRbnameEqualTo(String value) {
            addCriterion("rbname =", value, "rbname");
            return (Criteria) this;
        }

        public Criteria andRbnameNotEqualTo(String value) {
            addCriterion("rbname <>", value, "rbname");
            return (Criteria) this;
        }

        public Criteria andRbnameGreaterThan(String value) {
            addCriterion("rbname >", value, "rbname");
            return (Criteria) this;
        }

        public Criteria andRbnameGreaterThanOrEqualTo(String value) {
            addCriterion("rbname >=", value, "rbname");
            return (Criteria) this;
        }

        public Criteria andRbnameLessThan(String value) {
            addCriterion("rbname <", value, "rbname");
            return (Criteria) this;
        }

        public Criteria andRbnameLessThanOrEqualTo(String value) {
            addCriterion("rbname <=", value, "rbname");
            return (Criteria) this;
        }

        public Criteria andRbnameLike(String value) {
            addCriterion("rbname like", value, "rbname");
            return (Criteria) this;
        }

        public Criteria andRbnameNotLike(String value) {
            addCriterion("rbname not like", value, "rbname");
            return (Criteria) this;
        }

        public Criteria andRbnameIn(List<String> values) {
            addCriterion("rbname in", values, "rbname");
            return (Criteria) this;
        }

        public Criteria andRbnameNotIn(List<String> values) {
            addCriterion("rbname not in", values, "rbname");
            return (Criteria) this;
        }

        public Criteria andRbnameBetween(String value1, String value2) {
            addCriterion("rbname between", value1, value2, "rbname");
            return (Criteria) this;
        }

        public Criteria andRbnameNotBetween(String value1, String value2) {
            addCriterion("rbname not between", value1, value2, "rbname");
            return (Criteria) this;
        }

        public Criteria andCurrentMileageIsNull() {
            addCriterion("current_mileage is null");
            return (Criteria) this;
        }

        public Criteria andCurrentMileageIsNotNull() {
            addCriterion("current_mileage is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentMileageEqualTo(Float value) {
            addCriterion("current_mileage =", value, "currentMileage");
            return (Criteria) this;
        }

        public Criteria andCurrentMileageNotEqualTo(Float value) {
            addCriterion("current_mileage <>", value, "currentMileage");
            return (Criteria) this;
        }

        public Criteria andCurrentMileageGreaterThan(Float value) {
            addCriterion("current_mileage >", value, "currentMileage");
            return (Criteria) this;
        }

        public Criteria andCurrentMileageGreaterThanOrEqualTo(Float value) {
            addCriterion("current_mileage >=", value, "currentMileage");
            return (Criteria) this;
        }

        public Criteria andCurrentMileageLessThan(Float value) {
            addCriterion("current_mileage <", value, "currentMileage");
            return (Criteria) this;
        }

        public Criteria andCurrentMileageLessThanOrEqualTo(Float value) {
            addCriterion("current_mileage <=", value, "currentMileage");
            return (Criteria) this;
        }

        public Criteria andCurrentMileageIn(List<Float> values) {
            addCriterion("current_mileage in", values, "currentMileage");
            return (Criteria) this;
        }

        public Criteria andCurrentMileageNotIn(List<Float> values) {
            addCriterion("current_mileage not in", values, "currentMileage");
            return (Criteria) this;
        }

        public Criteria andCurrentMileageBetween(Float value1, Float value2) {
            addCriterion("current_mileage between", value1, value2, "currentMileage");
            return (Criteria) this;
        }

        public Criteria andCurrentMileageNotBetween(Float value1, Float value2) {
            addCriterion("current_mileage not between", value1, value2, "currentMileage");
            return (Criteria) this;
        }

        public Criteria andDispatchingTimeIsNull() {
            addCriterion("Dispatching_time is null");
            return (Criteria) this;
        }

        public Criteria andDispatchingTimeIsNotNull() {
            addCriterion("Dispatching_time is not null");
            return (Criteria) this;
        }

        public Criteria andDispatchingTimeEqualTo(Date value) {
            addCriterion("Dispatching_time =", value, "dispatchingTime");
            return (Criteria) this;
        }

        public Criteria andDispatchingTimeNotEqualTo(Date value) {
            addCriterion("Dispatching_time <>", value, "dispatchingTime");
            return (Criteria) this;
        }

        public Criteria andDispatchingTimeGreaterThan(Date value) {
            addCriterion("Dispatching_time >", value, "dispatchingTime");
            return (Criteria) this;
        }

        public Criteria andDispatchingTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("Dispatching_time >=", value, "dispatchingTime");
            return (Criteria) this;
        }

        public Criteria andDispatchingTimeLessThan(Date value) {
            addCriterion("Dispatching_time <", value, "dispatchingTime");
            return (Criteria) this;
        }

        public Criteria andDispatchingTimeLessThanOrEqualTo(Date value) {
            addCriterion("Dispatching_time <=", value, "dispatchingTime");
            return (Criteria) this;
        }

        public Criteria andDispatchingTimeIn(List<Date> values) {
            addCriterion("Dispatching_time in", values, "dispatchingTime");
            return (Criteria) this;
        }

        public Criteria andDispatchingTimeNotIn(List<Date> values) {
            addCriterion("Dispatching_time not in", values, "dispatchingTime");
            return (Criteria) this;
        }

        public Criteria andDispatchingTimeBetween(Date value1, Date value2) {
            addCriterion("Dispatching_time between", value1, value2, "dispatchingTime");
            return (Criteria) this;
        }

        public Criteria andDispatchingTimeNotBetween(Date value1, Date value2) {
            addCriterion("Dispatching_time not between", value1, value2, "dispatchingTime");
            return (Criteria) this;
        }

        public Criteria andEcompletionDateIsNull() {
            addCriterion("ecompletion_date is null");
            return (Criteria) this;
        }

        public Criteria andEcompletionDateIsNotNull() {
            addCriterion("ecompletion_date is not null");
            return (Criteria) this;
        }

        public Criteria andEcompletionDateEqualTo(Date value) {
            addCriterion("ecompletion_date =", value, "ecompletionDate");
            return (Criteria) this;
        }

        public Criteria andEcompletionDateNotEqualTo(Date value) {
            addCriterion("ecompletion_date <>", value, "ecompletionDate");
            return (Criteria) this;
        }

        public Criteria andEcompletionDateGreaterThan(Date value) {
            addCriterion("ecompletion_date >", value, "ecompletionDate");
            return (Criteria) this;
        }

        public Criteria andEcompletionDateGreaterThanOrEqualTo(Date value) {
            addCriterion("ecompletion_date >=", value, "ecompletionDate");
            return (Criteria) this;
        }

        public Criteria andEcompletionDateLessThan(Date value) {
            addCriterion("ecompletion_date <", value, "ecompletionDate");
            return (Criteria) this;
        }

        public Criteria andEcompletionDateLessThanOrEqualTo(Date value) {
            addCriterion("ecompletion_date <=", value, "ecompletionDate");
            return (Criteria) this;
        }

        public Criteria andEcompletionDateIn(List<Date> values) {
            addCriterion("ecompletion_date in", values, "ecompletionDate");
            return (Criteria) this;
        }

        public Criteria andEcompletionDateNotIn(List<Date> values) {
            addCriterion("ecompletion_date not in", values, "ecompletionDate");
            return (Criteria) this;
        }

        public Criteria andEcompletionDateBetween(Date value1, Date value2) {
            addCriterion("ecompletion_date between", value1, value2, "ecompletionDate");
            return (Criteria) this;
        }

        public Criteria andEcompletionDateNotBetween(Date value1, Date value2) {
            addCriterion("ecompletion_date not between", value1, value2, "ecompletionDate");
            return (Criteria) this;
        }

        public Criteria andClearingFormIsNull() {
            addCriterion("clearing_form is null");
            return (Criteria) this;
        }

        public Criteria andClearingFormIsNotNull() {
            addCriterion("clearing_form is not null");
            return (Criteria) this;
        }

        public Criteria andClearingFormEqualTo(String value) {
            addCriterion("clearing_form =", value, "clearingForm");
            return (Criteria) this;
        }

        public Criteria andClearingFormNotEqualTo(String value) {
            addCriterion("clearing_form <>", value, "clearingForm");
            return (Criteria) this;
        }

        public Criteria andClearingFormGreaterThan(String value) {
            addCriterion("clearing_form >", value, "clearingForm");
            return (Criteria) this;
        }

        public Criteria andClearingFormGreaterThanOrEqualTo(String value) {
            addCriterion("clearing_form >=", value, "clearingForm");
            return (Criteria) this;
        }

        public Criteria andClearingFormLessThan(String value) {
            addCriterion("clearing_form <", value, "clearingForm");
            return (Criteria) this;
        }

        public Criteria andClearingFormLessThanOrEqualTo(String value) {
            addCriterion("clearing_form <=", value, "clearingForm");
            return (Criteria) this;
        }

        public Criteria andClearingFormLike(String value) {
            addCriterion("clearing_form like", value, "clearingForm");
            return (Criteria) this;
        }

        public Criteria andClearingFormNotLike(String value) {
            addCriterion("clearing_form not like", value, "clearingForm");
            return (Criteria) this;
        }

        public Criteria andClearingFormIn(List<String> values) {
            addCriterion("clearing_form in", values, "clearingForm");
            return (Criteria) this;
        }

        public Criteria andClearingFormNotIn(List<String> values) {
            addCriterion("clearing_form not in", values, "clearingForm");
            return (Criteria) this;
        }

        public Criteria andClearingFormBetween(String value1, String value2) {
            addCriterion("clearing_form between", value1, value2, "clearingForm");
            return (Criteria) this;
        }

        public Criteria andClearingFormNotBetween(String value1, String value2) {
            addCriterion("clearing_form not between", value1, value2, "clearingForm");
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

        public Criteria andGoOffIsNull() {
            addCriterion("go_off is null");
            return (Criteria) this;
        }

        public Criteria andGoOffIsNotNull() {
            addCriterion("go_off is not null");
            return (Criteria) this;
        }

        public Criteria andGoOffEqualTo(Date value) {
            addCriterion("go_off =", value, "goOff");
            return (Criteria) this;
        }

        public Criteria andGoOffNotEqualTo(Date value) {
            addCriterion("go_off <>", value, "goOff");
            return (Criteria) this;
        }

        public Criteria andGoOffGreaterThan(Date value) {
            addCriterion("go_off >", value, "goOff");
            return (Criteria) this;
        }

        public Criteria andGoOffGreaterThanOrEqualTo(Date value) {
            addCriterion("go_off >=", value, "goOff");
            return (Criteria) this;
        }

        public Criteria andGoOffLessThan(Date value) {
            addCriterion("go_off <", value, "goOff");
            return (Criteria) this;
        }

        public Criteria andGoOffLessThanOrEqualTo(Date value) {
            addCriterion("go_off <=", value, "goOff");
            return (Criteria) this;
        }

        public Criteria andGoOffIn(List<Date> values) {
            addCriterion("go_off in", values, "goOff");
            return (Criteria) this;
        }

        public Criteria andGoOffNotIn(List<Date> values) {
            addCriterion("go_off not in", values, "goOff");
            return (Criteria) this;
        }

        public Criteria andGoOffBetween(Date value1, Date value2) {
            addCriterion("go_off between", value1, value2, "goOff");
            return (Criteria) this;
        }

        public Criteria andGoOffNotBetween(Date value1, Date value2) {
            addCriterion("go_off not between", value1, value2, "goOff");
            return (Criteria) this;
        }

        public Criteria andGoAddressIsNull() {
            addCriterion("go_address is null");
            return (Criteria) this;
        }

        public Criteria andGoAddressIsNotNull() {
            addCriterion("go_address is not null");
            return (Criteria) this;
        }

        public Criteria andGoAddressEqualTo(String value) {
            addCriterion("go_address =", value, "goAddress");
            return (Criteria) this;
        }

        public Criteria andGoAddressNotEqualTo(String value) {
            addCriterion("go_address <>", value, "goAddress");
            return (Criteria) this;
        }

        public Criteria andGoAddressGreaterThan(String value) {
            addCriterion("go_address >", value, "goAddress");
            return (Criteria) this;
        }

        public Criteria andGoAddressGreaterThanOrEqualTo(String value) {
            addCriterion("go_address >=", value, "goAddress");
            return (Criteria) this;
        }

        public Criteria andGoAddressLessThan(String value) {
            addCriterion("go_address <", value, "goAddress");
            return (Criteria) this;
        }

        public Criteria andGoAddressLessThanOrEqualTo(String value) {
            addCriterion("go_address <=", value, "goAddress");
            return (Criteria) this;
        }

        public Criteria andGoAddressLike(String value) {
            addCriterion("go_address like", value, "goAddress");
            return (Criteria) this;
        }

        public Criteria andGoAddressNotLike(String value) {
            addCriterion("go_address not like", value, "goAddress");
            return (Criteria) this;
        }

        public Criteria andGoAddressIn(List<String> values) {
            addCriterion("go_address in", values, "goAddress");
            return (Criteria) this;
        }

        public Criteria andGoAddressNotIn(List<String> values) {
            addCriterion("go_address not in", values, "goAddress");
            return (Criteria) this;
        }

        public Criteria andGoAddressBetween(String value1, String value2) {
            addCriterion("go_address between", value1, value2, "goAddress");
            return (Criteria) this;
        }

        public Criteria andGoAddressNotBetween(String value1, String value2) {
            addCriterion("go_address not between", value1, value2, "goAddress");
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

        public Criteria andCnoEqualTo(String value) {
            addCriterion("cno =", value, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoNotEqualTo(String value) {
            addCriterion("cno <>", value, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoGreaterThan(String value) {
            addCriterion("cno >", value, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoGreaterThanOrEqualTo(String value) {
            addCriterion("cno >=", value, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoLessThan(String value) {
            addCriterion("cno <", value, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoLessThanOrEqualTo(String value) {
            addCriterion("cno <=", value, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoLike(String value) {
            addCriterion("cno like", value, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoNotLike(String value) {
            addCriterion("cno not like", value, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoIn(List<String> values) {
            addCriterion("cno in", values, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoNotIn(List<String> values) {
            addCriterion("cno not in", values, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoBetween(String value1, String value2) {
            addCriterion("cno between", value1, value2, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoNotBetween(String value1, String value2) {
            addCriterion("cno not between", value1, value2, "cno");
            return (Criteria) this;
        }

        public Criteria andRoadHaulIsNull() {
            addCriterion("road_haul is null");
            return (Criteria) this;
        }

        public Criteria andRoadHaulIsNotNull() {
            addCriterion("road_haul is not null");
            return (Criteria) this;
        }

        public Criteria andRoadHaulEqualTo(Float value) {
            addCriterion("road_haul =", value, "roadHaul");
            return (Criteria) this;
        }

        public Criteria andRoadHaulNotEqualTo(Float value) {
            addCriterion("road_haul <>", value, "roadHaul");
            return (Criteria) this;
        }

        public Criteria andRoadHaulGreaterThan(Float value) {
            addCriterion("road_haul >", value, "roadHaul");
            return (Criteria) this;
        }

        public Criteria andRoadHaulGreaterThanOrEqualTo(Float value) {
            addCriterion("road_haul >=", value, "roadHaul");
            return (Criteria) this;
        }

        public Criteria andRoadHaulLessThan(Float value) {
            addCriterion("road_haul <", value, "roadHaul");
            return (Criteria) this;
        }

        public Criteria andRoadHaulLessThanOrEqualTo(Float value) {
            addCriterion("road_haul <=", value, "roadHaul");
            return (Criteria) this;
        }

        public Criteria andRoadHaulIn(List<Float> values) {
            addCriterion("road_haul in", values, "roadHaul");
            return (Criteria) this;
        }

        public Criteria andRoadHaulNotIn(List<Float> values) {
            addCriterion("road_haul not in", values, "roadHaul");
            return (Criteria) this;
        }

        public Criteria andRoadHaulBetween(Float value1, Float value2) {
            addCriterion("road_haul between", value1, value2, "roadHaul");
            return (Criteria) this;
        }

        public Criteria andRoadHaulNotBetween(Float value1, Float value2) {
            addCriterion("road_haul not between", value1, value2, "roadHaul");
            return (Criteria) this;
        }

        public Criteria andConstructionTimeIsNull() {
            addCriterion("construction_time is null");
            return (Criteria) this;
        }

        public Criteria andConstructionTimeIsNotNull() {
            addCriterion("construction_time is not null");
            return (Criteria) this;
        }

        public Criteria andConstructionTimeEqualTo(Date value) {
            addCriterion("construction_time =", value, "constructionTime");
            return (Criteria) this;
        }

        public Criteria andConstructionTimeNotEqualTo(Date value) {
            addCriterion("construction_time <>", value, "constructionTime");
            return (Criteria) this;
        }

        public Criteria andConstructionTimeGreaterThan(Date value) {
            addCriterion("construction_time >", value, "constructionTime");
            return (Criteria) this;
        }

        public Criteria andConstructionTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("construction_time >=", value, "constructionTime");
            return (Criteria) this;
        }

        public Criteria andConstructionTimeLessThan(Date value) {
            addCriterion("construction_time <", value, "constructionTime");
            return (Criteria) this;
        }

        public Criteria andConstructionTimeLessThanOrEqualTo(Date value) {
            addCriterion("construction_time <=", value, "constructionTime");
            return (Criteria) this;
        }

        public Criteria andConstructionTimeIn(List<Date> values) {
            addCriterion("construction_time in", values, "constructionTime");
            return (Criteria) this;
        }

        public Criteria andConstructionTimeNotIn(List<Date> values) {
            addCriterion("construction_time not in", values, "constructionTime");
            return (Criteria) this;
        }

        public Criteria andConstructionTimeBetween(Date value1, Date value2) {
            addCriterion("construction_time between", value1, value2, "constructionTime");
            return (Criteria) this;
        }

        public Criteria andConstructionTimeNotBetween(Date value1, Date value2) {
            addCriterion("construction_time not between", value1, value2, "constructionTime");
            return (Criteria) this;
        }

        public Criteria andRaddressIsNull() {
            addCriterion("raddress is null");
            return (Criteria) this;
        }

        public Criteria andRaddressIsNotNull() {
            addCriterion("raddress is not null");
            return (Criteria) this;
        }

        public Criteria andRaddressEqualTo(String value) {
            addCriterion("raddress =", value, "raddress");
            return (Criteria) this;
        }

        public Criteria andRaddressNotEqualTo(String value) {
            addCriterion("raddress <>", value, "raddress");
            return (Criteria) this;
        }

        public Criteria andRaddressGreaterThan(String value) {
            addCriterion("raddress >", value, "raddress");
            return (Criteria) this;
        }

        public Criteria andRaddressGreaterThanOrEqualTo(String value) {
            addCriterion("raddress >=", value, "raddress");
            return (Criteria) this;
        }

        public Criteria andRaddressLessThan(String value) {
            addCriterion("raddress <", value, "raddress");
            return (Criteria) this;
        }

        public Criteria andRaddressLessThanOrEqualTo(String value) {
            addCriterion("raddress <=", value, "raddress");
            return (Criteria) this;
        }

        public Criteria andRaddressLike(String value) {
            addCriterion("raddress like", value, "raddress");
            return (Criteria) this;
        }

        public Criteria andRaddressNotLike(String value) {
            addCriterion("raddress not like", value, "raddress");
            return (Criteria) this;
        }

        public Criteria andRaddressIn(List<String> values) {
            addCriterion("raddress in", values, "raddress");
            return (Criteria) this;
        }

        public Criteria andRaddressNotIn(List<String> values) {
            addCriterion("raddress not in", values, "raddress");
            return (Criteria) this;
        }

        public Criteria andRaddressBetween(String value1, String value2) {
            addCriterion("raddress between", value1, value2, "raddress");
            return (Criteria) this;
        }

        public Criteria andRaddressNotBetween(String value1, String value2) {
            addCriterion("raddress not between", value1, value2, "raddress");
            return (Criteria) this;
        }

        public Criteria andTimeCompletionIsNull() {
            addCriterion("time_completion is null");
            return (Criteria) this;
        }

        public Criteria andTimeCompletionIsNotNull() {
            addCriterion("time_completion is not null");
            return (Criteria) this;
        }

        public Criteria andTimeCompletionEqualTo(Date value) {
            addCriterion("time_completion =", value, "timeCompletion");
            return (Criteria) this;
        }

        public Criteria andTimeCompletionNotEqualTo(Date value) {
            addCriterion("time_completion <>", value, "timeCompletion");
            return (Criteria) this;
        }

        public Criteria andTimeCompletionGreaterThan(Date value) {
            addCriterion("time_completion >", value, "timeCompletion");
            return (Criteria) this;
        }

        public Criteria andTimeCompletionGreaterThanOrEqualTo(Date value) {
            addCriterion("time_completion >=", value, "timeCompletion");
            return (Criteria) this;
        }

        public Criteria andTimeCompletionLessThan(Date value) {
            addCriterion("time_completion <", value, "timeCompletion");
            return (Criteria) this;
        }

        public Criteria andTimeCompletionLessThanOrEqualTo(Date value) {
            addCriterion("time_completion <=", value, "timeCompletion");
            return (Criteria) this;
        }

        public Criteria andTimeCompletionIn(List<Date> values) {
            addCriterion("time_completion in", values, "timeCompletion");
            return (Criteria) this;
        }

        public Criteria andTimeCompletionNotIn(List<Date> values) {
            addCriterion("time_completion not in", values, "timeCompletion");
            return (Criteria) this;
        }

        public Criteria andTimeCompletionBetween(Date value1, Date value2) {
            addCriterion("time_completion between", value1, value2, "timeCompletion");
            return (Criteria) this;
        }

        public Criteria andTimeCompletionNotBetween(Date value1, Date value2) {
            addCriterion("time_completion not between", value1, value2, "timeCompletion");
            return (Criteria) this;
        }

        public Criteria andEcompletionMoneyIsNull() {
            addCriterion("ecompletion_money is null");
            return (Criteria) this;
        }

        public Criteria andEcompletionMoneyIsNotNull() {
            addCriterion("ecompletion_money is not null");
            return (Criteria) this;
        }

        public Criteria andEcompletionMoneyEqualTo(Float value) {
            addCriterion("ecompletion_money =", value, "ecompletionMoney");
            return (Criteria) this;
        }

        public Criteria andEcompletionMoneyNotEqualTo(Float value) {
            addCriterion("ecompletion_money <>", value, "ecompletionMoney");
            return (Criteria) this;
        }

        public Criteria andEcompletionMoneyGreaterThan(Float value) {
            addCriterion("ecompletion_money >", value, "ecompletionMoney");
            return (Criteria) this;
        }

        public Criteria andEcompletionMoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("ecompletion_money >=", value, "ecompletionMoney");
            return (Criteria) this;
        }

        public Criteria andEcompletionMoneyLessThan(Float value) {
            addCriterion("ecompletion_money <", value, "ecompletionMoney");
            return (Criteria) this;
        }

        public Criteria andEcompletionMoneyLessThanOrEqualTo(Float value) {
            addCriterion("ecompletion_money <=", value, "ecompletionMoney");
            return (Criteria) this;
        }

        public Criteria andEcompletionMoneyIn(List<Float> values) {
            addCriterion("ecompletion_money in", values, "ecompletionMoney");
            return (Criteria) this;
        }

        public Criteria andEcompletionMoneyNotIn(List<Float> values) {
            addCriterion("ecompletion_money not in", values, "ecompletionMoney");
            return (Criteria) this;
        }

        public Criteria andEcompletionMoneyBetween(Float value1, Float value2) {
            addCriterion("ecompletion_money between", value1, value2, "ecompletionMoney");
            return (Criteria) this;
        }

        public Criteria andEcompletionMoneyNotBetween(Float value1, Float value2) {
            addCriterion("ecompletion_money not between", value1, value2, "ecompletionMoney");
            return (Criteria) this;
        }

        public Criteria andMaintainRemarkIsNull() {
            addCriterion("maintain_remark is null");
            return (Criteria) this;
        }

        public Criteria andMaintainRemarkIsNotNull() {
            addCriterion("maintain_remark is not null");
            return (Criteria) this;
        }

        public Criteria andMaintainRemarkEqualTo(String value) {
            addCriterion("maintain_remark =", value, "maintainRemark");
            return (Criteria) this;
        }

        public Criteria andMaintainRemarkNotEqualTo(String value) {
            addCriterion("maintain_remark <>", value, "maintainRemark");
            return (Criteria) this;
        }

        public Criteria andMaintainRemarkGreaterThan(String value) {
            addCriterion("maintain_remark >", value, "maintainRemark");
            return (Criteria) this;
        }

        public Criteria andMaintainRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("maintain_remark >=", value, "maintainRemark");
            return (Criteria) this;
        }

        public Criteria andMaintainRemarkLessThan(String value) {
            addCriterion("maintain_remark <", value, "maintainRemark");
            return (Criteria) this;
        }

        public Criteria andMaintainRemarkLessThanOrEqualTo(String value) {
            addCriterion("maintain_remark <=", value, "maintainRemark");
            return (Criteria) this;
        }

        public Criteria andMaintainRemarkLike(String value) {
            addCriterion("maintain_remark like", value, "maintainRemark");
            return (Criteria) this;
        }

        public Criteria andMaintainRemarkNotLike(String value) {
            addCriterion("maintain_remark not like", value, "maintainRemark");
            return (Criteria) this;
        }

        public Criteria andMaintainRemarkIn(List<String> values) {
            addCriterion("maintain_remark in", values, "maintainRemark");
            return (Criteria) this;
        }

        public Criteria andMaintainRemarkNotIn(List<String> values) {
            addCriterion("maintain_remark not in", values, "maintainRemark");
            return (Criteria) this;
        }

        public Criteria andMaintainRemarkBetween(String value1, String value2) {
            addCriterion("maintain_remark between", value1, value2, "maintainRemark");
            return (Criteria) this;
        }

        public Criteria andMaintainRemarkNotBetween(String value1, String value2) {
            addCriterion("maintain_remark not between", value1, value2, "maintainRemark");
            return (Criteria) this;
        }

        public Criteria andRescueIsNull() {
            addCriterion("rescue is null");
            return (Criteria) this;
        }

        public Criteria andRescueIsNotNull() {
            addCriterion("rescue is not null");
            return (Criteria) this;
        }

        public Criteria andRescueEqualTo(String value) {
            addCriterion("rescue =", value, "rescue");
            return (Criteria) this;
        }

        public Criteria andRescueNotEqualTo(String value) {
            addCriterion("rescue <>", value, "rescue");
            return (Criteria) this;
        }

        public Criteria andRescueGreaterThan(String value) {
            addCriterion("rescue >", value, "rescue");
            return (Criteria) this;
        }

        public Criteria andRescueGreaterThanOrEqualTo(String value) {
            addCriterion("rescue >=", value, "rescue");
            return (Criteria) this;
        }

        public Criteria andRescueLessThan(String value) {
            addCriterion("rescue <", value, "rescue");
            return (Criteria) this;
        }

        public Criteria andRescueLessThanOrEqualTo(String value) {
            addCriterion("rescue <=", value, "rescue");
            return (Criteria) this;
        }

        public Criteria andRescueLike(String value) {
            addCriterion("rescue like", value, "rescue");
            return (Criteria) this;
        }

        public Criteria andRescueNotLike(String value) {
            addCriterion("rescue not like", value, "rescue");
            return (Criteria) this;
        }

        public Criteria andRescueIn(List<String> values) {
            addCriterion("rescue in", values, "rescue");
            return (Criteria) this;
        }

        public Criteria andRescueNotIn(List<String> values) {
            addCriterion("rescue not in", values, "rescue");
            return (Criteria) this;
        }

        public Criteria andRescueBetween(String value1, String value2) {
            addCriterion("rescue between", value1, value2, "rescue");
            return (Criteria) this;
        }

        public Criteria andRescueNotBetween(String value1, String value2) {
            addCriterion("rescue not between", value1, value2, "rescue");
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