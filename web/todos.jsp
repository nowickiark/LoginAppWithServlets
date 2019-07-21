<%@ page import="com.jsp.model.User" %>
<%@ page import="java.util.List" %>
<%@ page import="com.jsp.model.ToDo" %><%--
  Created by IntelliJ IDEA.
  User: nowic
  Date: 21.07.2019
  Time: 09:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    Hello ${sessionScope.user.login}!

    <br>

    <form action="toDoListSer" method="post">

        ToDo : <input type="text" name="content">
        <input type="submit" name="submit" value="Add ToDO">

    </form>


    <%
        List<ToDo> todoList =(List<ToDo>) session.getAttribute("todoList");

        if (todoList != null){

            for(ToDo toDo: todoList) {
    %>

    <%= toDo.getId() + " " + toDo.getContent()%>
    <br/>

    <%
            }
        }
    %>

    <br>

    <form action="logOut">
        <input type="submit" name="logout" value="logout">
    </form>

</body>
</html>
