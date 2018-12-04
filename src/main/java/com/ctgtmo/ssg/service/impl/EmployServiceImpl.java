package com.ctgtmo.ssg.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ctgtmo.ssg.model.EmployLinkman;
import com.ctgtmo.ssg.repository.EmployDao;
import com.ctgtmo.ssg.service.EmployService;

/**
 * <p>ClassName: EmployServiceImpl.java</p>
 * <p>Company: 乾通互联(北京)科技有限公司</p>
 * <p>Description:员工业务处理实现类 </p>
 * <p>author wanggongliang</p>
 * <p>2018年12月4日 下午2:59:30</p>
 */
@Service("employService")
public class EmployServiceImpl implements EmployService {
    //注入dao层接口
    @Autowired
    private EmployDao employDao;

    /*********************************************员工-基本资料附件************************************************************/

    /*********************************************员工-证书/证件记录***********************************************************/

    /*********************************************员工-本公司员工关系**********************************************************/

    /*********************************************员工-教育经历****************************************************************/

    /*********************************************员工-家庭关系****************************************************************/

    /*********************************************员工-紧急联系人**************************************************************/
    //查看员工紧急联系人列表
    @Override
    @Transactional(readOnly = true)
    public List<EmployLinkman> queryLinkmanList(String employId) {
        List<EmployLinkman> list = new ArrayList<>();
        if (StringUtils.isNotBlank(employId)) {
            list = employDao.queryLinkmanList(employId);
        }
        return list;
    }

    /*********************************************员工-任职记录****************************************************************/

    /*********************************************员工-职称记录****************************************************************/

    /*********************************************员工-培训记录****************************************************************/

    /*********************************************员工-工作经历记录************************************************************/
}
