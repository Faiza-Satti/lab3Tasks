package com.example.lab3tasks.servlet;

import com.example.lab3tasks.db.DbConnection;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.*;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.*;

@WebServlet(name = "ServletDisplay")
public class ServletDisplay extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse
            response) throws ServletException, IOException {
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse
            response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        out.println("<html><body>");
        try
        {
            DbConnection dbConnection;
            dbConnection = new DbConnection();
            ResultSet rs = dbConnection.getRecords();
            out.println("<table border=1 width=50% height=50%>");
            out.println("<tr> <th>Username</th> </tr>");
            out.println("<tr> <th>ID</th> </tr>");
            while (rs.next())
            {
                String user = rs.getString("student_name");
                int id = rs.getInt("student_id");
                out.println("<tr><td>" + user + "</td><td>" + id +"</td></tr>");
            }
            out.println("</table>");
            out.println("</body></html>");
        }
        catch (Exception e)
        {
            out.println("error");
        }
    }
}
