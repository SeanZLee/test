package com.kakarote.crm9.erp.admin.entity.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseAdminExamineStep<M extends BaseAdminExamineStep<M>> extends Model<M> implements IBean {

	public void setStepId(java.lang.Long stepId) {
		set("step_id", stepId);
	}
	
	public java.lang.Long getStepId() {
		return getLong("step_id");
	}

	public void setStepType(java.lang.Integer stepType) {
		set("step_type", stepType);
	}
	
	public java.lang.Integer getStepType() {
		return getInt("step_type");
	}

	public void setExamineId(java.lang.Integer examineId) {
		set("examine_id", examineId);
	}
	
	public java.lang.Integer getExamineId() {
		return getInt("examine_id");
	}

	public void setCheckUserId(java.lang.String checkUserId) {
		set("check_user_id", checkUserId);
	}
	
	public java.lang.String getCheckUserId() {
		return getStr("check_user_id");
	}

	public void setStepNum(java.lang.Integer stepNum) {
		set("step_num", stepNum);
	}
	
	public java.lang.Integer getStepNum() {
		return getInt("step_num");
	}

	public void setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
	}
	
	public java.util.Date getCreateTime() {
		return get("create_time");
	}

	public void setRemarks(java.lang.String remarks) {
		set("remarks", remarks);
	}
	
	public java.lang.String getRemarks() {
		return getStr("remarks");
	}

}