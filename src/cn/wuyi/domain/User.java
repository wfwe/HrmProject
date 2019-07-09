package cn.wuyi.domain;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.util.Date;

/**
 * 这是一个javabean类：
 * 
 * 什么是javaBean类：
 * 
 * 1.javabean类就是一个标准的java类
 * 
 * 2.必须实现序列化接口（开发中很多时候偷懒省略了）
 * 
 * 3.有get()和set方法(不能偷懒)
 * 
 * 4.有无参构造器（开发中很多时候偷懒省略了）
 * @author newuser
 *
 */
public class User implements Serializable {
	private int id;//id
	private String loginname;//登录名
	private String password;//密码
	private int status;//状态
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	private Date createdate;//创建时间
	private String username ;//用户名
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLoginname() {
		return loginname;
	}
	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public Date getCreatedate() {
		return createdate;
	}
	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public User() {
		super();
	}
	public User(int id, String loginname, String password, int status, Date createdate, String username) {
		super();
		this.id = id;
		this.loginname = loginname;
		this.password = password;
		this.status = status;
		this.createdate = createdate;
		this.username = username;
	}
	//toString（）,方便输出
	@Override
	public String toString() {
		return "User [id=" + id + ", loginname=" + loginname + ", password=" + password + ", status=" + status
				+ ", createdate=" + createdate + ", username=" + username + "]";
	}
	
	
	
	
	
	
}
