<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en" class="no-js">

<head>

<meta charset="utf-8">
<title>Login</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">

<!-- CSS -->
<link rel='stylesheet'
	href='http://fonts.googleapis.com/css?family=PT+Sans:400,700'>
<link rel="stylesheet" href="assets/css/reset.css">
<link rel="stylesheet" href="assets/css/supersized.css">
<link rel="stylesheet" href="assets/css/style.css">
</head>
<body>
	<form action="">
		<table style="margin-top: 200px;">
			<tr>
				<td><h2>学生信息管理系统</h2></td>
			</tr>
			<tr>
				<td><input type="text" id="uname" name="uname"
					placeholder="Username"></td>
			</tr>
			<tr>
				<td><span id="name" style="color: red"></span></td>
			</tr>
			<tr>
				<td><input type="password" id="upwd" name="upwd"
					placeholder="Password"></td>
			</tr>
			<tr>
				<td><span id="pwd" style="color: red"></span></td>
			</tr>
			<!-- <tr>
				<td>
					<div class="row cl" >
				    	<div class="formControls col-8 col-offset-3">
					        <input class="input-text size-L" name="vcode" type="text" placeholder="请输入验证码" style="width: 200px;">
					        <img title="点击图片切换验证码" id="vcodeImg" src="get_cpacha?vl=4&w=160&h=40">
				        </div>
				    </div>
				</td>
			</tr> -->
			<tr>
				<td><input type="radio" id="stu" name="stu" value="s1" />学生 <input
					type="radio" id="stu" name="stu" value="s2" />老师 <input
					type="radio" id="stu" name="stu" value="s3" />管理员</td>
			<tr>
				<td><span id="st" style="color: red"></span></td>
			</tr>
			<tr>
				<td><input type="checkbox" id="stu" name="chk">记住我</td>
			</tr>
			<tr>
				<td><input type="button" id="but" value="登陆"
					onclick="onlogin()"> <input type="reset" id="but"
					value="重置"></td>
			</tr>
		</table>
	</form>

	<!-- 引用的js -->
	<script src="assets/js/jquery-1.8.2.min.js"></script>
	<script src="assets/js/supersized.3.2.7.min.js"></script>
	<script src="assets/js/supersized-init.js"></script>
	<script src="assets/js/scripts.js"></script>
	<script src="assets/js/login.js"></script>
</body>
</html>