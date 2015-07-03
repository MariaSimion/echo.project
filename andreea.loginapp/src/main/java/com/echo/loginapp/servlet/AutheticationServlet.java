package com.echo.loginapp.servlet;

import com.echo.loginapp.service.implementation.AuthenticationService;
import com.echo.loginapp.service.implementation.AuthenticationServiceImplementation;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

/**
 * Created by UserA on 30/6/2015.
 */
@WebServlet("")
public class AutheticationServlet extends HttpServlet {


    AuthenticationService authenticationService;

    @Override
    public void init() throws ServletException {
        super.init();
        authenticationService = new AuthenticationServiceImplementation();

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String content = "Hello!";

        String username = req.getParameter("username");
        String password = req.getParameter("password");

        RequestDispatcher rd = getServletContext().getRequestDispatcher("/WEB-INF/forms/login.jsp");

        rd.forward(req,resp);
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");


        if (authenticationService.equals("username") && authenticationService.equals("password")) {
            HttpSession session = request.getSession();
            session.setAttribute("username", "Maria");
            //setting session to expiry in 30 mins
            session.setMaxInactiveInterval(30 * 60);
            Cookie userName = new Cookie(username, password);
            userName.setMaxAge(30 * 60);
            response.addCookie(userName);
            response.sendRedirect("admin/");

        } else {

            RequestDispatcher rd = getServletContext().getRequestDispatcher("WEB-INF/index.jsp");

        }
    }
}