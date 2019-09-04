<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE HTML>
<html>
<head>
<title>Grids</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="" />
<!-- Bootstrap Core CSS -->
<link href="css/bootstrap.css" rel='stylesheet' type='text/css' />

<!-- Custom CSS -->
<link href="css/style.css" rel='stylesheet' type='text/css' />

<!-- font-awesome icons CSS -->
<link href="css/font-awesome.css" rel="stylesheet">
<!-- //font-awesome icons CSS -->

<!-- side nav css file -->
<link href='css/SidebarNav.min.css' media='all' rel='stylesheet'
	type='text/css' />
<!-- side nav css file -->

<!-- js-->
<script src="js/jquery-1.11.1.min.js"></script>
<script src="js/modernizr.custom.js"></script>

<!--webfonts-->
<link
	href="http://fonts.googleapis.com/css?family=PT+Sans:400,400i,700,700i&amp;subset=cyrillic,cyrillic-ext,latin-ext"
	rel="stylesheet">
<!--//webfonts-->

<!-- Metis Menu -->
<script src="js/metisMenu.min.js"></script>
<script src="js/custom.js"></script>
<link href="css/custom.css" rel="stylesheet">
<!--//Metis Menu -->

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
							<a class="navbar-brand" href="TeaIndex.jsp"> 
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
								<a href="TeaIndex.jsp">
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
									<li><a href="sysselectAll"> <i
											class="fa fa-angle-right"></i> 教师信息统计
									</a></li>
									<li><a href="sysaddTeacher.jsp"> <i
											class="fa fa-angle-right"></i> 添加教师信息
									</a></li>
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
									<span>欢迎${teaname}登录</span>
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
	<!-- //header-ends -->
	<!-- main content start-->
	<!-- ============================提交路径在这里========================= -->
	<form action="sysaddtea" align="center">
		<div id="page-wrapper">
			<div class="main-page">
				<h2 class="title1" align="center">添加教师信息</h2>
				<div class="grids widget-shadow">
					<div class="col-md-4 grid_box1"></div>
					<div class="row">
						<div class="col-md-4 grid_box1">
							<input type="text"name="teanum"  class="form-control1" placeholder="请输入工号">
						</div>
					</div>
					<div class="col-md-4 grid_box1"></div>
					<div class="row">
						<div class="col-md-4 grid_box1">
							<input type="text" name="teaname" class="form-control1" placeholder="请输入姓名">
						</div>
					</div>
					<div class="col-md-4 grid_box1"></div>
					<div class="row">
						<div class="col-md-4 grid_box1">
							<input type="password" name="teapwd" id="teapwd" class="form-control1" placeholder="请输入密码">
						</div>
					</div>
					<div class="col-md-4 grid_box1"></div>
					<div class="row">
						<div class="col-md-4 grid_box1">
							<input type="password" name="tearpwd" id="tearpwd" class="form-control1" placeholder="请重新输入密码">
						</div>
					</div>

					<div class="col-md-4 grid_box1"></div>
					<div class="row">
						<div class="col-md-4 grid_box1">
							<input type="text" name="teasex" class="form-control1" placeholder="请输入性别">
						</div>
					</div>
					<div class="col-md-4 grid_box1"></div>
					<div class="row">
						<div class="col-md-4 grid_box1">
							<input type="text" name="teaphone" class="form-control1" placeholder="请输入手机号">
						</div>
					</div>

					<div class="col-md-4 grid_box1"></div>
					<div class="row">
						<div class="col-md-4 grid_box1">
							<input type="text" name="teaqq" class="form-control1" placeholder="请输入QQ号">
						</div>
					</div>
					<div class="col-md-4 grid_box1"></div>
					<div class="row">
						<div class="col-md-4 grid_box1">
							<input type="text" name="teacou" class="form-control1"
								placeholder="请输入您所教的科目">
						</div>
					</div>
					<!-- ============================提交按钮在这里========================= -->
					<button type="button" class="active" onclick="su()">提交教师信息</button>
				</div>
			</div>
		</div>
		</div>
	</form>
	</div>
	<script src='js/SidebarNav.min.js' type='text/javascript'></script>
	<script>
		$('.sidebar-menu').SidebarNav()
	</script>
	<!-- //side nav js -->

	<!-- Classie -->
	<!-- for toggle left push menu script -->
	<script src="js/classie.js"></script>
	<script>
		var menuLeft = document.getElementById('cbp-spmenu-s1'), showLeftPush = document
				.getElementById('showLeftPush'), body = document.body;

		showLeftPush.onclick = function() {
			classie.toggle(this, 'active');
			classie.toggle(body, 'cbp-spmenu-push-toright');
			classie.toggle(menuLeft, 'cbp-spmenu-open');
			disableOther('showLeftPush');
		};

		function disableOther(button) {
			if (button !== 'showLeftPush') {
				classie.toggle(showLeftPush, 'disabled');
			}
		}
		
		function su() {
			var pwd = document.getElementById('teapwd').value;
			if (document.getElementById('teapwd').value==document.getElementById('tearpwd').value) {
				$.ajax({
					//请求数据类型
					type : "POST",
					//请求数据类型
					dataType : "json",
					//请求路径
					url : "sysaddtea",
					//请求参数
					data : $("form").serialize(),
					success : function(data) {
						if (data == true) {
							window.location.href = 'selectAll';
						}
					}
				});
			} else {
				alert("两次输入的密码不一致,请重新输入");
			}
		}
	</script>
	<!-- //Classie -->
	<!-- //for toggle left push menu script -->

	<!--scrolling js-->
	<script src="js/jquery.nicescroll.js"></script>
	<script src="js/scripts.js"></script>
	<!--//scrolling js-->

	<!-- Bootstrap Core JavaScript -->
	<script src="js/bootstrap.js">
		
	</script>

</body>
</html>