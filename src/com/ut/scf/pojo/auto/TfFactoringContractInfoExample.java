package com.ut.scf.pojo.auto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TfFactoringContractInfoExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tf_factoring_contract_info
     *
     * @mbggenerated Fri Oct 27 09:40:13 CST 2017
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tf_factoring_contract_info
     *
     * @mbggenerated Fri Oct 27 09:40:13 CST 2017
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tf_factoring_contract_info
     *
     * @mbggenerated Fri Oct 27 09:40:13 CST 2017
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tf_factoring_contract_info
     *
     * @mbggenerated Fri Oct 27 09:40:13 CST 2017
     */
    public TfFactoringContractInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tf_factoring_contract_info
     *
     * @mbggenerated Fri Oct 27 09:40:13 CST 2017
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tf_factoring_contract_info
     *
     * @mbggenerated Fri Oct 27 09:40:13 CST 2017
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tf_factoring_contract_info
     *
     * @mbggenerated Fri Oct 27 09:40:13 CST 2017
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tf_factoring_contract_info
     *
     * @mbggenerated Fri Oct 27 09:40:13 CST 2017
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tf_factoring_contract_info
     *
     * @mbggenerated Fri Oct 27 09:40:13 CST 2017
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tf_factoring_contract_info
     *
     * @mbggenerated Fri Oct 27 09:40:13 CST 2017
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tf_factoring_contract_info
     *
     * @mbggenerated Fri Oct 27 09:40:13 CST 2017
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tf_factoring_contract_info
     *
     * @mbggenerated Fri Oct 27 09:40:13 CST 2017
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
     * This method corresponds to the database table tf_factoring_contract_info
     *
     * @mbggenerated Fri Oct 27 09:40:13 CST 2017
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tf_factoring_contract_info
     *
     * @mbggenerated Fri Oct 27 09:40:13 CST 2017
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tf_factoring_contract_info
     *
     * @mbggenerated Fri Oct 27 09:40:13 CST 2017
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

        public Criteria andFactoringContractNoIsNull() {
            addCriterion("factoring_contract_no is null");
            return (Criteria) this;
        }

        public Criteria andFactoringContractNoIsNotNull() {
            addCriterion("factoring_contract_no is not null");
            return (Criteria) this;
        }

        public Criteria andFactoringContractNoEqualTo(String value) {
            addCriterion("factoring_contract_no =", value, "factoringContractNo");
            return (Criteria) this;
        }

        public Criteria andFactoringContractNoNotEqualTo(String value) {
            addCriterion("factoring_contract_no <>", value, "factoringContractNo");
            return (Criteria) this;
        }

        public Criteria andFactoringContractNoGreaterThan(String value) {
            addCriterion("factoring_contract_no >", value, "factoringContractNo");
            return (Criteria) this;
        }

        public Criteria andFactoringContractNoGreaterThanOrEqualTo(String value) {
            addCriterion("factoring_contract_no >=", value, "factoringContractNo");
            return (Criteria) this;
        }

        public Criteria andFactoringContractNoLessThan(String value) {
            addCriterion("factoring_contract_no <", value, "factoringContractNo");
            return (Criteria) this;
        }

        public Criteria andFactoringContractNoLessThanOrEqualTo(String value) {
            addCriterion("factoring_contract_no <=", value, "factoringContractNo");
            return (Criteria) this;
        }

        public Criteria andFactoringContractNoLike(String value) {
            addCriterion("factoring_contract_no like", value, "factoringContractNo");
            return (Criteria) this;
        }

        public Criteria andFactoringContractNoNotLike(String value) {
            addCriterion("factoring_contract_no not like", value, "factoringContractNo");
            return (Criteria) this;
        }

        public Criteria andFactoringContractNoIn(List<String> values) {
            addCriterion("factoring_contract_no in", values, "factoringContractNo");
            return (Criteria) this;
        }

        public Criteria andFactoringContractNoNotIn(List<String> values) {
            addCriterion("factoring_contract_no not in", values, "factoringContractNo");
            return (Criteria) this;
        }

        public Criteria andFactoringContractNoBetween(String value1, String value2) {
            addCriterion("factoring_contract_no between", value1, value2, "factoringContractNo");
            return (Criteria) this;
        }

        public Criteria andFactoringContractNoNotBetween(String value1, String value2) {
            addCriterion("factoring_contract_no not between", value1, value2, "factoringContractNo");
            return (Criteria) this;
        }

        public Criteria andProjectIdIsNull() {
            addCriterion("project_id is null");
            return (Criteria) this;
        }

        public Criteria andProjectIdIsNotNull() {
            addCriterion("project_id is not null");
            return (Criteria) this;
        }

        public Criteria andProjectIdEqualTo(String value) {
            addCriterion("project_id =", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotEqualTo(String value) {
            addCriterion("project_id <>", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThan(String value) {
            addCriterion("project_id >", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThanOrEqualTo(String value) {
            addCriterion("project_id >=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThan(String value) {
            addCriterion("project_id <", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThanOrEqualTo(String value) {
            addCriterion("project_id <=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLike(String value) {
            addCriterion("project_id like", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotLike(String value) {
            addCriterion("project_id not like", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdIn(List<String> values) {
            addCriterion("project_id in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotIn(List<String> values) {
            addCriterion("project_id not in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdBetween(String value1, String value2) {
            addCriterion("project_id between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotBetween(String value1, String value2) {
            addCriterion("project_id not between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andFactoringContractNameIsNull() {
            addCriterion("factoring_contract_name is null");
            return (Criteria) this;
        }

        public Criteria andFactoringContractNameIsNotNull() {
            addCriterion("factoring_contract_name is not null");
            return (Criteria) this;
        }

        public Criteria andFactoringContractNameEqualTo(String value) {
            addCriterion("factoring_contract_name =", value, "factoringContractName");
            return (Criteria) this;
        }

        public Criteria andFactoringContractNameNotEqualTo(String value) {
            addCriterion("factoring_contract_name <>", value, "factoringContractName");
            return (Criteria) this;
        }

        public Criteria andFactoringContractNameGreaterThan(String value) {
            addCriterion("factoring_contract_name >", value, "factoringContractName");
            return (Criteria) this;
        }

        public Criteria andFactoringContractNameGreaterThanOrEqualTo(String value) {
            addCriterion("factoring_contract_name >=", value, "factoringContractName");
            return (Criteria) this;
        }

        public Criteria andFactoringContractNameLessThan(String value) {
            addCriterion("factoring_contract_name <", value, "factoringContractName");
            return (Criteria) this;
        }

        public Criteria andFactoringContractNameLessThanOrEqualTo(String value) {
            addCriterion("factoring_contract_name <=", value, "factoringContractName");
            return (Criteria) this;
        }

        public Criteria andFactoringContractNameLike(String value) {
            addCriterion("factoring_contract_name like", value, "factoringContractName");
            return (Criteria) this;
        }

        public Criteria andFactoringContractNameNotLike(String value) {
            addCriterion("factoring_contract_name not like", value, "factoringContractName");
            return (Criteria) this;
        }

        public Criteria andFactoringContractNameIn(List<String> values) {
            addCriterion("factoring_contract_name in", values, "factoringContractName");
            return (Criteria) this;
        }

        public Criteria andFactoringContractNameNotIn(List<String> values) {
            addCriterion("factoring_contract_name not in", values, "factoringContractName");
            return (Criteria) this;
        }

        public Criteria andFactoringContractNameBetween(String value1, String value2) {
            addCriterion("factoring_contract_name between", value1, value2, "factoringContractName");
            return (Criteria) this;
        }

        public Criteria andFactoringContractNameNotBetween(String value1, String value2) {
            addCriterion("factoring_contract_name not between", value1, value2, "factoringContractName");
            return (Criteria) this;
        }

        public Criteria andFactoringContractTermIsNull() {
            addCriterion("factoring_contract_term is null");
            return (Criteria) this;
        }

        public Criteria andFactoringContractTermIsNotNull() {
            addCriterion("factoring_contract_term is not null");
            return (Criteria) this;
        }

        public Criteria andFactoringContractTermEqualTo(Integer value) {
            addCriterion("factoring_contract_term =", value, "factoringContractTerm");
            return (Criteria) this;
        }

        public Criteria andFactoringContractTermNotEqualTo(Integer value) {
            addCriterion("factoring_contract_term <>", value, "factoringContractTerm");
            return (Criteria) this;
        }

        public Criteria andFactoringContractTermGreaterThan(Integer value) {
            addCriterion("factoring_contract_term >", value, "factoringContractTerm");
            return (Criteria) this;
        }

        public Criteria andFactoringContractTermGreaterThanOrEqualTo(Integer value) {
            addCriterion("factoring_contract_term >=", value, "factoringContractTerm");
            return (Criteria) this;
        }

        public Criteria andFactoringContractTermLessThan(Integer value) {
            addCriterion("factoring_contract_term <", value, "factoringContractTerm");
            return (Criteria) this;
        }

        public Criteria andFactoringContractTermLessThanOrEqualTo(Integer value) {
            addCriterion("factoring_contract_term <=", value, "factoringContractTerm");
            return (Criteria) this;
        }

        public Criteria andFactoringContractTermIn(List<Integer> values) {
            addCriterion("factoring_contract_term in", values, "factoringContractTerm");
            return (Criteria) this;
        }

        public Criteria andFactoringContractTermNotIn(List<Integer> values) {
            addCriterion("factoring_contract_term not in", values, "factoringContractTerm");
            return (Criteria) this;
        }

        public Criteria andFactoringContractTermBetween(Integer value1, Integer value2) {
            addCriterion("factoring_contract_term between", value1, value2, "factoringContractTerm");
            return (Criteria) this;
        }

        public Criteria andFactoringContractTermNotBetween(Integer value1, Integer value2) {
            addCriterion("factoring_contract_term not between", value1, value2, "factoringContractTerm");
            return (Criteria) this;
        }

        public Criteria andFactoringContractNoteIsNull() {
            addCriterion("factoring_contract_note is null");
            return (Criteria) this;
        }

        public Criteria andFactoringContractNoteIsNotNull() {
            addCriterion("factoring_contract_note is not null");
            return (Criteria) this;
        }

        public Criteria andFactoringContractNoteEqualTo(String value) {
            addCriterion("factoring_contract_note =", value, "factoringContractNote");
            return (Criteria) this;
        }

        public Criteria andFactoringContractNoteNotEqualTo(String value) {
            addCriterion("factoring_contract_note <>", value, "factoringContractNote");
            return (Criteria) this;
        }

        public Criteria andFactoringContractNoteGreaterThan(String value) {
            addCriterion("factoring_contract_note >", value, "factoringContractNote");
            return (Criteria) this;
        }

        public Criteria andFactoringContractNoteGreaterThanOrEqualTo(String value) {
            addCriterion("factoring_contract_note >=", value, "factoringContractNote");
            return (Criteria) this;
        }

        public Criteria andFactoringContractNoteLessThan(String value) {
            addCriterion("factoring_contract_note <", value, "factoringContractNote");
            return (Criteria) this;
        }

        public Criteria andFactoringContractNoteLessThanOrEqualTo(String value) {
            addCriterion("factoring_contract_note <=", value, "factoringContractNote");
            return (Criteria) this;
        }

        public Criteria andFactoringContractNoteLike(String value) {
            addCriterion("factoring_contract_note like", value, "factoringContractNote");
            return (Criteria) this;
        }

        public Criteria andFactoringContractNoteNotLike(String value) {
            addCriterion("factoring_contract_note not like", value, "factoringContractNote");
            return (Criteria) this;
        }

        public Criteria andFactoringContractNoteIn(List<String> values) {
            addCriterion("factoring_contract_note in", values, "factoringContractNote");
            return (Criteria) this;
        }

        public Criteria andFactoringContractNoteNotIn(List<String> values) {
            addCriterion("factoring_contract_note not in", values, "factoringContractNote");
            return (Criteria) this;
        }

        public Criteria andFactoringContractNoteBetween(String value1, String value2) {
            addCriterion("factoring_contract_note between", value1, value2, "factoringContractNote");
            return (Criteria) this;
        }

        public Criteria andFactoringContractNoteNotBetween(String value1, String value2) {
            addCriterion("factoring_contract_note not between", value1, value2, "factoringContractNote");
            return (Criteria) this;
        }

        public Criteria andFinancingMainIsNull() {
            addCriterion("financing_main is null");
            return (Criteria) this;
        }

        public Criteria andFinancingMainIsNotNull() {
            addCriterion("financing_main is not null");
            return (Criteria) this;
        }

        public Criteria andFinancingMainEqualTo(String value) {
            addCriterion("financing_main =", value, "financingMain");
            return (Criteria) this;
        }

        public Criteria andFinancingMainNotEqualTo(String value) {
            addCriterion("financing_main <>", value, "financingMain");
            return (Criteria) this;
        }

        public Criteria andFinancingMainGreaterThan(String value) {
            addCriterion("financing_main >", value, "financingMain");
            return (Criteria) this;
        }

        public Criteria andFinancingMainGreaterThanOrEqualTo(String value) {
            addCriterion("financing_main >=", value, "financingMain");
            return (Criteria) this;
        }

        public Criteria andFinancingMainLessThan(String value) {
            addCriterion("financing_main <", value, "financingMain");
            return (Criteria) this;
        }

        public Criteria andFinancingMainLessThanOrEqualTo(String value) {
            addCriterion("financing_main <=", value, "financingMain");
            return (Criteria) this;
        }

        public Criteria andFinancingMainLike(String value) {
            addCriterion("financing_main like", value, "financingMain");
            return (Criteria) this;
        }

        public Criteria andFinancingMainNotLike(String value) {
            addCriterion("financing_main not like", value, "financingMain");
            return (Criteria) this;
        }

        public Criteria andFinancingMainIn(List<String> values) {
            addCriterion("financing_main in", values, "financingMain");
            return (Criteria) this;
        }

        public Criteria andFinancingMainNotIn(List<String> values) {
            addCriterion("financing_main not in", values, "financingMain");
            return (Criteria) this;
        }

        public Criteria andFinancingMainBetween(String value1, String value2) {
            addCriterion("financing_main between", value1, value2, "financingMain");
            return (Criteria) this;
        }

        public Criteria andFinancingMainNotBetween(String value1, String value2) {
            addCriterion("financing_main not between", value1, value2, "financingMain");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tf_factoring_contract_info
     *
     * @mbggenerated do_not_delete_during_merge Fri Oct 27 09:40:13 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tf_factoring_contract_info
     *
     * @mbggenerated Fri Oct 27 09:40:13 CST 2017
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