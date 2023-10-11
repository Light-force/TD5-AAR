
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Title</title>
</head>
<body>

<h2>Les composites:</h2>
<ul>
    <c:forEach items="${listecomposites}" var="comp">
        <li>
                ${comp.id} ${comp.nom}
            <span> Composé de :
            <ul>
                <c:forEach items="${comp.composants}" var="elem">
                    <li>${elem}</li>
                </c:forEach>
            </ul>
        </span>
        </li>
    </c:forEach>
</ul>



<form action="${pageContext.request.contextPath}/">
    <button type="submit">Retour au menu</button>
</form>


</body>
</html>
