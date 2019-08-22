package com.qf.controller;

import com.qf.pojo.User;
import com.qf.service.Service;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet( "/SelectServlet")
public class SelectServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        Service service = new Service();
        try {
            List<User> user = service.select();
            if (user != null){
                request.setAttribute("list",user);
                request.getRequestDispatcher("/index.jsp").forward(request,response);
            }else{
                response.getWriter().print("查找失败");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
