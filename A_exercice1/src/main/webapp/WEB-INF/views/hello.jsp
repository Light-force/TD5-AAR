
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Welcome</title>
</head>
<body>

<table>
    <tr>
        <td>ID:</td>
        <td>${employe.idEmp}</td>
    </tr>
    <tr>
        <td>Nom:</td>
        <td>${employe.nom}</td>
    </tr>
</table>

<h2>Projets associés</h2>
<ul>
    <c:forEach var="projet" items="${employe.projetsEnCours}">
        <li>${projet.nomProjet}</li>
    </c:forEach>
</ul>

<h2>Machines associées</h2>
<p>${employe.machine.modele}</p>
<h2>Service associés</h2>
<p>${employe.service.nomService}</p>
</body>
</html>
