package com.example.livraisoncolis.service;

import com.example.livraisoncolis.controller.ColisEJB;
import com.example.livraisoncolis.model.Colis;
import com.example.livraisoncolis.model.Position;

import javax.ejb.EJB;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

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
        long id = System.currentTimeMillis();
        double poid = Double.parseDouble(request.getParameter("poid"));
        double valeur = Double.parseDouble(request.getParameter("valeur"));
        String origine = request.getParameter("origine");
        String destination = request.getParameter("destination");
        Position pos = new Position(0.0, 0.0, "Entrepot");

        // colisEJB.addColis(id, poid, valeur, origine, destination, pos);
        Colis c = new Colis(id, poid, valeur, origine, destination, pos);

        response.getWriter().write(c.toString());
    }
}
