package com.example.livraisoncolis.service;

import com.example.livraisoncolis.controller.ColisEJB;
import com.example.livraisoncolis.model.Colis;
import com.example.livraisoncolis.model.Position;

import javax.ejb.EJB;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServletEnregistrement", value = "/Enregistrement")
public class ServletEnregistrement extends HttpServlet {

    @EJB
    private ColisEJB colisEJB;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/Enregistrement.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double valeur = Double.parseDouble(request.getParameter("valeur"));
        double poid = Double.parseDouble(request.getParameter("poid"));
        String origine = request.getParameter("origine");
        String destination = request.getParameter("destination");
        Position acheminement = new Position(0.0, 0.0, "Entrepot");

        Colis c = colisEJB.addColis(poid, valeur, origine, destination, acheminement);

        response.sendRedirect(request.getContextPath() + "/Suivi?id=" + Long.toString(c.getId()));
    }
}
