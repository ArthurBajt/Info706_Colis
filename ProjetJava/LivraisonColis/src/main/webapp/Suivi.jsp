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
	<h1>Suivi</h1>
	<span class="mx-5">
              <a href="Enregistrement" class="row">Enregistrement</a>
            </span>

	<span class="mx-5">
              <a href="Suivi" class="row">Rechercher / Suivis</a>
            </span>

</header>


<main class="flex-shrink-0 p-4">
	<h2 class="text-center">Modifiez la progression d'un colis</h2>

	<form method="get" action="Suivi">
		<!-- Rechercher -->
		<div class="row border p-2 text-center">
			<h4 class="col">Num�ro du colis</h4>
			<input class="col" name="id"  type="text" value="${colis.id }">
			<input type="submit" formmethod="get" class="col-3 btn btn-success m-1" value="Rechercher">
		</div>


		<hr class="featurette-divider">


		<!-- Origine -->
		<div class="row border p-2">
			<h4 class="col-3">Origine :</h4>
			<p class="col">
				${colis.origine}
			</p>
		</div>

		<!-- Destination -->
		<div class="row border p-2">
			<h4 class="col-3">Destination :</h4>
			<p class="col">
				${colis.destination}
			</p>
		</div>

		<hr class="featurette-divider">

		<!-- Poids -->
		<div class="row border p-2">
			<h4 class="col-3">Poids :</h4>
			<p class="col">
				${colis.poid}
			</p>
		</div>

		<!-- Valeur -->
		<div class="row border p-2">
			<h4 class="col-3">Valeur :</h4>
			<p class="col">
				${colis.valeur}
			</p>
		</div>

		<hr class="featurette-divider">

		<!-- latitude -->
		<div class="row border p-2">
			<h4 class="col-3">Latitude :</h4>
			<p class="col">
				${colis.acheminement.latitude}
			</p>
		</div>

		<!-- Longitude -->
		<div class="row border p-2">
			<h4 class="col-3">Longitude :</h4>
			<p class="col">
				${colis.acheminement.longitude}
			</p>
		</div>

		<hr class="featurette-divider">

		<!-- Emplacement -->
		<div class="row border p-2">
			<h4 class="col-3">Emplacement :</h4>
			<p class="col">
				${colis.acheminement.emplacement}
			</p>
		</div>

		<!-- Etat -->
		<div class="row border p-2">
			<h4 class="col-3">Etat :</h4>
			<p class="col">
				${colis.acheminement.etat.name().substring(0,1).concat(colis.acheminement.etat.name().substring(1).toLowerCase().replace("_", " "))}
			</p>
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
