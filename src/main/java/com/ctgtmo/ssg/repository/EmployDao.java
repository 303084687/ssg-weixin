package com.ctgtmo.ssg.repository;

import java.util.List;

import com.ctgtmo.ssg.model.EmployAttachment;
import com.ctgtmo.ssg.model.EmployCertificate;
import com.ctgtmo.ssg.model.EmployCompanyRelation;
import com.ctgtmo.ssg.model.EmployEducation;
import com.ctgtmo.ssg.model.EmployFamilyRelation;
import com.ctgtmo.ssg.model.EmployLinkman;
import com.ctgtmo.ssg.model.EmployOfficeRecord;
import com.ctgtmo.ssg.model.EmployPositional;
import com.ctgtmo.ssg.model.EmployTrainExperience;
import com.ctgtmo.ssg.model.EmployWorkExperience;

/**
 * <p>ClassName: EmployDao.java</p>
 * <p>Company: 乾通互联(北京)科技有限公司</p>
 * <p>Description:员工信息接口 </p>
 * <p>author wanggongliang</p>
 * <p>2018年12月4日 下午2:40:18</p>
 */
public interface EmployDao {

    /*********************************************员工-基本资料附件************************************************************/
    //增加附件
    public int addAttachment(EmployAttachment attachment);

    /*********************************************员工-证书/证件记录***********************************************************/
    //增加证书
    public int addCertificate(EmployCertificate employCertificate);

    /*********************************************员工-本公司员工关系**********************************************************/
    //增加员工和本公司员工关系
    public int addCompanyRelation(EmployCompanyRelation companyRelation);

    /*********************************************员工-教育经历****************************************************************/
    //增加教育经历
    public int addEducation(EmployEducation education);

    /*********************************************员工-家庭关系****************************************************************/
    //增加员工家庭关系
    public int addFamilyRelation(EmployFamilyRelation employFamilyRelation);

    /*********************************************员工-紧急联系人**************************************************************/
    //增加员工紧急联系人
    public int addLinkman(EmployLinkman linkman);

    //查看员工紧急联系人列表
    public List<EmployLinkman> queryLinkmanList(String employId);

    /*********************************************员工-任职记录****************************************************************/
    //增加任职记录
    public int addOfferRecord(EmployOfficeRecord officeRecord);

    /*********************************************员工-职称记录****************************************************************/
    //增加职称
    public int addPositional(EmployPositional positional);

    /*********************************************员工-培训记录****************************************************************/
    //增加培训记录
    public int addTrain(EmployTrainExperience trainExperience);

    /*********************************************员工-工作经历记录************************************************************/
    //增加工作记录
    public int addWork(EmployWorkExperience workExperience);

}
