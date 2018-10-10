package com.ut.scf.dao.auto;

import com.ut.scf.pojo.auto.LimitInfo;
import com.ut.scf.pojo.auto.LimitInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LimitInfoMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table limit_info
	 * @mbggenerated  Sat Jul 01 10:49:09 CST 2017
	 */
	int countByExample(LimitInfoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table limit_info
	 * @mbggenerated  Sat Jul 01 10:49:09 CST 2017
	 */
	int deleteByExample(LimitInfoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table limit_info
	 * @mbggenerated  Sat Jul 01 10:49:09 CST 2017
	 */
	int deleteByPrimaryKey(String corpId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table limit_info
	 * @mbggenerated  Sat Jul 01 10:49:09 CST 2017
	 */
	int insert(LimitInfo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table limit_info
	 * @mbggenerated  Sat Jul 01 10:49:09 CST 2017
	 */
	int insertSelective(LimitInfo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table limit_info
	 * @mbggenerated  Sat Jul 01 10:49:09 CST 2017
	 */
	List<LimitInfo> selectByExample(LimitInfoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table limit_info
	 * @mbggenerated  Sat Jul 01 10:49:09 CST 2017
	 */
	LimitInfo selectByPrimaryKey(String corpId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table limit_info
	 * @mbggenerated  Sat Jul 01 10:49:09 CST 2017
	 */
	int updateByExampleSelective(@Param("record") LimitInfo record,
			@Param("example") LimitInfoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table limit_info
	 * @mbggenerated  Sat Jul 01 10:49:09 CST 2017
	 */
	int updateByExample(@Param("record") LimitInfo record,
			@Param("example") LimitInfoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table limit_info
	 * @mbggenerated  Sat Jul 01 10:49:09 CST 2017
	 */
	int updateByPrimaryKeySelective(LimitInfo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table limit_info
	 * @mbggenerated  Sat Jul 01 10:49:09 CST 2017
	 */
	int updateByPrimaryKey(LimitInfo record);

	List<LimitInfo> selectByTypeId(LimitInfo limitInfo);

	List<LimitInfo> selectByTypeId2(LimitInfo limitInfo);
}