package cn.wuyi.service;

import cn.wuyi.domain.Dept;
import cn.wuyi.domain.Job;
import cn.wuyi.domain.PageBean;
import cn.wuyi.domain.User;

import java.util.List;

/**
 * userservice的接口
 * 
 * 接口不能实例化，必须通过实行类
 * @author newuser
 *
 */
public interface UserService {
	//1.一个抽象方法，完成用户登录判断：return int : 0-->没有这个用户，1--->密码错误，2---->登录成功
	int loginByLoginname(User user);
	
	//2.添加用户的方法
	int addUser(User user);

	//3.查询所有用户
	String selectAllUser(int pageNumber, int pageSize);




}
