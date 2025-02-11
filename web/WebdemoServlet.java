package com.sri.web;

import java.io.IOException;

import com.sri.dao.webdemoDao;
import com.sri.model.webdemo;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class WebdemoServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("id"));
		webdemoDao dao=new webdemoDao();
		webdemo wd=dao.getwebDemo(id);
		request.setAttribute("webdemo",wd);
		RequestDispatcher rd= request.getRequestDispatcher("show.jsp");
		rd.forward(request, response)
		;
	}
}
