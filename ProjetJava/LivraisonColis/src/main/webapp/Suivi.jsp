<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Affichage Suivi</title>
	</head>
	<body>
	    <h1>Suivre votre Colis</h1>
	    
	    <form method="get" action="Suivi">
			Afficher votre colis grace a son Id : <input name="id"  type="text" value="${colis.id }">
			<input type="submit">
		</form>
	    
		<p>
			Depart : ${ colis.origine } <br>
			Arrive : ${ colis.destination } <br>
			Poids : ${ colis.poid } <br>
			Valeur : ${ colis.valeur } <br>
			Latitude : ${ colis.acheminement.latitude } <br>
			Longitude : ${ colis.acheminement.longitude } <br>
			Emplacement : ${ colis.acheminement.emplacement } <br>
			Etat : ${colis.acheminement.etat.name().substring(0,1).concat(colis.acheminement.etat.name().substring(1).toLowerCase().replace("_", " ")) } <br>			
		</p>
	</body>
</html>