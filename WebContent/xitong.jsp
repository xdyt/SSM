<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script type="text/javascript" src="https://cdn.staticfile.org/jquery/1.10.2/jquery.min.js"></script>
<script type="text/javascript">
	function tea() {
		if ($(":checkbox:checked").length > 0) {
			$.ajax({
				url : "teaquanxian",
				data : {
					quanxian : 0,
				},
				type : "POST",
				dataType : "json",
				success : function(data) {
					alert(data + "禁止教师登录");
				}
			});
		} else {
			$.ajax({
				url : "teaquanxian",
				data : {
					quanxian : 1,
				},
				type : "POST",
				dataType : "json",
				success : function(data) {
					alert(data + "欢迎教师登录");
				}
			});
		}
	}
	function stu() {
		if ($(":checkbox:checked").length > 0) {
			$.ajax({
				url : "stuquanxian",
				data : {
					quanxian : 0,
				},
				type : "POST",
				dataType : "json",
				success : function(data) {
					alert(data + "禁止学生登录");
				}
			});
		} else {
			$.ajax({
				url : "stuquanxian",
				data : {
					quanxian : 1,
				},
				type : "POST",
				dataType : "json",
				success : function(data) {
					alert(data + "欢迎学生登录");
				}
			});
		}
	}
	function tongzhi() {
		$.ajax({
			url : "tongzhi",
			data : {
				tongzhi : document.getElementById('textOne').value,
				utid : 1
			},
			type : "POST",
			dataType : "json",
			success : function(data) {
				alert(data + "发布成功");
			}
		});

	}
	function tongzhistu() {
		$.ajax({
			url : "tongzhi",
			data : {
				tongzhi : document.getElementById('textTwo').value,
				utid : 0
			},
			type : "POST",
			dataType : "json",
			success : function(data) {
				alert(data + "发布成功");
			}
		});

	}
</script>
<title>基本信息通知</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="" />
<link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
<link href="css/style.css" rel='stylesheet' type='text/css' />

<link href="css/font-awesome.css" rel="stylesheet">
<link href='css/SidebarNav.min.css' media='all' rel='stylesheet'
	type='text/css' />
<script src="js/jquery-1.11.1.min.js"></script>
<script src="js/modernizr.custom.js"></script>

<!--webfonts-->
<link
	href="http://fonts.googleapis.com/css?family=PT+Sans:400,400i,700,700i&amp;subset=cyrillic,cyrillic-ext,latin-ext"
	rel="stylesheet">
<!--//webfonts-->

<!-- chart -->
<script src="js/Chart.js"></script>
<!-- //chart -->

<!-- Metis Menu -->
<script src="js/metisMenu.min.js"></script>
<script src="js/custom.js"></script>
<link href="css/custom.css" rel="stylesheet">
<!--//Metis Menu -->
<style>
#chartdiv {
	width: 100%;
	height: 295px;
}

