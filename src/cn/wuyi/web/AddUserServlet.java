package cn.wuyi.web;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.wuyi.domain.User;
import cn.wuyi.service.UserService;
import cn.wuyi.service.impl.UserServiceImpl;

/**
 * Servlet implementation class AddUserServlet
 */
@WebServlet("/AddUserServlet")
public class AddUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 处理中文乱码
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf8");
		// 获取客户端的数据
		String userName = request.getParameter("userName");
		String loginName = request.getParameter("loginName");
		String password = request.getParameter("password");
		String status = request.getParameter("status");

		// 将得到的数据封装到对象中
		User user = new User();
		user.setCreatedate(new Date());
		user.setUsername(userName);
		user.setLoginname(loginName);
		user.setStatus(Integer.parseInt(status));
		user.setPassword(password);

		// 调用service中的添加方法
		UserService us = new UserServiceImpl();
		int rs = us.addUser(user);
		if (rs != 0) {
			// 将数据放回给页面
			response.getWriter().append("1");
		} else {
			// 将数据放回给页面
			response.getWriter().append("0");
		}
		System.out.println("用户名：" + userName);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
