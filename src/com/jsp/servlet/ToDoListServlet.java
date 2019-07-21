package com.jsp.servlet;

import com.jsp.model.ToDo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ToDoListServlet", urlPatterns = {"/toDoListSer"})
public class ToDoListServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.getSession(false);


        List<ToDo> toDoList = (List<ToDo>) request.getSession().getAttribute("todoList");



        if ( toDoList == null ) {
            toDoList = new ArrayList<>();
            ToDo toDo = new ToDo(1,request.getParameter("content"));
            toDoList.add(toDo);

        }else {
            ToDo toDo = new ToDo(toDoList.size()+1,request.getParameter("content"));
            toDoList.add(toDo);
        }

        request.getSession().setAttribute("todoList",toDoList);
        response.sendRedirect("todos.jsp");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
