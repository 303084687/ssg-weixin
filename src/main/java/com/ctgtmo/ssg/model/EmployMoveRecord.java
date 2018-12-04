package com.ctgtmo.ssg.model;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>ClassName: EmployMoveRecord.java</p>
 * <p>Company: 乾通互联(北京)科技有限公司</p>
 * <p>Description:员工-人事异动记录 </p>
 * <p>author wanggongliang</p>
 * <p>2018年10月24日 上午9:24:47</p>
 */
public class EmployMoveRecord implements Serializable {
    private static final long serialVersionUID = 1L;

    private int id;//异动记录id

    private String employId;//员工主键id

    private int foreignId;//关联异动表的主键

    private String approveNumber;//审批单号

    private String type;//异动类型 调岗 晋升 降级 转全职员工

    private String detail;//异动详情

    private String remark;//备注

    private Date createTime;//创建日期

    public int getForeignId() {
        return foreignId;
    }

    public void setForeignId(int foreignId) {
        this.foreignId = foreignId;
    }

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

    public String getApproveNumber() {
        return approveNumber;
    }

    public void setApproveNumber(String approveNumber) {
        this.approveNumber = approveNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
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
