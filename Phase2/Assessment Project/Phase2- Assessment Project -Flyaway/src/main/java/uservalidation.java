

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class uservalidation
 */
@WebServlet("/uservalidation")
public class uservalidation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public uservalidation() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter();
		String username=request.getParameter("uname");
		String password=request.getParameter("password");
		
		RequestDispatcher rd=null;
		if(username.equalsIgnoreCase("prashant") && password.equals("prashant123"))
		{
		rd=request.getRequestDispatcher("info.jsp");
		rd.forward(request, response);
		
		}else 
		{
		
		
			
			PrintWriter out=response.getWriter();
			out.println("Invalid Creadintial");
			rd=request.getRequestDispatcher("loginform.jsp");
			rd.include(request, response);
			
		}
	}

	}


