package com.careerit.iplstat.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.careerit.iplstat.dto.TeamStatDto;
import com.careerit.iplstat.service.IplStatService;
import com.careerit.iplstat.service.IplStatServiceImpl;

@WebServlet("/iplstat")
public class IplStatServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	private IplStatService iplStatService = new IplStatServiceImpl();
	public IplStatServlet() {
		
	}
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<TeamStatDto> list = iplStatService.getTeamStats();
		request.setAttribute("teamStatList", list);
		RequestDispatcher rd = request.getRequestDispatcher("/iplstat.jsp");
		rd.forward(request, response);
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
