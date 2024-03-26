

import java.io.IOException;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class One
 */
@WebServlet("/One")
public class One extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public One() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String uname=request.getParameter("username");
		String pass=request.getParameter("password");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","Rk@mysql09");
			Statement statement=connect.createStatement();
			
		
		
		if(uname.equals("ranjithrk") && pass.equals("rk@1234"))
		{
			response.sendRedirect("nextpage.html");
		}
		else
		{
			response.sendRedirect("wrongpass.jsp");
		}
		}catch(SQLException e)
		{
			System.out.println(e);
		}catch(Exception e)
		{
			System.out.println(e);
		}
	

	}
	

}
