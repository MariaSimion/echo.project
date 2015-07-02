package com.echo.loginapp.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Maria Simion on 01.07.2015.
 */
@WebServlet("/")
public class IndexPageServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        RequestDispatcher rd = getServletContext().getRequestDispatcher("/WEB-INF/forms/login.jsp");
        rd.forward(req, resp);
    }
}
