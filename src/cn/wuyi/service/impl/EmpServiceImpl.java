package cn.wuyi.service.impl;

import cn.wuyi.dao.EmpDao;
import cn.wuyi.dao.impl.EmpDaoImpl;
import cn.wuyi.domain.Emp;
import cn.wuyi.service.EmpService;

import java.util.List;

public class EmpServiceImpl implements EmpService {
    private EmpDao empDao = new EmpDaoImpl();
    @Override
    public List<Emp> selectAllEmp() {
        return empDao.selectAllEmp();
    }
}
