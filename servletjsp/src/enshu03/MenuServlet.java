package enshu03;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "name03_2" , urlPatterns = "/url03_2")
public class MenuServlet extends HttpServlet {
   
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{	
		response.setContentType("text/html; charset=UTF-8");
		
		PrintWriter outPrint = response.getWriter();
		outPrint.println("<html>");
		outPrint.println("<body>");
		outPrint.println("<h1>メニュー画面</h1>");
		
		outPrint.println("<form method='post' action='servletjsp/url03_1'>"); // 修正: action属性を修正
		outPrint.println("<input type='submit' value='送信'>");
		outPrint.println("</form>");
		
		outPrint.println("</body>");
		outPrint.println("</html>");
	}
}
