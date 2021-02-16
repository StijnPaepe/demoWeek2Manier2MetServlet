<%@ page import="domain.model.GuessGame" %><%--
  Created by IntelliJ IDEA.
  User: stijn
  Date: 16/02/2021
  Time: 10:12
  To change this template use File | Settings | File Templates.
--%>
<%! GuessGame game = new GuessGame(); %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Raad een getal tussen 1 en 10</h1>




<P> You guessed <%=request.getParameter("guess")%></P>
<h2><%= request.getAttribute("result")%></h2>



<a href="form.jsp"> nog eens raden? </a>

</body>
</html>
