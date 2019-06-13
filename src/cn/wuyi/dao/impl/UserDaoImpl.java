package cn.wuyi.dao.impl;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.List;

import cn.wuyi.dao.UserDao;
import cn.wuyi.domain.Dept;
import cn.wuyi.domain.User;
import cn.wuyi.util.C3P0Utils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

/**
 * 操作数据库
 * @author newuser
 *
 */
public class UserDaoImpl implements UserDao {

	@Override
	public User findByLoginname(User user) {
		User getUser = null;
		try {
			QueryRunner queryRunner = new QueryRunner(C3P0Utils.getDataSource());
			String sql = "select * from user_inf where loginname=?";
			String parms[] = {user.getLoginname()};
			getUser = queryRunner.query(sql,new BeanHandler<User>(User.class),parms);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		System.out.println(getUser);
		return getUser;
	}

	
	//添加用户
	@Override
	public int addUser(User user) {
		// 新增用户
		try {
			QueryRunner queryRunner = new QueryRunner(C3P0Utils.getDataSource());
			String sql = "insert into user_inf(loginname,PASSWORD,STATUS,createdate,username) values(?,?,?,?,?);";
			//将当前时间转换成指定的格式
			String createTiem = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(user.getCreatedate());
			String info[] = {user.getLoginname(),user.getPassword(),user.getStatus()+"",createTiem,user.getUsername()};
			queryRunner.execute(sql,info);
		} catch (SQLException e) {
			e.printStackTrace();
			return 0;
		}
		return 1;
	}

	//3.查询所有用户
	@Override
	public List<User> selectAllUser(int startIndex,int pageSize) {
		List<User> userList =null;
		try {
			QueryRunner queryRunner = new QueryRunner(C3P0Utils.getDataSource());
			String sql = "select * from user_inf limit ?,?";
			Object[] parms = {startIndex,pageSize};
			userList = queryRunner.query(sql,new BeanListHandler<User>(User.class),parms);
			return userList;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

	@Override
	public int getTotalRecord() {
		try {
			QueryRunner queryRunner = new QueryRunner(C3P0Utils.getDataSource());
			String sql = "select count(*) from user_inf";
			Object[] parms = {};
			Long numLong = (Long) queryRunner.query(sql,new ScalarHandler(),parms);
			return numLong.intValue();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}


}
