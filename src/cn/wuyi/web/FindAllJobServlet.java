package cn.wuyi.web;

import cn.wuyi.domain.Job;
import cn.wuyi.service.JobService;
import cn.wuyi.service.impl.JobServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/FindAllJobServlet")
public class FindAllJobServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");

        JobService jobService = new JobServiceImpl();
        List<Job> jobList = jobService.selectAllJob();

        request.getSession().setAttribute("jobList",jobList);
        request.getRequestDispatcher("/main.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
