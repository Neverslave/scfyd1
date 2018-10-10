package com.ut.scf.dao.auto;

import com.ut.scf.pojo.auto.RepaymentPlanInfo;
import com.ut.scf.pojo.auto.RepaymentPlanInfoExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface RepaymentPlanInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table repayment_plan_info
     *
     * @mbg.generated Thu Jul 05 19:51:27 GMT+08:00 2018
     */
    long countByExample(RepaymentPlanInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table repayment_plan_info
     *
     * @mbg.generated Thu Jul 05 19:51:27 GMT+08:00 2018
     */
    int deleteByExample(RepaymentPlanInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table repayment_plan_info
     *
     * @mbg.generated Thu Jul 05 19:51:27 GMT+08:00 2018
     */
    int deleteByPrimaryKey(String repaymentId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table repayment_plan_info
     *
     * @mbg.generated Thu Jul 05 19:51:27 GMT+08:00 2018
     */
    int insert(RepaymentPlanInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table repayment_plan_info
     *
     * @mbg.generated Thu Jul 05 19:51:27 GMT+08:00 2018
     */
    int insertSelective(RepaymentPlanInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table repayment_plan_info
     *
     * @mbg.generated Thu Jul 05 19:51:27 GMT+08:00 2018
     */
    List<RepaymentPlanInfo> selectByExample(RepaymentPlanInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table repayment_plan_info
     *
     * @mbg.generated Thu Jul 05 19:51:27 GMT+08:00 2018
     */
    RepaymentPlanInfo selectByPrimaryKey(String repaymentId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table repayment_plan_info
     *
     * @mbg.generated Thu Jul 05 19:51:27 GMT+08:00 2018
     */
    int updateByExampleSelective(@Param("record") RepaymentPlanInfo record, @Param("example") RepaymentPlanInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table repayment_plan_info
     *
     * @mbg.generated Thu Jul 05 19:51:27 GMT+08:00 2018
     */
    int updateByExample(@Param("record") RepaymentPlanInfo record, @Param("example") RepaymentPlanInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table repayment_plan_info
     *
     * @mbg.generated Thu Jul 05 19:51:27 GMT+08:00 2018
     */
    int updateByPrimaryKeySelective(RepaymentPlanInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table repayment_plan_info
     *
     * @mbg.generated Thu Jul 05 19:51:27 GMT+08:00 2018
     */
    int updateByPrimaryKey(RepaymentPlanInfo record);

	List<RepaymentPlanInfo> selectByOrderId(String orderId);

	int insertListRepayment(List<RepaymentPlanInfo> repaymentList);
}