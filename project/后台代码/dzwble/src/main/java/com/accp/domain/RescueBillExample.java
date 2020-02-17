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

        public Criteria andCurrentmileageIsNull() {
            addCriterion("currentmileage is null");
            return (Criteria) this;
        }

        public Criteria andCurrentmileageIsNotNull() {
            addCriterion("currentmileage is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentmileageEqualTo(Float value) {
            addCriterion("currentmileage =", value, "currentmileage");
            return (Criteria) this;
        }

        public Criteria andCurrentmileageNotEqualTo(Float value) {
            addCriterion("currentmileage <>", value, "currentmileage");
            return (Criteria) this;
        }

        public Criteria andCurrentmileageGreaterThan(Float value) {
            addCriterion("currentmileage >", value, "currentmileage");
            return (Criteria) this;
        }

        public Criteria andCurrentmileageGreaterThanOrEqualTo(Float value) {
            addCriterion("currentmileage >=", value, "currentmileage");
            return (Criteria) this;
        }

        public Criteria andCurrentmileageLessThan(Float value) {
            addCriterion("currentmileage <", value, "currentmileage");
            return (Criteria) this;
        }

        public Criteria andCurrentmileageLessThanOrEqualTo(Float value) {
            addCriterion("currentmileage <=", value, "currentmileage");
            return (Criteria) this;
        }

        public Criteria andCurrentmileageIn(List<Float> values) {
            addCriterion("currentmileage in", values, "currentmileage");
            return (Criteria) this;
        }

        public Criteria andCurrentmileageNotIn(List<Float> values) {
            addCriterion("currentmileage not in", values, "currentmileage");
            return (Criteria) this;
        }

        public Criteria andCurrentmileageBetween(Float value1, Float value2) {
            addCriterion("currentmileage between", value1, value2, "currentmileage");
            return (Criteria) this;
        }

        public Criteria andCurrentmileageNotBetween(Float value1, Float value2) {
            addCriterion("currentmileage not between", value1, value2, "currentmileage");
            return (Criteria) this;
        }

        public Criteria andDispatchingtimeIsNull() {
            addCriterion("Dispatchingtime is null");
            return (Criteria) this;
        }

        public Criteria andDispatchingtimeIsNotNull() {
            addCriterion("Dispatchingtime is not null");
            return (Criteria) this;
        }

        public Criteria andDispatchingtimeEqualTo(Date value) {
            addCriterion("Dispatchingtime =", value, "dispatchingtime");
            return (Criteria) this;
        }

        public Criteria andDispatchingtimeNotEqualTo(Date value) {
            addCriterion("Dispatchingtime <>", value, "dispatchingtime");
            return (Criteria) this;
        }

        public Criteria andDispatchingtimeGreaterThan(Date value) {
            addCriterion("Dispatchingtime >", value, "dispatchingtime");
            return (Criteria) this;
        }

        public Criteria andDispatchingtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("Dispatchingtime >=", value, "dispatchingtime");
            return (Criteria) this;
        }

        public Criteria andDispatchingtimeLessThan(Date value) {
            addCriterion("Dispatchingtime <", value, "dispatchingtime");
            return (Criteria) this;
        }

        public Criteria andDispatchingtimeLessThanOrEqualTo(Date value) {
            addCriterion("Dispatchingtime <=", value, "dispatchingtime");
            return (Criteria) this;
        }

        public Criteria andDispatchingtimeIn(List<Date> values) {
            addCriterion("Dispatchingtime in", values, "dispatchingtime");
            return (Criteria) this;
        }

        public Criteria andDispatchingtimeNotIn(List<Date> values) {
            addCriterion("Dispatchingtime not in", values, "dispatchingtime");
            return (Criteria) this;
        }

        public Criteria andDispatchingtimeBetween(Date value1, Date value2) {
            addCriterion("Dispatchingtime between", value1, value2, "dispatchingtime");
            return (Criteria) this;
        }

        public Criteria andDispatchingtimeNotBetween(Date value1, Date value2) {
            addCriterion("Dispatchingtime not between", value1, value2, "dispatchingtime");
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

        public Criteria andGotimeIsNull() {
            addCriterion("gotime is null");
            return (Criteria) this;
        }

        public Criteria andGotimeIsNotNull() {
            addCriterion("gotime is not null");
            return (Criteria) this;
        }

        public Criteria andGotimeEqualTo(Date value) {
            addCriterion("gotime =", value, "gotime");
            return (Criteria) this;
        }

        public Criteria andGotimeNotEqualTo(Date value) {
            addCriterion("gotime <>", value, "gotime");
            return (Criteria) this;
        }

        public Criteria andGotimeGreaterThan(Date value) {
            addCriterion("gotime >", value, "gotime");
            return (Criteria) this;
        }

        public Criteria andGotimeGreaterThanOrEqualTo(Date value) {
            addCriterion("gotime >=", value, "gotime");
            return (Criteria) this;
        }

        public Criteria andGotimeLessThan(Date value) {
            addCriterion("gotime <", value, "gotime");
            return (Criteria) this;
        }

        public Criteria andGotimeLessThanOrEqualTo(Date value) {
            addCriterion("gotime <=", value, "gotime");
            return (Criteria) this;
        }

        public Criteria andGotimeIn(List<Date> values) {
            addCriterion("gotime in", values, "gotime");
            return (Criteria) this;
        }

        public Criteria andGotimeNotIn(List<Date> values) {
            addCriterion("gotime not in", values, "gotime");
            return (Criteria) this;
        }

        public Criteria andGotimeBetween(Date value1, Date value2) {
            addCriterion("gotime between", value1, value2, "gotime");
            return (Criteria) this;
        }

        public Criteria andGotimeNotBetween(Date value1, Date value2) {
            addCriterion("gotime not between", value1, value2, "gotime");
            return (Criteria) this;
        }

        public Criteria andGoaddressIsNull() {
            addCriterion("goaddress is null");
            return (Criteria) this;
        }

        public Criteria andGoaddressIsNotNull() {
            addCriterion("goaddress is not null");
            return (Criteria) this;
        }

        public Criteria andGoaddressEqualTo(String value) {
            addCriterion("goaddress =", value, "goaddress");
            return (Criteria) this;
        }

        public Criteria andGoaddressNotEqualTo(String value) {
            addCriterion("goaddress <>", value, "goaddress");
            return (Criteria) this;
        }

        public Criteria andGoaddressGreaterThan(String value) {
            addCriterion("goaddress >", value, "goaddress");
            return (Criteria) this;
        }

        public Criteria andGoaddressGreaterThanOrEqualTo(String value) {
            addCriterion("goaddress >=", value, "goaddress");
            return (Criteria) this;
        }

        public Criteria andGoaddressLessThan(String value) {
            addCriterion("goaddress <", value, "goaddress");
            return (Criteria) this;
        }

        public Criteria andGoaddressLessThanOrEqualTo(String value) {
            addCriterion("goaddress <=", value, "goaddress");
            return (Criteria) this;
        }

        public Criteria andGoaddressLike(String value) {
            addCriterion("goaddress like", value, "goaddress");
            return (Criteria) this;
        }

        public Criteria andGoaddressNotLike(String value) {
            addCriterion("goaddress not like", value, "goaddress");
            return (Criteria) this;
        }

        public Criteria andGoaddressIn(List<String> values) {
            addCriterion("goaddress in", values, "goaddress");
            return (Criteria) this;
        }

        public Criteria andGoaddressNotIn(List<String> values) {
            addCriterion("goaddress not in", values, "goaddress");
            return (Criteria) this;
        }

        public Criteria andGoaddressBetween(String value1, String value2) {
            addCriterion("goaddress between", value1, value2, "goaddress");
            return (Criteria) this;
        }

        public Criteria andGoaddressNotBetween(String value1, String value2) {
            addCriterion("goaddress not between", value1, value2, "goaddress");
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

        public Criteria andDrivingIsNull() {
            addCriterion("driving is null");
            return (Criteria) this;
        }

        public Criteria andDrivingIsNotNull() {
            addCriterion("driving is not null");
            return (Criteria) this;
        }

        public Criteria andDrivingEqualTo(Float value) {
            addCriterion("driving =", value, "driving");
            return (Criteria) this;
        }

        public Criteria andDrivingNotEqualTo(Float value) {
            addCriterion("driving <>", value, "driving");
            return (Criteria) this;
        }

        public Criteria andDrivingGreaterThan(Float value) {
            addCriterion("driving >", value, "driving");
            return (Criteria) this;
        }

        public Criteria andDrivingGreaterThanOrEqualTo(Float value) {
            addCriterion("driving >=", value, "driving");
            return (Criteria) this;
        }

        public Criteria andDrivingLessThan(Float value) {
            addCriterion("driving <", value, "driving");
            return (Criteria) this;
        }

        public Criteria andDrivingLessThanOrEqualTo(Float value) {
            addCriterion("driving <=", value, "driving");
            return (Criteria) this;
        }

        public Criteria andDrivingIn(List<Float> values) {
            addCriterion("driving in", values, "driving");
            return (Criteria) this;
        }

        public Criteria andDrivingNotIn(List<Float> values) {
            addCriterion("driving not in", values, "driving");
            return (Criteria) this;
        }

        public Criteria andDrivingBetween(Float value1, Float value2) {
            addCriterion("driving between", value1, value2, "driving");
            return (Criteria) this;
        }

        public Criteria andDrivingNotBetween(Float value1, Float value2) {
            addCriterion("driving not between", value1, value2, "driving");
            return (Criteria) this;
        }

        public Criteria andConstructiontimeIsNull() {
            addCriterion("constructiontime is null");
            return (Criteria) this;
        }

        public Criteria andConstructiontimeIsNotNull() {
            addCriterion("constructiontime is not null");
            return (Criteria) this;
        }

        public Criteria andConstructiontimeEqualTo(Date value) {
            addCriterion("constructiontime =", value, "constructiontime");
            return (Criteria) this;
        }

        public Criteria andConstructiontimeNotEqualTo(Date value) {
            addCriterion("constructiontime <>", value, "constructiontime");
            return (Criteria) this;
        }

        public Criteria andConstructiontimeGreaterThan(Date value) {
            addCriterion("constructiontime >", value, "constructiontime");
            return (Criteria) this;
        }

        public Criteria andConstructiontimeGreaterThanOrEqualTo(Date value) {
            addCriterion("constructiontime >=", value, "constructiontime");
            return (Criteria) this;
        }

        public Criteria andConstructiontimeLessThan(Date value) {
            addCriterion("constructiontime <", value, "constructiontime");
            return (Criteria) this;
        }

        public Criteria andConstructiontimeLessThanOrEqualTo(Date value) {
            addCriterion("constructiontime <=", value, "constructiontime");
            return (Criteria) this;
        }

        public Criteria andConstructiontimeIn(List<Date> values) {
            addCriterion("constructiontime in", values, "constructiontime");
            return (Criteria) this;
        }

        public Criteria andConstructiontimeNotIn(List<Date> values) {
            addCriterion("constructiontime not in", values, "constructiontime");
            return (Criteria) this;
        }

        public Criteria andConstructiontimeBetween(Date value1, Date value2) {
            addCriterion("constructiontime between", value1, value2, "constructiontime");
            return (Criteria) this;
        }

        public Criteria andConstructiontimeNotBetween(Date value1, Date value2) {
            addCriterion("constructiontime not between", value1, value2, "constructiontime");
            return (Criteria) this;
        }

        public Criteria andRescueaddressIsNull() {
            addCriterion("Rescueaddress is null");
            return (Criteria) this;
        }

        public Criteria andRescueaddressIsNotNull() {
            addCriterion("Rescueaddress is not null");
            return (Criteria) this;
        }

        public Criteria andRescueaddressEqualTo(String value) {
            addCriterion("Rescueaddress =", value, "rescueaddress");
            return (Criteria) this;
        }

        public Criteria andRescueaddressNotEqualTo(String value) {
            addCriterion("Rescueaddress <>", value, "rescueaddress");
            return (Criteria) this;
        }

        public Criteria andRescueaddressGreaterThan(String value) {
            addCriterion("Rescueaddress >", value, "rescueaddress");
            return (Criteria) this;
        }

        public Criteria andRescueaddressGreaterThanOrEqualTo(String value) {
            addCriterion("Rescueaddress >=", value, "rescueaddress");
            return (Criteria) this;
        }

        public Criteria andRescueaddressLessThan(String value) {
            addCriterion("Rescueaddress <", value, "rescueaddress");
            return (Criteria) this;
        }

        public Criteria andRescueaddressLessThanOrEqualTo(String value) {
            addCriterion("Rescueaddress <=", value, "rescueaddress");
            return (Criteria) this;
        }

        public Criteria andRescueaddressLike(String value) {
            addCriterion("Rescueaddress like", value, "rescueaddress");
            return (Criteria) this;
        }

        public Criteria andRescueaddressNotLike(String value) {
            addCriterion("Rescueaddress not like", value, "rescueaddress");
            return (Criteria) this;
        }

        public Criteria andRescueaddressIn(List<String> values) {
            addCriterion("Rescueaddress in", values, "rescueaddress");
            return (Criteria) this;
        }

        public Criteria andRescueaddressNotIn(List<String> values) {
            addCriterion("Rescueaddress not in", values, "rescueaddress");
            return (Criteria) this;
        }

        public Criteria andRescueaddressBetween(String value1, String value2) {
            addCriterion("Rescueaddress between", value1, value2, "rescueaddress");
            return (Criteria) this;
        }

        public Criteria andRescueaddressNotBetween(String value1, String value2) {
            addCriterion("Rescueaddress not between", value1, value2, "rescueaddress");
            return (Criteria) this;
        }

        public Criteria andMaintenancenoteIsNull() {
            addCriterion("Maintenancenote is null");
            return (Criteria) this;
        }

        public Criteria andMaintenancenoteIsNotNull() {
            addCriterion("Maintenancenote is not null");
            return (Criteria) this;
        }

        public Criteria andMaintenancenoteEqualTo(String value) {
            addCriterion("Maintenancenote =", value, "maintenancenote");
            return (Criteria) this;
        }

        public Criteria andMaintenancenoteNotEqualTo(String value) {
            addCriterion("Maintenancenote <>", value, "maintenancenote");
            return (Criteria) this;
        }

        public Criteria andMaintenancenoteGreaterThan(String value) {
            addCriterion("Maintenancenote >", value, "maintenancenote");
            return (Criteria) this;
        }

        public Criteria andMaintenancenoteGreaterThanOrEqualTo(String value) {
            addCriterion("Maintenancenote >=", value, "maintenancenote");
            return (Criteria) this;
        }

        public Criteria andMaintenancenoteLessThan(String value) {
            addCriterion("Maintenancenote <", value, "maintenancenote");
            return (Criteria) this;
        }

        public Criteria andMaintenancenoteLessThanOrEqualTo(String value) {
            addCriterion("Maintenancenote <=", value, "maintenancenote");
            return (Criteria) this;
        }

        public Criteria andMaintenancenoteLike(String value) {
            addCriterion("Maintenancenote like", value, "maintenancenote");
            return (Criteria) this;
        }

        public Criteria andMaintenancenoteNotLike(String value) {
            addCriterion("Maintenancenote not like", value, "maintenancenote");
            return (Criteria) this;
        }

        public Criteria andMaintenancenoteIn(List<String> values) {
            addCriterion("Maintenancenote in", values, "maintenancenote");
            return (Criteria) this;
        }

        public Criteria andMaintenancenoteNotIn(List<String> values) {
            addCriterion("Maintenancenote not in", values, "maintenancenote");
            return (Criteria) this;
        }

        public Criteria andMaintenancenoteBetween(String value1, String value2) {
            addCriterion("Maintenancenote between", value1, value2, "maintenancenote");
            return (Criteria) this;
        }

        public Criteria andMaintenancenoteNotBetween(String value1, String value2) {
            addCriterion("Maintenancenote not between", value1, value2, "maintenancenote");
            return (Criteria) this;
        }

        public Criteria andRescuestatementIsNull() {
            addCriterion("rescuestatement is null");
            return (Criteria) this;
        }

        public Criteria andRescuestatementIsNotNull() {
            addCriterion("rescuestatement is not null");
            return (Criteria) this;
        }

        public Criteria andRescuestatementEqualTo(String value) {
            addCriterion("rescuestatement =", value, "rescuestatement");
            return (Criteria) this;
        }

        public Criteria andRescuestatementNotEqualTo(String value) {
            addCriterion("rescuestatement <>", value, "rescuestatement");
            return (Criteria) this;
        }

        public Criteria andRescuestatementGreaterThan(String value) {
            addCriterion("rescuestatement >", value, "rescuestatement");
            return (Criteria) this;
        }

        public Criteria andRescuestatementGreaterThanOrEqualTo(String value) {
            addCriterion("rescuestatement >=", value, "rescuestatement");
            return (Criteria) this;
        }

        public Criteria andRescuestatementLessThan(String value) {
            addCriterion("rescuestatement <", value, "rescuestatement");
            return (Criteria) this;
        }

        public Criteria andRescuestatementLessThanOrEqualTo(String value) {
            addCriterion("rescuestatement <=", value, "rescuestatement");
            return (Criteria) this;
        }

        public Criteria andRescuestatementLike(String value) {
            addCriterion("rescuestatement like", value, "rescuestatement");
            return (Criteria) this;
        }

        public Criteria andRescuestatementNotLike(String value) {
            addCriterion("rescuestatement not like", value, "rescuestatement");
            return (Criteria) this;
        }

        public Criteria andRescuestatementIn(List<String> values) {
            addCriterion("rescuestatement in", values, "rescuestatement");
            return (Criteria) this;
        }

        public Criteria andRescuestatementNotIn(List<String> values) {
            addCriterion("rescuestatement not in", values, "rescuestatement");
            return (Criteria) this;
        }

        public Criteria andRescuestatementBetween(String value1, String value2) {
            addCriterion("rescuestatement between", value1, value2, "rescuestatement");
            return (Criteria) this;
        }

        public Criteria andRescuestatementNotBetween(String value1, String value2) {
            addCriterion("rescuestatement not between", value1, value2, "rescuestatement");
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