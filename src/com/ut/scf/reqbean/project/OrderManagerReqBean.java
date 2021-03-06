package com.ut.scf.reqbean.project;

import com.ut.scf.reqbean.PageReqBean;

public class OrderManagerReqBean extends PageReqBean {

    /**
     * 订单管理
     **/
    private String orderId;// 订单id

    private String stuId;
    private String storeId;
    private String batchId;// 订单批次 id

    private String state;// 订单状态
    private String orderTotalNum;
    private String totalPrice;
    private String recOrderNum;
    private String recOrderAmt;
    private String rejOrderNum;
    private String rejOrderAmt;
    private String crReqTotalAmt;
    private String syncDate;
    private String selDate;
    private String peopleType;
    
    private String planPayDate;
    
    private String orderBy;
    
    private String orderByName;
    
    private String orderIds;
    private String opearte;
    /**
     * aciviti
     **/
	private String launchRoleId;
    private String agree;
    private String advice;
    private String taskId;
    private String procInstId;
    private String userId; // 用户
    private String activitiKey;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }



    public String getOrderTotalNum() {
        return orderTotalNum;
    }

    public void setOrderTotalNum(String orderTotalNum) {
        this.orderTotalNum = orderTotalNum;
    }

    public String getRecOrderNum() {
        return recOrderNum;
    }

    public void setRecOrderNum(String recOrderNum) {
        this.recOrderNum = recOrderNum;
    }

    public String getRecOrderAmt() {
        return recOrderAmt;
    }

    public void setRecOrderAmt(String recOrderAmt) {
        this.recOrderAmt = recOrderAmt;
    }

    public String getCrReqTotalAmt() {
        return crReqTotalAmt;
    }

    public void setCrReqTotalAmt(String crReqTotalAmt) {
        this.crReqTotalAmt = crReqTotalAmt;
    }

    public String getSyncDate() {
        return syncDate;
    }

    public void setSyncDate(String syncDate) {
        this.syncDate = syncDate;
    }

    public String getSelDate() {
        return selDate;
    }

    public void setSelDate(String selDate) {
        this.selDate = selDate;
    }
    public String getAgree() {
        return agree;
    }

    public void setAgree(String agree) {
        this.agree = agree;
    }

    public String getAdvice() {
        return advice;
    }

    public void setAdvice(String advice) {
        this.advice = advice;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getProcInstId() {
        return procInstId;
    }

    public void setProcInstId(String procInstId) {
        this.procInstId = procInstId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getActivitiKey() {
        return activitiKey;
    }

    public void setActivitiKey(String activitiKey) {
        this.activitiKey = activitiKey;
    }

	public String getBatchId() {
		return batchId;
	}

	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getLaunchRoleId() {
		return launchRoleId;
	}

	public void setLaunchRoleId(String launchRoleId) {
		this.launchRoleId = launchRoleId;
	}

	public String getPlanPayDate() {
		return planPayDate;
	}

	public void setPlanPayDate(String planPayDate) {
		this.planPayDate = planPayDate;
	}

	public String getPeopleType() {
		return peopleType;
	}

	public void setPeopleType(String peopleType) {
		this.peopleType = peopleType;
	}

	public String getOrderBy() {
		return orderBy;
	}

	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}

	public String getOrderByName() {
		return orderByName;
	}

	public void setOrderByName(String orderByName) {
		this.orderByName = orderByName;
	}

	public String getStoreId() {
		return storeId;
	}

	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	public String getRejOrderNum() {
		return rejOrderNum;
	}

	public void setRejOrderNum(String rejOrderNum) {
		this.rejOrderNum = rejOrderNum;
	}

	public String getRejOrderAmt() {
		return rejOrderAmt;
	}

	public void setRejOrderAmt(String rejOrderAmt) {
		this.rejOrderAmt = rejOrderAmt;
	}

	public String getOrderIds() {
		return orderIds;
	}

	public void setOrderIds(String orderIds) {
		this.orderIds = orderIds;
	}

	public String getOpearte() {
		return opearte;
	}

	public void setOpearte(String opearte) {
		this.opearte = opearte;
	}

}
