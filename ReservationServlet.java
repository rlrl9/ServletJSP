package core;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({ "/reservation"})
public class ReservationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		System.out.println("완료");
		PrintWriter out = response.getWriter();
		String vname = request.getParameter("vname");
		String room = request.getParameter("room");
		String pw = request.getParameter("pw");
		String options[] = request.getParameterValues("options");
		String date =request.getParameter("date");
		if(vname==null||vname.isEmpty()) {
			System.out.println("ForwardServlet 수행");
			RequestDispatcher rd = request.getRequestDispatcher("/first.html");
			rd.forward(request,  response);
		}else {
			out.print("<h1>"+ vname+" 님의 예약내용</h1><hr>");
		}
		if(pw==null||pw.isEmpty()) {
			System.out.println("RedirectServlet 수행");
			response.sendRedirect("http://www.daum.net");
		}
		out.print("<ul>");
		out.print("<li> 룸 : "+room+"</li>");
		out.print("<li> 추가 요청 사항 : ");
		if(options==null) {
			out.print("없음");
		}
		else {
			for(int i=0;i<options.length;i++) {
				out.print(options[i]);
				if(i!=options.length-1) {
					out.print(",");
				}
			}
		}
		out.print("</li>");
		String[] dates=date.split("-");
		out.print("<li> 예약날짜 : "+dates[0]+"년 "+dates[1]+"월 "+dates[2]+"일</li>");
		System.out.println(dates[0]+"년 "+dates[1]+"월 "+dates[2]+"일");
		out.print("</ul>");
		out.print("<a href='"+request.getHeader("referer")+"'>예약입력화면으로</a>");
		out.close();
	}
}