package cn.wuyi.domain;

import java.io.Serializable;

public class Dept implements Serializable {
    private int id;
    private String name;
    private String remark;

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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }

    public Dept(int id, String name, String remark) {
        this.id = id;
        this.name = name;
        this.remark = remark;
    }

    public Dept() {
    }
}
