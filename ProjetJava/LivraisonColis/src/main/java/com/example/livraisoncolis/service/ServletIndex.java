package com.example.livraisoncolis.service;

import com.example.livraisoncolis.controller.ColisEJB;
import com.example.livraisoncolis.model.Colis;

import javax.ejb.EJB;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "Index", value = "/")
public class ServletIndex extends HttpServlet {
    @EJB
    private ColisEJB ejb;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Colis> list = ejb.findAllColis();
        request.setAttribute("list", list);
        request.setAttribute("nbColis", list.size());
        request.getRequestDispatcher("/Index.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
