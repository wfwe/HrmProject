<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2019/6/4
  Time: 9:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.List" %>
<%@ page import="cn.wuyi.domain.Job" %>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="easyui/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="easyui/themes/icon.css">
    <script type="text/javascript" src="easyui/jquery.min.js"></script>
    <script type="text/javascript" src="easyui/jquery.easyui.min.js"></script>
    <title>查询职位</title>
</head>
<body>
<%
    List<Job> jobList = (List<Job>) request.getSession().getAttribute("jobList");
%>
<div title="查询职位" style="padding: 20px">
    <table class="easyui-datagrid" title="职位表"
           style="width: 100%; height: 500px"
           data-options="singleSelect:true,collapsible:true,url:'datagrid_data1.json',method:'get'">
        <thead>
        <tr>
            <th data-options="field:'itemid',align:'center',resizable:false"
                width="30%">职位</th>
            <th data-options="field:'productid',align:'center',resizable:false"
                width="30%">备注</th>
        </tr>
        </thead>
        <c:forEach var="job" items="<%=jobList%>">
            <tr>
                <td>${job.name}</td>
                <td>${job.remark}</td>
            </tr>
        </c:forEach>
    </table>

</div>
</body>
</html>
