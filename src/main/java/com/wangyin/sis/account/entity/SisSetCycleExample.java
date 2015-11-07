package com.wangyin.sis.account.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SisSetCycleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SisSetCycleExample() {
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

        public Criteria andSetCycleIdIsNull() {
            addCriterion("SET_CYCLE_ID is null");
            return (Criteria) this;
        }

        public Criteria andSetCycleIdIsNotNull() {
            addCriterion("SET_CYCLE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSetCycleIdEqualTo(String value) {
            addCriterion("SET_CYCLE_ID =", value, "setCycleId");
            return (Criteria) this;
        }

        public Criteria andSetCycleIdNotEqualTo(String value) {
            addCriterion("SET_CYCLE_ID <>", value, "setCycleId");
            return (Criteria) this;
        }

        public Criteria andSetCycleIdGreaterThan(String value) {
            addCriterion("SET_CYCLE_ID >", value, "setCycleId");
            return (Criteria) this;
        }

        public Criteria andSetCycleIdGreaterThanOrEqualTo(String value) {
            addCriterion("SET_CYCLE_ID >=", value, "setCycleId");
            return (Criteria) this;
        }

        public Criteria andSetCycleIdLessThan(String value) {
            addCriterion("SET_CYCLE_ID <", value, "setCycleId");
            return (Criteria) this;
        }

        public Criteria andSetCycleIdLessThanOrEqualTo(String value) {
            addCriterion("SET_CYCLE_ID <=", value, "setCycleId");
            return (Criteria) this;
        }

        public Criteria andSetCycleIdLike(String value) {
            addCriterion("SET_CYCLE_ID like", value, "setCycleId");
            return (Criteria) this;
        }

        public Criteria andSetCycleIdNotLike(String value) {
            addCriterion("SET_CYCLE_ID not like", value, "setCycleId");
            return (Criteria) this;
        }

        public Criteria andSetCycleIdIn(List<String> values) {
            addCriterion("SET_CYCLE_ID in", values, "setCycleId");
            return (Criteria) this;
        }

        public Criteria andSetCycleIdNotIn(List<String> values) {
            addCriterion("SET_CYCLE_ID not in", values, "setCycleId");
            return (Criteria) this;
        }

        public Criteria andSetCycleIdBetween(String value1, String value2) {
            addCriterion("SET_CYCLE_ID between", value1, value2, "setCycleId");
            return (Criteria) this;
        }

        public Criteria andSetCycleIdNotBetween(String value1, String value2) {
            addCriterion("SET_CYCLE_ID not between", value1, value2, "setCycleId");
            return (Criteria) this;
        }

        public Criteria andSetCycleNameIsNull() {
            addCriterion("SET_CYCLE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSetCycleNameIsNotNull() {
            addCriterion("SET_CYCLE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSetCycleNameEqualTo(String value) {
            addCriterion("SET_CYCLE_NAME =", value, "setCycleName");
            return (Criteria) this;
        }

        public Criteria andSetCycleNameNotEqualTo(String value) {
            addCriterion("SET_CYCLE_NAME <>", value, "setCycleName");
            return (Criteria) this;
        }

        public Criteria andSetCycleNameGreaterThan(String value) {
            addCriterion("SET_CYCLE_NAME >", value, "setCycleName");
            return (Criteria) this;
        }

        public Criteria andSetCycleNameGreaterThanOrEqualTo(String value) {
            addCriterion("SET_CYCLE_NAME >=", value, "setCycleName");
            return (Criteria) this;
        }

        public Criteria andSetCycleNameLessThan(String value) {
            addCriterion("SET_CYCLE_NAME <", value, "setCycleName");
            return (Criteria) this;
        }

        public Criteria andSetCycleNameLessThanOrEqualTo(String value) {
            addCriterion("SET_CYCLE_NAME <=", value, "setCycleName");
            return (Criteria) this;
        }

        public Criteria andSetCycleNameLike(String value) {
            addCriterion("SET_CYCLE_NAME like", value, "setCycleName");
            return (Criteria) this;
        }

        public Criteria andSetCycleNameNotLike(String value) {
            addCriterion("SET_CYCLE_NAME not like", value, "setCycleName");
            return (Criteria) this;
        }

        public Criteria andSetCycleNameIn(List<String> values) {
            addCriterion("SET_CYCLE_NAME in", values, "setCycleName");
            return (Criteria) this;
        }

        public Criteria andSetCycleNameNotIn(List<String> values) {
            addCriterion("SET_CYCLE_NAME not in", values, "setCycleName");
            return (Criteria) this;
        }

        public Criteria andSetCycleNameBetween(String value1, String value2) {
            addCriterion("SET_CYCLE_NAME between", value1, value2, "setCycleName");
            return (Criteria) this;
        }

        public Criteria andSetCycleNameNotBetween(String value1, String value2) {
            addCriterion("SET_CYCLE_NAME not between", value1, value2, "setCycleName");
            return (Criteria) this;
        }

        public Criteria andSetCycleTypeIsNull() {
            addCriterion("SET_CYCLE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andSetCycleTypeIsNotNull() {
            addCriterion("SET_CYCLE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSetCycleTypeEqualTo(String value) {
            addCriterion("SET_CYCLE_TYPE =", value, "setCycleType");
            return (Criteria) this;
        }

        public Criteria andSetCycleTypeNotEqualTo(String value) {
            addCriterion("SET_CYCLE_TYPE <>", value, "setCycleType");
            return (Criteria) this;
        }

        public Criteria andSetCycleTypeGreaterThan(String value) {
            addCriterion("SET_CYCLE_TYPE >", value, "setCycleType");
            return (Criteria) this;
        }

        public Criteria andSetCycleTypeGreaterThanOrEqualTo(String value) {
            addCriterion("SET_CYCLE_TYPE >=", value, "setCycleType");
            return (Criteria) this;
        }

        public Criteria andSetCycleTypeLessThan(String value) {
            addCriterion("SET_CYCLE_TYPE <", value, "setCycleType");
            return (Criteria) this;
        }

        public Criteria andSetCycleTypeLessThanOrEqualTo(String value) {
            addCriterion("SET_CYCLE_TYPE <=", value, "setCycleType");
            return (Criteria) this;
        }

        public Criteria andSetCycleTypeLike(String value) {
            addCriterion("SET_CYCLE_TYPE like", value, "setCycleType");
            return (Criteria) this;
        }

        public Criteria andSetCycleTypeNotLike(String value) {
            addCriterion("SET_CYCLE_TYPE not like", value, "setCycleType");
            return (Criteria) this;
        }

        public Criteria andSetCycleTypeIn(List<String> values) {
            addCriterion("SET_CYCLE_TYPE in", values, "setCycleType");
            return (Criteria) this;
        }

        public Criteria andSetCycleTypeNotIn(List<String> values) {
            addCriterion("SET_CYCLE_TYPE not in", values, "setCycleType");
            return (Criteria) this;
        }

        public Criteria andSetCycleTypeBetween(String value1, String value2) {
            addCriterion("SET_CYCLE_TYPE between", value1, value2, "setCycleType");
            return (Criteria) this;
        }

        public Criteria andSetCycleTypeNotBetween(String value1, String value2) {
            addCriterion("SET_CYCLE_TYPE not between", value1, value2, "setCycleType");
            return (Criteria) this;
        }

        public Criteria andDelayNumIsNull() {
            addCriterion("DELAY_NUM is null");
            return (Criteria) this;
        }

        public Criteria andDelayNumIsNotNull() {
            addCriterion("DELAY_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andDelayNumEqualTo(BigDecimal value) {
            addCriterion("DELAY_NUM =", value, "delayNum");
            return (Criteria) this;
        }

        public Criteria andDelayNumNotEqualTo(BigDecimal value) {
            addCriterion("DELAY_NUM <>", value, "delayNum");
            return (Criteria) this;
        }

        public Criteria andDelayNumGreaterThan(BigDecimal value) {
            addCriterion("DELAY_NUM >", value, "delayNum");
            return (Criteria) this;
        }

        public Criteria andDelayNumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DELAY_NUM >=", value, "delayNum");
            return (Criteria) this;
        }

        public Criteria andDelayNumLessThan(BigDecimal value) {
            addCriterion("DELAY_NUM <", value, "delayNum");
            return (Criteria) this;
        }

        public Criteria andDelayNumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DELAY_NUM <=", value, "delayNum");
            return (Criteria) this;
        }

        public Criteria andDelayNumIn(List<BigDecimal> values) {
            addCriterion("DELAY_NUM in", values, "delayNum");
            return (Criteria) this;
        }

        public Criteria andDelayNumNotIn(List<BigDecimal> values) {
            addCriterion("DELAY_NUM not in", values, "delayNum");
            return (Criteria) this;
        }

        public Criteria andDelayNumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DELAY_NUM between", value1, value2, "delayNum");
            return (Criteria) this;
        }

        public Criteria andDelayNumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DELAY_NUM not between", value1, value2, "delayNum");
            return (Criteria) this;
        }

        public Criteria andSetCycleTimesIsNull() {
            addCriterion("SET_CYCLE_TIMES is null");
            return (Criteria) this;
        }

        public Criteria andSetCycleTimesIsNotNull() {
            addCriterion("SET_CYCLE_TIMES is not null");
            return (Criteria) this;
        }

        public Criteria andSetCycleTimesEqualTo(BigDecimal value) {
            addCriterion("SET_CYCLE_TIMES =", value, "setCycleTimes");
            return (Criteria) this;
        }

        public Criteria andSetCycleTimesNotEqualTo(BigDecimal value) {
            addCriterion("SET_CYCLE_TIMES <>", value, "setCycleTimes");
            return (Criteria) this;
        }

        public Criteria andSetCycleTimesGreaterThan(BigDecimal value) {
            addCriterion("SET_CYCLE_TIMES >", value, "setCycleTimes");
            return (Criteria) this;
        }

        public Criteria andSetCycleTimesGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SET_CYCLE_TIMES >=", value, "setCycleTimes");
            return (Criteria) this;
        }

        public Criteria andSetCycleTimesLessThan(BigDecimal value) {
            addCriterion("SET_CYCLE_TIMES <", value, "setCycleTimes");
            return (Criteria) this;
        }

        public Criteria andSetCycleTimesLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SET_CYCLE_TIMES <=", value, "setCycleTimes");
            return (Criteria) this;
        }

        public Criteria andSetCycleTimesIn(List<BigDecimal> values) {
            addCriterion("SET_CYCLE_TIMES in", values, "setCycleTimes");
            return (Criteria) this;
        }

        public Criteria andSetCycleTimesNotIn(List<BigDecimal> values) {
            addCriterion("SET_CYCLE_TIMES not in", values, "setCycleTimes");
            return (Criteria) this;
        }

        public Criteria andSetCycleTimesBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SET_CYCLE_TIMES between", value1, value2, "setCycleTimes");
            return (Criteria) this;
        }

        public Criteria andSetCycleTimesNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SET_CYCLE_TIMES not between", value1, value2, "setCycleTimes");
            return (Criteria) this;
        }

        public Criteria andForceSetDateIsNull() {
            addCriterion("FORCE_SET_DATE is null");
            return (Criteria) this;
        }

        public Criteria andForceSetDateIsNotNull() {
            addCriterion("FORCE_SET_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andForceSetDateEqualTo(String value) {
            addCriterion("FORCE_SET_DATE =", value, "forceSetDate");
            return (Criteria) this;
        }

        public Criteria andForceSetDateNotEqualTo(String value) {
            addCriterion("FORCE_SET_DATE <>", value, "forceSetDate");
            return (Criteria) this;
        }

        public Criteria andForceSetDateGreaterThan(String value) {
            addCriterion("FORCE_SET_DATE >", value, "forceSetDate");
            return (Criteria) this;
        }

        public Criteria andForceSetDateGreaterThanOrEqualTo(String value) {
            addCriterion("FORCE_SET_DATE >=", value, "forceSetDate");
            return (Criteria) this;
        }

        public Criteria andForceSetDateLessThan(String value) {
            addCriterion("FORCE_SET_DATE <", value, "forceSetDate");
            return (Criteria) this;
        }

        public Criteria andForceSetDateLessThanOrEqualTo(String value) {
            addCriterion("FORCE_SET_DATE <=", value, "forceSetDate");
            return (Criteria) this;
        }

        public Criteria andForceSetDateLike(String value) {
            addCriterion("FORCE_SET_DATE like", value, "forceSetDate");
            return (Criteria) this;
        }

        public Criteria andForceSetDateNotLike(String value) {
            addCriterion("FORCE_SET_DATE not like", value, "forceSetDate");
            return (Criteria) this;
        }

        public Criteria andForceSetDateIn(List<String> values) {
            addCriterion("FORCE_SET_DATE in", values, "forceSetDate");
            return (Criteria) this;
        }

        public Criteria andForceSetDateNotIn(List<String> values) {
            addCriterion("FORCE_SET_DATE not in", values, "forceSetDate");
            return (Criteria) this;
        }

        public Criteria andForceSetDateBetween(String value1, String value2) {
            addCriterion("FORCE_SET_DATE between", value1, value2, "forceSetDate");
            return (Criteria) this;
        }

        public Criteria andForceSetDateNotBetween(String value1, String value2) {
            addCriterion("FORCE_SET_DATE not between", value1, value2, "forceSetDate");
            return (Criteria) this;
        }

        public Criteria andModifierIsNull() {
            addCriterion("MODIFIER is null");
            return (Criteria) this;
        }

        public Criteria andModifierIsNotNull() {
            addCriterion("MODIFIER is not null");
            return (Criteria) this;
        }

        public Criteria andModifierEqualTo(String value) {
            addCriterion("MODIFIER =", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotEqualTo(String value) {
            addCriterion("MODIFIER <>", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThan(String value) {
            addCriterion("MODIFIER >", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThanOrEqualTo(String value) {
            addCriterion("MODIFIER >=", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThan(String value) {
            addCriterion("MODIFIER <", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThanOrEqualTo(String value) {
            addCriterion("MODIFIER <=", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLike(String value) {
            addCriterion("MODIFIER like", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotLike(String value) {
            addCriterion("MODIFIER not like", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierIn(List<String> values) {
            addCriterion("MODIFIER in", values, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotIn(List<String> values) {
            addCriterion("MODIFIER not in", values, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierBetween(String value1, String value2) {
            addCriterion("MODIFIER between", value1, value2, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotBetween(String value1, String value2) {
            addCriterion("MODIFIER not between", value1, value2, "modifier");
            return (Criteria) this;
        }

        public Criteria andCreatedDateIsNull() {
            addCriterion("CREATED_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCreatedDateIsNotNull() {
            addCriterion("CREATED_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedDateEqualTo(Date value) {
            addCriterion("CREATED_DATE =", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateNotEqualTo(Date value) {
            addCriterion("CREATED_DATE <>", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateGreaterThan(Date value) {
            addCriterion("CREATED_DATE >", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATED_DATE >=", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateLessThan(Date value) {
            addCriterion("CREATED_DATE <", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateLessThanOrEqualTo(Date value) {
            addCriterion("CREATED_DATE <=", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateIn(List<Date> values) {
            addCriterion("CREATED_DATE in", values, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateNotIn(List<Date> values) {
            addCriterion("CREATED_DATE not in", values, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateBetween(Date value1, Date value2) {
            addCriterion("CREATED_DATE between", value1, value2, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateNotBetween(Date value1, Date value2) {
            addCriterion("CREATED_DATE not between", value1, value2, "createdDate");
            return (Criteria) this;
        }

        public Criteria andModifiedDateIsNull() {
            addCriterion("MODIFIED_DATE is null");
            return (Criteria) this;
        }

        public Criteria andModifiedDateIsNotNull() {
            addCriterion("MODIFIED_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andModifiedDateEqualTo(Date value) {
            addCriterion("MODIFIED_DATE =", value, "modifiedDate");
            return (Criteria) this;
        }

        public Criteria andModifiedDateNotEqualTo(Date value) {
            addCriterion("MODIFIED_DATE <>", value, "modifiedDate");
            return (Criteria) this;
        }

        public Criteria andModifiedDateGreaterThan(Date value) {
            addCriterion("MODIFIED_DATE >", value, "modifiedDate");
            return (Criteria) this;
        }

        public Criteria andModifiedDateGreaterThanOrEqualTo(Date value) {
            addCriterion("MODIFIED_DATE >=", value, "modifiedDate");
            return (Criteria) this;
        }

        public Criteria andModifiedDateLessThan(Date value) {
            addCriterion("MODIFIED_DATE <", value, "modifiedDate");
            return (Criteria) this;
        }

        public Criteria andModifiedDateLessThanOrEqualTo(Date value) {
            addCriterion("MODIFIED_DATE <=", value, "modifiedDate");
            return (Criteria) this;
        }

        public Criteria andModifiedDateIn(List<Date> values) {
            addCriterion("MODIFIED_DATE in", values, "modifiedDate");
            return (Criteria) this;
        }

        public Criteria andModifiedDateNotIn(List<Date> values) {
            addCriterion("MODIFIED_DATE not in", values, "modifiedDate");
            return (Criteria) this;
        }

        public Criteria andModifiedDateBetween(Date value1, Date value2) {
            addCriterion("MODIFIED_DATE between", value1, value2, "modifiedDate");
            return (Criteria) this;
        }

        public Criteria andModifiedDateNotBetween(Date value1, Date value2) {
            addCriterion("MODIFIED_DATE not between", value1, value2, "modifiedDate");
            return (Criteria) this;
        }

        public Criteria andSetCycleStartDateIsNull() {
            addCriterion("SET_CYCLE_START_DATE is null");
            return (Criteria) this;
        }

        public Criteria andSetCycleStartDateIsNotNull() {
            addCriterion("SET_CYCLE_START_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andSetCycleStartDateEqualTo(BigDecimal value) {
            addCriterion("SET_CYCLE_START_DATE =", value, "setCycleStartDate");
            return (Criteria) this;
        }

        public Criteria andSetCycleStartDateNotEqualTo(BigDecimal value) {
            addCriterion("SET_CYCLE_START_DATE <>", value, "setCycleStartDate");
            return (Criteria) this;
        }

        public Criteria andSetCycleStartDateGreaterThan(BigDecimal value) {
            addCriterion("SET_CYCLE_START_DATE >", value, "setCycleStartDate");
            return (Criteria) this;
        }

        public Criteria andSetCycleStartDateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SET_CYCLE_START_DATE >=", value, "setCycleStartDate");
            return (Criteria) this;
        }

        public Criteria andSetCycleStartDateLessThan(BigDecimal value) {
            addCriterion("SET_CYCLE_START_DATE <", value, "setCycleStartDate");
            return (Criteria) this;
        }

        public Criteria andSetCycleStartDateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SET_CYCLE_START_DATE <=", value, "setCycleStartDate");
            return (Criteria) this;
        }

        public Criteria andSetCycleStartDateIn(List<BigDecimal> values) {
            addCriterion("SET_CYCLE_START_DATE in", values, "setCycleStartDate");
            return (Criteria) this;
        }

        public Criteria andSetCycleStartDateNotIn(List<BigDecimal> values) {
            addCriterion("SET_CYCLE_START_DATE not in", values, "setCycleStartDate");
            return (Criteria) this;
        }

        public Criteria andSetCycleStartDateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SET_CYCLE_START_DATE between", value1, value2, "setCycleStartDate");
            return (Criteria) this;
        }

        public Criteria andSetCycleStartDateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SET_CYCLE_START_DATE not between", value1, value2, "setCycleStartDate");
            return (Criteria) this;
        }

        public Criteria andManySetTimesIsNull() {
            addCriterion("MANY_SET_TIMES is null");
            return (Criteria) this;
        }

        public Criteria andManySetTimesIsNotNull() {
            addCriterion("MANY_SET_TIMES is not null");
            return (Criteria) this;
        }

        public Criteria andManySetTimesEqualTo(String value) {
            addCriterion("MANY_SET_TIMES =", value, "manySetTimes");
            return (Criteria) this;
        }

        public Criteria andManySetTimesNotEqualTo(String value) {
            addCriterion("MANY_SET_TIMES <>", value, "manySetTimes");
            return (Criteria) this;
        }

        public Criteria andManySetTimesGreaterThan(String value) {
            addCriterion("MANY_SET_TIMES >", value, "manySetTimes");
            return (Criteria) this;
        }

        public Criteria andManySetTimesGreaterThanOrEqualTo(String value) {
            addCriterion("MANY_SET_TIMES >=", value, "manySetTimes");
            return (Criteria) this;
        }

        public Criteria andManySetTimesLessThan(String value) {
            addCriterion("MANY_SET_TIMES <", value, "manySetTimes");
            return (Criteria) this;
        }

        public Criteria andManySetTimesLessThanOrEqualTo(String value) {
            addCriterion("MANY_SET_TIMES <=", value, "manySetTimes");
            return (Criteria) this;
        }

        public Criteria andManySetTimesLike(String value) {
            addCriterion("MANY_SET_TIMES like", value, "manySetTimes");
            return (Criteria) this;
        }

        public Criteria andManySetTimesNotLike(String value) {
            addCriterion("MANY_SET_TIMES not like", value, "manySetTimes");
            return (Criteria) this;
        }

        public Criteria andManySetTimesIn(List<String> values) {
            addCriterion("MANY_SET_TIMES in", values, "manySetTimes");
            return (Criteria) this;
        }

        public Criteria andManySetTimesNotIn(List<String> values) {
            addCriterion("MANY_SET_TIMES not in", values, "manySetTimes");
            return (Criteria) this;
        }

        public Criteria andManySetTimesBetween(String value1, String value2) {
            addCriterion("MANY_SET_TIMES between", value1, value2, "manySetTimes");
            return (Criteria) this;
        }

        public Criteria andManySetTimesNotBetween(String value1, String value2) {
            addCriterion("MANY_SET_TIMES not between", value1, value2, "manySetTimes");
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