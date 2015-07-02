package com.echo.loginapp.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by UserA on 7/2/2015.
 */
public class PageServlet extends HttpServlet {
    @Override
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/WEB-INF/forms/login.jsp");
        requestDispatcher.forward(request, response);
    }
}
