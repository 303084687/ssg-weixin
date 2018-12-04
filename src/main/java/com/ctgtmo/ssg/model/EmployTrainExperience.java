package com.ctgtmo.ssg.model;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>ClassName: EmployTrainExperience.java</p>
 * <p>Company: 乾通互联(北京)科技有限公司</p>
 * <p>Description: </p>
 * <p>author wanggongliang</p>
 * <p>2018年10月24日 上午9:54:47</p>
 */
public class EmployTrainExperience implements Serializable {
    private static final long serialVersionUID = 1L;

    private int id;//主键自增长

    private String employId;//员工主键

    private String trainName;//培训名称

    private String trainStartTime;//培训开始时间

    private String trainEndTime;//培训结束时间

    private String trainUnit;//培训机构名称

    private String trainTotalTime;//培训总时长

    private String certificateNumber;//证书编号

    private String certificateName;//证书名称

    private String trainScore;//培训成绩

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

    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public String getTrainStartTime() {
        return trainStartTime;
    }

    public void setTrainStartTime(String trainStartTime) {
        this.trainStartTime = trainStartTime;
    }

    public String getTrainEndTime() {
        return trainEndTime;
    }

    public void setTrainEndTime(String trainEndTime) {
        this.trainEndTime = trainEndTime;
    }

    public String getTrainUnit() {
        return trainUnit;
    }

    public void setTrainUnit(String trainUnit) {
        this.trainUnit = trainUnit;
    }

    public String getTrainTotalTime() {
        return trainTotalTime;
    }

    public void setTrainTotalTime(String trainTotalTime) {
        this.trainTotalTime = trainTotalTime;
    }

    public String getCertificateNumber() {
        return certificateNumber;
    }

    public void setCertificateNumber(String certificateNumber) {
        this.certificateNumber = certificateNumber;
    }

    public String getCertificateName() {
        return certificateName;
    }

    public void setCertificateName(String certificateName) {
        this.certificateName = certificateName;
    }

    public String getTrainScore() {
        return trainScore;
    }

    public void setTrainScore(String trainScore) {
        this.trainScore = trainScore;
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
