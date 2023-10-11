

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "HelloServ" , urlPatterns = {"/hello"})

public class sample {

	@Override
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServleRequest request, jakarta.servlet.http.HttpServletResponse response)
	{
		throw ServletException,IOException
		{
			response.setContentType("text/html;charse=UTF-8");
			PrintWrite pw = response.getWriter();
			pw.println("<html>");
			pw.println("<body>");
			pw.println("<h1>Hello Servlet</h1>");
			pw.println("</body>");
			pw.println("</html>");
		}
	}
	
}


