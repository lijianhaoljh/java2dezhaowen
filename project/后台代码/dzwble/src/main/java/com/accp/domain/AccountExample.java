package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AccountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AccountExample() {
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

        public Criteria andAstateIsNull() {
            addCriterion("astate is null");
            return (Criteria) this;
        }

        public Criteria andAstateIsNotNull() {
            addCriterion("astate is not null");
            return (Criteria) this;
        }

        public Criteria andAstateEqualTo(Integer value) {
            addCriterion("astate =", value, "astate");
            return (Criteria) this;
        }

        public Criteria andAstateNotEqualTo(Integer value) {
            addCriterion("astate <>", value, "astate");
            return (Criteria) this;
        }

        public Criteria andAstateGreaterThan(Integer value) {
            addCriterion("astate >", value, "astate");
            return (Criteria) this;
        }

        public Criteria andAstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("astate >=", value, "astate");
            return (Criteria) this;
        }

        public Criteria andAstateLessThan(Integer value) {
            addCriterion("astate <", value, "astate");
            return (Criteria) this;
        }

        public Criteria andAstateLessThanOrEqualTo(Integer value) {
            addCriterion("astate <=", value, "astate");
            return (Criteria) this;
        }

        public Criteria andAstateIn(List<Integer> values) {
            addCriterion("astate in", values, "astate");
            return (Criteria) this;
        }

        public Criteria andAstateNotIn(List<Integer> values) {
            addCriterion("astate not in", values, "astate");
            return (Criteria) this;
        }

        public Criteria andAstateBetween(Integer value1, Integer value2) {
            addCriterion("astate between", value1, value2, "astate");
            return (Criteria) this;
        }

        public Criteria andAstateNotBetween(Integer value1, Integer value2) {
            addCriterion("astate not between", value1, value2, "astate");
            return (Criteria) this;
        }

        public Criteria andBeforeMoneyIsNull() {
            addCriterion("before_money is null");
            return (Criteria) this;
        }

        public Criteria andBeforeMoneyIsNotNull() {
            addCriterion("before_money is not null");
            return (Criteria) this;
        }

        public Criteria andBeforeMoneyEqualTo(Float value) {
            addCriterion("before_money =", value, "beforeMoney");
            return (Criteria) this;
        }

        public Criteria andBeforeMoneyNotEqualTo(Float value) {
            addCriterion("before_money <>", value, "beforeMoney");
            return (Criteria) this;
        }

        public Criteria andBeforeMoneyGreaterThan(Float value) {
            addCriterion("before_money >", value, "beforeMoney");
            return (Criteria) this;
        }

        public Criteria andBeforeMoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("before_money >=", value, "beforeMoney");
            return (Criteria) this;
        }

        public Criteria andBeforeMoneyLessThan(Float value) {
            addCriterion("before_money <", value, "beforeMoney");
            return (Criteria) this;
        }

        public Criteria andBeforeMoneyLessThanOrEqualTo(Float value) {
            addCriterion("before_money <=", value, "beforeMoney");
            return (Criteria) this;
        }

        public Criteria andBeforeMoneyIn(List<Float> values) {
            addCriterion("before_money in", values, "beforeMoney");
            return (Criteria) this;
        }

        public Criteria andBeforeMoneyNotIn(List<Float> values) {
            addCriterion("before_money not in", values, "beforeMoney");
            return (Criteria) this;
        }

        public Criteria andBeforeMoneyBetween(Float value1, Float value2) {
            addCriterion("before_money between", value1, value2, "beforeMoney");
            return (Criteria) this;
        }

        public Criteria andBeforeMoneyNotBetween(Float value1, Float value2) {
            addCriterion("before_money not between", value1, value2, "beforeMoney");
            return (Criteria) this;
        }

        public Criteria andTotalIsNull() {
            addCriterion("total is null");
            return (Criteria) this;
        }

        public Criteria andTotalIsNotNull() {
            addCriterion("total is not null");
            return (Criteria) this;
        }

        public Criteria andTotalEqualTo(Float value) {
            addCriterion("total =", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotEqualTo(Float value) {
            addCriterion("total <>", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThan(Float value) {
            addCriterion("total >", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThanOrEqualTo(Float value) {
            addCriterion("total >=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThan(Float value) {
            addCriterion("total <", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThanOrEqualTo(Float value) {
            addCriterion("total <=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalIn(List<Float> values) {
            addCriterion("total in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotIn(List<Float> values) {
            addCriterion("total not in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalBetween(Float value1, Float value2) {
            addCriterion("total between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotBetween(Float value1, Float value2) {
            addCriterion("total not between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andMaterialsExpensesIsNull() {
            addCriterion("materials_expenses is null");
            return (Criteria) this;
        }

        public Criteria andMaterialsExpensesIsNotNull() {
            addCriterion("materials_expenses is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialsExpensesEqualTo(Float value) {
            addCriterion("materials_expenses =", value, "materialsExpenses");
            return (Criteria) this;
        }

        public Criteria andMaterialsExpensesNotEqualTo(Float value) {
            addCriterion("materials_expenses <>", value, "materialsExpenses");
            return (Criteria) this;
        }

        public Criteria andMaterialsExpensesGreaterThan(Float value) {
            addCriterion("materials_expenses >", value, "materialsExpenses");
            return (Criteria) this;
        }

        public Criteria andMaterialsExpensesGreaterThanOrEqualTo(Float value) {
            addCriterion("materials_expenses >=", value, "materialsExpenses");
            return (Criteria) this;
        }

        public Criteria andMaterialsExpensesLessThan(Float value) {
            addCriterion("materials_expenses <", value, "materialsExpenses");
            return (Criteria) this;
        }

        public Criteria andMaterialsExpensesLessThanOrEqualTo(Float value) {
            addCriterion("materials_expenses <=", value, "materialsExpenses");
            return (Criteria) this;
        }

        public Criteria andMaterialsExpensesIn(List<Float> values) {
            addCriterion("materials_expenses in", values, "materialsExpenses");
            return (Criteria) this;
        }

        public Criteria andMaterialsExpensesNotIn(List<Float> values) {
            addCriterion("materials_expenses not in", values, "materialsExpenses");
            return (Criteria) this;
        }

        public Criteria andMaterialsExpensesBetween(Float value1, Float value2) {
            addCriterion("materials_expenses between", value1, value2, "materialsExpenses");
            return (Criteria) this;
        }

        public Criteria andMaterialsExpensesNotBetween(Float value1, Float value2) {
            addCriterion("materials_expenses not between", value1, value2, "materialsExpenses");
            return (Criteria) this;
        }

        public Criteria andCrashIsNull() {
            addCriterion("crash is null");
            return (Criteria) this;
        }

        public Criteria andCrashIsNotNull() {
            addCriterion("crash is not null");
            return (Criteria) this;
        }

        public Criteria andCrashEqualTo(Float value) {
            addCriterion("crash =", value, "crash");
            return (Criteria) this;
        }

        public Criteria andCrashNotEqualTo(Float value) {
            addCriterion("crash <>", value, "crash");
            return (Criteria) this;
        }

        public Criteria andCrashGreaterThan(Float value) {
            addCriterion("crash >", value, "crash");
            return (Criteria) this;
        }

        public Criteria andCrashGreaterThanOrEqualTo(Float value) {
            addCriterion("crash >=", value, "crash");
            return (Criteria) this;
        }

        public Criteria andCrashLessThan(Float value) {
            addCriterion("crash <", value, "crash");
            return (Criteria) this;
        }

        public Criteria andCrashLessThanOrEqualTo(Float value) {
            addCriterion("crash <=", value, "crash");
            return (Criteria) this;
        }

        public Criteria andCrashIn(List<Float> values) {
            addCriterion("crash in", values, "crash");
            return (Criteria) this;
        }

        public Criteria andCrashNotIn(List<Float> values) {
            addCriterion("crash not in", values, "crash");
            return (Criteria) this;
        }

        public Criteria andCrashBetween(Float value1, Float value2) {
            addCriterion("crash between", value1, value2, "crash");
            return (Criteria) this;
        }

        public Criteria andCrashNotBetween(Float value1, Float value2) {
            addCriterion("crash not between", value1, value2, "crash");
            return (Criteria) this;
        }

        public Criteria andAdditionIsNull() {
            addCriterion("addition is null");
            return (Criteria) this;
        }

        public Criteria andAdditionIsNotNull() {
            addCriterion("addition is not null");
            return (Criteria) this;
        }

        public Criteria andAdditionEqualTo(Float value) {
            addCriterion("addition =", value, "addition");
            return (Criteria) this;
        }

        public Criteria andAdditionNotEqualTo(Float value) {
            addCriterion("addition <>", value, "addition");
            return (Criteria) this;
        }

        public Criteria andAdditionGreaterThan(Float value) {
            addCriterion("addition >", value, "addition");
            return (Criteria) this;
        }

        public Criteria andAdditionGreaterThanOrEqualTo(Float value) {
            addCriterion("addition >=", value, "addition");
            return (Criteria) this;
        }

        public Criteria andAdditionLessThan(Float value) {
            addCriterion("addition <", value, "addition");
            return (Criteria) this;
        }

        public Criteria andAdditionLessThanOrEqualTo(Float value) {
            addCriterion("addition <=", value, "addition");
            return (Criteria) this;
        }

        public Criteria andAdditionIn(List<Float> values) {
            addCriterion("addition in", values, "addition");
            return (Criteria) this;
        }

        public Criteria andAdditionNotIn(List<Float> values) {
            addCriterion("addition not in", values, "addition");
            return (Criteria) this;
        }

        public Criteria andAdditionBetween(Float value1, Float value2) {
            addCriterion("addition between", value1, value2, "addition");
            return (Criteria) this;
        }

        public Criteria andAdditionNotBetween(Float value1, Float value2) {
            addCriterion("addition not between", value1, value2, "addition");
            return (Criteria) this;
        }

        public Criteria andAtimeIsNull() {
            addCriterion("atime is null");
            return (Criteria) this;
        }

        public Criteria andAtimeIsNotNull() {
            addCriterion("atime is not null");
            return (Criteria) this;
        }

        public Criteria andAtimeEqualTo(Date value) {
            addCriterion("atime =", value, "atime");
            return (Criteria) this;
        }

        public Criteria andAtimeNotEqualTo(Date value) {
            addCriterion("atime <>", value, "atime");
            return (Criteria) this;
        }

        public Criteria andAtimeGreaterThan(Date value) {
            addCriterion("atime >", value, "atime");
            return (Criteria) this;
        }

        public Criteria andAtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("atime >=", value, "atime");
            return (Criteria) this;
        }

        public Criteria andAtimeLessThan(Date value) {
            addCriterion("atime <", value, "atime");
            return (Criteria) this;
        }

        public Criteria andAtimeLessThanOrEqualTo(Date value) {
            addCriterion("atime <=", value, "atime");
            return (Criteria) this;
        }

        public Criteria andAtimeIn(List<Date> values) {
            addCriterion("atime in", values, "atime");
            return (Criteria) this;
        }

        public Criteria andAtimeNotIn(List<Date> values) {
            addCriterion("atime not in", values, "atime");
            return (Criteria) this;
        }

        public Criteria andAtimeBetween(Date value1, Date value2) {
            addCriterion("atime between", value1, value2, "atime");
            return (Criteria) this;
        }

        public Criteria andAtimeNotBetween(Date value1, Date value2) {
            addCriterion("atime not between", value1, value2, "atime");
            return (Criteria) this;
        }

        public Criteria andAnameIsNull() {
            addCriterion("aname is null");
            return (Criteria) this;
        }

        public Criteria andAnameIsNotNull() {
            addCriterion("aname is not null");
            return (Criteria) this;
        }

        public Criteria andAnameEqualTo(String value) {
            addCriterion("aname =", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameNotEqualTo(String value) {
            addCriterion("aname <>", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameGreaterThan(String value) {
            addCriterion("aname >", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameGreaterThanOrEqualTo(String value) {
            addCriterion("aname >=", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameLessThan(String value) {
            addCriterion("aname <", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameLessThanOrEqualTo(String value) {
            addCriterion("aname <=", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameLike(String value) {
            addCriterion("aname like", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameNotLike(String value) {
            addCriterion("aname not like", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameIn(List<String> values) {
            addCriterion("aname in", values, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameNotIn(List<String> values) {
            addCriterion("aname not in", values, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameBetween(String value1, String value2) {
            addCriterion("aname between", value1, value2, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameNotBetween(String value1, String value2) {
            addCriterion("aname not between", value1, value2, "aname");
            return (Criteria) this;
        }

        public Criteria andCashIsNull() {
            addCriterion("cash is null");
            return (Criteria) this;
        }

        public Criteria andCashIsNotNull() {
            addCriterion("cash is not null");
            return (Criteria) this;
        }

        public Criteria andCashEqualTo(Float value) {
            addCriterion("cash =", value, "cash");
            return (Criteria) this;
        }

        public Criteria andCashNotEqualTo(Float value) {
            addCriterion("cash <>", value, "cash");
            return (Criteria) this;
        }

        public Criteria andCashGreaterThan(Float value) {
            addCriterion("cash >", value, "cash");
            return (Criteria) this;
        }

        public Criteria andCashGreaterThanOrEqualTo(Float value) {
            addCriterion("cash >=", value, "cash");
            return (Criteria) this;
        }

        public Criteria andCashLessThan(Float value) {
            addCriterion("cash <", value, "cash");
            return (Criteria) this;
        }

        public Criteria andCashLessThanOrEqualTo(Float value) {
            addCriterion("cash <=", value, "cash");
            return (Criteria) this;
        }

        public Criteria andCashIn(List<Float> values) {
            addCriterion("cash in", values, "cash");
            return (Criteria) this;
        }

        public Criteria andCashNotIn(List<Float> values) {
            addCriterion("cash not in", values, "cash");
            return (Criteria) this;
        }

        public Criteria andCashBetween(Float value1, Float value2) {
            addCriterion("cash between", value1, value2, "cash");
            return (Criteria) this;
        }

        public Criteria andCashNotBetween(Float value1, Float value2) {
            addCriterion("cash not between", value1, value2, "cash");
            return (Criteria) this;
        }

        public Criteria andBankIsNull() {
            addCriterion("bank is null");
            return (Criteria) this;
        }

        public Criteria andBankIsNotNull() {
            addCriterion("bank is not null");
            return (Criteria) this;
        }

        public Criteria andBankEqualTo(Float value) {
            addCriterion("bank =", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotEqualTo(Float value) {
            addCriterion("bank <>", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankGreaterThan(Float value) {
            addCriterion("bank >", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankGreaterThanOrEqualTo(Float value) {
            addCriterion("bank >=", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankLessThan(Float value) {
            addCriterion("bank <", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankLessThanOrEqualTo(Float value) {
            addCriterion("bank <=", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankIn(List<Float> values) {
            addCriterion("bank in", values, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotIn(List<Float> values) {
            addCriterion("bank not in", values, "bank");
            return (Criteria) this;
        }

        public Criteria andBankBetween(Float value1, Float value2) {
            addCriterion("bank between", value1, value2, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotBetween(Float value1, Float value2) {
            addCriterion("bank not between", value1, value2, "bank");
            return (Criteria) this;
        }

        public Criteria andBillIsNull() {
            addCriterion("bill is null");
            return (Criteria) this;
        }

        public Criteria andBillIsNotNull() {
            addCriterion("bill is not null");
            return (Criteria) this;
        }

        public Criteria andBillEqualTo(Float value) {
            addCriterion("bill =", value, "bill");
            return (Criteria) this;
        }

        public Criteria andBillNotEqualTo(Float value) {
            addCriterion("bill <>", value, "bill");
            return (Criteria) this;
        }

        public Criteria andBillGreaterThan(Float value) {
            addCriterion("bill >", value, "bill");
            return (Criteria) this;
        }

        public Criteria andBillGreaterThanOrEqualTo(Float value) {
            addCriterion("bill >=", value, "bill");
            return (Criteria) this;
        }

        public Criteria andBillLessThan(Float value) {
            addCriterion("bill <", value, "bill");
            return (Criteria) this;
        }

        public Criteria andBillLessThanOrEqualTo(Float value) {
            addCriterion("bill <=", value, "bill");
            return (Criteria) this;
        }

        public Criteria andBillIn(List<Float> values) {
            addCriterion("bill in", values, "bill");
            return (Criteria) this;
        }

        public Criteria andBillNotIn(List<Float> values) {
            addCriterion("bill not in", values, "bill");
            return (Criteria) this;
        }

        public Criteria andBillBetween(Float value1, Float value2) {
            addCriterion("bill between", value1, value2, "bill");
            return (Criteria) this;
        }

        public Criteria andBillNotBetween(Float value1, Float value2) {
            addCriterion("bill not between", value1, value2, "bill");
            return (Criteria) this;
        }

        public Criteria andBuyingIsNull() {
            addCriterion("buying is null");
            return (Criteria) this;
        }

        public Criteria andBuyingIsNotNull() {
            addCriterion("buying is not null");
            return (Criteria) this;
        }

        public Criteria andBuyingEqualTo(Float value) {
            addCriterion("buying =", value, "buying");
            return (Criteria) this;
        }

        public Criteria andBuyingNotEqualTo(Float value) {
            addCriterion("buying <>", value, "buying");
            return (Criteria) this;
        }

        public Criteria andBuyingGreaterThan(Float value) {
            addCriterion("buying >", value, "buying");
            return (Criteria) this;
        }

        public Criteria andBuyingGreaterThanOrEqualTo(Float value) {
            addCriterion("buying >=", value, "buying");
            return (Criteria) this;
        }

        public Criteria andBuyingLessThan(Float value) {
            addCriterion("buying <", value, "buying");
            return (Criteria) this;
        }

        public Criteria andBuyingLessThanOrEqualTo(Float value) {
            addCriterion("buying <=", value, "buying");
            return (Criteria) this;
        }

        public Criteria andBuyingIn(List<Float> values) {
            addCriterion("buying in", values, "buying");
            return (Criteria) this;
        }

        public Criteria andBuyingNotIn(List<Float> values) {
            addCriterion("buying not in", values, "buying");
            return (Criteria) this;
        }

        public Criteria andBuyingBetween(Float value1, Float value2) {
            addCriterion("buying between", value1, value2, "buying");
            return (Criteria) this;
        }

        public Criteria andBuyingNotBetween(Float value1, Float value2) {
            addCriterion("buying not between", value1, value2, "buying");
            return (Criteria) this;
        }

        public Criteria andAtCardIsNull() {
            addCriterion("at_card is null");
            return (Criteria) this;
        }

        public Criteria andAtCardIsNotNull() {
            addCriterion("at_card is not null");
            return (Criteria) this;
        }

        public Criteria andAtCardEqualTo(Float value) {
            addCriterion("at_card =", value, "atCard");
            return (Criteria) this;
        }

        public Criteria andAtCardNotEqualTo(Float value) {
            addCriterion("at_card <>", value, "atCard");
            return (Criteria) this;
        }

        public Criteria andAtCardGreaterThan(Float value) {
            addCriterion("at_card >", value, "atCard");
            return (Criteria) this;
        }

        public Criteria andAtCardGreaterThanOrEqualTo(Float value) {
            addCriterion("at_card >=", value, "atCard");
            return (Criteria) this;
        }

        public Criteria andAtCardLessThan(Float value) {
            addCriterion("at_card <", value, "atCard");
            return (Criteria) this;
        }

        public Criteria andAtCardLessThanOrEqualTo(Float value) {
            addCriterion("at_card <=", value, "atCard");
            return (Criteria) this;
        }

        public Criteria andAtCardIn(List<Float> values) {
            addCriterion("at_card in", values, "atCard");
            return (Criteria) this;
        }

        public Criteria andAtCardNotIn(List<Float> values) {
            addCriterion("at_card not in", values, "atCard");
            return (Criteria) this;
        }

        public Criteria andAtCardBetween(Float value1, Float value2) {
            addCriterion("at_card between", value1, value2, "atCard");
            return (Criteria) this;
        }

        public Criteria andAtCardNotBetween(Float value1, Float value2) {
            addCriterion("at_card not between", value1, value2, "atCard");
            return (Criteria) this;
        }

        public Criteria andAtDepositIsNull() {
            addCriterion("at_deposit is null");
            return (Criteria) this;
        }

        public Criteria andAtDepositIsNotNull() {
            addCriterion("at_deposit is not null");
            return (Criteria) this;
        }

        public Criteria andAtDepositEqualTo(Float value) {
            addCriterion("at_deposit =", value, "atDeposit");
            return (Criteria) this;
        }

        public Criteria andAtDepositNotEqualTo(Float value) {
            addCriterion("at_deposit <>", value, "atDeposit");
            return (Criteria) this;
        }

        public Criteria andAtDepositGreaterThan(Float value) {
            addCriterion("at_deposit >", value, "atDeposit");
            return (Criteria) this;
        }

        public Criteria andAtDepositGreaterThanOrEqualTo(Float value) {
            addCriterion("at_deposit >=", value, "atDeposit");
            return (Criteria) this;
        }

        public Criteria andAtDepositLessThan(Float value) {
            addCriterion("at_deposit <", value, "atDeposit");
            return (Criteria) this;
        }

        public Criteria andAtDepositLessThanOrEqualTo(Float value) {
            addCriterion("at_deposit <=", value, "atDeposit");
            return (Criteria) this;
        }

        public Criteria andAtDepositIn(List<Float> values) {
            addCriterion("at_deposit in", values, "atDeposit");
            return (Criteria) this;
        }

        public Criteria andAtDepositNotIn(List<Float> values) {
            addCriterion("at_deposit not in", values, "atDeposit");
            return (Criteria) this;
        }

        public Criteria andAtDepositBetween(Float value1, Float value2) {
            addCriterion("at_deposit between", value1, value2, "atDeposit");
            return (Criteria) this;
        }

        public Criteria andAtDepositNotBetween(Float value1, Float value2) {
            addCriterion("at_deposit not between", value1, value2, "atDeposit");
            return (Criteria) this;
        }

        public Criteria andCollectTaxesIsNull() {
            addCriterion("Collect_taxes is null");
            return (Criteria) this;
        }

        public Criteria andCollectTaxesIsNotNull() {
            addCriterion("Collect_taxes is not null");
            return (Criteria) this;
        }

        public Criteria andCollectTaxesEqualTo(Float value) {
            addCriterion("Collect_taxes =", value, "collectTaxes");
            return (Criteria) this;
        }

        public Criteria andCollectTaxesNotEqualTo(Float value) {
            addCriterion("Collect_taxes <>", value, "collectTaxes");
            return (Criteria) this;
        }

        public Criteria andCollectTaxesGreaterThan(Float value) {
            addCriterion("Collect_taxes >", value, "collectTaxes");
            return (Criteria) this;
        }

        public Criteria andCollectTaxesGreaterThanOrEqualTo(Float value) {
            addCriterion("Collect_taxes >=", value, "collectTaxes");
            return (Criteria) this;
        }

        public Criteria andCollectTaxesLessThan(Float value) {
            addCriterion("Collect_taxes <", value, "collectTaxes");
            return (Criteria) this;
        }

        public Criteria andCollectTaxesLessThanOrEqualTo(Float value) {
            addCriterion("Collect_taxes <=", value, "collectTaxes");
            return (Criteria) this;
        }

        public Criteria andCollectTaxesIn(List<Float> values) {
            addCriterion("Collect_taxes in", values, "collectTaxes");
            return (Criteria) this;
        }

        public Criteria andCollectTaxesNotIn(List<Float> values) {
            addCriterion("Collect_taxes not in", values, "collectTaxes");
            return (Criteria) this;
        }

        public Criteria andCollectTaxesBetween(Float value1, Float value2) {
            addCriterion("Collect_taxes between", value1, value2, "collectTaxes");
            return (Criteria) this;
        }

        public Criteria andCollectTaxesNotBetween(Float value1, Float value2) {
            addCriterion("Collect_taxes not between", value1, value2, "collectTaxes");
            return (Criteria) this;
        }

        public Criteria andVoucherIsNull() {
            addCriterion("voucher is null");
            return (Criteria) this;
        }

        public Criteria andVoucherIsNotNull() {
            addCriterion("voucher is not null");
            return (Criteria) this;
        }

        public Criteria andVoucherEqualTo(Float value) {
            addCriterion("voucher =", value, "voucher");
            return (Criteria) this;
        }

        public Criteria andVoucherNotEqualTo(Float value) {
            addCriterion("voucher <>", value, "voucher");
            return (Criteria) this;
        }

        public Criteria andVoucherGreaterThan(Float value) {
            addCriterion("voucher >", value, "voucher");
            return (Criteria) this;
        }

        public Criteria andVoucherGreaterThanOrEqualTo(Float value) {
            addCriterion("voucher >=", value, "voucher");
            return (Criteria) this;
        }

        public Criteria andVoucherLessThan(Float value) {
            addCriterion("voucher <", value, "voucher");
            return (Criteria) this;
        }

        public Criteria andVoucherLessThanOrEqualTo(Float value) {
            addCriterion("voucher <=", value, "voucher");
            return (Criteria) this;
        }

        public Criteria andVoucherIn(List<Float> values) {
            addCriterion("voucher in", values, "voucher");
            return (Criteria) this;
        }

        public Criteria andVoucherNotIn(List<Float> values) {
            addCriterion("voucher not in", values, "voucher");
            return (Criteria) this;
        }

        public Criteria andVoucherBetween(Float value1, Float value2) {
            addCriterion("voucher between", value1, value2, "voucher");
            return (Criteria) this;
        }

        public Criteria andVoucherNotBetween(Float value1, Float value2) {
            addCriterion("voucher not between", value1, value2, "voucher");
            return (Criteria) this;
        }

        public Criteria andWipeMantissaIsNull() {
            addCriterion("wipe_mantissa is null");
            return (Criteria) this;
        }

        public Criteria andWipeMantissaIsNotNull() {
            addCriterion("wipe_mantissa is not null");
            return (Criteria) this;
        }

        public Criteria andWipeMantissaEqualTo(Float value) {
            addCriterion("wipe_mantissa =", value, "wipeMantissa");
            return (Criteria) this;
        }

        public Criteria andWipeMantissaNotEqualTo(Float value) {
            addCriterion("wipe_mantissa <>", value, "wipeMantissa");
            return (Criteria) this;
        }

        public Criteria andWipeMantissaGreaterThan(Float value) {
            addCriterion("wipe_mantissa >", value, "wipeMantissa");
            return (Criteria) this;
        }

        public Criteria andWipeMantissaGreaterThanOrEqualTo(Float value) {
            addCriterion("wipe_mantissa >=", value, "wipeMantissa");
            return (Criteria) this;
        }

        public Criteria andWipeMantissaLessThan(Float value) {
            addCriterion("wipe_mantissa <", value, "wipeMantissa");
            return (Criteria) this;
        }

        public Criteria andWipeMantissaLessThanOrEqualTo(Float value) {
            addCriterion("wipe_mantissa <=", value, "wipeMantissa");
            return (Criteria) this;
        }

        public Criteria andWipeMantissaIn(List<Float> values) {
            addCriterion("wipe_mantissa in", values, "wipeMantissa");
            return (Criteria) this;
        }

        public Criteria andWipeMantissaNotIn(List<Float> values) {
            addCriterion("wipe_mantissa not in", values, "wipeMantissa");
            return (Criteria) this;
        }

        public Criteria andWipeMantissaBetween(Float value1, Float value2) {
            addCriterion("wipe_mantissa between", value1, value2, "wipeMantissa");
            return (Criteria) this;
        }

        public Criteria andWipeMantissaNotBetween(Float value1, Float value2) {
            addCriterion("wipe_mantissa not between", value1, value2, "wipeMantissa");
            return (Criteria) this;
        }

        public Criteria andInternalIsNull() {
            addCriterion("Internal is null");
            return (Criteria) this;
        }

        public Criteria andInternalIsNotNull() {
            addCriterion("Internal is not null");
            return (Criteria) this;
        }

        public Criteria andInternalEqualTo(Float value) {
            addCriterion("Internal =", value, "internal");
            return (Criteria) this;
        }

        public Criteria andInternalNotEqualTo(Float value) {
            addCriterion("Internal <>", value, "internal");
            return (Criteria) this;
        }

        public Criteria andInternalGreaterThan(Float value) {
            addCriterion("Internal >", value, "internal");
            return (Criteria) this;
        }

        public Criteria andInternalGreaterThanOrEqualTo(Float value) {
            addCriterion("Internal >=", value, "internal");
            return (Criteria) this;
        }

        public Criteria andInternalLessThan(Float value) {
            addCriterion("Internal <", value, "internal");
            return (Criteria) this;
        }

        public Criteria andInternalLessThanOrEqualTo(Float value) {
            addCriterion("Internal <=", value, "internal");
            return (Criteria) this;
        }

        public Criteria andInternalIn(List<Float> values) {
            addCriterion("Internal in", values, "internal");
            return (Criteria) this;
        }

        public Criteria andInternalNotIn(List<Float> values) {
            addCriterion("Internal not in", values, "internal");
            return (Criteria) this;
        }

        public Criteria andInternalBetween(Float value1, Float value2) {
            addCriterion("Internal between", value1, value2, "internal");
            return (Criteria) this;
        }

        public Criteria andInternalNotBetween(Float value1, Float value2) {
            addCriterion("Internal not between", value1, value2, "internal");
            return (Criteria) this;
        }

        public Criteria andPointsDeductionIsNull() {
            addCriterion("Points_deduction is null");
            return (Criteria) this;
        }

        public Criteria andPointsDeductionIsNotNull() {
            addCriterion("Points_deduction is not null");
            return (Criteria) this;
        }

        public Criteria andPointsDeductionEqualTo(Float value) {
            addCriterion("Points_deduction =", value, "pointsDeduction");
            return (Criteria) this;
        }

        public Criteria andPointsDeductionNotEqualTo(Float value) {
            addCriterion("Points_deduction <>", value, "pointsDeduction");
            return (Criteria) this;
        }

        public Criteria andPointsDeductionGreaterThan(Float value) {
            addCriterion("Points_deduction >", value, "pointsDeduction");
            return (Criteria) this;
        }

        public Criteria andPointsDeductionGreaterThanOrEqualTo(Float value) {
            addCriterion("Points_deduction >=", value, "pointsDeduction");
            return (Criteria) this;
        }

        public Criteria andPointsDeductionLessThan(Float value) {
            addCriterion("Points_deduction <", value, "pointsDeduction");
            return (Criteria) this;
        }

        public Criteria andPointsDeductionLessThanOrEqualTo(Float value) {
            addCriterion("Points_deduction <=", value, "pointsDeduction");
            return (Criteria) this;
        }

        public Criteria andPointsDeductionIn(List<Float> values) {
            addCriterion("Points_deduction in", values, "pointsDeduction");
            return (Criteria) this;
        }

        public Criteria andPointsDeductionNotIn(List<Float> values) {
            addCriterion("Points_deduction not in", values, "pointsDeduction");
            return (Criteria) this;
        }

        public Criteria andPointsDeductionBetween(Float value1, Float value2) {
            addCriterion("Points_deduction between", value1, value2, "pointsDeduction");
            return (Criteria) this;
        }

        public Criteria andPointsDeductionNotBetween(Float value1, Float value2) {
            addCriterion("Points_deduction not between", value1, value2, "pointsDeduction");
            return (Criteria) this;
        }

        public Criteria andProfitLossIsNull() {
            addCriterion("profit_loss is null");
            return (Criteria) this;
        }

        public Criteria andProfitLossIsNotNull() {
            addCriterion("profit_loss is not null");
            return (Criteria) this;
        }

        public Criteria andProfitLossEqualTo(Float value) {
            addCriterion("profit_loss =", value, "profitLoss");
            return (Criteria) this;
        }

        public Criteria andProfitLossNotEqualTo(Float value) {
            addCriterion("profit_loss <>", value, "profitLoss");
            return (Criteria) this;
        }

        public Criteria andProfitLossGreaterThan(Float value) {
            addCriterion("profit_loss >", value, "profitLoss");
            return (Criteria) this;
        }

        public Criteria andProfitLossGreaterThanOrEqualTo(Float value) {
            addCriterion("profit_loss >=", value, "profitLoss");
            return (Criteria) this;
        }

        public Criteria andProfitLossLessThan(Float value) {
            addCriterion("profit_loss <", value, "profitLoss");
            return (Criteria) this;
        }

        public Criteria andProfitLossLessThanOrEqualTo(Float value) {
            addCriterion("profit_loss <=", value, "profitLoss");
            return (Criteria) this;
        }

        public Criteria andProfitLossIn(List<Float> values) {
            addCriterion("profit_loss in", values, "profitLoss");
            return (Criteria) this;
        }

        public Criteria andProfitLossNotIn(List<Float> values) {
            addCriterion("profit_loss not in", values, "profitLoss");
            return (Criteria) this;
        }

        public Criteria andProfitLossBetween(Float value1, Float value2) {
            addCriterion("profit_loss between", value1, value2, "profitLoss");
            return (Criteria) this;
        }

        public Criteria andProfitLossNotBetween(Float value1, Float value2) {
            addCriterion("profit_loss not between", value1, value2, "profitLoss");
            return (Criteria) this;
        }

        public Criteria andItidIsNull() {
            addCriterion("itid is null");
            return (Criteria) this;
        }

        public Criteria andItidIsNotNull() {
            addCriterion("itid is not null");
            return (Criteria) this;
        }

        public Criteria andItidEqualTo(Integer value) {
            addCriterion("itid =", value, "itid");
            return (Criteria) this;
        }

        public Criteria andItidNotEqualTo(Integer value) {
            addCriterion("itid <>", value, "itid");
            return (Criteria) this;
        }

        public Criteria andItidGreaterThan(Integer value) {
            addCriterion("itid >", value, "itid");
            return (Criteria) this;
        }

        public Criteria andItidGreaterThanOrEqualTo(Integer value) {
            addCriterion("itid >=", value, "itid");
            return (Criteria) this;
        }

        public Criteria andItidLessThan(Integer value) {
            addCriterion("itid <", value, "itid");
            return (Criteria) this;
        }

        public Criteria andItidLessThanOrEqualTo(Integer value) {
            addCriterion("itid <=", value, "itid");
            return (Criteria) this;
        }

        public Criteria andItidIn(List<Integer> values) {
            addCriterion("itid in", values, "itid");
            return (Criteria) this;
        }

        public Criteria andItidNotIn(List<Integer> values) {
            addCriterion("itid not in", values, "itid");
            return (Criteria) this;
        }

        public Criteria andItidBetween(Integer value1, Integer value2) {
            addCriterion("itid between", value1, value2, "itid");
            return (Criteria) this;
        }

        public Criteria andItidNotBetween(Integer value1, Integer value2) {
            addCriterion("itid not between", value1, value2, "itid");
            return (Criteria) this;
        }

        public Criteria andInvidIsNull() {
            addCriterion("invid is null");
            return (Criteria) this;
        }

        public Criteria andInvidIsNotNull() {
            addCriterion("invid is not null");
            return (Criteria) this;
        }

        public Criteria andInvidEqualTo(String value) {
            addCriterion("invid =", value, "invid");
            return (Criteria) this;
        }

        public Criteria andInvidNotEqualTo(String value) {
            addCriterion("invid <>", value, "invid");
            return (Criteria) this;
        }

        public Criteria andInvidGreaterThan(String value) {
            addCriterion("invid >", value, "invid");
            return (Criteria) this;
        }

        public Criteria andInvidGreaterThanOrEqualTo(String value) {
            addCriterion("invid >=", value, "invid");
            return (Criteria) this;
        }

        public Criteria andInvidLessThan(String value) {
            addCriterion("invid <", value, "invid");
            return (Criteria) this;
        }

        public Criteria andInvidLessThanOrEqualTo(String value) {
            addCriterion("invid <=", value, "invid");
            return (Criteria) this;
        }

        public Criteria andInvidLike(String value) {
            addCriterion("invid like", value, "invid");
            return (Criteria) this;
        }

        public Criteria andInvidNotLike(String value) {
            addCriterion("invid not like", value, "invid");
            return (Criteria) this;
        }

        public Criteria andInvidIn(List<String> values) {
            addCriterion("invid in", values, "invid");
            return (Criteria) this;
        }

        public Criteria andInvidNotIn(List<String> values) {
            addCriterion("invid not in", values, "invid");
            return (Criteria) this;
        }

        public Criteria andInvidBetween(String value1, String value2) {
            addCriterion("invid between", value1, value2, "invid");
            return (Criteria) this;
        }

        public Criteria andInvidNotBetween(String value1, String value2) {
            addCriterion("invid not between", value1, value2, "invid");
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