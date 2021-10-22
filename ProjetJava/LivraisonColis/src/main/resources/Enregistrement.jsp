<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
    <h1>Enregistrement</h1>
        <form method="post">
            <h3>Valeur du colis</h3>
            <input id="valeur" value="1" type="number" min="1">
            <br>

            <h3>Poid du colis</h3>
            <input id="poid" value="1" type="number" min="1">
            <br>

            <h3>Origine du colis</h3>
            <input id="origine" value="">
            <br>

            <h3>Destination du colis</h3>
            <input id="destination" value="">
            <br>

            <input type="submit">

        </form>
</html>