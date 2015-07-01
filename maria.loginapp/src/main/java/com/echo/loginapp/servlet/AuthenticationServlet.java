package com.echo.loginapp.servlet;

import com.echo.loginapp.service.implementation.AuthenticationServiceImpl;
import com.echo.loginapp.service.AuthenticationService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

/**
 * Created by Maria Simion on 30.06.2015.
 */
@WebServlet("/login")
public class AuthenticationServlet extends HttpServlet {

    AuthenticationService authentication = new AuthenticationServiceImpl();

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

        String content = "Welcome, Maria!!!";

        request.setAttribute("content", content);

        RequestDispatcher rd = getServletContext().getRequestDispatcher("/WEB-INF/forms/login.jsp");
        rd.forward(request, response);

    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if(authentication.isUserAuthenticated(username, password)){
            HttpSession session = request.getSession();
            session.setAttribute("username", "Maria");
            //setting session to expiry in 30 mins
            session.setMaxInactiveInterval(30*60);
            Cookie userName = new Cookie("username", username);
            userName.setMaxAge(30*60);
            response.addCookie(userName);
            response.sendRedirect("/WEB-INF/forms/mainPage.jsp");

        }
        else{

            RequestDispatcher rd = getServletContext().getRequestDispatcher("/WEB-INF/index.jsp");

        }

    }


}
