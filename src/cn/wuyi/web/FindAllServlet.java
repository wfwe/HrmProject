package cn.wuyi.web;

import cn.wuyi.domain.PageBean;
import cn.wuyi.domain.User;
import cn.wuyi.service.UserService;
import cn.wuyi.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/FindAllServlet")
public class FindAllServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //处理乱码
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");
        int currentPage = 1;
        try {
            currentPage = Integer.parseInt(request.getParameter("page"));
        }catch (RuntimeException e){}
        int pageSize = 5;
        try {
            pageSize = Integer.parseInt(request.getParameter("rows"));
        }catch (RuntimeException e){}
        //查询所有用户
        UserService userService = new UserServiceImpl();
        String rtn = userService.selectAllUser(currentPage,pageSize);
        //将查询到的所有用户放入request域中
        //request.getSession().setAttribute("pageBean",pageBean);
        //请求转发到显示所有用户界面
        System.out.println(rtn);
        response.getWriter().print(rtn);
        //request.getRequestDispatcher("/main.jsp").forward(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
