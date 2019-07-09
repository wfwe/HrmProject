package cn.wuyi.domain;

import java.util.Date;

public class EmpDisplay extends Emp {
    private String deptName;
    private String jobName;

    public EmpDisplay(String deptName, String jobName) {
        this.deptName = deptName;
        this.jobName = jobName;
    }

    public EmpDisplay(String job_name, int id, String name, String card_id, String address, String post_code, String tel, String phone, String qq_num, String email, int sex, String party, String birthday, String race, String education, String speciality, String hobby, String remark, Date create_date, String deptName, String jobName) {
        super(job_name, id, name, card_id, address, post_code, tel, phone, qq_num, email, sex, party, birthday, race, education, speciality, hobby, remark, create_date);
        this.deptName = deptName;
        this.jobName = jobName;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }
}
