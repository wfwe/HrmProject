package cn.wuyi.dao.impl;

import cn.wuyi.dao.JobDao;
import cn.wuyi.domain.Job;
import cn.wuyi.domain.User;
import cn.wuyi.util.C3P0Utils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.SQLException;
import java.util.List;

public class JobDaoImpl implements JobDao {
    @Override
    public int addJob(Job job) {
        // 新增职位
        try {
            QueryRunner queryRunner = new QueryRunner(C3P0Utils.getDataSource());
            String sql = "insert into job_inf(NAME,remark) values(?,?);";
            //将当前时间转换成指定的格式
            String info[] = {job.getName(),job.getRemark()};
            queryRunner.execute(sql,info);
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
        return 1;
    }

    @Override
    public List<Job> selectAllJob() {
        List<Job> jobList =null;
        try {
            QueryRunner queryRunner = new QueryRunner(C3P0Utils.getDataSource());
            String sql = "select * from job_inf ";
            jobList = queryRunner.query(sql,new BeanListHandler<Job>(Job.class));
            return jobList;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public int getTotalRecord() {
        try {
            QueryRunner queryRunner = new QueryRunner(C3P0Utils.getDataSource());
            String sql = "select count(*) from job_inf";
            Object[] parms = {};
            Long numLong = (Long) queryRunner.query(sql,new ScalarHandler(),parms);
            return numLong.intValue();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public List<Job> selectJob(int startIndex,int pageSize) {

        List<Job> jobList =null;
        try {
            QueryRunner queryRunner = new QueryRunner(C3P0Utils.getDataSource());
            String sql = "select * from job_inf limit ?,?";
            Object[] parms = {startIndex,pageSize};
            jobList = queryRunner.query(sql,new BeanListHandler<Job>(Job.class),parms);
            return jobList;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

