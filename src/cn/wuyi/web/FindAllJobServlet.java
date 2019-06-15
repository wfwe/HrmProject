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
        String jtn;
        if (request.getParameter("page")==null&&request.getParameter("rows")==null)
        {
            jtn = jobService.selectJob();
            response.getWriter().print(jtn);
        }else{
            int pageNumber = 0;
            pageNumber= Integer.parseInt(request.getParameter("page"));
            int pageSize = 0;
            pageSize= Integer.parseInt(request.getParameter("rows"));
            String jobList = jobService.selectjssonJob(pageNumber,pageSize);
            System.out.println(jobList);
            response.getWriter().print(jobList);
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
