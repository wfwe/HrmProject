package cn.wuyi.domain;

import java.io.Serializable;
import java.util.Date;

public class Emp implements Serializable{
    private String dept_name;
    private String job_name;
    private int id;     //员工id
    private String name;//员工名字
    private String card_id; //员工卡id
    private String address; //地址
    private String post_code; //邮政编码
    private String tel;
    private String phone;
    private String qq_num;
    private String email;
    private int sex;
    private String party; //政治面貌
    private String birthday;
    private String race; //族
    private String education; //教育背景
    private String speciality;  //专业
    private String hobby;
    private String remark;
    private Date create_date;

    public Emp() {
    }

    public String getDept_name() {
        return dept_name;
    }

    public void setDept_name(String dept_name) {
        this.dept_name = dept_name;
    }

    public String getJob_name() {
        return job_name;
    }

    public void setJob_name(String job_name) {
        this.job_name = job_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCard_id() {
        return card_id;
    }

    public void setCard_id(String card_id) {
        this.card_id = card_id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPost_code() {
        return post_code;
    }

    public void setPost_code(String post_code) {
        this.post_code = post_code;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getQq_num() {
        return qq_num;
    }

    public void setQq_num(String qq_num) {
        this.qq_num = qq_num;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getParty() {
        return party;
    }

    public void setParty(String party) {
        this.party = party;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getCreate_date() {
        return create_date;
    }


    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    public Emp(String job_name, int id, String name, String card_id, String address, String post_code, String tel, String phone, String qq_num, String email, int sex, String party, String birthday, String race, String education, String speciality, String hobby, String remark, Date create_date) {
        this.job_name = job_name;
        this.id = id;
        this.name = name;
        this.card_id = card_id;
        this.address = address;
        this.post_code = post_code;
        this.tel = tel;
        this.phone = phone;
        this.qq_num = qq_num;
        this.email = email;
        this.sex = sex;
        this.party = party;
        this.birthday = birthday;
        this.race = race;
        this.education = education;
        this.speciality = speciality;
        this.hobby = hobby;
        this.remark = remark;
        this.create_date = create_date;
    }
}
