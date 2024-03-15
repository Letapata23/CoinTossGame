<%-- 
    Document   : coin_toss
    Created on : 05 Mar 2024, 20:36:44
    Author     : gee
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Response</title>
    </head>
    <%
        String userName = (String)request.getAttribute("username");
        String userToss = (String)request.getAttribute("usertoss");
        String computerName = (String) request.getAttribute("computer");
        String computerGuess = (String) request.getAttribute("compGuess");
        String outcome = (String) request.getAttribute("outcome");
    %>
    <body>
        <p>
            <ul>
                <li><%=userName%> : <%=userToss%> </li>
                <li><%=computerName%> : <%=computerGuess%> </li>
                <li>Outcome: <%=outcome%></li>
            </ul>
        </p>
        
        <p>
            Click <a href="index.html">here</a> to go back to the home page
        </p>
    </body>
</html>
