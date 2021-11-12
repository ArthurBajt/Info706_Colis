<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>

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
    <h1>Enregistrement</h1>
    <span class="mx-5">
              <a href="Enregistrement" class="row">Enregistrement</a>
            </span>

    <span class="mx-5">
              <a href="Suivi" class="row">Rechercher / Suivis</a>
            </span>

</header>


<main class="flex-shrink-0 p-4">
    <h2 class="text-center">Enregistrez un nouveau colis</h2>

    <form method="post">
        <!-- Valeur -->
        <div class="row border p-2">
            <h4 class="col-3">Valeur :</h4>
            <input class="col-3" id="valeur" name="valeur" value="1" type="number" min="1" step="0.01">
        </div>

        <!-- Poids -->
        <div class="row border p-2">
            <h4 class="col-3">Poids :</h4>
            <input class="col-3" id="poid" name="poid" value="1" type="number" min="1" step="0.01">
        </div>

        <!-- Origine -->
        <div class="row border p-2">
            <h4 class="col-3">Origine :</h4>
            <input class="col-3" id="origine" name="origine" value="Entrepot">
        </div>

        <!-- Destination -->
        <div class="row border p-2">
            <h4 class="col-3">Destination :</h4>
            <input class="col-3" id="destination" name="destination" value="Client">
        </div>

        <div class="row">
            <input type="submit" class="btn btn-primary">
        </div>
    </form>

</main>

<footer class="d-flex flex-wrap justify-content-between align-items-center p-3 my-4 border-top">
    <p class="col-md-4 mb-0 text-muted">INFO 706</p>

    <a href="Index" class="col-md-4 d-flex align-items-center justify-content-center mb-3 mb-md-0 me-md-auto link-dark">
        Retour Menu Principal
    </a>
</footer>

</body>

</html>
