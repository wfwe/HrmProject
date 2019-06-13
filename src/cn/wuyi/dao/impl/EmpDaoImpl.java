package cn.wuyi.dao.impl;

import cn.wuyi.dao.EmpDao;
import cn.wuyi.domain.Emp;
import cn.wuyi.domain.User;
import cn.wuyi.util.C3P0Utils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class EmpDaoImpl implements EmpDao {
    @Override
    public List<Emp> selectAllEmp() {
        List<Emp> empList =null;
        try {
            QueryRunner queryRunner = new QueryRunner(C3P0Utils.getDataSource());
            String sql = "SELECT e.NAME as name,dept.`name` as dept_name,job.`NAME` as job_name,CARD_ID as card_id,ADDRESS as address,POST_CODE as post_code,PHONE as phone,QQ_NUM as qq_num,EMAIL as email,SEX as sex,PARTY as party,BIRTHDAY as birthday,RACE as race,EDUCATION as education,SPECIALITY as speciality,HOBBY as hobby,e.REMARK as remark,CREATE_DATE as create_date FROM employee_inf e,dept_inf dept,job_inf job WHERE e.DEPT_ID = dept.ID AND e.JOB_ID = job.ID";
            empList = queryRunner.query(sql,new BeanListHandler<Emp>(Emp.class));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return empList;
    }
}
