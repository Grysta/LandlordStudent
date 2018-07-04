<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>首页</title>
<%
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<script type="text/javascript" src="${APP_PATH }/static/js/jquery-1.12.4.min.js"></script>
<link href="${APP_PATH }/static/bootstrap-3.3.7-dist/css/bootstrap.min.css"
	rel="stylesheet">
<script src="${APP_PATH }/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</head>
<body background="${APP_PATH }/bg.jpg">
	<div class="page-header"  style="margin:0 auto; padding-top: 100px; font-size: 18px;" align="center">
		<p><a href="${APP_PATH }/landlord"> <h1><small>我是</small>房东 </h1></a></p>
		<p><a href="${APP_PATH }/student"> <h1><small>我是</small>学生 </h1></a></p>
	</div>
</body>
</html>