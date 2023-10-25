package enshu03;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "name03_3" , urlPatterns = "/url03_3")
public class LogoutServlet extends HttpServlet
{    
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		response.setContentType("text/html; charset=UTF-8");
		
		PrintWriter outPrint = response.getWriter();
		outPrint.println("<html>");
		outPrint.println("<body>");
		outPrint.println("<h1>ログアウト画面</h1>");
		
		outPrint.println("<form method='post' action='url03_1'>"); // 修正: action属性を修正
		outPrint.println("<input type='submit' value='ログイン画面に戻る'>");
		outPrint.println("</form>");
		
		outPrint.println("</body>");
		outPrint.println("</html>");
	}

}
