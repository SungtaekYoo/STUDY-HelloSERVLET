

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DoLogin
 */
@WebServlet("/DoLogin")
public class DoLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DoLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("userName");
		String passwd = request.getParameter("passwd");
		
		PrintWriter out = response.getWriter();
		StringBuilder msg = new StringBuilder();
		
		msg.append("<html>");
		msg.append("<h2>User Name is ");
		msg.append(userName);
		msg.append("<br/>Password is ");
		msg.append(passwd);
		msg.append("<br/></h2></html>");
		out.println(msg.toString());
	}

}
