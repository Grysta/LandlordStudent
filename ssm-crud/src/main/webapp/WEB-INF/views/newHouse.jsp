<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>请注册学生账户</title>
<%pageContext.setAttribute("APP_PATH", request.getContextPath());%>
<script type="text/javascript" src="${APP_PATH }/static/js/jquery-1.12.4.min.js"></script>
<link href="${APP_PATH }/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
<script src="${APP_PATH }/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</head>

<body background="${APP_PATH }/bg.jpg">

	<div
		style="height: 100px; width: 400px; margin: 0 auto; padding-top: 300px;"
		align="center">

		<h1>请新建房子</h1>
		<br />

		<form action="createHouse?houseLandlordId=${userid}" method="post" class="form-horizontal">

			<div class="form-group">

				<label for="houseAddress" class="col-sm-3 control-label">地址</label>

				<div class="col-sm-8">

					<input type="text" class="form-control" name="houseAddress"
						placeholder="请输入房屋地址">

				</div>

			</div>



			<div class="form-group">

				<label for="houseType" class="col-sm-3 control-label">单间/套间</label>

				<div class="col-sm-8">

					<input type="text" class="form-control" name="houseType"
						placeholder="单间输入0，套间输入1">

				</div>

			</div>

			<div class="form-group">

				<label for="housePeople" class="col-sm-3 control-label">人数：</label>

				<div class="col-sm-8">

					<input type="text" class="form-control" name="housePeople"
						placeholder="请输入适宜居住人数">

				</div>

			</div>

			<div class="form-group">

				<label for="housePrice" class="col-sm-3 control-label">月租金：</label>

				<div class="col-sm-8">

					<input type="text" class="form-control" name="housePrice"
						placeholder="请输入月租金">

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