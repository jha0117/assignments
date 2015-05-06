package com.samsung.hw.Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.samsung.hw.dao.hUserDAO;
import com.samsung.hw.vo.hUserVO;

@WebServlet("/addhUser")
public class AddhUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		int age = Integer.parseInt(request.getParameter("age"));
		int gender = Integer.parseInt(request.getParameter("gender"));
		
		hUserVO vo = new hUserVO();
		vo.setName(name);
		vo.setPassword(password);
		vo.setEmail(email);
		vo.setAge(age);
		vo.setGender(gender);
		hUserDAO dao = new hUserDAO();
		dao.addhUser(vo);
		response.sendRedirect("gethUserList");
	}
}
