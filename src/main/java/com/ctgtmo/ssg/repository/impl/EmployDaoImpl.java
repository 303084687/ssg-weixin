package com.ctgtmo.ssg.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.stereotype.Component;

import com.ctgtmo.ssg.config.MySqlDao;
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
import com.ctgtmo.ssg.repository.EmployDao;
import com.ctgtmo.ssg.utils.sql.EmploySql;

/**
 * <p>ClassName: EmployDao.java</p>
 * <p>Company: 乾通互联(北京)科技有限公司</p>
 * <p>Description:员工信息接口 </p>
 * <p>author wanggongliang</p>
 * <p>2018年12月4日 下午2:40:18</p>
 */
@Component
public class EmployDaoImpl implements EmployDao {
    @Autowired
    private MySqlDao mySqlDao;

    /*********************************************员工-基本资料附件************************************************************/
    //增加附件
    @Override
    public int addAttachment(EmployAttachment attachment) {
        return 0;
    }

    /*********************************************员工-证书/证件记录***********************************************************/
    //增加证书
    @Override
    public int addCertificate(EmployCertificate employCertificate) {
        return 0;
    }

    /*********************************************员工-本公司员工关系**********************************************************/
    //增加员工和本公司员工关系
    @Override
    public int addCompanyRelation(EmployCompanyRelation companyRelation) {
        return 0;
    }

    /*********************************************员工-教育经历****************************************************************/
    //增加教育经历
    @Override
    public int addEducation(EmployEducation education) {
        return 0;
    }

    /*********************************************员工-家庭关系****************************************************************/
    //增加员工家庭关系
    @Override
    public int addFamilyRelation(EmployFamilyRelation employFamilyRelation) {
        return 0;
    }

    /*********************************************员工-紧急联系人**************************************************************/
    //增加员工紧急联系人
    @Override
    public int addLinkman(EmployLinkman linkman) {
        return 0;
    }

    //查看员工紧急联系人列表
    @Override
    public List<EmployLinkman> queryLinkmanList(String employId) {
        //员工-紧急联系人
        List<EmployLinkman> linkmanList = mySqlDao.getNamedParamterDao().query(EmploySql.QUERY_LINKMAN_LIST,
                new MapSqlParameterSource().addValue("employId", employId), new BeanPropertyRowMapper<>(EmployLinkman.class));
        return linkmanList;
    }

    /*********************************************员工-任职记录****************************************************************/
    //增加任职记录
    @Override
    public int addOfferRecord(EmployOfficeRecord officeRecord) {
        return 0;
    }

    /*********************************************员工-职称记录****************************************************************/
    //增加职称
    @Override
    public int addPositional(EmployPositional positional) {
        return 0;
    }

    /*********************************************员工-培训记录****************************************************************/
    //增加培训记录
    @Override
    public int addTrain(EmployTrainExperience trainExperience) {
        return 0;
    }

    /*********************************************员工-工作经历记录************************************************************/
    //增加工作记录
    @Override
    public int addWork(EmployWorkExperience workExperience) {
        return 0;
    }

}
