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
    <title>ToDo App</title>
      <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
      <link href="${pageContext.request.contextPath}/resources/css/style.css" type="text/css" rel="stylesheet">
  </head>

  <header>

      <%@include file="navbar.jspf"%>

  </header>


  <body>

  <%
      if(session.getAttribute("user") != null){
          response.sendRedirect("todos.jsp");
      }
      %>


<%--    <form action="ToDoList" method="post">

        <p>Login    : <input type="text" name ="login" ></p>
        <p>Password : <input type="password" name="password"></p>
        <input type="submit" name="submit_button">

    </form>--%>
  <div class="container login-container">
      <div class="row">
  <div class="col-md-6 login-form-1">
      <h3>Login for Form 1</h3>
      <form action="ToDoList" method="post">
          <div class="form-group">
              <input type="text" class="form-control" placeholder="Your Email *" value="" name="login" />
          </div>
          <div class="form-group">
              <input type="password" class="form-control" placeholder="Your Password *" value="" name="password" />
          </div>
          <div class="form-group">
              <input type="submit" class="btnSubmit" value="Login" />
          </div>
          <div class="form-group">
              <a href="#" class="ForgetPwd">Forget Password?</a>
          </div>
      </form>
  </div>
      </div>
  </div>





  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
  </body>
</html>
