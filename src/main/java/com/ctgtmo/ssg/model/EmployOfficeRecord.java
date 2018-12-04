package com.ctgtmo.ssg.model;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>ClassName: EmployOfficeRecord.java</p>
 * <p>Company: 乾通互联(北京)科技有限公司</p>
 * <p>Description: 员工-任职记录表</p>
 * <p>author wanggongliang</p>
 * <p>2018年10月24日 上午9:31:16</p>
 */
public class EmployOfficeRecord implements Serializable {
    private static final long serialVersionUID = 1L;

    private int id;//主键自增长

    private String employId;//员工主键

    private String startTime;//任职开始时间

    private String endTime;//任职结束时间

    private String orgName;//组织名称-显示使用

    private String positionName;//岗位名称-显示使用

    private String positionTypeName;//岗位类别名称--显示时候使用

    private String positionLevelName;//岗位职级名称-显示使用

    private String contractCompanyName;//合同公司名称-显示使用

    private String workPlaceName;//工作地点名称-显示时候使用

    private String remark;//任职备注

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

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public String getPositionTypeName() {
        return positionTypeName;
    }

    public void setPositionTypeName(String positionTypeName) {
        this.positionTypeName = positionTypeName;
    }

    public String getPositionLevelName() {
        return positionLevelName;
    }

    public void setPositionLevelName(String positionLevelName) {
        this.positionLevelName = positionLevelName;
    }

    public String getContractCompanyName() {
        return contractCompanyName;
    }

    public void setContractCompanyName(String contractCompanyName) {
        this.contractCompanyName = contractCompanyName;
    }

    public String getWorkPlaceName() {
        return workPlaceName;
    }

    public void setWorkPlaceName(String workPlaceName) {
        this.workPlaceName = workPlaceName;
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
