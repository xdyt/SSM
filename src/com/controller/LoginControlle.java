package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.entity.Cla;
import com.entity.Stu;
import com.entity.Tab;
import com.entity.Tea;
import com.entity.Tongzhi;
import com.services.AllService;

@Controller
public class LoginControlle {
	/**
	 * 注入services层
	 */
	@Autowired
	private AllService allService;

	/**
	 * 学生登陆 账号密码正确返回查询到的对象否则返回null
	 * 
	 * @param stu jsp页面传输过来的用户输入的账号,密码
	 * @return
	 */
	@RequestMapping("/stulogin")
	@ResponseBody
	public Stu stulogin(Stu stu,HttpServletRequest request) {
		int id = 2;
		int i = allService.selectid(id).get(0).getQuanxian();
		if (i==1) {
			Stu st = allService.login(stu);
			if (null != st) {
				request.getSession().setAttribute("stname", stu.getStunum());
				request.getSession().setAttribute("stpwd", stu.getStupwd());
				return st;
			}
		}
		return null;
	}

	/**
	 * 教师登陆 账号密码正确返回查询到的对象否则返回null
	 * 
	 * @param tea jsp页面的传输过来的用户输入的值(账号,密码)
	 * @return
	 */
	@RequestMapping("/tealogin")
	@ResponseBody
	public Tea tealogin(Tea tea,HttpServletRequest request) {
		int id = 1;
		int i = allService.selectid(id).get(0).getQuanxian();
		if (i==1) {
			Tea te = allService.tealogin(tea);
			if (null != te) {
				request.getSession().setAttribute("teaname", tea.getTeanum());
				request.getSession().setAttribute("teapwd", tea.getTeapwd());
				return te;
			}
		}
		return null;
	}

	/**
	 * 管理员登陆 成功翻译success否则返回空
	 * 
	 * @param uname jsp页面传输的账号
	 * @param upwd  jsp页面传输的密码
	 * @return
	 */
	@RequestMapping("/syslogin")
	@ResponseBody
	public String syslogin(String uname, String upwd) {
		if (uname == "admin" && upwd == "admin") {
			return "success";
		}
		return null;
	}
	
	
	
	
		// 查询年级表
		@RequestMapping("/cla")
		public String selectcla(HttpServletRequest request) {
			List<Cla> selectcla = allService.selectcla();
			request.setAttribute("selectcla", selectcla);
			System.out.println(selectcla);
			return "forward:teaGradequery.jsp";
		}


		// 查询学生信息表
		@RequestMapping("/stu")
		public String selectstu(HttpServletRequest request) {
			List<Stu> selectstu = allService.selectstu();
			request.setAttribute("selectstu", selectstu);
			System.out.println(selectstu);
			return "forward:teaSelectStus.jsp";

		}
		// 查询课程表
		@RequestMapping("/class")
		public String selectclass(HttpServletRequest request) {
			List<Tab> selectsclass = allService.selectclass();
			request.setAttribute("selectsclass", selectsclass);
			System.out.println(selectsclass);
			return "forward:teaSelectsub.jsp";
		}
		// 管理员查询年级表
		@RequestMapping("/syscla")
		public String sysselectcla(HttpServletRequest request) {
			List<Cla> selectcla = allService.selectcla();
			request.setAttribute("selectcla", selectcla);
			System.out.println(selectcla);
			return "forward:sysGradequery.jsp";
		}
		
		
		// 管理员查询学生信息表
		@RequestMapping("/sysstu")
		public String sysselectstu(HttpServletRequest request) {
			List<Stu> selectstu = allService.selectstu();
			request.setAttribute("selectstu", selectstu);
			System.out.println(selectstu);
			return "forward:sysSelectStus.jsp";
			
		}
		// 管理员查询课程表
		@RequestMapping("/sysclass")
		public String sysselectclass(HttpServletRequest request) {
			List<Tab> selectsclass = allService.selectclass();
			request.setAttribute("selectsclass", selectsclass);
			System.out.println(selectsclass);
			return "forward:sysSelectsub.jsp";
		}


		// 教师权限
		@RequestMapping("/teaquanxian")
		@ResponseBody
		public void teaqx(int quanxian) {
			int id = 1;
			allService.updatext(quanxian, id);
		}

		// 学生权限
		@RequestMapping("/stuquanxian")
		@ResponseBody
		public void userqx(int quanxian) {
			int id = 2;
			allService.updastu(quanxian, id);
		}

		// 通知
		@RequestMapping("/tongzhi")
		@ResponseBody
		public String tongzhi(Tongzhi tongzhi) {
			int inserttz = allService.inserttz(tongzhi);
			return "inserttz";
		}
		
		//退出系统
		@RequestMapping("/exitsystem")
		@ResponseBody
		public void exitSystem() {
			System.exit(1);
		}

}
