<%--
  Created by IntelliJ IDEA.
  User: nowic
  Date: 21.07.2019
  Time: 09:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>

  <%
      if(session.getAttribute("user") != null){
          response.sendRedirect("todos.jsp");
      }
      %>


    <form action="ToDoList" method="post">

        <p>Login    : <input type="text" name ="login" ></p>
        <p>Password : <input type="password" name="password"></p>
        <input type="submit" name="submit_button">

    </form>


  </body>
</html>
