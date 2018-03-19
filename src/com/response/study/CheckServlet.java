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
		/*浏览器提交的数据在提交给服务器之前设置编码方式为UTF-8*/ 
		String clientCheckcode= request.getParameter("validateCode");
		//接收客户端浏览器提交上来的验证码
		
		System.out.println(clientCheckcode);
		String serverCheckcode= (String) request.getSession().getAttribute("checkcode");
		//从服务器端的session中取出验证码
		System.out.println(serverCheckcode);
		if(clientCheckcode.equals(serverCheckcode)){//将验证码和服务器端验证比较，相等则通过
			System.out.println("验证码通过");
		}else{
			System.out.println("验证码失败");
			
		}
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doGet(request, response);
		
	}

}
