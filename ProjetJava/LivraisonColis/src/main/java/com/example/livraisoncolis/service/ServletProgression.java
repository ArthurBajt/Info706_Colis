package com.example.livraisoncolis.service;

import javax.ejb.EJB;
import javax.persistence.EnumType;
import javax.servlet.*;
import javax.servlet.http.*;

import com.example.livraisoncolis.controller.ColisEJB;
import com.example.livraisoncolis.model.Colis;
import com.example.livraisoncolis.model.Etat;
import com.example.livraisoncolis.model.Position;

import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ServletProgression", value = "/Progression")
public class ServletProgression extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	// injection de la reference de l'ejb
	@EJB
	private ColisEJB ejb;
	
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	 long id = -1;
         if (request.getParameter("id") != null){
             id = Long.parseLong(request.getParameter("id"));
         }
      	
         Colis c = ejb.findColis(id);
         request.setAttribute("colis", c);
         
         request.getRequestDispatcher("/Progression.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	long id = -1;
        if (request.getParameter("id") != null){
            id = Long.parseLong(request.getParameter("id"));
        }
        double latitude = Double.parseDouble(request.getParameter("latitude"));
        double longitude = Double.parseDouble(request.getParameter("longitude"));
        String emplacement = request.getParameter("emplacement");
        Etat etat = Etat.valueOf(request.getParameter("etat"));

        response.getWriter().write(Long.toString(id));
        
        Colis c = ejb.updateColis(id, latitude,longitude,emplacement,etat);

        response.sendRedirect(request.getContextPath() + "/Progression?id=" + Long.toString(c.getId()));
    }
}
