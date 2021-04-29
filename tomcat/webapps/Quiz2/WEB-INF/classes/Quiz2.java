import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
public class Quiz2 extends HttpServlet
{
public void doGet (HttpServletRequest req, HttpServletResponse res) 
throws ServletException, IOException
           {   doPost(req, res);  }

public void doPost(HttpServletRequest req, HttpServletResponse res)
throws ServletException, IOException
 {
  res.setContentType("text/html");
  PrintWriter  msg = res.getWriter();
  msg.println("<HTML> <HEAD> <TITLE>");
  msg.println("Quiz2 </TITLE> </HEAD> <BODY>");

// get all parameters
  Enumeration  formdata = req.getParameterNames();
  String PARAM = "";
  String formData = "";
  while (formdata.hasMoreElements())
        {
        PARAM = (String) formdata.nextElement();
        formData = formData + PARAM + ": " + req.getParameter(PARAM) + "\n";
        } // while


  PARAM = "userName";
  msg.println("Thank you " + req.getParameter(PARAM)+".Your registration is done");


  msg.println("</BODY> </HTML>");

   BufferedWriter outFile = new BufferedWriter(new FileWriter("Quiz2", true));
   outFile.write(formData);
   outFile.close();
 } // doPost
} // Quiz2

