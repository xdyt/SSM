package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.entity.Exa;
import com.services.ExaService;

@Controller
public class ExaController {
	/**
	 * 对考试列表进行增加，删除，查询
	 * 
	 */
	// 注入service
	@Autowired
	private ExaService exaService;

	// 查询考试列表
	@RequestMapping("/selectExa")
	public String queryExa1(HttpServletRequest request) {
		List<Exa> exalist = exaService.selectExa();
		request.setAttribute("user", exalist);
		return "forward:teaqueryTheTest.jsp";
	}
	// 管理员查询考试列表
	@RequestMapping("/sysselectExa")
	public String sysselectExa(HttpServletRequest request) {
		List<Exa> exalist = exaService.selectExa();
		request.setAttribute("user", exalist);
		return "forward:sysqueryTheTest.jsp";
	}

	// 添加考试
	@RequestMapping("/addexa")
	@ResponseBody
	public String addExa(Exa exa, boolean data) {
		exaService.AddExa(exa);
		return "redirect:selectExa";
	}
	// 管理员添加考试
	@RequestMapping("/sysaddexa")
	@ResponseBody
	public String sysaddexa(Exa exa, boolean data) {
		exaService.AddExa(exa);
		return "redirect:sysselectExa";
	}

	// 删除考试信息
	@RequestMapping("/deleteExa")
	public String deleteExa(int exaid) {
		exaService.deleteExa(exaid);
		return "redirect:selectExa";
	}
	// 管理员删除考试信息
	@RequestMapping("/sysdeleteExa")
	public String sysdeleteExa(int exaid) {
		exaService.deleteExa(exaid);
		return "redirect:selectExa";
	}
}
