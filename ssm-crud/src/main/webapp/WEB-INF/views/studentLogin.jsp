<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<%
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<script type="text/javascript" src="${APP_PATH }/static/js/jquery-1.12.4.min.js"></script>
<link href="${APP_PATH }/static/bootstrap-3.3.7-dist/css/bootstrap.min.css"
	rel="stylesheet">
<script src="${APP_PATH }/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</head>
<body background="${APP_PATH }/bg.jpg">
	<div style="margin:0 auto; padding-top: 100px;width: 40%;" align="center">
		<!-- <form action="dostudentLogin" method="post" class="form-group">
			<p>
				<span>用户名：</span><input type="text" name="username">
			</p>
			<p>
				<span>密    码：</span><input type="password" name="password">
			</p>
			<p>
				<input type="submit" value="登录">
			</p>
		</form> -->
		<form action="dostudentLogin" method="post" >
			<div class="form-group" >
				<label for="username">用户名：</label> 
				<input type="text" class="form-control" id="username" name="username" >
			</div>
			<div class="form-group">
				<label for="password">密码</label>
				<input type="password" class="form-control" id="password" name="password">
			</div>
			<button type="submit" class="btn btn-default">登陆</button>
		</form>
	</div>
</body>
</html>