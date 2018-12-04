package com.ctgtmo.ssg.utils.sql;

/**
 * <p>ClassName: EmploySql.java</p>
 * <p>Company: 乾通互联(北京)科技有限公司</p>
 * <p>Description:员工属性sql </p>
 * <p>author wanggongliang</p>
 * <p>2018年12月4日 下午2:52:15</p>
 */
public class EmploySql {

    /*********************************************员工-基本资料附件************************************************************/

    //增加附件
    public static final String ADD_ATTACHMENT = "INSERT INTO employ_attachment(employ_id,file_name,file_address,file_size,file_category_name,file_category_type,description,uploader,third_id,source,create_time)"
            + "VALUES(:employId,:fileName,:fileAddress,:fileSize,:fileCategoryName,:fileCategoryType,:description,:uploader,:thirdId,:source,now())";

    /*********************************************员工-证书/证件记录***********************************************************/
    //根据员工主键查询证件记录
    public static final String QUERY_CERTIFICATE_LIST = "SELECT ty.`name` as certificate_type_name,ce.* FROM employ_certificate ce LEFT JOIN setup_certificate_type ty ON ty.id=ce.certificate_type_id WHERE ce.employ_id=:employId ORDER BY ce.id DESC";

    //增加证书
    public static final String ADD_CERTIFICATE = "INSERT INTO employ_certificate(employ_id,certificate_type_id,certificate_name,fetch_time,assess_name,certificate_number,validity_start_time,validity_end_time,remark,create_time)"
            + "VALUES(:employId,:certificateTypeId,:certificateName,:fetchTime,:assessName,:certificateNumber,:validityStartTime,:validityEndTime,:remark,now())";

    /*********************************************员工-本公司员工关系************************************************************/
    //根据员工主键查询与本公司员工记录
    public static final String QUERY_COMPANY_RELATION_LIST = "SELECT * FROM employ_company_relation WHERE employ_id=:employId ORDER BY id DESC";

    //增加员工和本公司员工关系
    public static final String ADD_COMPANY_RELATION = "INSERT INTO employ_company_relation(employ_id,name,relation,phone,department_name,remark,create_time)"
            + "VALUES(:employId,:name,:relation,:phone,:departmentName,:remark,now())";

    /*********************************************员工-教育经历****************************************************************/
    //根据员工主键查询教育记录
    public static final String QUERY_EDUCATION_LIST = "SELECT e.*,de.`name` as education_name,(SELECT count(third_id) FROM employ_attachment t WHERE t.third_id=e.id AND t.file_category_name='学历证明' AND t.employ_id=:employId) as file_count FROM employ_education e LEFT JOIN setup_degree de ON e.education_id=de.id WHERE e.employ_id=:employId";

    //增加教育经历
    public static final String ADD_EDUCATION = "INSERT INTO employ_education(employ_id,education_id,school_name,major,graduate_time,learn_type,degree_type,degree_name,graduate_number,degree_number,remark,create_time)"
            + "VALUES(:employId,:educationId,:schoolName,:major,:graduateTime,:learnType,:degreeType,:degreeName,:graduateNumber,:degreeNumber,:remark,now())";

    /*********************************************员工-家庭关系****************************************************************/
    //根据员工主键查询员工家庭关系记录
    public static final String QUERY_FAMILY_RELATION_LIST = "SELECT * FROM employ_family_relation WHERE employ_id=:employId ORDER BY id DESC";

    //增加员工家庭关系
    public static final String ADD_FAMILY_RELATION = "INSERT INTO employ_family_relation (employ_id,name,relation,phone,birth,work_place,position_name,create_time)"
            + "VALUES(:employId,:name,:relation,:phone,:birth,:workPlace,:positionName,now())";

    /*********************************************员工-紧急联系人**************************************************************/
    //根据员工主键查询紧急联系人记录
    public static final String QUERY_LINKMAN_LIST = "SELECT * FROM employ_linkman WHERE employ_id=:employId ORDER BY is_default,id DESC";

    //增加员工紧急联系人
    public static final String ADD_LINKMAN = "INSERT INTO employ_linkman(employ_id,link_name,link_relation,link_phone,link_address,is_default,create_time)"
            + "VALUES(:employId,:linkName,:linkRelation,:linkPhone,:linkAddress,:isDefault,now())";

    /*********************************************员工-任职记录****************************************************************/
    //根据员工主键查询任职记录
    public static final String QUERY_OFFER_RECORD_LIST = "SELECT * FROM employ_office_record WHERE employ_id=:employId ORDER BY id DESC";

    //增加任职记录
    public static final String ADD_OFFER_RECORD = "INSERT INTO employ_office_record (employ_id,start_time,end_time,org_name,position_name,position_level_name,contract_company_name,work_place_name,remark,"
            + "create_time,position_type_name) VALUES(:employId,:startTime,:endTime,:orgName,:positionName,:positionLevelName,:contractCompanyName,:workPlaceName,:remark,now(),:positionTypeName)";

    /*********************************************员工-职称记录****************************************************************/
    //根据员工主键查询职称记录
    public static final String QUERY_POSITIONAL_LIST = "SELECT * FROM employ_positional  WHERE employ_id=:employId ORDER BY id DESC";

    //增加职称
    public static final String ADD_POSITIONAL = "INSERT INTO employ_positional(employ_id,positional_name,fetch_time,assess_name,certificate_number,remark,create_time)"
            + "VALUES(:employId,:positionalName,:fetchTime,:assessName,:certificateNumber,:remark,now())";

    /*********************************************员工-培训记录****************************************************************/
    //根据员工主键查询培训记录
    public static final String QUERY_TRAIN_LIST = "SELECT * FROM employ_train_experience WHERE employ_id=:employId ORDER BY id DESC";

    //增加培训记录
    public static final String ADD_TRAIN = "INSERT INTO employ_train_experience(employ_id,train_name,train_start_time,train_end_time,train_unit,train_total_time,certificate_number,certificate_name,train_score,remark,create_time)"
            + "VALUES(:employId,:trainName,:trainStartTime,:trainEndTime,:trainUnit,:trainTotalTime,:certificateNumber,:certificateName,:trainScore,:remark,now())";

    /*********************************************员工-工作经历记录************************************************************/
    //根据员工主键查询工作记录
    public static final String QUERY_WORK_LIST = "SELECT * FROM employ_work_experience WHERE employ_id=:employId";

    //增加工作记录
    public static final String ADD_WORK = "INSERT INTO employ_work_experience(employ_id,company_name,post_name,start_time,end_time,reference_name,reference_phone,reason,salary,remark,create_time)"
            + "  VALUES(:employId,:companyName,:postName,:startTime,:endTime,:referenceName,:referencePhone,:reason,:salary,:remark,now())";

}
