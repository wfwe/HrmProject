package cn.wuyi.web;

import cn.wuyi.domain.Dept;
import cn.wuyi.service.DeptService;
import cn.wuyi.service.impl.DeptServiceImpl;
import net.sf.json.JSONArray;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/FindAllDeptServlet")
public class FindAllDeptServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");


        DeptService deptService = new DeptServiceImpl();
        String rtn;
        if (request.getParameter("page") == null && request.getParameter("rows") == null){
             rtn = deptService.selectDept();
            response.getWriter().print(rtn);
        }else {
            int currentPage= Integer.parseInt(request.getParameter("page"));
            int pageSize= Integer.parseInt(request.getParameter("rows"));
            rtn = deptService.selectAllDept(currentPage,pageSize);
            System.out.println(rtn);
            response.getWriter().print(rtn);
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
