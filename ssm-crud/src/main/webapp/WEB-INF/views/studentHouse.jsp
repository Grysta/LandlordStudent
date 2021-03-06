 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>房子列表</title>
<%
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<script type="text/javascript" src="${APP_PATH }/static/js/jquery-1.12.4.min.js"></script>
<link href="${APP_PATH }/static/bootstrap-3.3.7-dist/css/bootstrap.min.css"
	rel="stylesheet">
<script src="${APP_PATH }/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</head>
<body background="${APP_PATH }/bg.jpg">
	<div class="container">
		<!-- 标题 -->
		<div class="row">
			<div class="col-md-12">
				<p><font size="8">房子列表</font></p>
			</div>
		</div>
		<!-- 表格 -->
		<div class="row">
			<div class="col-md-12">
				<table class="table table-hover">
					<tr>
						<th>编号</th>
						<th>地址</th>
						<th>类型</th>
						<th>宜居人数</th>
						<th>月租金</th>
						<th>房东</th>
						<th>预约</th>
					</tr>
					<c:forEach items="${pageInfo.list }" var="house">
						<tr>
						<th>${house.houseId }</th>
						<th>${house.houseAddress }</th>
						<th>${house.houseType=="0"?"单间":"套间" }</th>
						<th>${house.housePeople }</th>
						<th>${house.housePrice }</th>
						<th>${house.landlord.landlordName }</th>
						<th><button class="btn btn-info btn-sm">
								<span class="glyphicon glyphicon-ok" aria-hidden="true"></span> 预约
							</button></th>
					</tr>
					</c:forEach>
				</table>
			</div>
		</div>
		<!--  分页-->
		<div class="row">
			<div class="col-md-6">
				当前第${pageInfo.pageNum }页，总共${pageInfo.pages }页，总共${pageInfo.total}条记录。
			</div>
			<div class="col-md-6">
				<nav aria-label="Page navigation">
				  <ul class="pagination">
				  	<li><a href="${APP_PATH }/studentHouse?pn=1">首页</a></li>
				  	<c:if test="${pageInfo.hasPreviousPage }">
				  		<li><a href="${APP_PATH }/studentHouse?pn=${pageInfo.pageNum-1 }" aria-label="Previous">
				        <span aria-hidden="true">&laquo;</span>
				      		</a>
				   		</li>
				  	</c:if>
				  	<c:if test="${!pageInfo.hasPreviousPage }">
				  		<li class="disable"><a href="#" aria-label="Previous">
				        <span aria-hidden="true">&laquo;</span>
				      </a>
				    </li>
				  	</c:if>
				    <c:forEach items="${pageInfo.navigatepageNums }" var="page_Num">
				    	<c:if test="${page_Num==pageInfo.pageNum }">
				    		<li class="active"><a href="#">${page_Num }</a></li>
				    	</c:if>
				    	<c:if test="${page_Num!=pageInfo.pageNum }">
				    		<li><a href="${APP_PATH }/studentHouse?pn=${page_Num }">${page_Num }</a></li>
				    	</c:if>
				    </c:forEach>
				    <c:if test="${pageInfo.hasNextPage }">
				    	<li><a href="${APP_PATH }/studentHouse?pn=${pageInfo.pageNum+1 }" aria-label="Next">
				        	<span aria-hidden="true">&raquo;</span>
				     		</a>
				   		</li>
				   	</c:if>
				   	<c:if test="${!pageInfo.hasNextPage }">
				    	<li class="disable"><a href="#" aria-label="Next">
				        	<span aria-hidden="true">&raquo;</span>
				     		</a>
				   		</li>
				   	</c:if>
				    <li><a href="${APP_PATH }/studentHouse?pn=${pageInfo.pages }">末页</a></li>
				  </ul>
				</nav>
			</div>
		</div>
	</div>
</body>
</html>