.textname {
	margin-top: 350px;
	margin-left: 780px;
}
</style>
<!--pie-chart -->
<!-- index page sales reviews visitors pie chart -->
<script src="js/pie-chart.js" type="text/javascript"></script>
<link href="css/owl.carousel.css" rel="stylesheet">
</head>
<body class="cbp-spmenu-push">
	<div class="main-content">
		<div class="cbp-spmenu cbp-spmenu-vertical cbp-spmenu-left"
			id="cbp-spmenu-s1">
			<!--left-fixed -navigation-->
			<aside class="sidebar-left">
				<nav class="navbar navbar-inverse">
					<div class="navbar-header">
						<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target=".collapse" aria-expanded="false">
							<span class="icon-bar"></span>
							<span class="icon-bar"></span> 
							<span class="icon-bar"></span>
						</button>
						<h1>
							<a class="navbar-brand" href="index.jsp"> 
								<span class="fa fa-area-chart"></span> 学生管理系统
								<span class="dashboard_text">学生教师成绩管理</span>
							</a>
						</h1>
					</div>
					<div class="collapse navbar-collapse"
						id="bs-example-navbar-collapse-1">
						<ul class="sidebar-menu">
							<li class="header"></li>
							<li class="treeview">
								<a href="index.jsp">
									<i class="fa fa-dashboard"></i> <span>系统主界面</span>
								</a>
							</li>
							<li class="treeview">
								<a href="#"> 
									<i class="fa fa-laptop"></i> <span>成绩统计分析</span> 
									<i class="fa fa-angle-left pull-right"></i>
								</a>
								<ul class="treeview-menu">
									<li>
										<a href="addTheTest.jsp"> <i class="fa fa-angle-right"></i> 添加考试 </a>
									</li>
									<li>
										<a href="checkResults.jsp"> <i class="fa fa-angle-right"></i> 成绩统计</a>
									</li>
									<li>
										<a href="queryTheTest.jsp"> <i class="fa fa-angle-right"></i>考试列表 </a>
									</li>
								</ul>
							</li>
							<li class="treeview">
								<a href="#">
									<i class="fa fa-laptop"></i> <span>学生信息管理</span> 
									<i class="fa fa-angle-left pull-right"></i>
								</a>
								<ul class="treeview-menu">
									<li>
										<a href="addStuDent.jsp"> <i class="fa fa-angle-right"></i> 添加学生信息</a>
									</li>
									<li>
										<a href="searchStuDent.jsp"> <i class="fa fa-angle-right"></i>统计学生信息</a>
									</li>
								</ul>
							</li>
							<li class="treeview">
								<a href="#">
									<i class="fa fa-laptop"></i> <span>教师信息管理</span> <i
									class="fa fa-angle-left pull-right"></i>
								</a>
								<ul class="treeview-menu">
									<li>
										<a href="addTeacher.jsp"> <i class="fa fa-angle-right"></i> 添加教师信息</a>
									</li>
									<li>
										<a href="addTeacher.html"> <i class="fa fa-angle-right"></i> 教师信息统计 </a>
									</li>
								</ul>
							</li>
							<li class="treeview">
								<a href="#">
									<i class="fa fa-laptop"></i> <span>基础信息管理</span> 
									<i class="fa fa-angle-left pull-right"></i>
								</a>
								<ul class="treeview-menu">
									<li>
										<a href="SelectStus.jsp"> <i class="fa fa-angle-right"></i>年级列表</a>
									</li>
								</ul>
								<ul class="treeview-menu">
									<li>
										<a href="Gradequery.jsp"> <i class="fa fa-angle-right"></i>班级列表</a>
									</li>
								</ul>
								<ul class="treeview-menu">
									<li>
										<a href="Selectsub.jsp"><i class="fa fa-angle-right"></i> 课程列表</a>
									</li>
								</ul>
							</li>
							<li class="treeview">
								<a href="#">
									<i class="fa fa-laptop"></i> <span>系统管理</span>
									<i class="fa fa-angle-left pull-right"></i>
								</a>
								<ul class="treeview-menu">
									<li>
										<a href="xitong.jsp"><i class="fa fa-angle-right"></i>系统设置</a>
									</li>
								</ul>
							</li>
					</div>
				</nav>
			</aside>
		</div>
	</div>
	<!--left-fixed -navigation-->

	<!-- header-starts -->
	<div class="sticky-header header-section ">
		<div class="header-left">

			<!--toggle button start-->
			<button id="showLeftPush">
				<i class="fa fa-bars"></i>
			</button>
			<!--toggle button end-->
			<div class="profile_details_left">
				<!--notifications of menu start -->
				<ul class="nofitications-dropdown">
					<li class="dropdown head-dpdn">
						<a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-expanded="false">
							<i class="fa fa-bell"></i> 
							<span class="badge blue">4</span>
						</a>
						<ul class="dropdown-menu">
							<li>
								<div class="notification_header">
									<h3>你有新的公告信息！！！！</h3>
								</div>
							</li>
						</ul>
					</li>
			</div>
			<!--notification menu end -->
			<div class="clearfix"></div>
		</div>
		<div class="header-right">
			<!--search-box-->
			<div class="search-box">
				<form class="input">
					<input class="sb-search-input input__field--madoka" placeholder="请输入信息..." type="search" id="input-31" />
					<label class="input__label" for="input-31"> 
						<svg class="graphic" width="100%" height="100%" viewBox="0 0 404 77" preserveAspectRatio="none">
							<path d="m0,0l404,0l0,77l-404,0l0,-77z" />
						</svg>
					</label>
				</form>
			</div>
			<!--//end-search-box-->
			<!-- 左上角头像内容 -->
			<div class="profile_details">
				<ul>
					<li class="dropdown profile_details_drop">
						<a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-expanded="false">
							<div class="profile_img">
								<span class="prfil-img">
									<img src="images/2.jpg" alt="">
								</span>
								<div class="user-name">
									<p>系统管理员</p>
									<span>欢迎编号为${teaname}的老师登录</span>
								</div>
									<i class="fa fa-angle-down lnr"></i>
									<i class="fa fa-angle-up lnr"></i>
								<div class="clearfix"></div>
							</div>
						</a>
						<ul class="dropdown-menu drp-mnu">
							<li>
								<a href="#"> <i class="fa fa-cog"></i> 系统设置 </a>
							</li>
							<li>
								<a href="#"> <i class="fa fa-suitcase"></i> 修改密码 </a>
							</li>
							<li>
								<a href="exitsystem"> <i class="fa fa-sign-out"></i> 退出系统 </a>
							</li>
						</ul>
					</li>
				</ul>
			</div>
			<!-- 到这里 -->
			<div class="clearfix"></div>
		</div>
		<div class="clearfix"></div>
	</div>

	<div align="center">
	<div id="page-wrapper">
			<div class="main-page">
				<h2 class="title1" align="center">系统管理</h2>
				<div class="bs-example widget-shadow" data-example-id="hoverable-table">
					<table class="table table-hover">
						<tr>
							<td>学校名称:</td>
							<td><input type="text" value="厚溥IT" /></td>
							<td><input type="button" value="保存" class = "btn btn-info"/></td>
						</tr>
						<tr>
							<td>禁止教师登录系统:</td>
							<td><input type="checkbox" value="" /></td>
							<td><input type="button" value="保存" onclick="tea()" class = "btn btn-info"/></td>
						</tr>
						<tr>
							<td>禁止学生登录系统:</td>
							<td><input type="checkbox" value="" /></td>
							<td><input type="button" value="保存" onclick="stu()" class = "btn btn-info"/></td>
						</tr>
						<tr>
							<td>教师通知:</td>
							<td><textarea rows="3" cols="22" id="textOne"></textarea></td>
							<td><input type="button" value="保存" onclick="tongzhi()" class = "btn btn-info" /></td>
						</tr>
						<tr>
							<td>学生通知:</td>
							<td><textarea rows="3" cols="22" id="textTwo"></textarea></td>
							<td><input type="button" value="保存" onclick="tongzhistu()" class = "btn btn-info" /></td>
						</tr>
				
					</table>
				</div>
			</div>
		</div>
	</div>
	<script src="js/classie.js"></script>
	<script src="js/jquery.nicescroll.js"></script>
	<script src="js/scripts.js"></script>
	<script src='js/SidebarNav.min.js' type='text/javascript'></script>
	<script>
		$('.sidebar-menu').SidebarNav()
	</script>
	<script src="js/SimpleChart.js"></script>
	<script src="js/bootstrap.js">
		
	</script>
</body>
</html>