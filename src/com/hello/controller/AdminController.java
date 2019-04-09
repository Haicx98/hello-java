package com.hello.controller;

import entity.Feedback;
import model.UserModel;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

public class AdminController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserModel model = new UserModel();
        ArrayList<Feedback> listFeedback =  model.readAllfeedback();
        req.setAttribute("feedbacks",listFeedback);
        req.getRequestDispatcher("/admin.jsp").forward(req,resp);
    }
}
