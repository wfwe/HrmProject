<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加员工</title>
<link rel="stylesheet" type="text/css"
      href="easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="easyui/themes/icon.css">
<script type="text/javascript" src="easyui/jquery.min.js"></script>
<script type="text/javascript" src="easyui/jquery.easyui.min.js"></script>
</head>
<body>
<div style="margin: 20px 0;"></div>
<div class="easyui-panel" title="添加部门"
     style="width: 945px; height: 500px;">
    <div style="padding: 40px 60px 20px 60px;">
        <form id="ff" class="easyui-form" method="post">
            <table cellpadding="10">
                <tr>
                    <td>姓名:</td>
                    <td><input class="easyui-textbox" type="text" name="username"
                               data-options="required:true"></td>
                    <td>卡号:</td>
                    <td><input class="easyui-textbox" type="text" name="userid"
                               data-options="required:true"></td>
                    <td>邮政编码:</td>
                    <td><input class="easyui-textbox" type="text" name="postcode"
                               data-options="required:true"></td>
                </tr>
                <tr>
                    <td>电话:</td>
                    <td><input class="easyui-textbox" type="text" name="usertel"
                               data-options="required:true"></td>
                    <td>QQ:</td>
                    <td><input class="easyui-textbox" type="text" name="userqq"
                               data-options="required:true"></td>
                    <td>Email:</td>
                    <td><input class="easyui-textbox" type="text" name="email"
                               data-options="required:true"></td>
                </tr>
                <tr>
                    <td>地址:</td>
                    <td><input class="easyui-textbox" type="text" name="address"
                               data-options="required:true"></td>
                    <td>民族:</td>
                    <td><input class="easyui-textbox" type="text" name="race"
                               data-options="required:true"></td>
                    <td>生日:</td>
                    <td><input class="easyui-datebox" type="text" name="birthday"
                               data-options="required:true"></td>
                </tr>
                <tr>
                    <td>爱好:</td>
                    <td><input class="easyui-textbox" type="text" name="hobby"
                               data-options="required:true"></td>
                    <td>专业:</td>
                    <td><input class="easyui-textbox" type="text" name="speciality"
                               data-options="required:true"></td>
                    <td>备注:</td>
                    <td><input class="easyui-textbox" type="text" name="remark"
                               data-options="required:true"></td>
                </tr>

                <tr>
                    <td>性别:</td>
                    <td><select id="sex" class="easyui-combobox" name="sex"
                                style="width: 120px;">
                        <option value="男">男</option>
                        <option value="女">女</option>
                    </select></td>
                    <td>政治面貌:</td>
                    <td><select id="party" class="easyui-combobox" name="party"
                                style="width: 120px;">
                        <option value="群众">群众</option>
                        <option value="团员">团员</option>
                        <option value="党员">党员</option>
                    </select></td>
                    <td>学历:</td>
                    <td><select id="education" class="easyui-combobox" name="education"
                                style="width: 120px;">
                        <option value="高中">高中</option>
                        <option value="专科">专科</option>
                        <option value="本科">本科</option>
                        <option value="本科以上">本科以上</option>
                    </select></td>
                </tr>
                <tr>
                    <td>部门:</td>
                    <td>    <input id="deptName" class="easyui-combobox" name="dept" data-options="valueField:'id',textField:'name',url:'${pageContext.request.contextPath}/FindAllDeptServlet'">
                    </td>
                    <td>职位:</td>
                    <td><select id="job_name" class="easyui-combobox" name="job_name"
                                style="width: 120px;">
                        <option value="高中">高中</option>
                        <option value="专科">专科</option>
                        <option value="本科">本科</option>
                        <option value="本科以上">本科以上</option>
                    </select>
                </tr>
            </table>
        </form>

        <div style="text-align: left; padding: 20px; margin-top: 50px">

            <a href="javascript:void(0)" class="easyui-linkbutton"
               onclick="submitForm()">添加</a> &nbsp;&nbsp;&nbsp; <a
                href="javascript:void(0)" class="easyui-linkbutton"
                onclick="clearForm()">重置</a>
        </div>
    </div>
</div>
</body>
</html>