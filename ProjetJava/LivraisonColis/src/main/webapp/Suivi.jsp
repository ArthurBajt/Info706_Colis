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
		<p>
			Depart : ${ colis.origine } <br>
			Arrive : ${ colis.destination } <br>
			Latitude : ${ colis.acheminement.latitude } <br>
			Longitude : ${ colis.acheminement.longitude } <br>
			Emplacement : ${ colis.acheminement.emplacement } <br>
			Etat : ${ colis.acheminement.etat } <br>
			
		</p>
	</body>
</html>