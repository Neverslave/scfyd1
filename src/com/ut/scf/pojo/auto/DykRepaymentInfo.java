package com.ut.scf.pojo.auto;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.ut.scf.reqbean.PageReqBean;

public class DykRepaymentInfo extends PageReqBean{

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column dyk_repayment_info.repayment_id
	 * @mbggenerated  Wed Jun 28 15:28:10 CST 2017
	 */
	private String repaymentId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column dyk_repayment_info.repayment_date
	 * @mbggenerated  Wed Jun 28 15:28:10 CST 2017
	 */
	private Date repaymentDate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column dyk_repayment_info.repay_sum_amt
	 * @mbggenerated  Wed Jun 28 15:28:10 CST 2017
	 */
	private BigDecimal repaySumAmt;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column dyk_repayment_info.repay_capital_amt
	 * @mbggenerated  Wed Jun 28 15:28:10 CST 2017
	 */
	private BigDecimal repayCapitalAmt;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column dyk_repayment_info.repay_interest_amt
	 * @mbggenerated  Wed Jun 28 15:28:10 CST 2017
	 */
	private BigDecimal repayInterestAmt;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column dyk_repayment_info.act_repay_amt
	 * @mbggenerated  Wed Jun 28 15:28:10 CST 2017
	 */
	private BigDecimal actRepayAmt;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column dyk_repayment_info.car_stolen_certificate
	 * @mbggenerated  Wed Jun 28 15:28:10 CST 2017
	 */
	private String carStolenCertificate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column dyk_repayment_info.car_stolen_certificate_url
	 * @mbggenerated  Wed Jun 28 15:28:10 CST 2017
	 */
	private String carStolenCertificateUrl;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column dyk_repayment_info.repayment_type
	 * @mbggenerated  Wed Jun 28 15:28:10 CST 2017
	 */
	private Byte repaymentType;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column dyk_repayment_info.repayment_corp_id
	 * @mbggenerated  Wed Jun 28 15:28:10 CST 2017
	 */
	private String repaymentCorpId;

	private String repayCarType;
	
	private String express;
	
	private String expressNum;
	
	private String date;
	private String lsYinghang;
	private String lsBaozhengjin;
	private String lsDaifu;
	private String lsQita;
	private String lsHeji;
	private String dzYinghang;
	private String dzBaozhengjin;
	private String dzDaifu;
	private String dzQita;
	private String dzHeji;
	
	private String firTime;
	
	private String secTime;
	
	private String corpName;
	
