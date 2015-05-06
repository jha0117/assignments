package com.samsung.hw.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.samsung.hw.dao.hUserDAO;
import com.samsung.hw.vo.hUserVO;

public class GethUserList extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"UTF-8\">");
		out.println("<title>hUsers List</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h3>회원 목록</h3>");
		hUserDAO dao = new hUserDAO();
		ArrayList<hUserVO> hUserList = dao.gethUserList();
		for (hUserVO hUser : hUserList) {
			out.println(hUser.getSeq()+" - "+"<a href='gethUser?seq="+hUser.getSeq()+"'>"+hUser.getName()+"</a>"+" - "+hUser.getEmail()
					+" - "+hUser.getAge()+" - "+hUser.getGender()+"<br>");
		}
		out.println("<br>");
		out.println("<a href='addhUser.jsp'>회원 가입</a>");
		out.println("</body>");
		out.println("</html>");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		doGet(request, response);
	}
}
