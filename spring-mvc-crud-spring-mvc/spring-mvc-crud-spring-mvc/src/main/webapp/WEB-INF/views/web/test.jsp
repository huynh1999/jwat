<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>

<head>

<meta charset="UTF-8">
<title>Trang chủ</title>

</head>

<body>
	<h1>${model.item.title}</h1>
	<div>
		${model.item.shortDescription}
	</div>
	<!-- Page Content -->
	<div class="container">
		${model.item.content}
	</div>
	<!-- /.container -->

</body>

</html>