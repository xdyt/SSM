package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.entity.Gra2;
import com.services.GraService;

@Controller
public class GraController{
	//濞夈劌鍙唖ervice鐏烇拷
	@Autowired
	private GraService graservice;
	
	//学生查询学新信息
	@RequestMapping("stuselectGra2")
	public String stuselectGra2 (HttpServletRequest request) {
		List<Gra2> listgra = graservice.selectGra2();
		request.setAttribute("user", listgra);
		return "forward:stuSelectGra.jsp";
	}
	//教师查询学新信息
	@RequestMapping("teaselectGra2")
	public String teaselectGra2 (HttpServletRequest request) {
		List<Gra2> listgra = graservice.selectGra2();
		request.setAttribute("user", listgra);
		return "forward:teaSelectGra.jsp";
	}
	//管理员查询学新信息
	@RequestMapping("sysselectGra2")
	public String sysselectGra2 (HttpServletRequest request) {
		List<Gra2> listgra = graservice.selectGra2();
		request.setAttribute("user", listgra);
		return "forward:sysSelectGra.jsp";
	}
	
	//濞ｈ濮為幋鎰摋娣団剝浼�
	@RequestMapping("addGra")
	@ResponseBody
	public String addGra(HttpServletRequest request,Gra2 gra2) {
			graservice.addGra(gra2);
			return "forward:selectGra2";
	}
}

