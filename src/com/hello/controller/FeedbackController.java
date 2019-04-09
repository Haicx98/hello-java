package com.hello.controller;

import entity.Feedback;
import model.UserModel;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class FeedbackController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/feedback.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String fullname = req.getParameter("fullname");
        String email = req.getParameter("email");
        String feedback = req.getParameter("feedback");
        Feedback feedback1 = new Feedback(fullname,email,feedback);
        UserModel model = new UserModel();
        boolean result = model.insert(feedback1);
        if(result){
            resp.getWriter().println("Success");
        }else {
            resp.getWriter().println("Failed");
        }

    }
}
