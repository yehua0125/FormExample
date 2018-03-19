package com.response.study;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CheckServlet extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		/*������ύ���������ύ��������֮ǰ���ñ��뷽ʽΪUTF-8*/ 
		String clientCheckcode= request.getParameter("validateCode");
		//���տͻ���������ύ��������֤��
		
		System.out.println(clientCheckcode);
		String serverCheckcode= (String) request.getSession().getAttribute("checkcode");
		//�ӷ������˵�session��ȡ����֤��
		System.out.println(serverCheckcode);
		if(clientCheckcode.equals(serverCheckcode)){//����֤��ͷ���������֤�Ƚϣ������ͨ��
			System.out.println("��֤��ͨ��");
		}else{
			System.out.println("��֤��ʧ��");
			
		}
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doGet(request, response);
		
	}

}
