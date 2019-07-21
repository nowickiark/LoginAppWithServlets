package com.jsp.filter;

import com.jsp.dao.DaoUserSet;
import com.jsp.dao.DaoUsers;
import com.jsp.model.User;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter(filterName = "LoginFilter", servletNames={"ToDoList", "IndexServlet"})
public class LoginFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {

        System.out.println("Application is in filter");
        DaoUsers daoUsers = new DaoUserSet();
        HttpServletResponse httpResponse = (HttpServletResponse) resp;
        HttpServletRequest httpRequest = (HttpServletRequest) req;


        String login = req.getParameter("login");
        String password = req.getParameter("password");

        User userToBeChecked = new User(login,password);
        User userFromList = daoUsers.getUserByName(login);

        HttpSession session = httpRequest.getSession(true);


       // if("admin".equals(login) && "admin".equals(password)){
       //     chain.doFilter(req, resp);
       // }


        if (userToBeChecked.equals(userFromList) || (session.equals(userToBeChecked) )){
            chain.doFilter(req, resp);
        }

        else if(userFromList == null){
            System.out.println("User with this login doesn't exist");

            httpResponse.sendRedirect("/ToDosApp/index.jsp");
        }
        else {
            System.out.println("login unsuccesful");
            httpResponse.sendRedirect("/ToDosApp/index.jsp");
        }


    }

    public void init(FilterConfig config) throws ServletException {

    }

}
