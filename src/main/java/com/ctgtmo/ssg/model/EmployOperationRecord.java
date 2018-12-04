package com.ctgtmo.ssg.model;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>ClassName: EmployOperationRecord.java</p>
 * <p>Company: 乾通互联(北京)科技有限公司</p>
 * <p>Description: 员工-操作记录表</p>
 * <p>author wanggongliang</p>
 * <p>2018年10月24日 上午9:40:54</p>
 */
public class EmployOperationRecord implements Serializable {

    private static final long serialVersionUID = 1L;

    private int id;//操作日志id

    private String employId;//员工主键id

    private int type;//操作类型

    private String remark;//操作备注

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

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
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
