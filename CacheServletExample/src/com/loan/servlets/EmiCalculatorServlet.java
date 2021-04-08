package com.loan.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.loan.cachecontents.Cache;

public class EmiCalculatorServlet extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {

		String fName = request.getParameter("firstName");
		String lName = request.getParameter("lastName");
		int age = Integer.parseInt(request.getParameter("age"));
		double amount = Double.parseDouble(request.getParameter("amount"));
		int tenureInMonths = Integer.parseInt(request.getParameter("tenure"));
		String city = request.getParameter("city");

		Cache cache = Cache.getInstance();

		Properties props = cache.get("cities");
		double interest = 0;
		double emi = 0.0;
		if (props.containsKey(city)) {
			interest = Double.parseDouble(props.getProperty(city));
			emi = (((amount * interest) / 100) + amount) / tenureInMonths;
		} else {
			emi = 0;
		}

		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<p>");
		out.println("Emi Is " + emi);
		out.println("</p>");
		out.println("</body>");
		out.println("</html>");
		 System.out.println("EMI is "+emi);
	}

}
