package com.ctgtmo.ssg.model;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>ClassName: EmployPositional.java</p>
 * <p>Company: 乾通互联(北京)科技有限公司</p>
 * <p>Description: </p>
 * <p>author wanggongliang</p>
 * <p>2018年10月24日 上午9:47:20</p>
 */
public class EmployPositional implements Serializable {

    private static final long serialVersionUID = 1L;

    private int id;//主键自增长

    private String employId;//员工主键

    private String positionalName;//职称名称

    private String fetchTime;//获取时间

    private String assessName;//评定机构名称

    private String certificateNumber;//证书编号

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

    public String getPositionalName() {
        return positionalName;
    }

    public void setPositionalName(String positionalName) {
        this.positionalName = positionalName;
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
