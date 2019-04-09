package com.hello.controller;

import entity.User;
import model.UserModel;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

public class LoginController extends HttpServlet {

    UserModel userModel = new UserModel();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/login.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("UTF-8");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        User user = checkLogin(username, password);
        if (user != null) {
            HttpSession httpSession = req.getSession();
            httpSession.setAttribute("loggedUser", user.getUsername());
            resp.sendRedirect("/security");
        } else {
            resp.getWriter().println("Sai thong tin tai khoan");
        }
    }

    private User checkLogin(String username, String password) {
        User user = userModel.getUserByUsernameAndPassword(username, password);
        if (user != null) {
            return user;
        }
        return null;
    }
}
