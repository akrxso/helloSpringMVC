<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <p> <a href="${pageContext.request.contextPath}/offers">Show current offers</a></p>
  <p> <a href="${pageContext.request.contextPath}/createoffer">Add a new offer</a></p>

  <c:if test="${pageContext.request.userPrincipal.name != null}">
    <a href="javascript:document.getElementById('logout').submit()">Logout</a>
  </c:if>

  <form id="logout"  action="<c:url value="/logout" />"method="post">
    <input type="hidden" name="${_csrf.parameterName}"value="${_csrf.token}" />
  </form>

  </body>
</html>
