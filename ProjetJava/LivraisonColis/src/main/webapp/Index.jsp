<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>

    <body>

        <header>
            <h1 class="row">Index</h1>
            <div class="row">
                <a href="Enregistrement" class="col">Enregistrer</a>
                <a href="Suivi" class="col">Rechercher / Suivis</a>
            </div>
        </header>


        <main>
            <h2>Il y a ${requestScope['nbColis']} coli(s) en transit</h2>

            <div>
                <c:forEach items="${requestScope['list']}" var="colis">
                    <a class="row" href="Suivi?id=${colis.id}">
                        Colis N° ${colis.id} - de ${colis.origine} vers ${colis.destination}
                    </a> </br>
                </c:forEach>
            </div>
        </main>



    </body>

</html>