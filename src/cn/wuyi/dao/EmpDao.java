package cn.wuyi.dao;

import cn.wuyi.domain.Emp;

import java.util.List;

public interface EmpDao {
    List<Emp> selectAllEmp();
    //2.添加用户
    int addEmp(Emp emp);
}
