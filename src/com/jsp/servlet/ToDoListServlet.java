package com.jsp.servlet;

import com.jsp.model.ToDo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ToDoListServlet", urlPatterns = {"/toDoListSer"})
public class ToDoListServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.getSession(false);


        List<ToDo> toDoList = (List<ToDo>) request.getSession().getAttribute("todoList");

        String content = request.getParameter("content");


        if ( toDoList == null ) {
            toDoList = new ArrayList<>();
            ToDo toDo = new ToDo(1, content);
            toDoList.add(toDo);

        }else {
            ToDo toDo = new ToDo(toDoList.size()+1, content);
            toDoList.add(toDo);
        }

        request.getSession().setAttribute("todoList",toDoList);

/*        Cookie cookie = new Cookie("ciasteczko" + content,"czekoladowe");
        cookie.setMaxAge(360);
        response.addCookie(cookie);


        request.getCookies();*/

        response.sendRedirect("todos.jsp");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
