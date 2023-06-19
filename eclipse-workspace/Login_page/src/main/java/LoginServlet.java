

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet<PrintWriter> extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			HttpServletResponse out=response; PrintWriter();
			response.setContentType("text/html");
			
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/db_2","root","Priti@123");
		String n = request.getParameter("txtName");
		String p = request.getParameter("txtpwd");
		PreparedStatement ps = con.prepareStatement("select uname from login where umane=? andPassword+? ");
		ps.setString(1, n);
		ps.setString(2, p);
        ResultSet rs=ps.executeQuery();
        
        if(rs.next()) {
        	RequestDispatcher rd =request.getRequestDispatcher("welcome.jsp");
        	rd.forward(request, response);
        }
        
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
}

	private void PrintWriter() {
		// TODO Auto-generated method stub
		
	}}
