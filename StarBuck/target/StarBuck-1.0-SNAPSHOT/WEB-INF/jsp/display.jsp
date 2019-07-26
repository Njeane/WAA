<%--
  Created by IntelliJ IDEA.
  User: Jean Eric Ndahimana
  Date: 7/25/2019
  Time: 9:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Insert title here</title>
</head>
<body>
<h2>Starbuck's ${roast} Roast Coffees:</h2>
<form action="advice.do" method="get">

    <table >
        <c:forEach var="coffee" items="${roastList}" varStatus="status">

            <c:choose>
                <c:when test="${(status.index)%2 eq 0}">
                    <tr style="background-color:cyan">
                </c:when>
                <c:otherwise>
                    <tr style="background-color:yellow">
                </c:otherwise>
            </c:choose>
            <td>${coffee}</td>
            </tr>
        </c:forEach>
    </table>
    <input type="submit" value="Back">
</form>
</body>
</html>
