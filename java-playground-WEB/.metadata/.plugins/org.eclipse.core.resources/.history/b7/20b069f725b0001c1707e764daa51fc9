package com.careerit.cbook;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/helloworld")
public class HelloworldServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("username");
		if(name == null) {
			name = "User";
		}
		System.out.println(name);
		req.setAttribute("user", name);

		List<String> list = new ArrayList<>();
		list.add("Krish");
		list.add("Manoj");
		list.add("Venkat");
		
		req.setAttribute("friends", list);
		RequestDispatcher rd = req.getRequestDispatcher("/greetings.jsp");
		rd.forward(req, resp);
		
		/*
		 * PrintWriter out = resp.getWriter(); resp.setContentType("text/html");
		 * StringBuilder sb = new StringBuilder(); sb.append("<html>");
		 * sb.append("<head>"); sb.append("<title>Welcome Servlet</title>");
		 * sb.append("</head>"); sb.append("<h3>Welcome : " + name + " Today: " +
		 * LocalDateTime.now()); sb.append("<h4>Have a nice day!</h4>");
		 * sb.append("<body>"); sb.append("</html>"); out.print(sb.toString());
		 */
	}
}
//<servlet>
//<servlet-name>greetings</servlet-name>
//<servlet-class>com.careerit.cbook.HelloworldServlet</servlet-class>
//</servlet>
//<servlet-mapping>
//<servlet-name>greetings</servlet-name>
//<url-pattern>/helloworld</url-pattern>
//</servlet-mapping>