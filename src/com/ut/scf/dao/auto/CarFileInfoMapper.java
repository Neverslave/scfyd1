package com.ut.scf.dao.auto;

import com.ut.scf.pojo.auto.CarFileInfo;
import com.ut.scf.pojo.auto.CarFileInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CarFileInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table car_file_info
     *
     * @mbggenerated Mon Jun 19 16:33:27 CST 2017
     */
    int countByExample(CarFileInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table car_file_info
     *
     * @mbggenerated Mon Jun 19 16:33:27 CST 2017
     */
    int deleteByExample(CarFileInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table car_file_info
     *
     * @mbggenerated Mon Jun 19 16:33:27 CST 2017
     */
    int deleteByPrimaryKey(String financeId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table car_file_info
     *
     * @mbggenerated Mon Jun 19 16:33:27 CST 2017
     */
    int insert(CarFileInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table car_file_info
     *
     * @mbggenerated Mon Jun 19 16:33:27 CST 2017
     */
    int insertSelective(CarFileInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table car_file_info
     *
     * @mbggenerated Mon Jun 19 16:33:27 CST 2017
     */
    List<CarFileInfo> selectByExample(CarFileInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table car_file_info
     *
     * @mbggenerated Mon Jun 19 16:33:27 CST 2017
     */
    CarFileInfo selectByPrimaryKey(String financeId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table car_file_info
     *
     * @mbggenerated Mon Jun 19 16:33:27 CST 2017
     */
    int updateByExampleSelective(@Param("record") CarFileInfo record, @Param("example") CarFileInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table car_file_info
     *
     * @mbggenerated Mon Jun 19 16:33:27 CST 2017
     */
    int updateByExample(@Param("record") CarFileInfo record, @Param("example") CarFileInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table car_file_info
     *
     * @mbggenerated Mon Jun 19 16:33:27 CST 2017
     */
    int updateByPrimaryKeySelective(CarFileInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table car_file_info
     *
     * @mbggenerated Mon Jun 19 16:33:27 CST 2017
     */
    int updateByPrimaryKey(CarFileInfo record);
}