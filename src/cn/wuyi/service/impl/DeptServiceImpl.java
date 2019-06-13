package cn.wuyi.service.impl;

import cn.wuyi.dao.DeptDao;
import cn.wuyi.dao.impl.DeptDaoImpl;
import cn.wuyi.domain.Dept;
import cn.wuyi.domain.PageBean;
import cn.wuyi.service.DeptService;
import net.sf.json.JSONArray;

import java.util.List;

public class DeptServiceImpl implements DeptService {
    private DeptDao deptDao = new DeptDaoImpl();
    @Override
    public int addDept(Dept dept) {
        return deptDao.addDept(dept);
    }

    @Override
    public String selectAllDept(int currentPage,int pageSize) {

        List<Dept> deptList = deptDao.selectAllJob();
        PageBean<Dept> pageBean = new PageBean<>(currentPage,pageSize,deptList.size());
        String rtn="{'title':0,'rows':[]}";
        if (deptList.size() > 0)
        {
            List<Dept> deptList1 = deptDao.selectJob(pageBean.getStartIndex(),pageBean.getPageSize());
            rtn = " {\"total\":"+pageBean.getTotalRecord()+",\"rows\":"+JSONArray.fromObject(deptList1).toString()+"}";
        }
        return rtn;
    }

    @Override
    public String selectDept() {
        List<Dept> deptList = deptDao.selectAllJob();
        //String rtn="{'title':0,'rows':[]}";
        //if (deptList.size() > 0)
        //{
         //   List<Dept> deptList1 = deptDao.selectAllJob();
          //  rtn = " {\"total\":"+deptList.size()+",\"rows\":"+JSONArray.fromObject(deptList1).toString()+"}";
        //}
        String rtn = JSONArray.fromObject(deptList).toString();
        System.out.println(rtn);
        return rtn;
    }
}
