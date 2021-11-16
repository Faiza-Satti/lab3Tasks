package com.example.lab3tasks.servlet;

import com.example.lab3tasks.db.DbConnection;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "ServletExample")
public class ServletExample extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse
            response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("Servlet called");
        String username = request.getParameter("username");
        String email = request.getParameter("inputEmail4");
//        String password = request.getParameter("inputPassword4");
//        String city = request.getParameter("inputCity");
//        String state= request.getParameter("inputState");
//        String zip= request.getParameter("inputZip");
//        String address=city+state+zip;
//        String gender="Female";

        DbConnection dbConnection;
        dbConnection = new DbConnection();
        //dbConnection.insertRecord(username);
        out.println(username);
        //response.sendRedirect("servletdisplay");
    }
}
