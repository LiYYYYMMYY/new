package com.oracle.cars.control;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.oracle.cars.model.Push;
import com.oracle.cars.model.PushDAO;
@WebServlet("/PushServlet")
public class PushServlet extends HttpServlet {
	private PushDAO dao=new PushDAO();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String method=request.getParameter("method");
		switch (method) {
		case "listAll":
		{
			System.out.println("查询方法");
			List<Push>pushs=dao.listAll();
			System.out.println(pushs.size());
			request.setAttribute("pushs", pushs);
			request.getRequestDispatcher("pushList.jsp").forward(request,response);
			break;
		}
		case "add":
		{
			System.out.println("添加方法");
			break;
		}
		case "delete":
		{
			System.out.println("删除");
			String haibao=request.getParameter("haibao");
			boolean result=dao.deletePush(Integer.parseInt(haibao));
			request.setAttribute("deleteResult", result);
			request.getRequestDispatcher("PushServlet?method=listAll").forward(request,response);
			break;
		}
		case "getPushInfo":
		{
			System.out.println("修改前的查询");
			String haibao=request.getParameter("haibao");
			break;
		}
		}
	}
}
