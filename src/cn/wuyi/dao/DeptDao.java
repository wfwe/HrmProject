package cn.wuyi.dao;

import cn.wuyi.domain.Dept;

import java.util.List;

public interface DeptDao {
    int addDept(Dept dept);

    List<Dept> selectAllJob();

    List<Dept> selectJob(int currentPage, int pageSize);
}
