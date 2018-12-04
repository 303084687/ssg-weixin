package com.ctgtmo.ssg.model;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>ClassName: EmployWorkExperience.java</p>
 * <p>Company: 乾通互联(北京)科技有限公司</p>
 * <p>Description: 员工-工作经历记录表</p>
 * <p>author wanggongliang</p>
 * <p>2018年10月24日 上午10:00:29</p>
 */
public class EmployWorkExperience implements Serializable {
    private static final long serialVersionUID = 1L;

    private int id;//主键自增长

    private String employId;//员工主键

    private String companyName;//工作单位

    private String postName;//职务名称

    private String startTime;//工作开始时间

    private String endTime;//工作结束时间

    private String referenceName;//证明人

    private String referencePhone;//证明人电话

    private String reason;//离职原因

    private String salary;//薪资

    private String remark;//备注

    private Date createTime;//创建时间

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmployId() {
        return employId;
    }

    public void setEmployId(String employId) {
        this.employId = employId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getReferenceName() {
        return referenceName;
    }

    public void setReferenceName(String referenceName) {
        this.referenceName = referenceName;
    }

    public String getReferencePhone() {
        return referencePhone;
    }

    public void setReferencePhone(String referencePhone) {
        this.referencePhone = referencePhone;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
