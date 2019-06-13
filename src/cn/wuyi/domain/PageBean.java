package cn.wuyi.domain;

import java.util.List;

public class PageBean<T> {
    private int pageNumber;     //当前页
    private int pageSize;       //每页显示个数
    private int totalRecord;    //总记录数
    private int totolPage;      //总分页数
    private int startIndex;     //开始索引
    private List<T> data;       //分页查询的数据

    public PageBean(int pageNumber, int pageSize, int totalRecord) {
        this.pageNumber = pageNumber;
        this.pageSize = pageSize;
        this.totalRecord = totalRecord;
        //总分页数
        this.totolPage = (this.totalRecord + this.pageNumber - 1) / this.pageSize;
        //开始索引
        this.startIndex = (this.pageNumber-1)*this.pageSize;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public PageBean() {
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalRecord() {
        return totalRecord;
    }

    public void setTotalRecord(int totalRecord) {
        this.totalRecord = totalRecord;
    }

    public int getTotolPage() {
        return totolPage;
    }

    public void setTotolPage(int totolPage) {
        this.totolPage = totolPage;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
