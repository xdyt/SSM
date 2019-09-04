function onlogin() {
	var stuname = document.getElementById("uname").value;
	var stupwd = document.getElementById("upwd").value;

	if (!stuname || stuname.legth < 1) {
		$("#name").html("账号不能为空");
		return false;
	} else {
		$("#name").html("");
	}

	if (!stupwd || stupwd.legth < 1) {
		$("#pwd").html("密码不能为空");
		return false;
	} else {
		$("#pwd").html("");
	}

	if ($(":radio:checked").length == 0) {
		$("#st").html("未选择要登录的身份");
		return false;
	} else {
		$("#st").html("");
	}

	if ($(':radio:checked').val() == "s1") {
		$.ajax({
			url : "stulogin",
			type : "POST",
			data : {
				stunum:stuname,
				stupwd:stupwd
			},
			dataType : "json",
			success : function(data) {
				if (null != data) {
					window.location.href = "StuIndex.jsp";
				} else {
					alert("登陆失败,账号 密码错误,或者是管理员已经禁止该身份登陆");
					window.location.href = "login.jsp";
				}
			}
		})
	} else if ($(':radio:checked').val() == "s2") {
		$.ajax({
			url : "tealogin",
			type : "POST",
			data : {
				teanum:stuname,
				teapwd:stupwd
			},
			dataType : "json",
			success : function(data) {
				if (null != data) {
					window.location.href = "TeaIndex.jsp";
				} else {
					alert("登陆失败,账号 密码错误,或者是管理员已经禁止该身份登陆");
					window.location.href = "login.jsp";
				}
			}
		})
	} else if ($(':radio:checked').val() == "s3") {
		$.ajax({
			url : "syslogin",
			type : "POST",
			data : $("form").serialize(),
			dataType : "text",
			success : function(data) {
				if (null != data) {
					window.location.href = "SysIndex.jsp";
				} else {
					alert("登陆失败,账号或密码错误");
				}
			}
		})
	}
}