	private String represent;
	
	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column dyk_repayment_info.repayment_id
	 * @return  the value of dyk_repayment_info.repayment_id
	 * @mbggenerated  Wed Jun 28 15:28:10 CST 2017
	 */
	public String getRepaymentId() {
		return repaymentId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column dyk_repayment_info.repayment_id
	 * @param repaymentId  the value for dyk_repayment_info.repayment_id
	 * @mbggenerated  Wed Jun 28 15:28:10 CST 2017
	 */
	public void setRepaymentId(String repaymentId) {
		this.repaymentId = repaymentId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column dyk_repayment_info.repayment_date
	 * @return  the value of dyk_repayment_info.repayment_date
	 * @mbggenerated  Wed Jun 28 15:28:10 CST 2017
	 */
	public String getRepaymentDate() {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		return repaymentDate == null ? "" : sdf.format(repaymentDate);
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column dyk_repayment_info.repayment_date
	 * @param repaymentDate  the value for dyk_repayment_info.repayment_date
	 * @mbggenerated  Wed Jun 28 15:28:10 CST 2017
	 */
	public void setRepaymentDate(Date repaymentDate) {
		this.repaymentDate = repaymentDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column dyk_repayment_info.repay_sum_amt
	 * @return  the value of dyk_repayment_info.repay_sum_amt
	 * @mbggenerated  Wed Jun 28 15:28:10 CST 2017
	 */
	public BigDecimal getRepaySumAmt() {
		return repaySumAmt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column dyk_repayment_info.repay_sum_amt
	 * @param repaySumAmt  the value for dyk_repayment_info.repay_sum_amt
	 * @mbggenerated  Wed Jun 28 15:28:10 CST 2017
	 */
	public void setRepaySumAmt(BigDecimal repaySumAmt) {
		this.repaySumAmt = repaySumAmt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column dyk_repayment_info.repay_capital_amt
	 * @return  the value of dyk_repayment_info.repay_capital_amt
	 * @mbggenerated  Wed Jun 28 15:28:10 CST 2017
	 */
	public BigDecimal getRepayCapitalAmt() {
		return repayCapitalAmt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column dyk_repayment_info.repay_capital_amt
	 * @param repayCapitalAmt  the value for dyk_repayment_info.repay_capital_amt
	 * @mbggenerated  Wed Jun 28 15:28:10 CST 2017
	 */
	public void setRepayCapitalAmt(BigDecimal repayCapitalAmt) {
		this.repayCapitalAmt = repayCapitalAmt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column dyk_repayment_info.repay_interest_amt
	 * @return  the value of dyk_repayment_info.repay_interest_amt
	 * @mbggenerated  Wed Jun 28 15:28:10 CST 2017
	 */
	public BigDecimal getRepayInterestAmt() {
		return repayInterestAmt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column dyk_repayment_info.repay_interest_amt
	 * @param repayInterestAmt  the value for dyk_repayment_info.repay_interest_amt
	 * @mbggenerated  Wed Jun 28 15:28:10 CST 2017
	 */
	public void setRepayInterestAmt(BigDecimal repayInterestAmt) {
		this.repayInterestAmt = repayInterestAmt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column dyk_repayment_info.act_repay_amt
	 * @return  the value of dyk_repayment_info.act_repay_amt
	 * @mbggenerated  Wed Jun 28 15:28:10 CST 2017
	 */
	public BigDecimal getActRepayAmt() {
		return actRepayAmt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column dyk_repayment_info.act_repay_amt
	 * @param actRepayAmt  the value for dyk_repayment_info.act_repay_amt
	 * @mbggenerated  Wed Jun 28 15:28:10 CST 2017
	 */
	public void setActRepayAmt(BigDecimal actRepayAmt) {
		this.actRepayAmt = actRepayAmt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column dyk_repayment_info.car_stolen_certificate
	 * @return  the value of dyk_repayment_info.car_stolen_certificate
	 * @mbggenerated  Wed Jun 28 15:28:10 CST 2017
	 */
	public String getCarStolenCertificate() {
		return carStolenCertificate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column dyk_repayment_info.car_stolen_certificate
	 * @param carStolenCertificate  the value for dyk_repayment_info.car_stolen_certificate
	 * @mbggenerated  Wed Jun 28 15:28:10 CST 2017
	 */
	public void setCarStolenCertificate(String carStolenCertificate) {
		this.carStolenCertificate = carStolenCertificate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column dyk_repayment_info.car_stolen_certificate_url
	 * @return  the value of dyk_repayment_info.car_stolen_certificate_url
	 * @mbggenerated  Wed Jun 28 15:28:10 CST 2017
	 */
	public String getCarStolenCertificateUrl() {
		return carStolenCertificateUrl;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column dyk_repayment_info.car_stolen_certificate_url
	 * @param carStolenCertificateUrl  the value for dyk_repayment_info.car_stolen_certificate_url
	 * @mbggenerated  Wed Jun 28 15:28:10 CST 2017
	 */
	public void setCarStolenCertificateUrl(String carStolenCertificateUrl) {
		this.carStolenCertificateUrl = carStolenCertificateUrl;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column dyk_repayment_info.repayment_type
	 * @return  the value of dyk_repayment_info.repayment_type
	 * @mbggenerated  Wed Jun 28 15:28:10 CST 2017
	 */
	public Byte getRepaymentType() {
		return repaymentType;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column dyk_repayment_info.repayment_type
	 * @param repaymentType  the value for dyk_repayment_info.repayment_type
	 * @mbggenerated  Wed Jun 28 15:28:10 CST 2017
	 */
	public void setRepaymentType(Byte repaymentType) {
		this.repaymentType = repaymentType;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column dyk_repayment_info.repayment_corp_id
	 * @return  the value of dyk_repayment_info.repayment_corp_id
	 * @mbggenerated  Wed Jun 28 15:28:10 CST 2017
	 */
	public String getRepaymentCorpId() {
		return repaymentCorpId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column dyk_repayment_info.repayment_corp_id
	 * @param repaymentCorpId  the value for dyk_repayment_info.repayment_corp_id
	 * @mbggenerated  Wed Jun 28 15:28:10 CST 2017
	 */
	public void setRepaymentCorpId(String repaymentCorpId) {
		this.repaymentCorpId = repaymentCorpId;
	}

	public String getRepayCarType() {
		return repayCarType;
	}

	public void setRepayCarType(String repayCarType) {
		this.repayCarType = repayCarType;
	}

	public String getExpress() {
		return express;
	}

	public void setExpress(String express) {
		this.express = express;
	}

	public String getExpressNum() {
		return expressNum;
	}

	public void setExpressNum(String expressNum) {
		this.expressNum = expressNum;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getLsYinghang() {
		return lsYinghang;
	}

	public void setLsYinghang(String lsYinghang) {
		this.lsYinghang = lsYinghang;
	}

	public String getLsBaozhengjin() {
		return lsBaozhengjin;
	}

	public void setLsBaozhengjin(String lsBaozhengjin) {
		this.lsBaozhengjin = lsBaozhengjin;
	}

	public String getLsDaifu() {
		return lsDaifu;
	}

	public void setLsDaifu(String lsDaifu) {
		this.lsDaifu = lsDaifu;
	}

	public String getLsQita() {
		return lsQita;
	}

	public void setLsQita(String lsQita) {
		this.lsQita = lsQita;
	}

	public String getLsHeji() {
		return lsHeji;
	}

	public void setLsHeji(String lsHeji) {
		this.lsHeji = lsHeji;
	}

	public String getDzYinghang() {
		return dzYinghang;
	}

	public void setDzYinghang(String dzYinghang) {
		this.dzYinghang = dzYinghang;
	}

	public String getDzBaozhengjin() {
		return dzBaozhengjin;
	}

	public void setDzBaozhengjin(String dzBaozhengjin) {
		this.dzBaozhengjin = dzBaozhengjin;
	}

	public String getDzDaifu() {
		return dzDaifu;
	}

	public void setDzDaifu(String dzDaifu) {
		this.dzDaifu = dzDaifu;
	}

	public String getDzQita() {
		return dzQita;
	}

	public void setDzQita(String dzQita) {
		this.dzQita = dzQita;
	}

	public String getDzHeji() {
		return dzHeji;
	}

	public void setDzHeji(String dzHeji) {
		this.dzHeji = dzHeji;
	}

	public String getFirTime() {
		return firTime;
	}

	public void setFirTime(String firTime) {
		this.firTime = firTime;
	}

	public String getSecTime() {
		return secTime;
	}

	public void setSecTime(String secTime) {
		this.secTime = secTime;
	}

	public String getCorpName() {
		return corpName;
	}

	public void setCorpName(String corpName) {
		this.corpName = corpName;
	}

	public String getRepresent() {
		return represent;
	}

	public void setRepresent(String represent) {
		this.represent = represent;
	}
	
	
	
}