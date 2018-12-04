package com.ctgtmo.ssg.model;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>ClassName: employCompanyRelation.java</p>
 * <p>Company: 乾通互联(北京)科技有限公司</p>
 * <p>Description:员工-本公司员工关系 </p>
 * <p>author wanggongliang</p>
 * <p>2018年10月23日 下午5:34:16</p>
 */
public class EmployCompanyRelation implements Serializable {

    private static final long serialVersionUID = 1L;

    private int id;//主键自增长

    private String employId;//关联员工主键

    private String name;//员工姓名

    private String relation;//关系

    private String phone;//电话

    private String departmentName;//部门名称

    private String remark;//备注

    private Date create_time;//创建时间

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

}
