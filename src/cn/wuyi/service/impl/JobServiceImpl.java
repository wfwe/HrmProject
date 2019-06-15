package cn.wuyi.service.impl;

import cn.wuyi.dao.JobDao;
import cn.wuyi.dao.impl.JobDaoImpl;
import cn.wuyi.domain.Dept;
import cn.wuyi.domain.Job;
import cn.wuyi.domain.PageBean;
import cn.wuyi.service.JobService;
import net.sf.json.JSONArray;

import java.util.List;

public class JobServiceImpl implements JobService {
    private JobDao jobDao = new JobDaoImpl();
    @Override
    public int addJob(Job job) {
        return jobDao.addJob(job);
    }

    @Override
    public List<Job> selectAllJob() {
        return jobDao.selectAllJob();
    }

    @Override
    public String selectJob() {
        List<Job> jobList = jobDao.selectAllJob();
        String jtn = JSONArray.fromObject(jobList).toString();

        return jtn;
    }

    @Override
    public String selectjssonJob(int pageNumber, int pageSize) {
        int totalRecord = jobDao.getTotalRecord();
        PageBean<Job> pageBean = new PageBean<>(pageNumber,pageSize,totalRecord);
        List<Job> jobList = jobDao.selectJob(pageBean.getStartIndex(),pageBean.getPageSize());
        String rtn="{'title':0,'rows':[]}";
        if (jobList.size() > 0)
        {
            rtn = "{\"total\":"+pageBean.getTotalRecord()+",\"rows\":"+JSONArray.fromObject(jobList).toString()+"}";
        }

        return rtn;

    }
}
