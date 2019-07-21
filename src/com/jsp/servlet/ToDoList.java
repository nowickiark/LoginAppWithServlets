package com.jsp.servlet;

import com.jsp.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ToDoList", urlPatterns = {"/ToDoList"})
public class ToDoList extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        String login = request.getParameter("login");
        String password =request.getParameter("password");

        User user = new User(login,password);

        request.getSession().setAttribute("user", user);


        response.sendRedirect("todos.jsp");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
