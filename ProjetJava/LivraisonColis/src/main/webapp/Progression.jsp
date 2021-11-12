<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<h1>Progression</h1>

	<head>
		<meta charset="ISO-8859-1">
		<title>Modification de progression</title>
	</head>
	<body>
	    <h1>Modification de la progression de votre Colis</h1>
	    
		<form method="post" action="Progression">
			Afficher votre colis grace a son Id : <input name="id"  type="text" value="${colis.id }">
			<input type="submit" formmethod="get">
	
			<p>Latitude du colis</p>
            <input id="latitude" name="latitude" type="number" value="${ colis.acheminement.latitude }">
            <br>
            
			<p>Longitude du colis</p>
            <input id="longitude" name="longitude" type="number" value="${ colis.acheminement.longitude }">
            <br>

            <p>Emplacement du colis</p>
            <input id="emplacement" name="emplacement" type="text" value="${ colis.acheminement.emplacement }">
            <br>


            <p>Etat du colis</p>
            <select name="etat">
                <option value="ENREGISTREMENT" ${colis.acheminement.etat.name() == "ENREGISTREMENT" ? "selected " : ''}>Enregistrement</option>
	            <option value="EN_ATTENTE" ${colis.acheminement.etat == "EN_ATTENTE" ? "selected " : ''}>En attente</option>
	            <option value="EN_ACHEMINEMENT" ${colis.acheminement.etat == "EN_ACHEMINEMENT" ? "selected " : ''}>En acheminement</option>
	            <option value="BLOQUE" ${colis.acheminement.etat == "BLOQUE" ? "selected " : ''}>Bloqué</option>
	            <option value="LIVRE" ${colis.acheminement.etat == "LIVRE" ? "selected " : ''}>Livré</option>
            </select>
            
            <br>
            <br>

            <input type="submit">
			
			
		</form>
		
	</body>


</html>