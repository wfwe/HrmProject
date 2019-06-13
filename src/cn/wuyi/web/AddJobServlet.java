package cn.wuyi.web;

import cn.wuyi.domain.Job;
import cn.wuyi.service.JobService;
import cn.wuyi.service.UserService;
import cn.wuyi.service.impl.JobServiceImpl;
import cn.wuyi.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/AddJobServlet")
public class AddJobServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");
        String jobName = request.getParameter("jobName");
        String remark = request.getParameter("remark");
        Job job = new Job();
        job.setName(jobName);
        job.setRemark(remark);

        JobService jobService = new JobServiceImpl();
        int rt = jobService.addJob(job);
        if (rt != 0){
            response.getWriter().append("1");
        }else {
            response.getWriter().append("0");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
