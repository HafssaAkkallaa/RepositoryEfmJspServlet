<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Liste des Etablissements</title>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container">
        <h1>Liste des Etablissements</h1>

        <table class="table">
            <thead>
                <tr>
                    <th>Code Etablisment</th>
                    <th>Nom</th>
                    <th>Adresse</th>
                    <th>Telephone</th>
                     <th>operation</th>
                    
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${etablissements}" var="etablissement">
                    <tr>
                        <td>${etablissement.code_etab}</td>
                        <td>${etablissement.Nom_Etab}</td>
                        <td>${etablissement.Adresse_etab}</td>
                        <td>${etablissement.Tel_etab}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>

        <ul class="pagination">
            <c:choose>
                <c:when test="${currentPage > 1}">
                    <li class="page-item"><a class="page-link" href="?page=${currentPage - 1}">Précédent</a></li>
                </c:when>
                <c:otherwise>
                    <li class="page-item disabled"><a class="page-link" href="#">Précédent</a></li>
                </c:otherwise>
            </c:choose>

            <c:forEach begin="1" end="${totalPages}" var="pageNum">
                <li class="page-item<c:if test="${pageNum == currentPage}"> active</c:if>">
                    <a class="page-link" href="?page=${pageNum}">${pageNum}</a>
                </li>
            </c:forEach>

            <c:choose>
                <c:when test="${currentPage < totalPages}">
                    <li class="page-item"><a class="page-link" href="?page=${currentPage + 1}">Suivant</a></li>
                </c:when>
                <c:otherwise>
                    <li class="page-item disabled"><a class="page-link" href="#">Suivant</a></li>
                </c:otherwise>
            </c:choose>
        </ul>
    </div>

    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@1.16.1/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>