package cn.wuyi.web;

import cn.wuyi.domain.Dept;
import cn.wuyi.service.DeptService;
import cn.wuyi.service.UserService;
import cn.wuyi.service.impl.DeptServiceImpl;
import cn.wuyi.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/AddDeptServlet")
public class AddDeptServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 处理中文乱码
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf8");
        //处理客户端获取到的数据
        String deptName = request.getParameter("deptName");
        String remark = request.getParameter("remark");
        //封装数据
        Dept dept = new Dept();
        dept.setName(deptName);
        dept.setRemark(remark);
        //调用service方法
        DeptService deptService = new DeptServiceImpl();
        int rt = deptService.addDept(dept);
        if (rt !=0 ){
            response.getWriter().append("1");
        }else{
            response.getWriter().append("0");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
