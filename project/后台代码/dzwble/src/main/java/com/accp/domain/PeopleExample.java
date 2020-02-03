package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class PeopleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PeopleExample() {
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

        public Criteria andPnameIsNull() {
            addCriterion("pname is null");
            return (Criteria) this;
        }

        public Criteria andPnameIsNotNull() {
            addCriterion("pname is not null");
            return (Criteria) this;
        }

        public Criteria andPnameEqualTo(String value) {
            addCriterion("pname =", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotEqualTo(String value) {
            addCriterion("pname <>", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameGreaterThan(String value) {
            addCriterion("pname >", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameGreaterThanOrEqualTo(String value) {
            addCriterion("pname >=", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameLessThan(String value) {
            addCriterion("pname <", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameLessThanOrEqualTo(String value) {
            addCriterion("pname <=", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameLike(String value) {
            addCriterion("pname like", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotLike(String value) {
            addCriterion("pname not like", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameIn(List<String> values) {
            addCriterion("pname in", values, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotIn(List<String> values) {
            addCriterion("pname not in", values, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameBetween(String value1, String value2) {
            addCriterion("pname between", value1, value2, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotBetween(String value1, String value2) {
            addCriterion("pname not between", value1, value2, "pname");
            return (Criteria) this;
        }

        public Criteria andPsexIsNull() {
            addCriterion("psex is null");
            return (Criteria) this;
        }

        public Criteria andPsexIsNotNull() {
            addCriterion("psex is not null");
            return (Criteria) this;
        }

        public Criteria andPsexEqualTo(String value) {
            addCriterion("psex =", value, "psex");
            return (Criteria) this;
        }

        public Criteria andPsexNotEqualTo(String value) {
            addCriterion("psex <>", value, "psex");
            return (Criteria) this;
        }

        public Criteria andPsexGreaterThan(String value) {
            addCriterion("psex >", value, "psex");
            return (Criteria) this;
        }

        public Criteria andPsexGreaterThanOrEqualTo(String value) {
            addCriterion("psex >=", value, "psex");
            return (Criteria) this;
        }

        public Criteria andPsexLessThan(String value) {
            addCriterion("psex <", value, "psex");
            return (Criteria) this;
        }

        public Criteria andPsexLessThanOrEqualTo(String value) {
            addCriterion("psex <=", value, "psex");
            return (Criteria) this;
        }

        public Criteria andPsexLike(String value) {
            addCriterion("psex like", value, "psex");
            return (Criteria) this;
        }

        public Criteria andPsexNotLike(String value) {
            addCriterion("psex not like", value, "psex");
            return (Criteria) this;
        }

        public Criteria andPsexIn(List<String> values) {
            addCriterion("psex in", values, "psex");
            return (Criteria) this;
        }

        public Criteria andPsexNotIn(List<String> values) {
            addCriterion("psex not in", values, "psex");
            return (Criteria) this;
        }

        public Criteria andPsexBetween(String value1, String value2) {
            addCriterion("psex between", value1, value2, "psex");
            return (Criteria) this;
        }

        public Criteria andPsexNotBetween(String value1, String value2) {
            addCriterion("psex not between", value1, value2, "psex");
            return (Criteria) this;
        }

        public Criteria andPidcardIsNull() {
            addCriterion("pidcard is null");
            return (Criteria) this;
        }

        public Criteria andPidcardIsNotNull() {
            addCriterion("pidcard is not null");
            return (Criteria) this;
        }

        public Criteria andPidcardEqualTo(String value) {
            addCriterion("pidcard =", value, "pidcard");
            return (Criteria) this;
        }

        public Criteria andPidcardNotEqualTo(String value) {
            addCriterion("pidcard <>", value, "pidcard");
            return (Criteria) this;
        }

        public Criteria andPidcardGreaterThan(String value) {
            addCriterion("pidcard >", value, "pidcard");
            return (Criteria) this;
        }

        public Criteria andPidcardGreaterThanOrEqualTo(String value) {
            addCriterion("pidcard >=", value, "pidcard");
            return (Criteria) this;
        }

        public Criteria andPidcardLessThan(String value) {
            addCriterion("pidcard <", value, "pidcard");
            return (Criteria) this;
        }

        public Criteria andPidcardLessThanOrEqualTo(String value) {
            addCriterion("pidcard <=", value, "pidcard");
            return (Criteria) this;
        }

        public Criteria andPidcardLike(String value) {
            addCriterion("pidcard like", value, "pidcard");
            return (Criteria) this;
        }

        public Criteria andPidcardNotLike(String value) {
            addCriterion("pidcard not like", value, "pidcard");
            return (Criteria) this;
        }

        public Criteria andPidcardIn(List<String> values) {
            addCriterion("pidcard in", values, "pidcard");
            return (Criteria) this;
        }

        public Criteria andPidcardNotIn(List<String> values) {
            addCriterion("pidcard not in", values, "pidcard");
            return (Criteria) this;
        }

        public Criteria andPidcardBetween(String value1, String value2) {
            addCriterion("pidcard between", value1, value2, "pidcard");
            return (Criteria) this;
        }

        public Criteria andPidcardNotBetween(String value1, String value2) {
            addCriterion("pidcard not between", value1, value2, "pidcard");
            return (Criteria) this;
        }

        public Criteria andPaddressIsNull() {
            addCriterion("paddress is null");
            return (Criteria) this;
        }

        public Criteria andPaddressIsNotNull() {
            addCriterion("paddress is not null");
            return (Criteria) this;
        }

        public Criteria andPaddressEqualTo(String value) {
            addCriterion("paddress =", value, "paddress");
            return (Criteria) this;
        }

        public Criteria andPaddressNotEqualTo(String value) {
            addCriterion("paddress <>", value, "paddress");
            return (Criteria) this;
        }

        public Criteria andPaddressGreaterThan(String value) {
            addCriterion("paddress >", value, "paddress");
            return (Criteria) this;
        }

        public Criteria andPaddressGreaterThanOrEqualTo(String value) {
            addCriterion("paddress >=", value, "paddress");
            return (Criteria) this;
        }

        public Criteria andPaddressLessThan(String value) {
            addCriterion("paddress <", value, "paddress");
            return (Criteria) this;
        }

        public Criteria andPaddressLessThanOrEqualTo(String value) {
            addCriterion("paddress <=", value, "paddress");
            return (Criteria) this;
        }

        public Criteria andPaddressLike(String value) {
            addCriterion("paddress like", value, "paddress");
            return (Criteria) this;
        }

        public Criteria andPaddressNotLike(String value) {
            addCriterion("paddress not like", value, "paddress");
            return (Criteria) this;
        }

        public Criteria andPaddressIn(List<String> values) {
            addCriterion("paddress in", values, "paddress");
            return (Criteria) this;
        }

        public Criteria andPaddressNotIn(List<String> values) {
            addCriterion("paddress not in", values, "paddress");
            return (Criteria) this;
        }

        public Criteria andPaddressBetween(String value1, String value2) {
            addCriterion("paddress between", value1, value2, "paddress");
            return (Criteria) this;
        }

        public Criteria andPaddressNotBetween(String value1, String value2) {
            addCriterion("paddress not between", value1, value2, "paddress");
            return (Criteria) this;
        }

        public Criteria andPphoneIsNull() {
            addCriterion("pphone is null");
            return (Criteria) this;
        }

        public Criteria andPphoneIsNotNull() {
            addCriterion("pphone is not null");
            return (Criteria) this;
        }

        public Criteria andPphoneEqualTo(String value) {
            addCriterion("pphone =", value, "pphone");
            return (Criteria) this;
        }

        public Criteria andPphoneNotEqualTo(String value) {
            addCriterion("pphone <>", value, "pphone");
            return (Criteria) this;
        }

        public Criteria andPphoneGreaterThan(String value) {
            addCriterion("pphone >", value, "pphone");
            return (Criteria) this;
        }

        public Criteria andPphoneGreaterThanOrEqualTo(String value) {
            addCriterion("pphone >=", value, "pphone");
            return (Criteria) this;
        }

        public Criteria andPphoneLessThan(String value) {
            addCriterion("pphone <", value, "pphone");
            return (Criteria) this;
        }

        public Criteria andPphoneLessThanOrEqualTo(String value) {
            addCriterion("pphone <=", value, "pphone");
            return (Criteria) this;
        }

        public Criteria andPphoneLike(String value) {
            addCriterion("pphone like", value, "pphone");
            return (Criteria) this;
        }

        public Criteria andPphoneNotLike(String value) {
            addCriterion("pphone not like", value, "pphone");
            return (Criteria) this;
        }

        public Criteria andPphoneIn(List<String> values) {
            addCriterion("pphone in", values, "pphone");
            return (Criteria) this;
        }

        public Criteria andPphoneNotIn(List<String> values) {
            addCriterion("pphone not in", values, "pphone");
            return (Criteria) this;
        }

        public Criteria andPphoneBetween(String value1, String value2) {
            addCriterion("pphone between", value1, value2, "pphone");
            return (Criteria) this;
        }

        public Criteria andPphoneNotBetween(String value1, String value2) {
            addCriterion("pphone not between", value1, value2, "pphone");
            return (Criteria) this;
        }

        public Criteria andPtellphoneIsNull() {
            addCriterion("ptellphone is null");
            return (Criteria) this;
        }

        public Criteria andPtellphoneIsNotNull() {
            addCriterion("ptellphone is not null");
            return (Criteria) this;
        }

        public Criteria andPtellphoneEqualTo(String value) {
            addCriterion("ptellphone =", value, "ptellphone");
            return (Criteria) this;
        }

        public Criteria andPtellphoneNotEqualTo(String value) {
            addCriterion("ptellphone <>", value, "ptellphone");
            return (Criteria) this;
        }

        public Criteria andPtellphoneGreaterThan(String value) {
            addCriterion("ptellphone >", value, "ptellphone");
            return (Criteria) this;
        }

        public Criteria andPtellphoneGreaterThanOrEqualTo(String value) {
            addCriterion("ptellphone >=", value, "ptellphone");
            return (Criteria) this;
        }

        public Criteria andPtellphoneLessThan(String value) {
            addCriterion("ptellphone <", value, "ptellphone");
            return (Criteria) this;
        }

        public Criteria andPtellphoneLessThanOrEqualTo(String value) {
            addCriterion("ptellphone <=", value, "ptellphone");
            return (Criteria) this;
        }

        public Criteria andPtellphoneLike(String value) {
            addCriterion("ptellphone like", value, "ptellphone");
            return (Criteria) this;
        }

        public Criteria andPtellphoneNotLike(String value) {
            addCriterion("ptellphone not like", value, "ptellphone");
            return (Criteria) this;
        }

        public Criteria andPtellphoneIn(List<String> values) {
            addCriterion("ptellphone in", values, "ptellphone");
            return (Criteria) this;
        }

        public Criteria andPtellphoneNotIn(List<String> values) {
            addCriterion("ptellphone not in", values, "ptellphone");
            return (Criteria) this;
        }

        public Criteria andPtellphoneBetween(String value1, String value2) {
            addCriterion("ptellphone between", value1, value2, "ptellphone");
            return (Criteria) this;
        }

        public Criteria andPtellphoneNotBetween(String value1, String value2) {
            addCriterion("ptellphone not between", value1, value2, "ptellphone");
            return (Criteria) this;
        }

        public Criteria andPemailIsNull() {
            addCriterion("pemail is null");
            return (Criteria) this;
        }

        public Criteria andPemailIsNotNull() {
            addCriterion("pemail is not null");
            return (Criteria) this;
        }

        public Criteria andPemailEqualTo(String value) {
            addCriterion("pemail =", value, "pemail");
            return (Criteria) this;
        }

        public Criteria andPemailNotEqualTo(String value) {
            addCriterion("pemail <>", value, "pemail");
            return (Criteria) this;
        }

        public Criteria andPemailGreaterThan(String value) {
            addCriterion("pemail >", value, "pemail");
            return (Criteria) this;
        }

        public Criteria andPemailGreaterThanOrEqualTo(String value) {
            addCriterion("pemail >=", value, "pemail");
            return (Criteria) this;
        }

        public Criteria andPemailLessThan(String value) {
            addCriterion("pemail <", value, "pemail");
            return (Criteria) this;
        }

        public Criteria andPemailLessThanOrEqualTo(String value) {
            addCriterion("pemail <=", value, "pemail");
            return (Criteria) this;
        }

        public Criteria andPemailLike(String value) {
            addCriterion("pemail like", value, "pemail");
            return (Criteria) this;
        }

        public Criteria andPemailNotLike(String value) {
            addCriterion("pemail not like", value, "pemail");
            return (Criteria) this;
        }

        public Criteria andPemailIn(List<String> values) {
            addCriterion("pemail in", values, "pemail");
            return (Criteria) this;
        }

        public Criteria andPemailNotIn(List<String> values) {
            addCriterion("pemail not in", values, "pemail");
            return (Criteria) this;
        }

        public Criteria andPemailBetween(String value1, String value2) {
            addCriterion("pemail between", value1, value2, "pemail");
            return (Criteria) this;
        }

        public Criteria andPemailNotBetween(String value1, String value2) {
            addCriterion("pemail not between", value1, value2, "pemail");
            return (Criteria) this;
        }

        public Criteria andSpasswordIsNull() {
            addCriterion("spassword is null");
            return (Criteria) this;
        }

        public Criteria andSpasswordIsNotNull() {
            addCriterion("spassword is not null");
            return (Criteria) this;
        }

        public Criteria andSpasswordEqualTo(String value) {
            addCriterion("spassword =", value, "spassword");
            return (Criteria) this;
        }

        public Criteria andSpasswordNotEqualTo(String value) {
            addCriterion("spassword <>", value, "spassword");
            return (Criteria) this;
        }

        public Criteria andSpasswordGreaterThan(String value) {
            addCriterion("spassword >", value, "spassword");
            return (Criteria) this;
        }

        public Criteria andSpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("spassword >=", value, "spassword");
            return (Criteria) this;
        }

        public Criteria andSpasswordLessThan(String value) {
            addCriterion("spassword <", value, "spassword");
            return (Criteria) this;
        }

        public Criteria andSpasswordLessThanOrEqualTo(String value) {
            addCriterion("spassword <=", value, "spassword");
            return (Criteria) this;
        }

        public Criteria andSpasswordLike(String value) {
            addCriterion("spassword like", value, "spassword");
            return (Criteria) this;
        }

        public Criteria andSpasswordNotLike(String value) {
            addCriterion("spassword not like", value, "spassword");
            return (Criteria) this;
        }

        public Criteria andSpasswordIn(List<String> values) {
            addCriterion("spassword in", values, "spassword");
            return (Criteria) this;
        }

        public Criteria andSpasswordNotIn(List<String> values) {
            addCriterion("spassword not in", values, "spassword");
            return (Criteria) this;
        }

        public Criteria andSpasswordBetween(String value1, String value2) {
            addCriterion("spassword between", value1, value2, "spassword");
            return (Criteria) this;
        }

        public Criteria andSpasswordNotBetween(String value1, String value2) {
            addCriterion("spassword not between", value1, value2, "spassword");
            return (Criteria) this;
        }

        public Criteria andSaltIsNull() {
            addCriterion("salt is null");
            return (Criteria) this;
        }

        public Criteria andSaltIsNotNull() {
            addCriterion("salt is not null");
            return (Criteria) this;
        }

        public Criteria andSaltEqualTo(String value) {
            addCriterion("salt =", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotEqualTo(String value) {
            addCriterion("salt <>", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltGreaterThan(String value) {
            addCriterion("salt >", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltGreaterThanOrEqualTo(String value) {
            addCriterion("salt >=", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltLessThan(String value) {
            addCriterion("salt <", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltLessThanOrEqualTo(String value) {
            addCriterion("salt <=", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltLike(String value) {
            addCriterion("salt like", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotLike(String value) {
            addCriterion("salt not like", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltIn(List<String> values) {
            addCriterion("salt in", values, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotIn(List<String> values) {
            addCriterion("salt not in", values, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltBetween(String value1, String value2) {
            addCriterion("salt between", value1, value2, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotBetween(String value1, String value2) {
            addCriterion("salt not between", value1, value2, "salt");
            return (Criteria) this;
        }

        public Criteria andPbankIsNull() {
            addCriterion("pbank is null");
            return (Criteria) this;
        }

        public Criteria andPbankIsNotNull() {
            addCriterion("pbank is not null");
            return (Criteria) this;
        }

        public Criteria andPbankEqualTo(String value) {
            addCriterion("pbank =", value, "pbank");
            return (Criteria) this;
        }

        public Criteria andPbankNotEqualTo(String value) {
            addCriterion("pbank <>", value, "pbank");
            return (Criteria) this;
        }

        public Criteria andPbankGreaterThan(String value) {
            addCriterion("pbank >", value, "pbank");
            return (Criteria) this;
        }

        public Criteria andPbankGreaterThanOrEqualTo(String value) {
            addCriterion("pbank >=", value, "pbank");
            return (Criteria) this;
        }

        public Criteria andPbankLessThan(String value) {
            addCriterion("pbank <", value, "pbank");
            return (Criteria) this;
        }

        public Criteria andPbankLessThanOrEqualTo(String value) {
            addCriterion("pbank <=", value, "pbank");
            return (Criteria) this;
        }

        public Criteria andPbankLike(String value) {
            addCriterion("pbank like", value, "pbank");
            return (Criteria) this;
        }

        public Criteria andPbankNotLike(String value) {
            addCriterion("pbank not like", value, "pbank");
            return (Criteria) this;
        }

        public Criteria andPbankIn(List<String> values) {
            addCriterion("pbank in", values, "pbank");
            return (Criteria) this;
        }

        public Criteria andPbankNotIn(List<String> values) {
            addCriterion("pbank not in", values, "pbank");
            return (Criteria) this;
        }

        public Criteria andPbankBetween(String value1, String value2) {
            addCriterion("pbank between", value1, value2, "pbank");
            return (Criteria) this;
        }

        public Criteria andPbankNotBetween(String value1, String value2) {
            addCriterion("pbank not between", value1, value2, "pbank");
            return (Criteria) this;
        }

        public Criteria andPbanknumberIsNull() {
            addCriterion("pbanknumber is null");
            return (Criteria) this;
        }

        public Criteria andPbanknumberIsNotNull() {
            addCriterion("pbanknumber is not null");
            return (Criteria) this;
        }

        public Criteria andPbanknumberEqualTo(String value) {
            addCriterion("pbanknumber =", value, "pbanknumber");
            return (Criteria) this;
        }

        public Criteria andPbanknumberNotEqualTo(String value) {
            addCriterion("pbanknumber <>", value, "pbanknumber");
            return (Criteria) this;
        }

        public Criteria andPbanknumberGreaterThan(String value) {
            addCriterion("pbanknumber >", value, "pbanknumber");
            return (Criteria) this;
        }

        public Criteria andPbanknumberGreaterThanOrEqualTo(String value) {
            addCriterion("pbanknumber >=", value, "pbanknumber");
            return (Criteria) this;
        }

        public Criteria andPbanknumberLessThan(String value) {
            addCriterion("pbanknumber <", value, "pbanknumber");
            return (Criteria) this;
        }

        public Criteria andPbanknumberLessThanOrEqualTo(String value) {
            addCriterion("pbanknumber <=", value, "pbanknumber");
            return (Criteria) this;
        }

        public Criteria andPbanknumberLike(String value) {
            addCriterion("pbanknumber like", value, "pbanknumber");
            return (Criteria) this;
        }

        public Criteria andPbanknumberNotLike(String value) {
            addCriterion("pbanknumber not like", value, "pbanknumber");
            return (Criteria) this;
        }

        public Criteria andPbanknumberIn(List<String> values) {
            addCriterion("pbanknumber in", values, "pbanknumber");
            return (Criteria) this;
        }

        public Criteria andPbanknumberNotIn(List<String> values) {
            addCriterion("pbanknumber not in", values, "pbanknumber");
            return (Criteria) this;
        }

        public Criteria andPbanknumberBetween(String value1, String value2) {
            addCriterion("pbanknumber between", value1, value2, "pbanknumber");
            return (Criteria) this;
        }

        public Criteria andPbanknumberNotBetween(String value1, String value2) {
            addCriterion("pbanknumber not between", value1, value2, "pbanknumber");
            return (Criteria) this;
        }

        public Criteria andPresidenceaddressIsNull() {
            addCriterion("presidenceaddress is null");
            return (Criteria) this;
        }

        public Criteria andPresidenceaddressIsNotNull() {
            addCriterion("presidenceaddress is not null");
            return (Criteria) this;
        }

        public Criteria andPresidenceaddressEqualTo(String value) {
            addCriterion("presidenceaddress =", value, "presidenceaddress");
            return (Criteria) this;
        }

        public Criteria andPresidenceaddressNotEqualTo(String value) {
            addCriterion("presidenceaddress <>", value, "presidenceaddress");
            return (Criteria) this;
        }

        public Criteria andPresidenceaddressGreaterThan(String value) {
            addCriterion("presidenceaddress >", value, "presidenceaddress");
            return (Criteria) this;
        }

        public Criteria andPresidenceaddressGreaterThanOrEqualTo(String value) {
            addCriterion("presidenceaddress >=", value, "presidenceaddress");
            return (Criteria) this;
        }

        public Criteria andPresidenceaddressLessThan(String value) {
            addCriterion("presidenceaddress <", value, "presidenceaddress");
            return (Criteria) this;
        }

        public Criteria andPresidenceaddressLessThanOrEqualTo(String value) {
            addCriterion("presidenceaddress <=", value, "presidenceaddress");
            return (Criteria) this;
        }

        public Criteria andPresidenceaddressLike(String value) {
            addCriterion("presidenceaddress like", value, "presidenceaddress");
            return (Criteria) this;
        }

        public Criteria andPresidenceaddressNotLike(String value) {
            addCriterion("presidenceaddress not like", value, "presidenceaddress");
            return (Criteria) this;
        }

        public Criteria andPresidenceaddressIn(List<String> values) {
            addCriterion("presidenceaddress in", values, "presidenceaddress");
            return (Criteria) this;
        }

        public Criteria andPresidenceaddressNotIn(List<String> values) {
            addCriterion("presidenceaddress not in", values, "presidenceaddress");
            return (Criteria) this;
        }

        public Criteria andPresidenceaddressBetween(String value1, String value2) {
            addCriterion("presidenceaddress between", value1, value2, "presidenceaddress");
            return (Criteria) this;
        }

        public Criteria andPresidenceaddressNotBetween(String value1, String value2) {
            addCriterion("presidenceaddress not between", value1, value2, "presidenceaddress");
            return (Criteria) this;
        }

        public Criteria andPtidIsNull() {
            addCriterion("ptid is null");
            return (Criteria) this;
        }

        public Criteria andPtidIsNotNull() {
            addCriterion("ptid is not null");
            return (Criteria) this;
        }

        public Criteria andPtidEqualTo(Integer value) {
            addCriterion("ptid =", value, "ptid");
            return (Criteria) this;
        }

        public Criteria andPtidNotEqualTo(Integer value) {
            addCriterion("ptid <>", value, "ptid");
            return (Criteria) this;
        }

        public Criteria andPtidGreaterThan(Integer value) {
            addCriterion("ptid >", value, "ptid");
            return (Criteria) this;
        }

        public Criteria andPtidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ptid >=", value, "ptid");
            return (Criteria) this;
        }

        public Criteria andPtidLessThan(Integer value) {
            addCriterion("ptid <", value, "ptid");
            return (Criteria) this;
        }

        public Criteria andPtidLessThanOrEqualTo(Integer value) {
            addCriterion("ptid <=", value, "ptid");
            return (Criteria) this;
        }

        public Criteria andPtidIn(List<Integer> values) {
            addCriterion("ptid in", values, "ptid");
            return (Criteria) this;
        }

        public Criteria andPtidNotIn(List<Integer> values) {
            addCriterion("ptid not in", values, "ptid");
            return (Criteria) this;
        }

        public Criteria andPtidBetween(Integer value1, Integer value2) {
            addCriterion("ptid between", value1, value2, "ptid");
            return (Criteria) this;
        }

        public Criteria andPtidNotBetween(Integer value1, Integer value2) {
            addCriterion("ptid not between", value1, value2, "ptid");
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

        public Criteria andDimissionIsNull() {
            addCriterion("dimission is null");
            return (Criteria) this;
        }

        public Criteria andDimissionIsNotNull() {
            addCriterion("dimission is not null");
            return (Criteria) this;
        }

        public Criteria andDimissionEqualTo(Integer value) {
            addCriterion("dimission =", value, "dimission");
            return (Criteria) this;
        }

        public Criteria andDimissionNotEqualTo(Integer value) {
            addCriterion("dimission <>", value, "dimission");
            return (Criteria) this;
        }

        public Criteria andDimissionGreaterThan(Integer value) {
            addCriterion("dimission >", value, "dimission");
            return (Criteria) this;
        }

        public Criteria andDimissionGreaterThanOrEqualTo(Integer value) {
            addCriterion("dimission >=", value, "dimission");
            return (Criteria) this;
        }

        public Criteria andDimissionLessThan(Integer value) {
            addCriterion("dimission <", value, "dimission");
            return (Criteria) this;
        }

        public Criteria andDimissionLessThanOrEqualTo(Integer value) {
            addCriterion("dimission <=", value, "dimission");
            return (Criteria) this;
        }

        public Criteria andDimissionIn(List<Integer> values) {
            addCriterion("dimission in", values, "dimission");
            return (Criteria) this;
        }

        public Criteria andDimissionNotIn(List<Integer> values) {
            addCriterion("dimission not in", values, "dimission");
            return (Criteria) this;
        }

        public Criteria andDimissionBetween(Integer value1, Integer value2) {
            addCriterion("dimission between", value1, value2, "dimission");
            return (Criteria) this;
        }

        public Criteria andDimissionNotBetween(Integer value1, Integer value2) {
            addCriterion("dimission not between", value1, value2, "dimission");
            return (Criteria) this;
        }

        public Criteria andDcauseIsNull() {
            addCriterion("dcause is null");
            return (Criteria) this;
        }

        public Criteria andDcauseIsNotNull() {
            addCriterion("dcause is not null");
            return (Criteria) this;
        }

        public Criteria andDcauseEqualTo(String value) {
            addCriterion("dcause =", value, "dcause");
            return (Criteria) this;
        }

        public Criteria andDcauseNotEqualTo(String value) {
            addCriterion("dcause <>", value, "dcause");
            return (Criteria) this;
        }

        public Criteria andDcauseGreaterThan(String value) {
            addCriterion("dcause >", value, "dcause");
            return (Criteria) this;
        }

        public Criteria andDcauseGreaterThanOrEqualTo(String value) {
            addCriterion("dcause >=", value, "dcause");
            return (Criteria) this;
        }

        public Criteria andDcauseLessThan(String value) {
            addCriterion("dcause <", value, "dcause");
            return (Criteria) this;
        }

        public Criteria andDcauseLessThanOrEqualTo(String value) {
            addCriterion("dcause <=", value, "dcause");
            return (Criteria) this;
        }

        public Criteria andDcauseLike(String value) {
            addCriterion("dcause like", value, "dcause");
            return (Criteria) this;
        }

        public Criteria andDcauseNotLike(String value) {
            addCriterion("dcause not like", value, "dcause");
            return (Criteria) this;
        }

        public Criteria andDcauseIn(List<String> values) {
            addCriterion("dcause in", values, "dcause");
            return (Criteria) this;
        }

        public Criteria andDcauseNotIn(List<String> values) {
            addCriterion("dcause not in", values, "dcause");
            return (Criteria) this;
        }

        public Criteria andDcauseBetween(String value1, String value2) {
            addCriterion("dcause between", value1, value2, "dcause");
            return (Criteria) this;
        }

        public Criteria andDcauseNotBetween(String value1, String value2) {
            addCriterion("dcause not between", value1, value2, "dcause");
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