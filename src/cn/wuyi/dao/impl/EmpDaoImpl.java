package cn.wuyi.dao.impl;

import cn.wuyi.dao.EmpDao;
import cn.wuyi.domain.Emp;
import cn.wuyi.util.C3P0Utils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
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

    @Override
    public int addEmp(Emp emp) {
        // 新增用户
        try {
            QueryRunner queryRunner = new QueryRunner(C3P0Utils.getDataSource());
            String sql = "insert into employee_inf(dept_id,job_id,name,card_id,address,post_code,tel,qq_num,email,sex,party,race,education,speciality,hobby,remark,create_date,birthday)" +
                    "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
            //将当前时间转换成指定的格式
           String create_date= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
            Object info[] = {Integer.parseInt(emp.getDept_name()),Integer.parseInt(emp.getJob_name()),emp.getName(),emp.getCard_id(),emp.getAddress(),
            emp.getPost_code(),emp.getTel(),emp.getQq_num(),emp.getEmail(), emp.getSex(),emp.getParty(),
            emp.getRace(),emp.getEducation(),emp.getSpeciality(),emp.getHobby(),emp.getRemark(),create_date,emp.getBirthday()};
            queryRunner.execute(sql,info);
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
        return 1;
    }
}
