package core;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet({ "/basket2" })
public class BasketServlet2 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=utf-8");
		String name = req.getParameter("pid");
		PrintWriter out = resp.getWriter();
		HttpSession session = req.getSession();
		if(name==null) {
			session.invalidate();
			out.write("<h1>선택한 상품이 없습니다.</h1><br>");
			out.print("<a href=\"/edu/clientexam/productlog2.html\">상품선택화면</a>   ");
			return;
		}
		if(session.getAttribute(name) == null) {
			session.setAttribute(name, 1);
		}else {
			session.setAttribute(name, (int)(session.getAttribute(name))+1);
		}
		out.write("<h1>선택한 상품 리스트</h1>");
		out.write("<ul>");
		for(int i=1;i<=10;i++) {
			if((session.getAttribute("p0"+i))!=null) {
				out.print("<li>p0"+i+" 상품 "+(int)(session.getAttribute("p0"+i))+"개</li>");
			}
		}
		out.write("</ul>");
		out.write("<hr>");
		out.print("<a href='" + req.getHeader("referer") + "'>상품선택화면</a>   ");
		out.print("<a href=\"/edu/basket2\">상품 비우기</a>");
		out.close();
	}
}