<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<head>
	<meta charset="UTF-8">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
		  rel="stylesheet"
		  integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
		  crossorigin="anonymous">
</head>
<html>

<body>
<header class="navbar navbar-expand-md navbar-dark bg-dark text-light p-2">
	<h1>Progression</h1>
	<span class="mx-5">
              <a href="Enregistrement" class="row">Enregistrement</a>
            </span>

	<span class="mx-5">
              <a href="Suivi" class="row">Rechercher / Suivis</a>
            </span>

</header>


<main class="flex-shrink-0 p-4">
	<h2 class="text-center">Modifiez la progression d'un colis</h2>

	<form method="post" action="Progression">
		<!-- Rechercher -->
		<div class="row border p-2 text-center">
			<h4 class="col">Numéro du colis</h4>
			<input class="col" name="id"  type="text" value="${colis.id }">
			<input type="submit" formmethod="get" class="col-3 btn btn-success m-1" value="Rechercher">
		</div>

		<hr class="featurette-divider">

		<!-- latitude -->
		<div class="row border p-2">
			<h4 class="col-3">latitude :</h4>
			<input class="col-3" id="latitude" name="latitude" type="number" value="${ colis.acheminement.latitude }" step="0.00001">
		</div>

		<!-- longitude -->
		<div class="row border p-2">
			<h4 class="col-3">longitude :</h4>
			<input class="col-3" id="longitude" name="longitude" type="number" value="${ colis.acheminement.longitude }" step="0.00001">
		</div>

		<!-- emplacement -->
		<div class="row border p-2">
			<h4 class="col-3">emplacement :</h4>
			<input class="col-3" id="emplacement" name="emplacement" type="text" value="${ colis.acheminement.emplacement }">
		</div>

		<!-- Etat -->
		<div class="row border p-2">
			<h4 class="col-3">Destination :</h4>
			<select name="etat" class="col-5">
				<option></option>
				<option value="ENREGISTREMENT" ${colis.acheminement.etat == "ENREGISTREMENT" ? "selected " : ''}>Enregistrement</option>
				<option value="EN_ATTENTE" ${colis.acheminement.etat == "EN_ATTENTE" ? "selected " : ''}>En attente</option>
				<option value="EN_ACHEMINEMENT" ${colis.acheminement.etat == "EN_ACHEMINEMENT" ? "selected " : ''}>En acheminement</option>
				<option value="BLOQUE" ${colis.acheminement.etat == "BLOQUE" ? "selected " : ''}>Bloqué</option>
				<option value="LIVRE" ${colis.acheminement.etat == "LIVRE" ? "selected " : ''}>Livré</option>
			</select>
		</div>

		<div class="row">
			
			<input type="submit" class="btn btn-primary col mx-2" value="Modifier">
			<input type="submit" class="btn btn-primary col mx-2" value="Supprimer" formaction="Suppression">
			
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
