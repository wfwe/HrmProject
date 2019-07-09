package cn.wuyi.service.impl;

import cn.wuyi.dao.UserDao;
import cn.wuyi.dao.impl.UserDaoImpl;
import cn.wuyi.domain.Dept;
import cn.wuyi.domain.PageBean;
import cn.wuyi.domain.User;
import cn.wuyi.service.UserService;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import java.util.List;

/**
 * UserService实现类
 * @author newuser
 *
 */
public class UserServiceImpl implements UserService {
private UserDao userdao = new UserDaoImpl();
	
	@Override
	public int loginByLoginname(User user) {
		User user_rs = userdao.findByLoginname(user);
		//如果返回的结果！=null说明有这个用户，将这个用户返回的密码与用户输入的密码做比较
		if(user_rs!=null) {
			
			if(user.getPassword().equals(user_rs.getPassword())) {
				
				//登录成功
				return 2;
			}else {
				//密码错误
				return 1;
			}
			
		}
		//没有这个用户
		return 0;
	}

	//添加用户
	@Override
	public int addUser(User user) {
		
		return userdao.addUser(user);
	}

	@Override
	public String selectAllUser(int pageNumber, int pageSize) {
		int totalRecord = userdao.getTotalRecord();
		PageBean<User> pageBean = new PageBean<>(pageNumber,pageSize,totalRecord);
		List<User>	data = userdao.selectAllUser(pageBean.getStartIndex(),pageBean.getPageSize());
		pageBean.setData(data);
		String rtn="{'total':0,'rows':[]}";
		if (data.size() > 0)
		{
			rtn = "{\"total\":"+totalRecord+",\"rows\":"+ com.alibaba.fastjson.JSONObject.toJSON(data).toString() +"}";
		}
		return rtn;
	}



}
