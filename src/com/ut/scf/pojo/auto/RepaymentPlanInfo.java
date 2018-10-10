package com.ut.scf.pojo.auto;

import java.math.BigDecimal;
import java.util.Date;

public class RepaymentPlanInfo {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column repayment_plan_info.repayment_id
     *
     * @mbg.generated Thu Aug 02 16:59:50 GMT+08:00 2018
     */
    private String repaymentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column repayment_plan_info.order_id
     *
     * @mbg.generated Thu Aug 02 16:59:50 GMT+08:00 2018
     */
    private String orderId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column repayment_plan_info.order_batch_id
     *
     * @mbg.generated Thu Aug 02 16:59:50 GMT+08:00 2018
     */
    private String orderBatchId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column repayment_plan_info.period
     *
     * @mbg.generated Thu Aug 02 16:59:50 GMT+08:00 2018
     */
    private Byte period;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column repayment_plan_info.current_repay_date
     *
     * @mbg.generated Thu Aug 02 16:59:50 GMT+08:00 2018
     */
    private Date currentRepayDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column repayment_plan_info.current_payable_principal
     *
     * @mbg.generated Thu Aug 02 16:59:50 GMT+08:00 2018
     */
    private BigDecimal currentPayablePrincipal;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column repayment_plan_info.current_payable_interest
     *
     * @mbg.generated Thu Aug 02 16:59:50 GMT+08:00 2018
     */
    private BigDecimal currentPayableInterest;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column repayment_plan_info.student_repay_status
     *
     * @mbg.generated Thu Aug 02 16:59:50 GMT+08:00 2018
     */
    private String studentRepayStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column repayment_plan_info.super_repay_status
     *
     * @mbg.generated Thu Aug 02 16:59:50 GMT+08:00 2018
     */
    private String superRepayStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column repayment_plan_info.interest
     *
     * @mbg.generated Thu Aug 02 16:59:50 GMT+08:00 2018
     */
    private BigDecimal interest;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column repayment_plan_info.lc_money
     *
     * @mbg.generated Thu Aug 02 16:59:50 GMT+08:00 2018
     */
    private BigDecimal lcMoney;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column repayment_plan_info.current_money
     *
     * @mbg.generated Thu Aug 02 16:59:50 GMT+08:00 2018
     */
    private BigDecimal currentMoney;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column repayment_plan_info.ensure_money
     *
     * @mbg.generated Thu Aug 02 16:59:50 GMT+08:00 2018
     */
    private BigDecimal ensureMoney;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column repayment_plan_info.payed_time
     *
     * @mbg.generated Thu Aug 02 16:59:50 GMT+08:00 2018
     */
    private String payedTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column repayment_plan_info.repayment_money
     *
     * @mbg.generated Thu Aug 02 16:59:50 GMT+08:00 2018
     */
    private BigDecimal repaymentMoney;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column repayment_plan_info.paid_money
     *
     * @mbg.generated Thu Aug 02 16:59:50 GMT+08:00 2018
     */
    private BigDecimal paidMoney;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column repayment_plan_info.state
     *
     * @mbg.generated Thu Aug 02 16:59:50 GMT+08:00 2018
     */
    private Integer state;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column repayment_plan_info.marketing_fee_yi
     *
     * @mbg.generated Thu Aug 02 16:59:50 GMT+08:00 2018
     */
    private BigDecimal marketingFeeYi;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column repayment_plan_info.service_charge_yi
     *
     * @mbg.generated Thu Aug 02 16:59:50 GMT+08:00 2018
     */
    private BigDecimal serviceChargeYi;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column repayment_plan_info.ensure_money_state
     *
     * @mbg.generated Thu Aug 02 16:59:50 GMT+08:00 2018
     */
    private Integer ensureMoneyState;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column repayment_plan_info.guaranyee_cash_id
     *
     * @mbg.generated Thu Aug 02 16:59:50 GMT+08:00 2018
     */
    private String guaranyeeCashId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column repayment_plan_info.people_type
     *
     * @mbg.generated Thu Aug 02 16:59:50 GMT+08:00 2018
     */
    private Byte peopleType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column repayment_plan_info.stu_state
     *
     * @mbg.generated Thu Aug 02 16:59:50 GMT+08:00 2018
     */
    private Integer stuState;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column repayment_plan_info.repayment_id
     *
     * @return the value of repayment_plan_info.repayment_id
     *
     * @mbg.generated Thu Aug 02 16:59:50 GMT+08:00 2018
     */
    public String getRepaymentId() {
        return repaymentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column repayment_plan_info.repayment_id
     *
     * @param repaymentId the value for repayment_plan_info.repayment_id
     *
     * @mbg.generated Thu Aug 02 16:59:50 GMT+08:00 2018
     */
    public void setRepaymentId(String repaymentId) {
        this.repaymentId = repaymentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column repayment_plan_info.order_id
     *
     * @return the value of repayment_plan_info.order_id
     *
     * @mbg.generated Thu Aug 02 16:59:50 GMT+08:00 2018
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column repayment_plan_info.order_id
     *
     * @param orderId the value for repayment_plan_info.order_id
     *
     * @mbg.generated Thu Aug 02 16:59:50 GMT+08:00 2018
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column repayment_plan_info.order_batch_id
     *
     * @return the value of repayment_plan_info.order_batch_id
     *
     * @mbg.generated Thu Aug 02 16:59:50 GMT+08:00 2018
     */
    public String getOrderBatchId() {
        return orderBatchId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column repayment_plan_info.order_batch_id
     *
     * @param orderBatchId the value for repayment_plan_info.order_batch_id
     *
     * @mbg.generated Thu Aug 02 16:59:50 GMT+08:00 2018
     */
    public void setOrderBatchId(String orderBatchId) {
        this.orderBatchId = orderBatchId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column repayment_plan_info.period
     *
     * @return the value of repayment_plan_info.period
     *
     * @mbg.generated Thu Aug 02 16:59:50 GMT+08:00 2018
     */
    public Byte getPeriod() {
        return period;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column repayment_plan_info.period
     *
     * @param period the value for repayment_plan_info.period
     *
     * @mbg.generated Thu Aug 02 16:59:50 GMT+08:00 2018
     */
    public void setPeriod(Byte period) {
        this.period = period;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column repayment_plan_info.current_repay_date
     *
     * @return the value of repayment_plan_info.current_repay_date
     *
     * @mbg.generated Thu Aug 02 16:59:50 GMT+08:00 2018
     */
    public Date getCurrentRepayDate() {
        return currentRepayDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column repayment_plan_info.current_repay_date
     *
     * @param currentRepayDate the value for repayment_plan_info.current_repay_date
     *
     * @mbg.generated Thu Aug 02 16:59:50 GMT+08:00 2018
     */
    public void setCurrentRepayDate(Date currentRepayDate) {
        this.currentRepayDate = currentRepayDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column repayment_plan_info.current_payable_principal
     *
     * @return the value of repayment_plan_info.current_payable_principal
     *
     * @mbg.generated Thu Aug 02 16:59:50 GMT+08:00 2018
     */
    public BigDecimal getCurrentPayablePrincipal() {
        return currentPayablePrincipal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column repayment_plan_info.current_payable_principal
     *
     * @param currentPayablePrincipal the value for repayment_plan_info.current_payable_principal
     *
     * @mbg.generated Thu Aug 02 16:59:50 GMT+08:00 2018
     */
    public void setCurrentPayablePrincipal(BigDecimal currentPayablePrincipal) {
        this.currentPayablePrincipal = currentPayablePrincipal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column repayment_plan_info.current_payable_interest
     *
     * @return the value of repayment_plan_info.current_payable_interest
     *
     * @mbg.generated Thu Aug 02 16:59:50 GMT+08:00 2018
     */
    public BigDecimal getCurrentPayableInterest() {
        return currentPayableInterest;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column repayment_plan_info.current_payable_interest
     *
     * @param currentPayableInterest the value for repayment_plan_info.current_payable_interest
     *
     * @mbg.generated Thu Aug 02 16:59:50 GMT+08:00 2018
     */
    public void setCurrentPayableInterest(BigDecimal currentPayableInterest) {
        this.currentPayableInterest = currentPayableInterest;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column repayment_plan_info.student_repay_status
     *
     * @return the value of repayment_plan_info.student_repay_status
     *
     * @mbg.generated Thu Aug 02 16:59:50 GMT+08:00 2018
     */
    public String getStudentRepayStatus() {
        return studentRepayStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column repayment_plan_info.student_repay_status
     *
     * @param studentRepayStatus the value for repayment_plan_info.student_repay_status
     *
     * @mbg.generated Thu Aug 02 16:59:50 GMT+08:00 2018
     */
    public void setStudentRepayStatus(String studentRepayStatus) {
        this.studentRepayStatus = studentRepayStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column repayment_plan_info.super_repay_status
     *
     * @return the value of repayment_plan_info.super_repay_status
     *
     * @mbg.generated Thu Aug 02 16:59:50 GMT+08:00 2018
     */
    public String getSuperRepayStatus() {
        return superRepayStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column repayment_plan_info.super_repay_status
     *
     * @param superRepayStatus the value for repayment_plan_info.super_repay_status
     *
     * @mbg.generated Thu Aug 02 16:59:50 GMT+08:00 2018
     */
    public void setSuperRepayStatus(String superRepayStatus) {
        this.superRepayStatus = superRepayStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column repayment_plan_info.interest
     *
     * @return the value of repayment_plan_info.interest
     *
     * @mbg.generated Thu Aug 02 16:59:50 GMT+08:00 2018
     */
    public BigDecimal getInterest() {
        return interest;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column repayment_plan_info.interest
     *
     * @param interest the value for repayment_plan_info.interest
     *
     * @mbg.generated Thu Aug 02 16:59:50 GMT+08:00 2018
     */
    public void setInterest(BigDecimal interest) {
        this.interest = interest;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column repayment_plan_info.lc_money
     *
     * @return the value of repayment_plan_info.lc_money
     *
     * @mbg.generated Thu Aug 02 16:59:50 GMT+08:00 2018
     */
    public BigDecimal getLcMoney() {
        return lcMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column repayment_plan_info.lc_money
     *
     * @param lcMoney the value for repayment_plan_info.lc_money
     *
     * @mbg.generated Thu Aug 02 16:59:50 GMT+08:00 2018
     */
    public void setLcMoney(BigDecimal lcMoney) {
        this.lcMoney = lcMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column repayment_plan_info.current_money
     *
     * @return the value of repayment_plan_info.current_money
     *
     * @mbg.generated Thu Aug 02 16:59:50 GMT+08:00 2018
     */
    public BigDecimal getCurrentMoney() {
        return currentMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column repayment_plan_info.current_money
     *
     * @param currentMoney the value for repayment_plan_info.current_money
     *
     * @mbg.generated Thu Aug 02 16:59:50 GMT+08:00 2018
     */
    public void setCurrentMoney(BigDecimal currentMoney) {
        this.currentMoney = currentMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column repayment_plan_info.ensure_money
     *
     * @return the value of repayment_plan_info.ensure_money
     *
     * @mbg.generated Thu Aug 02 16:59:50 GMT+08:00 2018
     */
    public BigDecimal getEnsureMoney() {
        return ensureMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column repayment_plan_info.ensure_money
     *
     * @param ensureMoney the value for repayment_plan_info.ensure_money
     *
     * @mbg.generated Thu Aug 02 16:59:50 GMT+08:00 2018
     */
    public void setEnsureMoney(BigDecimal ensureMoney) {
        this.ensureMoney = ensureMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column repayment_plan_info.payed_time
     *
     * @return the value of repayment_plan_info.payed_time
     *
     * @mbg.generated Thu Aug 02 16:59:50 GMT+08:00 2018
     */
    public String getPayedTime() {
        return payedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column repayment_plan_info.payed_time
     *
     * @param payedTime the value for repayment_plan_info.payed_time
     *
     * @mbg.generated Thu Aug 02 16:59:50 GMT+08:00 2018
     */
    public void setPayedTime(String payedTime) {
        this.payedTime = payedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column repayment_plan_info.repayment_money
     *
     * @return the value of repayment_plan_info.repayment_money
     *
     * @mbg.generated Thu Aug 02 16:59:50 GMT+08:00 2018
     */
    public BigDecimal getRepaymentMoney() {
        return repaymentMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column repayment_plan_info.repayment_money
     *
     * @param repaymentMoney the value for repayment_plan_info.repayment_money
     *
     * @mbg.generated Thu Aug 02 16:59:50 GMT+08:00 2018
     */
    public void setRepaymentMoney(BigDecimal repaymentMoney) {
        this.repaymentMoney = repaymentMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column repayment_plan_info.paid_money
     *
     * @return the value of repayment_plan_info.paid_money
     *
     * @mbg.generated Thu Aug 02 16:59:50 GMT+08:00 2018
     */
    public BigDecimal getPaidMoney() {
        return paidMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column repayment_plan_info.paid_money
     *
     * @param paidMoney the value for repayment_plan_info.paid_money
     *
     * @mbg.generated Thu Aug 02 16:59:50 GMT+08:00 2018
     */
    public void setPaidMoney(BigDecimal paidMoney) {
        this.paidMoney = paidMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column repayment_plan_info.state
     *
     * @return the value of repayment_plan_info.state
     *
     * @mbg.generated Thu Aug 02 16:59:50 GMT+08:00 2018
     */
    public Integer getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column repayment_plan_info.state
     *
     * @param state the value for repayment_plan_info.state
     *
     * @mbg.generated Thu Aug 02 16:59:50 GMT+08:00 2018
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column repayment_plan_info.marketing_fee_yi
     *
     * @return the value of repayment_plan_info.marketing_fee_yi
     *
     * @mbg.generated Thu Aug 02 16:59:50 GMT+08:00 2018
     */
    public BigDecimal getMarketingFeeYi() {
        return marketingFeeYi;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column repayment_plan_info.marketing_fee_yi
     *
     * @param marketingFeeYi the value for repayment_plan_info.marketing_fee_yi
     *
     * @mbg.generated Thu Aug 02 16:59:50 GMT+08:00 2018
     */
    public void setMarketingFeeYi(BigDecimal marketingFeeYi) {
        this.marketingFeeYi = marketingFeeYi;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column repayment_plan_info.service_charge_yi
     *
     * @return the value of repayment_plan_info.service_charge_yi
     *
     * @mbg.generated Thu Aug 02 16:59:50 GMT+08:00 2018
     */
    public BigDecimal getServiceChargeYi() {
        return serviceChargeYi;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column repayment_plan_info.service_charge_yi
     *
     * @param serviceChargeYi the value for repayment_plan_info.service_charge_yi
     *
     * @mbg.generated Thu Aug 02 16:59:50 GMT+08:00 2018
     */
    public void setServiceChargeYi(BigDecimal serviceChargeYi) {
        this.serviceChargeYi = serviceChargeYi;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column repayment_plan_info.ensure_money_state
     *
     * @return the value of repayment_plan_info.ensure_money_state
     *
     * @mbg.generated Thu Aug 02 16:59:50 GMT+08:00 2018
     */
    public Integer getEnsureMoneyState() {
        return ensureMoneyState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column repayment_plan_info.ensure_money_state
     *
     * @param ensureMoneyState the value for repayment_plan_info.ensure_money_state
     *
     * @mbg.generated Thu Aug 02 16:59:50 GMT+08:00 2018
     */
    public void setEnsureMoneyState(Integer ensureMoneyState) {
        this.ensureMoneyState = ensureMoneyState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column repayment_plan_info.guaranyee_cash_id
     *
     * @return the value of repayment_plan_info.guaranyee_cash_id
     *
     * @mbg.generated Thu Aug 02 16:59:50 GMT+08:00 2018
     */
    public String getGuaranyeeCashId() {
        return guaranyeeCashId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column repayment_plan_info.guaranyee_cash_id
     *
     * @param guaranyeeCashId the value for repayment_plan_info.guaranyee_cash_id
     *
     * @mbg.generated Thu Aug 02 16:59:50 GMT+08:00 2018
     */
    public void setGuaranyeeCashId(String guaranyeeCashId) {
        this.guaranyeeCashId = guaranyeeCashId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column repayment_plan_info.people_type
     *
     * @return the value of repayment_plan_info.people_type
     *
     * @mbg.generated Thu Aug 02 16:59:50 GMT+08:00 2018
     */
    public Byte getPeopleType() {
        return peopleType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column repayment_plan_info.people_type
     *
     * @param peopleType the value for repayment_plan_info.people_type
     *
     * @mbg.generated Thu Aug 02 16:59:50 GMT+08:00 2018
     */
    public void setPeopleType(Byte peopleType) {
        this.peopleType = peopleType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column repayment_plan_info.stu_state
     *
     * @return the value of repayment_plan_info.stu_state
     *
     * @mbg.generated Thu Aug 02 16:59:50 GMT+08:00 2018
     */
    public Integer getStuState() {
        return stuState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column repayment_plan_info.stu_state
     *
     * @param stuState the value for repayment_plan_info.stu_state
     *
     * @mbg.generated Thu Aug 02 16:59:50 GMT+08:00 2018
     */
    public void setStuState(Integer stuState) {
        this.stuState = stuState;
    }
}