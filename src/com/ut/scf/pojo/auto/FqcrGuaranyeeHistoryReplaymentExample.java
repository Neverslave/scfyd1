package com.ut.scf.pojo.auto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class FqcrGuaranyeeHistoryReplaymentExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table fqcr_guaranyee_history_replayment
     *
     * @mbg.generated Mon Jul 16 10:50:42 GMT+08:00 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table fqcr_guaranyee_history_replayment
     *
     * @mbg.generated Mon Jul 16 10:50:42 GMT+08:00 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table fqcr_guaranyee_history_replayment
     *
     * @mbg.generated Mon Jul 16 10:50:42 GMT+08:00 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fqcr_guaranyee_history_replayment
     *
     * @mbg.generated Mon Jul 16 10:50:42 GMT+08:00 2018
     */
    public FqcrGuaranyeeHistoryReplaymentExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fqcr_guaranyee_history_replayment
     *
     * @mbg.generated Mon Jul 16 10:50:42 GMT+08:00 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fqcr_guaranyee_history_replayment
     *
     * @mbg.generated Mon Jul 16 10:50:42 GMT+08:00 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fqcr_guaranyee_history_replayment
     *
     * @mbg.generated Mon Jul 16 10:50:42 GMT+08:00 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fqcr_guaranyee_history_replayment
     *
     * @mbg.generated Mon Jul 16 10:50:42 GMT+08:00 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fqcr_guaranyee_history_replayment
     *
     * @mbg.generated Mon Jul 16 10:50:42 GMT+08:00 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fqcr_guaranyee_history_replayment
     *
     * @mbg.generated Mon Jul 16 10:50:42 GMT+08:00 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fqcr_guaranyee_history_replayment
     *
     * @mbg.generated Mon Jul 16 10:50:42 GMT+08:00 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fqcr_guaranyee_history_replayment
     *
     * @mbg.generated Mon Jul 16 10:50:42 GMT+08:00 2018
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fqcr_guaranyee_history_replayment
     *
     * @mbg.generated Mon Jul 16 10:50:42 GMT+08:00 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fqcr_guaranyee_history_replayment
     *
     * @mbg.generated Mon Jul 16 10:50:42 GMT+08:00 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table fqcr_guaranyee_history_replayment
     *
     * @mbg.generated Mon Jul 16 10:50:42 GMT+08:00 2018
     */
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCashIdIsNull() {
            addCriterion("cash_id is null");
            return (Criteria) this;
        }

        public Criteria andCashIdIsNotNull() {
            addCriterion("cash_id is not null");
            return (Criteria) this;
        }

        public Criteria andCashIdEqualTo(String value) {
            addCriterion("cash_id =", value, "cashId");
            return (Criteria) this;
        }

        public Criteria andCashIdNotEqualTo(String value) {
            addCriterion("cash_id <>", value, "cashId");
            return (Criteria) this;
        }

        public Criteria andCashIdGreaterThan(String value) {
            addCriterion("cash_id >", value, "cashId");
            return (Criteria) this;
        }

        public Criteria andCashIdGreaterThanOrEqualTo(String value) {
            addCriterion("cash_id >=", value, "cashId");
            return (Criteria) this;
        }

        public Criteria andCashIdLessThan(String value) {
            addCriterion("cash_id <", value, "cashId");
            return (Criteria) this;
        }

        public Criteria andCashIdLessThanOrEqualTo(String value) {
            addCriterion("cash_id <=", value, "cashId");
            return (Criteria) this;
        }

        public Criteria andCashIdLike(String value) {
            addCriterion("cash_id like", value, "cashId");
            return (Criteria) this;
        }

        public Criteria andCashIdNotLike(String value) {
            addCriterion("cash_id not like", value, "cashId");
            return (Criteria) this;
        }

        public Criteria andCashIdIn(List<String> values) {
            addCriterion("cash_id in", values, "cashId");
            return (Criteria) this;
        }

        public Criteria andCashIdNotIn(List<String> values) {
            addCriterion("cash_id not in", values, "cashId");
            return (Criteria) this;
        }

        public Criteria andCashIdBetween(String value1, String value2) {
            addCriterion("cash_id between", value1, value2, "cashId");
            return (Criteria) this;
        }

        public Criteria andCashIdNotBetween(String value1, String value2) {
            addCriterion("cash_id not between", value1, value2, "cashId");
            return (Criteria) this;
        }

        public Criteria andReplaymentIdIsNull() {
            addCriterion("replayment_id is null");
            return (Criteria) this;
        }

        public Criteria andReplaymentIdIsNotNull() {
            addCriterion("replayment_id is not null");
            return (Criteria) this;
        }

        public Criteria andReplaymentIdEqualTo(String value) {
            addCriterion("replayment_id =", value, "replaymentId");
            return (Criteria) this;
        }

        public Criteria andReplaymentIdNotEqualTo(String value) {
            addCriterion("replayment_id <>", value, "replaymentId");
            return (Criteria) this;
        }

        public Criteria andReplaymentIdGreaterThan(String value) {
            addCriterion("replayment_id >", value, "replaymentId");
            return (Criteria) this;
        }

        public Criteria andReplaymentIdGreaterThanOrEqualTo(String value) {
            addCriterion("replayment_id >=", value, "replaymentId");
            return (Criteria) this;
        }

        public Criteria andReplaymentIdLessThan(String value) {
            addCriterion("replayment_id <", value, "replaymentId");
            return (Criteria) this;
        }

        public Criteria andReplaymentIdLessThanOrEqualTo(String value) {
            addCriterion("replayment_id <=", value, "replaymentId");
            return (Criteria) this;
        }

        public Criteria andReplaymentIdLike(String value) {
            addCriterion("replayment_id like", value, "replaymentId");
            return (Criteria) this;
        }

        public Criteria andReplaymentIdNotLike(String value) {
            addCriterion("replayment_id not like", value, "replaymentId");
            return (Criteria) this;
        }

        public Criteria andReplaymentIdIn(List<String> values) {
            addCriterion("replayment_id in", values, "replaymentId");
            return (Criteria) this;
        }

        public Criteria andReplaymentIdNotIn(List<String> values) {
            addCriterion("replayment_id not in", values, "replaymentId");
            return (Criteria) this;
        }

        public Criteria andReplaymentIdBetween(String value1, String value2) {
            addCriterion("replayment_id between", value1, value2, "replaymentId");
            return (Criteria) this;
        }

        public Criteria andReplaymentIdNotBetween(String value1, String value2) {
            addCriterion("replayment_id not between", value1, value2, "replaymentId");
            return (Criteria) this;
        }

        public Criteria andReplaymentGuaranteeMoneyIsNull() {
            addCriterion("replayment_guarantee_money is null");
            return (Criteria) this;
        }

        public Criteria andReplaymentGuaranteeMoneyIsNotNull() {
            addCriterion("replayment_guarantee_money is not null");
            return (Criteria) this;
        }

        public Criteria andReplaymentGuaranteeMoneyEqualTo(BigDecimal value) {
            addCriterion("replayment_guarantee_money =", value, "replaymentGuaranteeMoney");
            return (Criteria) this;
        }

        public Criteria andReplaymentGuaranteeMoneyNotEqualTo(BigDecimal value) {
            addCriterion("replayment_guarantee_money <>", value, "replaymentGuaranteeMoney");
            return (Criteria) this;
        }

        public Criteria andReplaymentGuaranteeMoneyGreaterThan(BigDecimal value) {
            addCriterion("replayment_guarantee_money >", value, "replaymentGuaranteeMoney");
            return (Criteria) this;
        }

        public Criteria andReplaymentGuaranteeMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("replayment_guarantee_money >=", value, "replaymentGuaranteeMoney");
            return (Criteria) this;
        }

        public Criteria andReplaymentGuaranteeMoneyLessThan(BigDecimal value) {
            addCriterion("replayment_guarantee_money <", value, "replaymentGuaranteeMoney");
            return (Criteria) this;
        }

        public Criteria andReplaymentGuaranteeMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("replayment_guarantee_money <=", value, "replaymentGuaranteeMoney");
            return (Criteria) this;
        }

        public Criteria andReplaymentGuaranteeMoneyIn(List<BigDecimal> values) {
            addCriterion("replayment_guarantee_money in", values, "replaymentGuaranteeMoney");
            return (Criteria) this;
        }

        public Criteria andReplaymentGuaranteeMoneyNotIn(List<BigDecimal> values) {
            addCriterion("replayment_guarantee_money not in", values, "replaymentGuaranteeMoney");
            return (Criteria) this;
        }

        public Criteria andReplaymentGuaranteeMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("replayment_guarantee_money between", value1, value2, "replaymentGuaranteeMoney");
            return (Criteria) this;
        }

        public Criteria andReplaymentGuaranteeMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("replayment_guarantee_money not between", value1, value2, "replaymentGuaranteeMoney");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table fqcr_guaranyee_history_replayment
     *
     * @mbg.generated do_not_delete_during_merge Mon Jul 16 10:50:42 GMT+08:00 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table fqcr_guaranyee_history_replayment
     *
     * @mbg.generated Mon Jul 16 10:50:42 GMT+08:00 2018
     */
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