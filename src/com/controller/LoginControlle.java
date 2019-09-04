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
	 * ע��services��
	 */
	@Autowired
	private AllService allService;

	/**
	 * ѧ����½ �˺�������ȷ���ز�ѯ���Ķ�����򷵻�null
	 * 
	 * @param stu jspҳ�洫��������û�������˺�,����
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
	 * ��ʦ��½ �˺�������ȷ���ز�ѯ���Ķ�����򷵻�null
	 * 
	 * @param tea jspҳ��Ĵ���������û������ֵ(�˺�,����)
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
	 * ����Ա��½ �ɹ�����success���򷵻ؿ�
	 * 
	 * @param uname jspҳ�洫����˺�
	 * @param upwd  jspҳ�洫�������
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
	
	
	
	
		// ��ѯ�꼶��
		@RequestMapping("/cla")
		public String selectcla(HttpServletRequest request) {
			List<Cla> selectcla = allService.selectcla();
			request.setAttribute("selectcla", selectcla);
			System.out.println(selectcla);
			return "forward:teaGradequery.jsp";
		}


		// ��ѯѧ����Ϣ��
		@RequestMapping("/stu")
		public String selectstu(HttpServletRequest request) {
			List<Stu> selectstu = allService.selectstu();
			request.setAttribute("selectstu", selectstu);
			System.out.println(selectstu);
			return "forward:teaSelectStus.jsp";

		}
		// ��ѯ�γ̱�
		@RequestMapping("/class")
		public String selectclass(HttpServletRequest request) {
			List<Tab> selectsclass = allService.selectclass();
			request.setAttribute("selectsclass", selectsclass);
			System.out.println(selectsclass);
			return "forward:teaSelectsub.jsp";
		}
		// ����Ա��ѯ�꼶��
		@RequestMapping("/syscla")
		public String sysselectcla(HttpServletRequest request) {
			List<Cla> selectcla = allService.selectcla();
			request.setAttribute("selectcla", selectcla);
			System.out.println(selectcla);
			return "forward:sysGradequery.jsp";
		}
		
		
		// ����Ա��ѯѧ����Ϣ��
		@RequestMapping("/sysstu")
		public String sysselectstu(HttpServletRequest request) {
			List<Stu> selectstu = allService.selectstu();
			request.setAttribute("selectstu", selectstu);
			System.out.println(selectstu);
			return "forward:sysSelectStus.jsp";
			
		}
		// ����Ա��ѯ�γ̱�
		@RequestMapping("/sysclass")
		public String sysselectclass(HttpServletRequest request) {
			List<Tab> selectsclass = allService.selectclass();
			request.setAttribute("selectsclass", selectsclass);
			System.out.println(selectsclass);
			return "forward:sysSelectsub.jsp";
		}


		// ��ʦȨ��
		@RequestMapping("/teaquanxian")
		@ResponseBody
		public void teaqx(int quanxian) {
			int id = 1;
			allService.updatext(quanxian, id);
		}

		// ѧ��Ȩ��
		@RequestMapping("/stuquanxian")
		@ResponseBody
		public void userqx(int quanxian) {
			int id = 2;
			allService.updastu(quanxian, id);
		}

		// ֪ͨ
		@RequestMapping("/tongzhi")
		@ResponseBody
		public String tongzhi(Tongzhi tongzhi) {
			int inserttz = allService.inserttz(tongzhi);
			return "inserttz";
		}
		
		//�˳�ϵͳ
		@RequestMapping("/exitsystem")
		@ResponseBody
		public void exitSystem() {
			System.exit(1);
		}

}
