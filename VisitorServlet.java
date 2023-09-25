package core;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({ "/visitor"})
public class VisitorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		System.out.println("완료");
		request.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		String name = request.getParameter("pname");
		String memo = request.getParameter("memo");
		out.print("<h1>"+name+" 님이 "+LocalDate.now().getYear()+"년 "+LocalDate.now().getMonth().getValue()+"월 "+LocalDate.now().getDayOfMonth()+"일에 남긴 글입니다.</h1><hr><h2>"+memo+"</h2>");
		out.print("<a href='"+request.getHeader("referer")+"'>입력화면으로 가기</a>"); //요청하게 한 애의 url..
		out.close();
	}
}