package enshu02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "/name02_1" , urlPatterns = "/url02_1")
public class TopServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
    
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		response.setContentType("text/html;charset=UTF-8");
		
		PrintWriter pw = response.getWriter();
		pw.println("<html>");
		pw.println("<body>");
		pw.println("<h1>こんにちは【桑折怜輔】");
		pw.println("</body>");
		pw.println("</html>");	
	}
}
