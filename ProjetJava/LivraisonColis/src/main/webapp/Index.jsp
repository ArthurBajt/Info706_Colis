<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
          rel="stylesheet"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
          crossorigin="anonymous">
</head>
<html>

<body>
<header class="navbar navbar-expand-md navbar-dark bg-dark text-light p-2">
    <h1>Index</h1>
    <span class="mx-5">
              <a href="Enregistrement" class="row">Enregistrement</a>
            </span>

    <span class="mx-5">
              <a href="Suivi" class="row">Rechercher / Suivis</a>
            </span>

</header>


<main class="flex-shrink-0">
    <div class="container">
        <h2>Il y a ${requestScope['nbColis']} colis en transite</h2>
    </div>


    <div class="container table-responsive">
        <table class="table table-striped table-sm">
            <thead>
            <th scope="col">N�</th>
            <th scope="col">Origine</th>
            <th scope="col">Destination</th>
            <th scope="col">Valeur</th>
            <th scope="col">Poid</th>
            <th scope="col"></th>
            </thead>

            <c:forEach items="${requestScope['list']}" var="colis">
                <tbody>
                    <th scope="col"><a href="Suivi?id=${colis.id}">${colis.id}</a></th>
                    <th scope="col">${colis.origine}</th>
                    <th scope="col">${colis.destination}</th>
                    <th scope="col">${colis.valeur}e</th>
                    <th scope="col">${colis.poid} kg</th>
                    <th scope="col"><a href="Progression?id=${colis.id}" class="btn btn-lg btn-outline-primary fs-6">Modifier</a></th>
                </tbody>
            </c:forEach>
        </table>

    </div>


</main>

<footer class="d-flex flex-wrap justify-content-between align-items-center p-3 my-4 border-top">
    <p class="col-md-4 mb-0 text-muted">INFO 706</p>

    <a href="Index" class="col-md-4 d-flex align-items-center justify-content-center mb-3 mb-md-0 me-md-auto link-dark">
        Retour Menu Principal
    </a>
</footer>

</body>

</html>