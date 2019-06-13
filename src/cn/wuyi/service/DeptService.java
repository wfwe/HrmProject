package cn.wuyi.service;

import cn.wuyi.domain.Dept;

import java.util.List;

public interface DeptService {
    int addDept(Dept dept);

    String selectAllDept(int currentPage,int pageSize);

    String selectDept();
}
