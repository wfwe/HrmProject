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

@WebServlet("/AddEmpServlet")
public class AddEmpServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // 处理中文乱码
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf8");

        //从客户端获取数据
        String name =request.getParameter("username");
        String card_id =request.getParameter("card_id");
        String address =request.getParameter("address");
        String post_code =request.getParameter("post_code");
        String qq_num =request.getParameter("qq_num");
        String email =request.getParameter("email");
        String party =request.getParameter("party");
        int sex = Integer.parseInt(request.getParameter("sex"));
        String race =request.getParameter("race");
        String education =request.getParameter("education");
        String speciality =request.getParameter("speciality");
        String hobby =request.getParameter("hobby");
        String remark =request.getParameter("remark");
        String tel =request.getParameter("tel");
        String dept_name = request.getParameter("dept_name");
        String job_name = request.getParameter("job_name");
        String birthday= request.getParameter("birthday");

        //将得到的数据封装到对象中
        Emp emp = new Emp();
        emp.setName(name);
        emp.setCard_id(card_id);
        emp.setAddress(address);
        emp.setPost_code(post_code);
        emp.setQq_num(qq_num);
        emp.setEmail(email);
        emp.setSex(sex);
        emp.setParty(party);
        emp.setRace(race);
        emp.setEducation(education);
        emp.setSpeciality(speciality);
        emp.setHobby(hobby);
        emp.setDept_name(dept_name);
        emp.setJob_name(job_name);
        emp.setTel(tel);
        emp.setRemark(remark);
        emp.setBirthday(birthday);

        // 调用service中的添加方法
        EmpService ep = new EmpServiceImpl();
        int rs = ep.addEmp(emp);
        if (rs != 0) {
            // 将数据放回给页面
            response.getWriter().append("1");
        } else {
            // 将数据放回给页面
            response.getWriter().append("0");
        }





    }
}
