package com.ctgtmo.ssg.model;

import java.io.Serializable;

/**
 * <p>ClassName: employAttachment.java</p>
 * <p>Company: 乾通互联(北京)科技有限公司</p>
 * <p>Description: 员工-基本资料附件表</p>
 * <p>author wanggongliang</p>
 * <p>2018年10月23日 下午5:11:45</p>
 */
public class EmployAttachment implements Serializable {
    private static final long serialVersionUID = 1L;

    private int id;//主键自增长

    private String employId;//员工主键id

    private String fileName;//附件名称

    private String fileSize;//文件大小

    private String fileAddress;//附件的oss地址，oss的key值

    private int source;//来源 1：电签 2：附件

    private Integer thirdId;//附件关联第三方表的主键，如合同附件

    private int fileCategoryType;//附件所属大类1基本资料 2员工档案资料3离职资料

    private String fileCategoryName;//附件所属小类名称

    private String description;//附件描述

    private String uploader;//上传人

    private String createTime;//上传时间

    private String employName;//Y员工姓名

    private String fileType;//图片类型

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public String getEmployName() {
        return employName;
    }

    public void setEmployName(String employName) {
        this.employName = employName;
    }

    public int getSource() {
        return source;
    }

    public void setSource(int source) {
        this.source = source;
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

    public String getFileCategoryName() {
        return fileCategoryName;
    }

    public void setFileCategoryName(String fileCategoryName) {
        this.fileCategoryName = fileCategoryName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileSize() {
        return fileSize;
    }

    public void setFileSize(String fileSize) {
        this.fileSize = fileSize;
    }

    public String getFileAddress() {
        return fileAddress;
    }

    public void setFileAddress(String fileAddress) {
        this.fileAddress = fileAddress;
    }

    public int getFileCategoryType() {
        return fileCategoryType;
    }

    public void setFileCategoryType(int fileCategoryType) {
        this.fileCategoryType = fileCategoryType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUploader() {
        return uploader;
    }

    public void setUploader(String uploader) {
        this.uploader = uploader;
    }

    public String getCreateTime() {
        return createTime.substring(0, createTime.length() - 2);
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public Integer getThirdId() {
        return thirdId;
    }

    public void setThirdId(Integer thirdId) {
        this.thirdId = thirdId;
    }

}
