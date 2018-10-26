<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>首页</title>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/bootstrap.min.css" />
	</head>
	<body>
		<div class="container">
			<div class="row">
				<div class="col-md-12" style="background-color: blue;height:50px"></div>
			</div>
			<div class="row">
				<div class="col-md-3">
					<ul class="list-group">
						<li class="list-group-item">
							<a href="book.jsp" class="btn btn-primary" target="main">图书管理</a>
						</li>
						<li class="list-group-item">
							<a href="borrow.jsp" class="btn btn-info" target="main">借阅管理</a>
						</li>
					</ul>
				</div>
				<div class="col-md-9">
					<iframe name="main" src="main.jsp" style="width:100%;height:500px;" frameborder="0"></iframe>
				</div>
			</div>
		</div>
	</body>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
</html>