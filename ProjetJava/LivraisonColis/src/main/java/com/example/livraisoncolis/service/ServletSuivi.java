package com.example.livraisoncolis.service;

import javax.servlet.*;
import javax.servlet.http.*;

import com.example.livraisoncolis.controller.ColisEJB;
import com.example.livraisoncolis.model.Colis;

import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.EJB;

@WebServlet(name = "ServletSuivi", value = "/Suivi")
public class ServletSuivi extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	// injection de la reference de l'ejb
	@EJB
	private ColisEJB ejb;
	
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       long id = -1;
       if (request.getParameter("id") != null && request.getParameter("id") != ""){
           id = Long.parseLong(request.getParameter("id"));
       }
    	
       Colis c = ejb.findColis(id);
       request.setAttribute("colis", c);
       
       request.getRequestDispatcher("/Suivi.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
