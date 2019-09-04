package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.entity.Stu;
import com.entity.Tea;
import com.services.TeacherService;

@Controller
@RequestMapping()
public class TeachertController {
	@Autowired
	private TeacherService teacherService;
	
	//����Ա��ӽ�ʦ��Ϣ
	@RequestMapping("sysaddtea")
	@ResponseBody
	public boolean sysaddtea(Tea te) {
		Tea tea = new Tea();
		tea.setTeapwd(te.getTeapwd());
		tea.setTeaid(te.getTeaid());
		tea.setTeanum(te.getTeanum());
		tea.setTeaname(te.getTeaname());
		tea.setTeasex(te.getTeasex());
		tea.setTeaqq(te.getTeaqq());
		tea.setTeacou(te.getTeacou());
		teacherService.addtea(tea);
		return true;
	}
	
	
	
	

	//��ѯȫ����ʦ��Ϣ
	@RequestMapping("selectAll")
	public String list(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		List<Tea> ls = teacherService.list();
		request.setAttribute("ls", ls);
		return "forward:teaselectTeaAll.jsp";
	}
	//����Ա��ѯȫ����ʦ��Ϣ
	@RequestMapping("sysselectAll")
	public String syslist(HttpServletRequest request) {
		List<Tea> ls = teacherService.list();
		request.setAttribute("ls", ls);
		return "forward:sysSelectTeaAll.jsp";
	}

	@RequestMapping("editgo")
	public String editgo(int teaid, HttpServletRequest request) {
		Tea c = teacherService.get(teaid);
		System.out.println(teaid);
		request.setAttribute("c", c);
		return "forward:edit.jsp";
	}

	//ɾ����ʦ��Ϣ
	@RequestMapping("delete")
	public String delete(int teaid) {
		teacherService.delete(teaid);
		return"forward:selectAll";
	}
	
	// �޸Ľ�ʦ��Ϣ1
		@RequestMapping(value = "/selectTea")
		public String selectTea(int teaid, HttpServletRequest request) {
			System.out.println(teaid + ">>>>>>>>>>>>");
			Tea tea = teacherService.selectTea(teaid);
			System.out.println(tea);
			request.setAttribute("student", tea);
			return "forward:updateTea.jsp";
		}

		// �޸Ľ�ʦ��Ϣ2
		@RequestMapping(value = "/teaupdatete")
		@ResponseBody
		public boolean updateTea(int teaid, String teanum, String teaname, String teasex, String teaphone, String teaqq,
				String teacou) {
			Tea tea = new Tea();
			tea.setTeaid(teaid);
			tea.setTeanum(teanum);
			tea.setTeaname(teaname);
			tea.setTeasex(teasex);
			tea.setTeaphone(teaphone);
			tea.setTeaqq(teaqq);
			tea.setTeacou(teacou);
			int student = teacherService.updateTea(tea);
			System.out.println(student);
			return true;
		}

}
