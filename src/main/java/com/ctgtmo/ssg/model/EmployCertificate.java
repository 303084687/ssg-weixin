package com.ctgtmo.ssg.model;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>ClassName: EmployCertificate.java</p>
 * <p>Company: 乾通互联(北京)科技有限公司</p>
 * <p>Description: 员工-证书/附件记录表</p>
 * <p>author wanggongliang</p>
 * <p>2018年10月23日 下午5:28:21</p>
 */
public class EmployCertificate implements Serializable {
    private static final long serialVersionUID = 1L;

    private int id;//主键自增长

    private String employId;//员工主键

    private int certificateTypeId;//证书类型主键-关联证书类型表

    private String certificateName;//证书名称

    private String fetchTime;//发证时间

    private String assessName;//获取机构

    private String certificateNumber;//证书编号

    private String validityStartTime;//有效期开始

    private String validityEndTime;//有效期结束

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

    public int getCertificateTypeId() {
        return certificateTypeId;
    }

    public void setCertificateTypeId(int certificateTypeId) {
        this.certificateTypeId = certificateTypeId;
    }

    public String getCertificateName() {
        return certificateName;
    }

    public void setCertificateName(String certificateName) {
        this.certificateName = certificateName;
    }

    public String getFetchTime() {
        return fetchTime;
    }

    public void setFetchTime(String fetchTime) {
        this.fetchTime = fetchTime;
    }

    public String getAssessName() {
        return assessName;
    }

    public void setAssessName(String assessName) {
        this.assessName = assessName;
    }

    public String getCertificateNumber() {
        return certificateNumber;
    }

    public void setCertificateNumber(String certificateNumber) {
        this.certificateNumber = certificateNumber;
    }

    public String getValidityStartTime() {
        return validityStartTime;
    }

    public void setValidityStartTime(String validityStartTime) {
        this.validityStartTime = validityStartTime;
    }

    public String getValidityEndTime() {
        return validityEndTime;
    }

    public void setValidityEndTime(String validityEndTime) {
        this.validityEndTime = validityEndTime;
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
