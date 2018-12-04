package com.ctgtmo.ssg.model;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>ClassName: employEducation.java</p>
 * <p>Company: 乾通互联(北京)科技有限公司</p>
 * <p>Description:员工-教育经历表 </p>
 * <p>author wanggongliang</p>
 * <p>2018年10月23日 下午5:38:55</p>
 */
public class EmployEducation implements Serializable {

    private static final long serialVersionUID = 1L;

    private int id;//主键自增长

    private String employId;//员工主键

    private int educationId;//学历主键-关联学历表

    private String schoolName;//院校名称

    private String major;//专业

    private String graduateTime;//毕业时间

    private String learnType;//学历形式-全日制 成人教育 远程教育 自学考试 其它非全日制

    private String degreeType;//学位类型 学士 硕士 博士 名誉博士 未取得学位

    private String degreeName;//学位名称

    private String graduateNumber;//毕业证书编号

    private String degreeNumber;//学位证书编号

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

    public int getEducationId() {
        return educationId;
    }

    public void setEducationId(int educationId) {
        this.educationId = educationId;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getGraduateTime() {
        return graduateTime;
    }

    public void setGraduateTime(String graduateTime) {
        this.graduateTime = graduateTime;
    }

    public String getLearnType() {
        return learnType;
    }

    public void setLearnType(String learnType) {
        this.learnType = learnType;
    }

    public String getDegreeType() {
        return degreeType;
    }

    public void setDegreeType(String degreeType) {
        this.degreeType = degreeType;
    }

    public String getDegreeName() {
        return degreeName;
    }

    public void setDegreeName(String degreeName) {
        this.degreeName = degreeName;
    }

    public String getGraduateNumber() {
        return graduateNumber;
    }

    public void setGraduateNumber(String graduateNumber) {
        this.graduateNumber = graduateNumber;
    }

    public String getDegreeNumber() {
        return degreeNumber;
    }

    public void setDegreeNumber(String degreeNumber) {
        this.degreeNumber = degreeNumber;
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
