package f.a.m;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/myURL")
public class MyForm extends HttpServlet{

	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		String fname=req.getParameter("fname");
		String lname=req.getParameter("lname");
		String email=req.getParameter("email");
		String pass=req.getParameter("pass");
		String gender=req.getParameter("gender");
		String s[]=req.getParameterValues("skill");
		
		PrintWriter pw=res.getWriter();
		pw.println("fname is: "+fname);
		pw.println("lname is: "+lname);
		pw.println("email is: "+email);
		pw.println("pass is: "+pass);
		pw.println("genter is: "+gender);
		
		if(s!=null)
		{
			pw.println("Your skill are as below:");
			
			for(String s1:s) {
				pw.println(s1);
			}
		}
		else {
			pw.println("pless check the box...");
		}
		
		
		
		
		
	}
}
