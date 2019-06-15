package cn.wuyi.service;

import cn.wuyi.domain.Job;

import java.util.List;

public interface JobService {
    int addJob(Job job);

    String selectJob();
    List<Job> selectAllJob();
    String selectjssonJob(int pageNumber, int pageSize);
}
