package cn.wuyi.service;

import cn.wuyi.domain.Job;

import java.util.List;

public interface JobService {
    int addJob(Job job);

    List<Job> selectAllJob();

    String selectJob();
}
