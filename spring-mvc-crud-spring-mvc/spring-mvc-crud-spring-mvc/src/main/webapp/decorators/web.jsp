<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Trang chủ</title>

 <link rel="icon" href="<c:url value="/template/web/img/core-img/favicon.ico"/>">

<!-- Custom styles for this template -->
<link href="<c:url value='/template/web/style.css'/>" rel="stylesheet" type="text/css">
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
 
 
</head>
<body>
	<!-- Navigation -->
	<%@ include file="/common/web/header.jsp" %>

	<dec:body/>

	<!-- Footer -->
	<%@ include file="/common/web/footer.jsp" %>

	<!-- Bootstrap core JavaScript -->

	 <script src="<c:url value="/template/web/js/jquery/jquery-2.2.4.min.js"/>"></script>
    <!-- Popper js -->
    <script src="<c:url value="/template/web/js/bootstrap/popper.min.js"/>"></script>
    <!-- Bootstrap js -->
    <script src="<c:url value="/template/web/js/bootstrap/bootstrap.min.js"/>"></script>
    <!-- All Plugins js -->
    <script src="<c:url value="/template/web/js/plugins/plugins.js"/>"></script>
    <!-- Active js -->
    <script src="<c:url value="/template/web/js/active.js"/>"></script>
    <script src="<c:url value='/template/admin/paging/jquery.twbsPagination.js' />"></script>
</body>
</html>