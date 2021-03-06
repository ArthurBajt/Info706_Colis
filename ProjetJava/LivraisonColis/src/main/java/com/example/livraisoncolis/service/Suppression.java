package com.example.livraisoncolis.service;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.livraisoncolis.controller.ColisEJB;

/**
 * Servlet implementation class Suppression
 */
@WebServlet("/Suppression")
public class Suppression extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	@EJB
	private ColisEJB ejb;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Suppression() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		long id = -1;
        if (request.getParameter("id") != null && request.getParameter("id") != ""){
            id = Long.parseLong(request.getParameter("id"));
            ejb.removeColis(id);
        }
        response.sendRedirect(request.getContextPath() + "/Progression" );
	}

}
