package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.entity.Stu;
import com.services.StuDentService;

@Controller
public class StuDentController {
	@Autowired
	private StuDentService stuDentService;

	// ��ʦ��ѯ����ѧ����Ϣ
	@RequestMapping("tearealstu")
	public String realstu(HttpServletRequest request) {

		List<Stu> stuDent = stuDentService.select();
		// System.out.println(stuDent);
		request.setAttribute("user", stuDent);
		return "forward:teaSearchStuDent.jsp";
	}

	// ��ʦ��ѯ����ѧ����Ϣ
	@RequestMapping("sysrealstu")
	public String sysrealstu(HttpServletRequest request) {

		List<Stu> stuDent = stuDentService.select();
		// System.out.println(stuDent);
		request.setAttribute("user", stuDent);
		return "forward:sysSearchStuDent.jsp";
	}

	// ��ʦ�޸�ѧ����Ϣ
	@RequestMapping("teaupdstu")
	public String teaupdstu(HttpServletRequest request) {
		List<Stu> stuDent = stuDentService.select();
		// System.out.println(stuDent);
		request.setAttribute("user", stuDent);
		return "forward:teaUpdataStu.jsp";
	}

	// ��ʦɾ��ѧ����Ϣ
	@RequestMapping("teadelstu")
	public String teadelstu(HttpServletRequest request) {
		List<Stu> stuDent = stuDentService.select();
		// System.out.println(stuDent);
		request.setAttribute("user", stuDent);
		return "forward:teaDelStu.jsp";
	}

	// ѧ����ѯ����ѧ����Ϣ
	@RequestMapping("sturealstu")
	public String sturealstu(HttpServletRequest request) {
		List<Stu> stuDent = stuDentService.select();
		// System.out.println(stuDent);
		request.setAttribute("user", stuDent);
		return "forward:stuSearchStuDent.jsp";
	}

	// ɾ��ѧ����ϢaddStu
	@RequestMapping(value = "/deleteStu")
	public String deleteStu(int id) {
		// System.out.println(id);
		int i = stuDentService.deleteStuId(id);
		return "redirect:tearealstu";
	}

	// ���ѧ����Ϣ
	@RequestMapping(value = "/addstu")
	@ResponseBody
	public boolean addStu(String stunum, String stuname, String stusex, String stupwd, String stuphone, String stuqq,
			String stugrade, String stuclass) {
		// System.out.println(stunum);
		// System.out.println(stuname);
		Stu stuDent = new Stu();
		stuDent.setStunum(stunum);
		stuDent.setStuname(stuname);
		stuDent.setStuclass(stuclass);
		stuDent.setStugrade(stugrade);
		stuDent.setStunum(stunum);
		stuDent.setStuphone(stuphone);
		stuDent.setStuqq(stuqq);
		stuDent.setStupwd(stupwd);
		stuDent.setStusex(stusex);
		// System.out.println(stuDent);
		int student3 = stuDentService.insertAddStu(stuDent);
		// System.out.println(student3);
		return true;
	}

	// �޸�ѧ����Ϣ1
	@RequestMapping(value = "/selectStuDentId")
	public String selectStuDentId(int id, HttpServletRequest request) {
		// System.out.println(id + "111111");
		Stu student = stuDentService.selectStuDentId(id);
		// System.out.println(student);
		request.setAttribute("student", student);
		return "forward:teaupdateStuDent.jsp";
	}

	// �޸�ѧ����Ϣ2
	@RequestMapping(value = "/updateStuDent")
	@ResponseBody
	public boolean updateStuDent(int stuid, String stunum, String stuname, String stusex, String stuphone, String stuqq,
			String stugrade, String stuclass) {
		Stu stuDent1 = new Stu();
		stuDent1.setStuid(stuid);
		stuDent1.setStunum(stunum);
		stuDent1.setStuname(stuname);
		stuDent1.setStuclass(stuclass);
		stuDent1.setStugrade(stugrade);
		stuDent1.setStuphone(stuphone);
		stuDent1.setStuqq(stuqq);
		stuDent1.setStusex(stusex);
		int student = stuDentService.updateStuDent(stuDent1);
		System.out.println(student);
		return true;
	}
	// ѧ���޸�ѧ����Ϣ1
	@RequestMapping(value = "/stuselectStuid")
	public String stuselectStuId(int id, HttpServletRequest request) {
		// System.out.println(id + "111111");
		Stu student = stuDentService.selectStuDentId(id);
		// System.out.println(student);
		request.setAttribute("student", student);
		return "forward:stuupdateStuDent.jsp";
	}
	
	// ѧ���޸�ѧ����Ϣ2
	@RequestMapping(value = "/stuupdateStu")
	@ResponseBody
	public boolean stuupdateStu(int stuid, String stunum, String stuname, String stusex, String stuphone, String stuqq,
			String stugrade, String stuclass) {
		Stu stuDent1 = new Stu();
		stuDent1.setStuid(stuid);
		stuDent1.setStunum(stunum);
		stuDent1.setStuname(stuname);
		stuDent1.setStuclass(stuclass);
		stuDent1.setStugrade(stugrade);
		stuDent1.setStuphone(stuphone);
		stuDent1.setStuqq(stuqq);
		stuDent1.setStusex(stusex);
		int student = stuDentService.updateStuDent(stuDent1);
		System.out.println(student);
		return true;
	}

	// �޸�ѧ����½����
	@RequestMapping(value = "/updatestupwd")
	@ResponseBody
	public void updatestupwd(String stupwd) {

	}

	// �޸�ѧ����Ϣ1
	@RequestMapping(value = "/stuid")
	public String selectId(int id, HttpServletRequest request) {
		System.out.println(id + "111111");
		Stu student = stuDentService.selectStuDentId(id);
		System.out.println(student);
		request.setAttribute("stu", student);
		return "forward:stuSelStu.jsp";
	}
}
