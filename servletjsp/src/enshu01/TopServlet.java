package enshu01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "HellowServ" , urlPatterns = {"/hello"})
public class TopServlet extends HttpServet 
{
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest request, jakarta.servlet.http.HttpServletResponse response)
			throws ServletException,IOException
	{
		
		response.setContentType("");
	}
	
}
