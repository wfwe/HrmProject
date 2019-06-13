package cn.wuyi.dao.impl;

import cn.wuyi.dao.DeptDao;
import cn.wuyi.domain.Dept;
import cn.wuyi.domain.Job;
import cn.wuyi.util.C3P0Utils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class DeptDaoImpl implements DeptDao {
    @Override
    public int addDept(Dept dept) {
        // 新增部门
        try {
            QueryRunner queryRunner = new QueryRunner(C3P0Utils.getDataSource());
            String sql = "insert into dept_inf(name,remark) values(?,?);";
            //将当前时间转换成指定的格式
            String info[] = {dept.getName(),dept.getRemark()};
            queryRunner.execute(sql,info);
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
        return 1;
    }

    @Override
    public List<Dept> selectAllJob() {
        List<Dept> deptList =null;
        try {
            QueryRunner queryRunner = new QueryRunner(C3P0Utils.getDataSource());
            String sql = "select * from dept_inf";
            deptList = queryRunner.query(sql,new BeanListHandler<Dept>(Dept.class));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return deptList;
    }

    @Override
    public List<Dept> selectJob(int currentPage, int pageSize) {
        List<Dept> deptList =null;
        try {
            QueryRunner queryRunner = new QueryRunner(C3P0Utils.getDataSource());
            String sql = "select * from dept_inf limit ?,?";
            Object[] parms = {currentPage,pageSize};
            deptList = queryRunner.query(sql,new BeanListHandler<Dept>(Dept.class),parms);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return deptList;
    }
}
