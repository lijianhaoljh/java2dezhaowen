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

        public Criteria andMileFactoryIsNull() {
            addCriterion("mile_factory is null");
            return (Criteria) this;
        }

        public Criteria andMileFactoryIsNotNull() {
            addCriterion("mile_factory is not null");
            return (Criteria) this;
        }

        public Criteria andMileFactoryEqualTo(Float value) {
            addCriterion("mile_factory =", value, "mileFactory");
            return (Criteria) this;
        }

        public Criteria andMileFactoryNotEqualTo(Float value) {
            addCriterion("mile_factory <>", value, "mileFactory");
            return (Criteria) this;
        }

        public Criteria andMileFactoryGreaterThan(Float value) {
            addCriterion("mile_factory >", value, "mileFactory");
            return (Criteria) this;
        }

        public Criteria andMileFactoryGreaterThanOrEqualTo(Float value) {
            addCriterion("mile_factory >=", value, "mileFactory");
            return (Criteria) this;
        }

        public Criteria andMileFactoryLessThan(Float value) {
            addCriterion("mile_factory <", value, "mileFactory");
            return (Criteria) this;
        }

        public Criteria andMileFactoryLessThanOrEqualTo(Float value) {
            addCriterion("mile_factory <=", value, "mileFactory");
            return (Criteria) this;
        }

        public Criteria andMileFactoryIn(List<Float> values) {
            addCriterion("mile_factory in", values, "mileFactory");
            return (Criteria) this;
        }

        public Criteria andMileFactoryNotIn(List<Float> values) {
            addCriterion("mile_factory not in", values, "mileFactory");
            return (Criteria) this;
        }

        public Criteria andMileFactoryBetween(Float value1, Float value2) {
            addCriterion("mile_factory between", value1, value2, "mileFactory");
            return (Criteria) this;
        }

        public Criteria andMileFactoryNotBetween(Float value1, Float value2) {
            addCriterion("mile_factory not between", value1, value2, "mileFactory");
            return (Criteria) this;
        }

        public Criteria andOilFactoryIsNull() {
            addCriterion("oil_factory is null");
            return (Criteria) this;
        }

        public Criteria andOilFactoryIsNotNull() {
            addCriterion("oil_factory is not null");
            return (Criteria) this;
        }

        public Criteria andOilFactoryEqualTo(Float value) {
            addCriterion("oil_factory =", value, "oilFactory");
            return (Criteria) this;
        }

        public Criteria andOilFactoryNotEqualTo(Float value) {
            addCriterion("oil_factory <>", value, "oilFactory");
            return (Criteria) this;
        }

        public Criteria andOilFactoryGreaterThan(Float value) {
            addCriterion("oil_factory >", value, "oilFactory");
            return (Criteria) this;
        }

        public Criteria andOilFactoryGreaterThanOrEqualTo(Float value) {
            addCriterion("oil_factory >=", value, "oilFactory");
            return (Criteria) this;
        }

        public Criteria andOilFactoryLessThan(Float value) {
            addCriterion("oil_factory <", value, "oilFactory");
            return (Criteria) this;
        }

        public Criteria andOilFactoryLessThanOrEqualTo(Float value) {
            addCriterion("oil_factory <=", value, "oilFactory");
            return (Criteria) this;
        }

        public Criteria andOilFactoryIn(List<Float> values) {
            addCriterion("oil_factory in", values, "oilFactory");
            return (Criteria) this;
        }

        public Criteria andOilFactoryNotIn(List<Float> values) {
            addCriterion("oil_factory not in", values, "oilFactory");
            return (Criteria) this;
        }

        public Criteria andOilFactoryBetween(Float value1, Float value2) {
            addCriterion("oil_factory between", value1, value2, "oilFactory");
            return (Criteria) this;
        }

        public Criteria andOilFactoryNotBetween(Float value1, Float value2) {
            addCriterion("oil_factory not between", value1, value2, "oilFactory");
            return (Criteria) this;
        }

        public Criteria andMileIsNull() {
            addCriterion("mile is null");
            return (Criteria) this;
        }

        public Criteria andMileIsNotNull() {
            addCriterion("mile is not null");
            return (Criteria) this;
        }

        public Criteria andMileEqualTo(Float value) {
            addCriterion("mile =", value, "mile");
            return (Criteria) this;
        }

        public Criteria andMileNotEqualTo(Float value) {
            addCriterion("mile <>", value, "mile");
            return (Criteria) this;
        }

        public Criteria andMileGreaterThan(Float value) {
            addCriterion("mile >", value, "mile");
            return (Criteria) this;
        }

        public Criteria andMileGreaterThanOrEqualTo(Float value) {
            addCriterion("mile >=", value, "mile");
            return (Criteria) this;
        }

        public Criteria andMileLessThan(Float value) {
            addCriterion("mile <", value, "mile");
            return (Criteria) this;
        }

        public Criteria andMileLessThanOrEqualTo(Float value) {
            addCriterion("mile <=", value, "mile");
            return (Criteria) this;
        }

        public Criteria andMileIn(List<Float> values) {
            addCriterion("mile in", values, "mile");
            return (Criteria) this;
        }

        public Criteria andMileNotIn(List<Float> values) {
            addCriterion("mile not in", values, "mile");
            return (Criteria) this;
        }

        public Criteria andMileBetween(Float value1, Float value2) {
            addCriterion("mile between", value1, value2, "mile");
            return (Criteria) this;
        }

        public Criteria andMileNotBetween(Float value1, Float value2) {
            addCriterion("mile not between", value1, value2, "mile");
            return (Criteria) this;
        }

        public Criteria andEfactoryTimeIsNull() {
            addCriterion("efactory_time is null");
            return (Criteria) this;
        }

        public Criteria andEfactoryTimeIsNotNull() {
            addCriterion("efactory_time is not null");
            return (Criteria) this;
        }

        public Criteria andEfactoryTimeEqualTo(Date value) {
            addCriterion("efactory_time =", value, "efactoryTime");
            return (Criteria) this;
        }

        public Criteria andEfactoryTimeNotEqualTo(Date value) {
            addCriterion("efactory_time <>", value, "efactoryTime");
            return (Criteria) this;
        }

        public Criteria andEfactoryTimeGreaterThan(Date value) {
            addCriterion("efactory_time >", value, "efactoryTime");
            return (Criteria) this;
        }

        public Criteria andEfactoryTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("efactory_time >=", value, "efactoryTime");
            return (Criteria) this;
        }

        public Criteria andEfactoryTimeLessThan(Date value) {
            addCriterion("efactory_time <", value, "efactoryTime");
            return (Criteria) this;
        }

        public Criteria andEfactoryTimeLessThanOrEqualTo(Date value) {
            addCriterion("efactory_time <=", value, "efactoryTime");
            return (Criteria) this;
        }

        public Criteria andEfactoryTimeIn(List<Date> values) {
            addCriterion("efactory_time in", values, "efactoryTime");
            return (Criteria) this;
        }

        public Criteria andEfactoryTimeNotIn(List<Date> values) {
            addCriterion("efactory_time not in", values, "efactoryTime");
            return (Criteria) this;
        }

        public Criteria andEfactoryTimeBetween(Date value1, Date value2) {
            addCriterion("efactory_time between", value1, value2, "efactoryTime");
            return (Criteria) this;
        }

        public Criteria andEfactoryTimeNotBetween(Date value1, Date value2) {
            addCriterion("efactory_time not between", value1, value2, "efactoryTime");
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

        public Criteria andFactoryIsNull() {
            addCriterion("factory is null");
            return (Criteria) this;
        }

        public Criteria andFactoryIsNotNull() {
            addCriterion("factory is not null");
            return (Criteria) this;
        }

        public Criteria andFactoryEqualTo(Date value) {
            addCriterion("factory =", value, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryNotEqualTo(Date value) {
            addCriterion("factory <>", value, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryGreaterThan(Date value) {
            addCriterion("factory >", value, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryGreaterThanOrEqualTo(Date value) {
            addCriterion("factory >=", value, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryLessThan(Date value) {
            addCriterion("factory <", value, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryLessThanOrEqualTo(Date value) {
            addCriterion("factory <=", value, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryIn(List<Date> values) {
            addCriterion("factory in", values, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryNotIn(List<Date> values) {
            addCriterion("factory not in", values, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryBetween(Date value1, Date value2) {
            addCriterion("factory between", value1, value2, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryNotBetween(Date value1, Date value2) {
            addCriterion("factory not between", value1, value2, "factory");
            return (Criteria) this;
        }

        public Criteria andReportIsNull() {
            addCriterion("report is null");
            return (Criteria) this;
        }

        public Criteria andReportIsNotNull() {
            addCriterion("report is not null");
            return (Criteria) this;
        }

        public Criteria andReportEqualTo(String value) {
            addCriterion("report =", value, "report");
            return (Criteria) this;
        }

        public Criteria andReportNotEqualTo(String value) {
            addCriterion("report <>", value, "report");
            return (Criteria) this;
        }

        public Criteria andReportGreaterThan(String value) {
            addCriterion("report >", value, "report");
            return (Criteria) this;
        }

        public Criteria andReportGreaterThanOrEqualTo(String value) {
            addCriterion("report >=", value, "report");
            return (Criteria) this;
        }

        public Criteria andReportLessThan(String value) {
            addCriterion("report <", value, "report");
            return (Criteria) this;
        }

        public Criteria andReportLessThanOrEqualTo(String value) {
            addCriterion("report <=", value, "report");
            return (Criteria) this;
        }

        public Criteria andReportLike(String value) {
            addCriterion("report like", value, "report");
            return (Criteria) this;
        }

        public Criteria andReportNotLike(String value) {
            addCriterion("report not like", value, "report");
            return (Criteria) this;
        }

        public Criteria andReportIn(List<String> values) {
            addCriterion("report in", values, "report");
            return (Criteria) this;
        }

        public Criteria andReportNotIn(List<String> values) {
            addCriterion("report not in", values, "report");
            return (Criteria) this;
        }

        public Criteria andReportBetween(String value1, String value2) {
            addCriterion("report between", value1, value2, "report");
            return (Criteria) this;
        }

        public Criteria andReportNotBetween(String value1, String value2) {
            addCriterion("report not between", value1, value2, "report");
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