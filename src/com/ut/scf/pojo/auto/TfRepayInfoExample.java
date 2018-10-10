package com.ut.scf.pojo.auto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TfRepayInfoExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table tf_repay_info
	 * @mbggenerated  Fri Nov 24 10:04:57 CST 2017
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table tf_repay_info
	 * @mbggenerated  Fri Nov 24 10:04:57 CST 2017
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table tf_repay_info
	 * @mbggenerated  Fri Nov 24 10:04:57 CST 2017
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tf_repay_info
	 * @mbggenerated  Fri Nov 24 10:04:57 CST 2017
	 */
	public TfRepayInfoExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tf_repay_info
	 * @mbggenerated  Fri Nov 24 10:04:57 CST 2017
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tf_repay_info
	 * @mbggenerated  Fri Nov 24 10:04:57 CST 2017
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tf_repay_info
	 * @mbggenerated  Fri Nov 24 10:04:57 CST 2017
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tf_repay_info
	 * @mbggenerated  Fri Nov 24 10:04:57 CST 2017
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tf_repay_info
	 * @mbggenerated  Fri Nov 24 10:04:57 CST 2017
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tf_repay_info
	 * @mbggenerated  Fri Nov 24 10:04:57 CST 2017
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tf_repay_info
	 * @mbggenerated  Fri Nov 24 10:04:57 CST 2017
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tf_repay_info
	 * @mbggenerated  Fri Nov 24 10:04:57 CST 2017
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tf_repay_info
	 * @mbggenerated  Fri Nov 24 10:04:57 CST 2017
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tf_repay_info
	 * @mbggenerated  Fri Nov 24 10:04:57 CST 2017
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table tf_repay_info
	 * @mbggenerated  Fri Nov 24 10:04:57 CST 2017
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

		protected void addCriterion(String condition, Object value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1,
				Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
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

		public Criteria andLoanIdIsNull() {
			addCriterion("loan_id is null");
			return (Criteria) this;
		}

		public Criteria andLoanIdIsNotNull() {
			addCriterion("loan_id is not null");
			return (Criteria) this;
		}

		public Criteria andLoanIdEqualTo(String value) {
			addCriterion("loan_id =", value, "loanId");
			return (Criteria) this;
		}

		public Criteria andLoanIdNotEqualTo(String value) {
			addCriterion("loan_id <>", value, "loanId");
			return (Criteria) this;
		}

		public Criteria andLoanIdGreaterThan(String value) {
			addCriterion("loan_id >", value, "loanId");
			return (Criteria) this;
		}

		public Criteria andLoanIdGreaterThanOrEqualTo(String value) {
			addCriterion("loan_id >=", value, "loanId");
			return (Criteria) this;
		}

		public Criteria andLoanIdLessThan(String value) {
			addCriterion("loan_id <", value, "loanId");
			return (Criteria) this;
		}

		public Criteria andLoanIdLessThanOrEqualTo(String value) {
			addCriterion("loan_id <=", value, "loanId");
			return (Criteria) this;
		}

		public Criteria andLoanIdLike(String value) {
			addCriterion("loan_id like", value, "loanId");
			return (Criteria) this;
		}

		public Criteria andLoanIdNotLike(String value) {
			addCriterion("loan_id not like", value, "loanId");
			return (Criteria) this;
		}

		public Criteria andLoanIdIn(List<String> values) {
			addCriterion("loan_id in", values, "loanId");
			return (Criteria) this;
		}

		public Criteria andLoanIdNotIn(List<String> values) {
			addCriterion("loan_id not in", values, "loanId");
			return (Criteria) this;
		}

		public Criteria andLoanIdBetween(String value1, String value2) {
			addCriterion("loan_id between", value1, value2, "loanId");
			return (Criteria) this;
		}

		public Criteria andLoanIdNotBetween(String value1, String value2) {
			addCriterion("loan_id not between", value1, value2, "loanId");
			return (Criteria) this;
		}

		public Criteria andAccountNoIsNull() {
			addCriterion("account_no is null");
			return (Criteria) this;
		}

		public Criteria andAccountNoIsNotNull() {
			addCriterion("account_no is not null");
			return (Criteria) this;
		}

		public Criteria andAccountNoEqualTo(String value) {
			addCriterion("account_no =", value, "accountNo");
			return (Criteria) this;
		}

		public Criteria andAccountNoNotEqualTo(String value) {
			addCriterion("account_no <>", value, "accountNo");
			return (Criteria) this;
		}

		public Criteria andAccountNoGreaterThan(String value) {
			addCriterion("account_no >", value, "accountNo");
			return (Criteria) this;
		}

		public Criteria andAccountNoGreaterThanOrEqualTo(String value) {
			addCriterion("account_no >=", value, "accountNo");
			return (Criteria) this;
		}

		public Criteria andAccountNoLessThan(String value) {
			addCriterion("account_no <", value, "accountNo");
			return (Criteria) this;
		}

		public Criteria andAccountNoLessThanOrEqualTo(String value) {
			addCriterion("account_no <=", value, "accountNo");
			return (Criteria) this;
		}

		public Criteria andAccountNoLike(String value) {
			addCriterion("account_no like", value, "accountNo");
			return (Criteria) this;
		}

		public Criteria andAccountNoNotLike(String value) {
			addCriterion("account_no not like", value, "accountNo");
			return (Criteria) this;
		}

		public Criteria andAccountNoIn(List<String> values) {
			addCriterion("account_no in", values, "accountNo");
			return (Criteria) this;
		}

		public Criteria andAccountNoNotIn(List<String> values) {
			addCriterion("account_no not in", values, "accountNo");
			return (Criteria) this;
		}

		public Criteria andAccountNoBetween(String value1, String value2) {
			addCriterion("account_no between", value1, value2, "accountNo");
			return (Criteria) this;
		}

		public Criteria andAccountNoNotBetween(String value1, String value2) {
			addCriterion("account_no not between", value1, value2, "accountNo");
			return (Criteria) this;
		}

		public Criteria andAccountNameIsNull() {
			addCriterion("account_name is null");
			return (Criteria) this;
		}

		public Criteria andAccountNameIsNotNull() {
			addCriterion("account_name is not null");
			return (Criteria) this;
		}

		public Criteria andAccountNameEqualTo(String value) {
			addCriterion("account_name =", value, "accountName");
			return (Criteria) this;
		}

		public Criteria andAccountNameNotEqualTo(String value) {
			addCriterion("account_name <>", value, "accountName");
			return (Criteria) this;
		}

		public Criteria andAccountNameGreaterThan(String value) {
			addCriterion("account_name >", value, "accountName");
			return (Criteria) this;
		}

		public Criteria andAccountNameGreaterThanOrEqualTo(String value) {
			addCriterion("account_name >=", value, "accountName");
			return (Criteria) this;
		}

		public Criteria andAccountNameLessThan(String value) {
			addCriterion("account_name <", value, "accountName");
			return (Criteria) this;
		}

		public Criteria andAccountNameLessThanOrEqualTo(String value) {
			addCriterion("account_name <=", value, "accountName");
			return (Criteria) this;
		}

		public Criteria andAccountNameLike(String value) {
			addCriterion("account_name like", value, "accountName");
			return (Criteria) this;
		}

		public Criteria andAccountNameNotLike(String value) {
			addCriterion("account_name not like", value, "accountName");
			return (Criteria) this;
		}

		public Criteria andAccountNameIn(List<String> values) {
			addCriterion("account_name in", values, "accountName");
			return (Criteria) this;
		}

		public Criteria andAccountNameNotIn(List<String> values) {
			addCriterion("account_name not in", values, "accountName");
			return (Criteria) this;
		}

		public Criteria andAccountNameBetween(String value1, String value2) {
			addCriterion("account_name between", value1, value2, "accountName");
			return (Criteria) this;
		}

		public Criteria andAccountNameNotBetween(String value1, String value2) {
			addCriterion("account_name not between", value1, value2,
					"accountName");
			return (Criteria) this;
		}

		public Criteria andBankNameIsNull() {
			addCriterion("bank_name is null");
			return (Criteria) this;
		}

		public Criteria andBankNameIsNotNull() {
			addCriterion("bank_name is not null");
			return (Criteria) this;
		}

		public Criteria andBankNameEqualTo(String value) {
			addCriterion("bank_name =", value, "bankName");
			return (Criteria) this;
		}

		public Criteria andBankNameNotEqualTo(String value) {
			addCriterion("bank_name <>", value, "bankName");
			return (Criteria) this;
		}

		public Criteria andBankNameGreaterThan(String value) {
			addCriterion("bank_name >", value, "bankName");
			return (Criteria) this;
		}

		public Criteria andBankNameGreaterThanOrEqualTo(String value) {
			addCriterion("bank_name >=", value, "bankName");
			return (Criteria) this;
		}

		public Criteria andBankNameLessThan(String value) {
			addCriterion("bank_name <", value, "bankName");
			return (Criteria) this;
		}

		public Criteria andBankNameLessThanOrEqualTo(String value) {
			addCriterion("bank_name <=", value, "bankName");
			return (Criteria) this;
		}

		public Criteria andBankNameLike(String value) {
			addCriterion("bank_name like", value, "bankName");
			return (Criteria) this;
		}

		public Criteria andBankNameNotLike(String value) {
			addCriterion("bank_name not like", value, "bankName");
			return (Criteria) this;
		}

		public Criteria andBankNameIn(List<String> values) {
			addCriterion("bank_name in", values, "bankName");
			return (Criteria) this;
		}

		public Criteria andBankNameNotIn(List<String> values) {
			addCriterion("bank_name not in", values, "bankName");
			return (Criteria) this;
		}

		public Criteria andBankNameBetween(String value1, String value2) {
			addCriterion("bank_name between", value1, value2, "bankName");
			return (Criteria) this;
		}

		public Criteria andBankNameNotBetween(String value1, String value2) {
			addCriterion("bank_name not between", value1, value2, "bankName");
			return (Criteria) this;
		}

		public Criteria andBankNoIsNull() {
			addCriterion("bank_no is null");
			return (Criteria) this;
		}

		public Criteria andBankNoIsNotNull() {
			addCriterion("bank_no is not null");
			return (Criteria) this;
		}

		public Criteria andBankNoEqualTo(String value) {
			addCriterion("bank_no =", value, "bankNo");
			return (Criteria) this;
		}

		public Criteria andBankNoNotEqualTo(String value) {
			addCriterion("bank_no <>", value, "bankNo");
			return (Criteria) this;
		}

		public Criteria andBankNoGreaterThan(String value) {
			addCriterion("bank_no >", value, "bankNo");
			return (Criteria) this;
		}

		public Criteria andBankNoGreaterThanOrEqualTo(String value) {
			addCriterion("bank_no >=", value, "bankNo");
			return (Criteria) this;
		}

		public Criteria andBankNoLessThan(String value) {
			addCriterion("bank_no <", value, "bankNo");
			return (Criteria) this;
		}

		public Criteria andBankNoLessThanOrEqualTo(String value) {
			addCriterion("bank_no <=", value, "bankNo");
			return (Criteria) this;
		}

		public Criteria andBankNoLike(String value) {
			addCriterion("bank_no like", value, "bankNo");
			return (Criteria) this;
		}

		public Criteria andBankNoNotLike(String value) {
			addCriterion("bank_no not like", value, "bankNo");
			return (Criteria) this;
		}

		public Criteria andBankNoIn(List<String> values) {
			addCriterion("bank_no in", values, "bankNo");
			return (Criteria) this;
		}

		public Criteria andBankNoNotIn(List<String> values) {
			addCriterion("bank_no not in", values, "bankNo");
			return (Criteria) this;
		}

		public Criteria andBankNoBetween(String value1, String value2) {
			addCriterion("bank_no between", value1, value2, "bankNo");
			return (Criteria) this;
		}

		public Criteria andBankNoNotBetween(String value1, String value2) {
			addCriterion("bank_no not between", value1, value2, "bankNo");
			return (Criteria) this;
		}

		public Criteria andThisRepayPrincipleIsNull() {
			addCriterion("this_repay_principle is null");
			return (Criteria) this;
		}

		public Criteria andThisRepayPrincipleIsNotNull() {
			addCriterion("this_repay_principle is not null");
			return (Criteria) this;
		}

		public Criteria andThisRepayPrincipleEqualTo(BigDecimal value) {
			addCriterion("this_repay_principle =", value, "thisRepayPrinciple");
			return (Criteria) this;
		}

		public Criteria andThisRepayPrincipleNotEqualTo(BigDecimal value) {
			addCriterion("this_repay_principle <>", value, "thisRepayPrinciple");
			return (Criteria) this;
		}

		public Criteria andThisRepayPrincipleGreaterThan(BigDecimal value) {
			addCriterion("this_repay_principle >", value, "thisRepayPrinciple");
			return (Criteria) this;
		}

		public Criteria andThisRepayPrincipleGreaterThanOrEqualTo(
				BigDecimal value) {
			addCriterion("this_repay_principle >=", value, "thisRepayPrinciple");
			return (Criteria) this;
		}

		public Criteria andThisRepayPrincipleLessThan(BigDecimal value) {
			addCriterion("this_repay_principle <", value, "thisRepayPrinciple");
			return (Criteria) this;
		}

		public Criteria andThisRepayPrincipleLessThanOrEqualTo(BigDecimal value) {
			addCriterion("this_repay_principle <=", value, "thisRepayPrinciple");
			return (Criteria) this;
		}

		public Criteria andThisRepayPrincipleIn(List<BigDecimal> values) {
			addCriterion("this_repay_principle in", values,
					"thisRepayPrinciple");
			return (Criteria) this;
		}

		public Criteria andThisRepayPrincipleNotIn(List<BigDecimal> values) {
			addCriterion("this_repay_principle not in", values,
					"thisRepayPrinciple");
			return (Criteria) this;
		}

		public Criteria andThisRepayPrincipleBetween(BigDecimal value1,
				BigDecimal value2) {
			addCriterion("this_repay_principle between", value1, value2,
					"thisRepayPrinciple");
			return (Criteria) this;
		}

		public Criteria andThisRepayPrincipleNotBetween(BigDecimal value1,
				BigDecimal value2) {
			addCriterion("this_repay_principle not between", value1, value2,
					"thisRepayPrinciple");
			return (Criteria) this;
		}

		public Criteria andThisRepayInterestIsNull() {
			addCriterion("this_repay_interest is null");
			return (Criteria) this;
		}

		public Criteria andThisRepayInterestIsNotNull() {
			addCriterion("this_repay_interest is not null");
			return (Criteria) this;
		}

		public Criteria andThisRepayInterestEqualTo(BigDecimal value) {
			addCriterion("this_repay_interest =", value, "thisRepayInterest");
			return (Criteria) this;
		}

		public Criteria andThisRepayInterestNotEqualTo(BigDecimal value) {
			addCriterion("this_repay_interest <>", value, "thisRepayInterest");
			return (Criteria) this;
		}

		public Criteria andThisRepayInterestGreaterThan(BigDecimal value) {
			addCriterion("this_repay_interest >", value, "thisRepayInterest");
			return (Criteria) this;
		}

		public Criteria andThisRepayInterestGreaterThanOrEqualTo(
				BigDecimal value) {
			addCriterion("this_repay_interest >=", value, "thisRepayInterest");
			return (Criteria) this;
		}

		public Criteria andThisRepayInterestLessThan(BigDecimal value) {
			addCriterion("this_repay_interest <", value, "thisRepayInterest");
			return (Criteria) this;
		}

		public Criteria andThisRepayInterestLessThanOrEqualTo(BigDecimal value) {
			addCriterion("this_repay_interest <=", value, "thisRepayInterest");
			return (Criteria) this;
		}

		public Criteria andThisRepayInterestIn(List<BigDecimal> values) {
			addCriterion("this_repay_interest in", values, "thisRepayInterest");
			return (Criteria) this;
		}

		public Criteria andThisRepayInterestNotIn(List<BigDecimal> values) {
			addCriterion("this_repay_interest not in", values,
					"thisRepayInterest");
			return (Criteria) this;
		}

		public Criteria andThisRepayInterestBetween(BigDecimal value1,
				BigDecimal value2) {
			addCriterion("this_repay_interest between", value1, value2,
					"thisRepayInterest");
			return (Criteria) this;
		}

		public Criteria andThisRepayInterestNotBetween(BigDecimal value1,
				BigDecimal value2) {
			addCriterion("this_repay_interest not between", value1, value2,
					"thisRepayInterest");
			return (Criteria) this;
		}

		public Criteria andCeateTimeIsNull() {
			addCriterion("ceate_time is null");
			return (Criteria) this;
		}

		public Criteria andCeateTimeIsNotNull() {
			addCriterion("ceate_time is not null");
			return (Criteria) this;
		}

		public Criteria andCeateTimeEqualTo(Date value) {
			addCriterion("ceate_time =", value, "ceateTime");
			return (Criteria) this;
		}

		public Criteria andCeateTimeNotEqualTo(Date value) {
			addCriterion("ceate_time <>", value, "ceateTime");
			return (Criteria) this;
		}

		public Criteria andCeateTimeGreaterThan(Date value) {
			addCriterion("ceate_time >", value, "ceateTime");
			return (Criteria) this;
		}

		public Criteria andCeateTimeGreaterThanOrEqualTo(Date value) {
			addCriterion("ceate_time >=", value, "ceateTime");
			return (Criteria) this;
		}

		public Criteria andCeateTimeLessThan(Date value) {
			addCriterion("ceate_time <", value, "ceateTime");
			return (Criteria) this;
		}

		public Criteria andCeateTimeLessThanOrEqualTo(Date value) {
			addCriterion("ceate_time <=", value, "ceateTime");
			return (Criteria) this;
		}

		public Criteria andCeateTimeIn(List<Date> values) {
			addCriterion("ceate_time in", values, "ceateTime");
			return (Criteria) this;
		}

		public Criteria andCeateTimeNotIn(List<Date> values) {
			addCriterion("ceate_time not in", values, "ceateTime");
			return (Criteria) this;
		}

		public Criteria andCeateTimeBetween(Date value1, Date value2) {
			addCriterion("ceate_time between", value1, value2, "ceateTime");
			return (Criteria) this;
		}

		public Criteria andCeateTimeNotBetween(Date value1, Date value2) {
			addCriterion("ceate_time not between", value1, value2, "ceateTime");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table tf_repay_info
	 * @mbggenerated  Fri Nov 24 10:04:57 CST 2017
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

		protected Criterion(String condition, Object value, Object secondValue,
				String typeHandler) {
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

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tf_repay_info
     *
     * @mbggenerated do_not_delete_during_merge Wed Nov 22 10:50:18 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}