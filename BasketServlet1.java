package core;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({"/basket1"})
public class BasketServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		System.out.println("완료");
		request.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		String number = request.getParameter("pid");
		String ids = number.split("p0")[1];
		out.print("<h1>선택한 상품 : "+number+"</h1>");
		out.print("<img src ='/edu/images/"+ids+".jpg' width=300 alt=''>");
		out.print("<hr><a href='"+request.getHeader("referer")+"'>상품 선택 화면</a>"); //요청하게 한 애의 url..
		out.close();
	}
}