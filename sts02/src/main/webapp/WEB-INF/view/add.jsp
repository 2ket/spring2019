<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="../css/bootstrap.min.css"/>
<script type="text/javascript" src="../js/jquery-1.12.4.min.js"></script>
<script type="text/javascript" src="../js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
<div class="row">
	<div class="col-md-12">
	<div class="page-header">
		<h1>글쓰기<small>(입력 페이지)</small></h1>	
	</div>
	</div>
</div>
<div class="row">
	<div class="col-md-4">
		<a href="list.bit" class="btn btn-default btn-block" role="button">리스트</a>
		<a href="add.bit" class="btn btn-primary btn-block" role="button">글쓰기</a>
		
	</div>
	<div class="col-md-8" >
		<form class="form-horizontal" action="insert.bit" method="POST" >
			<div class="form-group">
				<label for="sub" class="col-sm-2 control-label">제목</label> 
				<div class="col-sm-10">
					<input type="text" class="form-control" name="sub" id="sub" placeholder="sub"/>
				</div>
			</div>
			<div class="form-group">
				<label for="name" class="col-sm-2 control-label">이름</label> 
				<div class="col-sm-10">
					<input type="text" class="form-control" name="name" id="name" placeholder="name"/>
				</div>
			</div>
			<div class="form-group">
				<div class="col-sm-offset-2 col-sm-10">
					<textarea name="content" class="form-control" ></textarea>
				</div>
			</div>
			
			<div class="form-group">
				<div class="col-sm-offset-2 col-sm-10">
					<button type="submit" class="btn btn-default">입력</button>
					<button type="reset" class="btn btn-default">취소</button>
				</div>
			</div>
		</form>
	</div>
</div>
</div>
</body>
</html>