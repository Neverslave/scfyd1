package com.ut.scf.dao.auto;

import com.ut.scf.pojo.auto.SupplierInfo;
import com.ut.scf.pojo.auto.SupplierInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SupplierInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table supplier_info
     *
     * @mbg.generated Tue Oct 23 12:47:06 GMT+08:00 2018
     */
    long countByExample(SupplierInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table supplier_info
     *
     * @mbg.generated Tue Oct 23 12:47:06 GMT+08:00 2018
     */
    int deleteByExample(SupplierInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table supplier_info
     *
     * @mbg.generated Tue Oct 23 12:47:06 GMT+08:00 2018
     */
    int deleteByPrimaryKey(String corpId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table supplier_info
     *
     * @mbg.generated Tue Oct 23 12:47:06 GMT+08:00 2018
     */
    int insert(SupplierInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table supplier_info
     *
     * @mbg.generated Tue Oct 23 12:47:06 GMT+08:00 2018
     */
    int insertSelective(SupplierInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table supplier_info
     *
     * @mbg.generated Tue Oct 23 12:47:06 GMT+08:00 2018
     */
    List<SupplierInfo> selectByExample(SupplierInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table supplier_info
     *
     * @mbg.generated Tue Oct 23 12:47:06 GMT+08:00 2018
     */
    SupplierInfo selectByPrimaryKey(String corpId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table supplier_info
     *
     * @mbg.generated Tue Oct 23 12:47:06 GMT+08:00 2018
     */
    int updateByExampleSelective(@Param("record") SupplierInfo record, @Param("example") SupplierInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table supplier_info
     *
     * @mbg.generated Tue Oct 23 12:47:06 GMT+08:00 2018
     */
    int updateByExample(@Param("record") SupplierInfo record, @Param("example") SupplierInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table supplier_info
     *
     * @mbg.generated Tue Oct 23 12:47:06 GMT+08:00 2018
     */
    int updateByPrimaryKeySelective(SupplierInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table supplier_info
     *
     * @mbg.generated Tue Oct 23 12:47:06 GMT+08:00 2018
     */
    int updateByPrimaryKey(SupplierInfo record);
}