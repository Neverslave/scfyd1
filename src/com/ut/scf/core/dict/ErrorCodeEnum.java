package com.ut.scf.core.dict;

/**
 * 错误码枚举类
 *
 * @author sunll
 */
public enum ErrorCodeEnum {

    // 成功信息
    SUCCESS(0),

    // 其他都是错误信息
    FAILED(1), PARAM_VALID_ERROR(2), UNKNOWN_ERROR(3), REQUEST_FORMAT_ERROR(4), BIZ_EXCEPTION(
            5), USER_NOT_SIGNIN(6), ADD_FAILED(7), UPDATE_FAILED(8), DELETE_FAILED(
            9), QUERY_FAILED(10), QUERY_BLANK(11), LOGIN_CODE_ERROR(12), LOGIN_CODE_EXPIRE(
            13), SEND_SMS_FAILED(14), FILE_NOT_EXIST(15),

    // 以下都是业务代码错误信息,从10000开始
    LOGIN_USERNAME_PASSWORD_ERROR(10000), SYS_ROLE_NO_PERMISSION(10001), ROLE_TYPE_NO_PERMISSION(
            10002), ROLE_NAME_EXIST(10003), ROLE_NOT_EXIST(10004), DEPT_NAME_EXIST(
            10005), HAS_SUB_DEPT(10006), DEPT_NOT_EXIST(10007), HAS_SUB_MENU(
            10008), CORP_NAME_EXIST(10009), DEPT_HAS_USER(10010), HAS_SAME_DATE(
            10011), USER_NAME_EXIST(10012), USER_PHONE_EXIST(10013), USER_INSUFFICIENT_AUTHORITY(
            10014), PHONE_NOT_REGISTER(10015), PHONE_EXIST_ABNORMAL(10016), CREATE_SUNFLOW_ERROR(
            10017), DISC_SUNFLOW_ERROR(10018), SUNFLOW_ERROR(10019), WKI_STATE_ERROR(
            10020), MENU_NAME_EXIST(10021), PROJECT_NAME_EXIST(10022), PROJECT_NAME_NOT_EXIST(
            10023), BUY_CORP_NAME_NOT_EXIST(10024), SALE_CORP_NAME_NOT_EXIST(
            10025), EXCEL_ERROR(10026), EXCEL_TOO_LARGE(10027), USEID_NOT_EXIST(
            10028), PRODUCT_NAME_EXIST(100029), CAR_FRAME_NUM_EXIST(100030), GUARANTEE_MONEY_EXIST(
            100031), INTEREST_EXIST(100032), AGENCY_NUM_EXIST(100033), ORGN_NUM_EXIST(
            100034), ROLEID_USERD(100035), FINANCE_AGENCY_EXIST(100036), AGENCY_NAME_NUM_EXIST(
            100037), FINANCE_ID_EXIST(100038), PAYAMT_ERROR(100039), HAVE_NOT_REPAY(
            100040), REVENUE_AGENCY(100041), FINANCE_ID_EXIST_IN_REF(100042), FINANCE_ID_EXIST_IN_OFFSET(
            100043), FINANCE_ID_EXIST_IN_REPAY(100043), PAYM_IS_TOO_BIG(100044), FINANCEAMT_BIG_USEABLEAMT(
            100045), REPAY_REVENUE_CONFLICT(100046), AGENCY_HAS_NOT_USER(100047), NOT_FINISHED_PAY(
            100048), ACTIVITI_REVIEW_ERROR(100049), USER_DELETE_FAIL(100050), USER_REPEAT_LOGIN(1000501),
            USER_BIND_ERROR(1000502),BUSINESS_NAME_EXIST(1000503),FINANCEID_NAME_EXIST(1000504),ORDER_BATCH_ID_EXIST(1000505),

    // 保理合同信息
    FACTOR_CONTRACT_INFO(20000), DYK_CONTRACT_INFO(20001), FACTORING_NO_EXIST(20003), CREDIT_NO_EXIST(20004),
    // 批处理
    BATCH_FAIL(30000),
    // 还款登记
    SSM_REPAY_FAIL(40000),
    
    // 利率配置
    RATE_MODE_FAIL(50000), RATE_DELETE_FAIL(50001), RATE_ADD_FAIL(50002), RATE_END_DAYS_FAIL(
            50003),
    // 产品配置
    PRODUCT_DELETE_FAIL(60000),
    //传统保理
    PROJECT_EXIST(70000),LOAN_ID_EXIST(70001),CREDIT_ERROR(70002),NOTICE_ERROR(70003);

    private int value;

    private ErrorCodeEnum(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

}