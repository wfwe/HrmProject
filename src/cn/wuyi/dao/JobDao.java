package cn.wuyi.dao;

import cn.wuyi.domain.Job;

import java.util.List;

public interface JobDao {
    int addJob(Job job);

    List<Job> selectAllJob();
}
