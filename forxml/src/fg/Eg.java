package fg;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Eg
 */
@WebServlet("/Eg")
public class Eg extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Eg() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
	String fname=request.getParameter("fname");
	String lname=request.getParameter("lname");
	if((fname.trim().length()!=0)&&(lname.trim().length()!=0))
	{
		request.getRequestDispatcher("Success").forward(request, response);
	}
	else
	{
	request.setAttribute("error", "Fname or Lname is missing");
	getServletContext().getNamedDispatcher("error").include(request, response);
	request.getRequestDispatcher("Index.jsp").include(request, response);
		
	}
	}

}
