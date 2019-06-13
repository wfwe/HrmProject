package cn.wuyi.web;

import cn.wuyi.domain.Emp;
import cn.wuyi.service.EmpService;
import cn.wuyi.service.impl.EmpServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/FinAllEmpServlet")
public class FinAllEmpServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");

        EmpService empService = new EmpServiceImpl();
        List<Emp> empList = empService.selectAllEmp();
        request.getSession().setAttribute("empList",empList);
        request.getRequestDispatcher("/main.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
