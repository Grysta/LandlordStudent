<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>请注册学生账户</title>

<%
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>

<script type="text/javascript"
	src="${APP_PATH }/static/js/jquery-1.12.4.min.js"></script>

<link
	href="${APP_PATH }/static/bootstrap-3.3.7-dist/css/bootstrap.min.css"
	rel="stylesheet">

<script
	src="${APP_PATH }/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>

</head>

<body background="${APP_PATH }/bg.jpg">

	<div
		style="height: 100px; width: 400px; margin: 0 auto; padding-top: 300px;"
		align="center">

		<h1>请登录</h1>
		<br />

		<form action="studentRegist" method="post" class="form-horizontal">

			<div class="form-group">

				<label for="studentName" class="col-sm-3 control-label">姓名：</label>

				<div class="col-sm-8">

					<input type="text" class="form-control" name="studentName"
						placeholder="请输入姓名">

				</div>

			</div>

			<div class="form-group">

				<label for="studentUsername" class="col-sm-3 control-label">用户名：</label>

				<div class="col-sm-8">

					<input type="text" class="form-control" name="studentUsername"
						placeholder="请输入用户名">

				</div>

			</div>

			<div class="form-group">

				<label for="studentPassword" class="col-sm-3 control-label">密码：</label>

				<div class="col-sm-8">

					<input type="password" class="form-control" name="studentPassword"
						placeholder="请输入密码">

				</div>

			</div>

			<div class="form-group">

				<label for="studentAddress" class="col-sm-3 control-label">住址：</label>

				<div class="col-sm-8">

					<input type="text" class="form-control" name="studentAddress"
						placeholder="请输入现住址">

				</div>

			</div>

			<div class="form-group">

				<label for="studentPhone" class="col-sm-3 control-label">电话号码：</label>

				<div class="col-sm-8">

					<input type="text" class="form-control" name="studentPhone"
						placeholder="请输入电话号码">

				</div>

			</div>

			<div class="form-group">

				<label for="studentGender" class="col-sm-3 control-label">性别：</label>

				<div class="col-sm-8">

					<input type="text" class="form-control" name="studentGender"
						placeholder="请输入性别">

				</div>

			</div>

			<div class="form-group">

				<label for="studentBirthday" class="col-sm-3 control-label">生日：</label>

				<div class="col-sm-8">

					<input type="text" class="form-control" name="studentBirthday"
						placeholder="请输入生日">

				</div>

			</div>

			<div class="form-group">

				<div class="col-sm-offset-2 col-sm-8">

					<button type="submit" class="btn btn-primary">注册</button>

				</div>

			</div>

		</form>

	</div>

</body>

</html>