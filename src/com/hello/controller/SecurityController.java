package com.hello.controller;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

public class SecurityController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        boolean logged = false;

        HttpSession httpSession = req.getSession();
        req.setAttribute("user", httpSession.getAttribute("loggedUser"));
        logged = true;
        if (logged) {
            req.getRequestDispatcher("/index.jsp").forward(req,resp);
        } else {
            resp.sendRedirect("/login");
        }
    }
}
