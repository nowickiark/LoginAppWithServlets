<%@ page import="com.jsp.model.User" %>
<%@ page import="java.util.List" %>
<%@ page import="com.jsp.model.ToDo" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%--
  Created by IntelliJ IDEA.
  User: nowic
  Date: 21.07.2019
  Time: 09:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ToDos App</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>


<header>

    <%@include file="navbar.jspf"%>

</header>


<body>


    Hello ${sessionScope.user.login}!

    <br>

    <form action="toDoListSer" method="post">

        ToDo : <input type="text" name="content">
        <input type="submit" name="submit" value="Add ToDO">

    </form>




    <table class="table">
        <thead>
        <tr>
            <th scope="col">#</th>
            <th scope="col">ToDo</th>
            <th scope="col">Edit</th>
            <th scope="col">Delete</th>
        </tr>
        </thead>
        <tbody>

            <c:if test="${sessionScope.todoList != null}">
                <c:forEach var="t" items="${sessionScope.todoList}">

                    <tr>
                        <th scope="row">1</th>
                        <td><c:out value="${t.content}"></c:out></td>
                        <td><button class="btn btn-info">Edit</button></td>
                        <td><button class="btn btn-danger">Delate</button></td>
                    </tr>
                </c:forEach>
            </c:if>
        </tbody>
    </table>

    <br>

    <form action="logOut">
        <input type="submit" name="logout" value="logout">
    </form>

    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</body>
</html>
